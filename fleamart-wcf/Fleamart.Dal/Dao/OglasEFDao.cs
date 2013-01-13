using AutoMapper;
using Fleamart.Contracts.Data;
using Fleamart.Dal.Entities;
using System;
using System.Collections.Generic;
using System.Data;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.Dal.Dao
{
    public class OglasEFDao : IDAO<Oglas>
    {
        public OglasEFDao()
        {
            Mapper.CreateMap<Oglas, OglasEF>();
            Mapper.CreateMap<OglasEF, Oglas>();

            Mapper.CreateMap<Komentar, KomentarEF>();
            Mapper.CreateMap<KomentarEF, Komentar>();

            Mapper.CreateMap<Ponudba, PonudbaEF>();
            Mapper.CreateMap<PonudbaEF, Ponudba>();

            Mapper.CreateMap<Uporabnik, UporabnikEF>();
            Mapper.CreateMap<UporabnikEF, Uporabnik>();

            Mapper.CreateMap<Kategorija, KategorijaEF>();
            Mapper.CreateMap<KategorijaEF, Kategorija>();

            Mapper.CreateMap<Naslov, NaslovEF>();
            Mapper.CreateMap<NaslovEF, Naslov>();

            Mapper.CreateMap<PrivatnoSporocilo, PrivatnoSporociloEF>();
            Mapper.CreateMap<PrivatnoSporociloEF, PrivatnoSporocilo>();
        }

        public bool Create(Oglas entity)
        {
            using (FleamartContext db = new FleamartContext())
            {
                if (entity != null)
                {
                    OglasEF ef = Mapper.Map<Oglas, OglasEF>(entity);
                    ef.Kategorija = null;
                    ef.Avtor = null;
                    db.Oglasi.Add(ef);
                    db.SaveChanges();
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }

        public Oglas Read(int id)
        {
            using (FleamartContext db = new FleamartContext())
            {
                var query = from x in db.Oglasi.Include("Avtor").Include("Kategorija")
                            where x.Id == id
                            select x;
                if (query.Count() != 0)
                {
                    return Mapper.Map<OglasEF, Oglas>(query.First());
                }
                else
                {
                    return null;
                }
            }
        }

        public Oglas ReadLast(int idAvtor)
        {
            using (FleamartContext db = new FleamartContext())
            {
                var query = from x in db.Oglasi.Include("Avtor")
                            where x.Avtor.Id == idAvtor
                            orderby x.CasOd descending
                            select x;
                if (query.Count() != 0)
                {
                    return Mapper.Map<OglasEF, Oglas>(query.First());
                }
                else
                {
                    return null;
                }
            }
        }

        public bool Update(Oglas entity)
        {
            using (FleamartContext db = new FleamartContext())
            {
                if (entity != null)
                {
                    OglasEF ef = Mapper.Map<Oglas, OglasEF>(entity);
                    db.Oglasi.Attach(ef);
                    db.Entry(ef).State = EntityState.Modified;
                    db.SaveChanges();
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }

        public bool Delete(int id)
        {
            using (FleamartContext db = new FleamartContext())
            {
                OglasEF ef = db.Oglasi.Find(id);
                if (ef != null)
                {
                    db.Oglasi.Remove(ef);
                    db.SaveChanges();
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }

        public List<Oglas> List()
        {
            using (FleamartContext db = new FleamartContext())
            {
                List<OglasEF> oglasi_ef = db.Oglasi.ToList();
                List<Oglas> oglasi = (oglasi_ef != null) ? Mapper.Map<List<OglasEF>, List<Oglas>>(oglasi_ef) : null;
                return oglasi;
            }
        }

        public List<Oglas> List(String kategorija, String param)
        {
            using (FleamartContext db = new FleamartContext())
            {
                List<OglasEF> oglasi_ef = null;
                if (param == null)
                {
                    oglasi_ef = db.Oglasi.Where(x => x.Kategorija.Naziv.Equals(kategorija)).ToList();
                }
                else if (kategorija != null && param != null)
                {
                    oglasi_ef = db.Oglasi.Where(x => x.Kategorija.Naziv == kategorija).Where(x => x.Naslov.Contains(param)).ToList();
                }
                else if (kategorija == null && param != null)
                {
                    oglasi_ef = db.Oglasi.Where(x => x.Naslov.Contains(param)).ToList();
                }

                List<Oglas> oglasi = (oglasi_ef != null) ? Mapper.Map<List<OglasEF>, List<Oglas>>(oglasi_ef) : null;
                return oglasi;
            }
        }

        public List<Oglas> ListProdaniNeocenjeni(int userId)
        {
            using (FleamartContext db = new FleamartContext())
            {
                var query = from o in db.Oglasi where o.KupecId == userId join oc in db.Ocene on o.Id equals oc.OglasId into jt from r in jt.DefaultIfEmpty() where r == null select o;
                List<OglasEF> oglasi_ef = query.ToList();
                List<Oglas> oglasi = new List<Oglas>();

                foreach(OglasEF oef in oglasi_ef) {
                    oglasi.Add(Mapper.Map<OglasEF, Oglas>(oef));
                }
                return oglasi;
			}
		}
		
        public List<Oglas> List(int idAvtor, int? status, int? statusNakupa)
        {
            using (FleamartContext db = new FleamartContext())
            {
                var query = from x in db.Oglasi
                            where x.AvtorId == idAvtor
                            select x;
                if (status != null)
                    query = query.Where(a => a.Status == status);


                if (statusNakupa >= 0) //drugače ne dela lol
                    query = query.Where(a => a.StatusNakupa == statusNakupa);
                else
                    query = query.Where(a => a.StatusNakupa == null);

                query = query.OrderByDescending(x => x.CasOd);

                List<Oglas> list = new List<Oglas>();
                if (query.Count() != 0)
                {
                    foreach (var item in query.ToList())
                    {
                        list.Add(Mapper.Map<OglasEF, Oglas>(item));
                    }
                }
                return list;
            }
        }

        public List<Oglas> List(int idKupec, int statusNakupa)
        {
            using (FleamartContext db = new FleamartContext())
            {
                var query = from x in db.Oglasi
                            where x.KupecId == idKupec &&
                            x.StatusNakupa == statusNakupa
                            select x;
                query = query.OrderByDescending(x => x.CasOd);

                List<Oglas> list = new List<Oglas>();
                if (query.Count() != 0)
                {
                    foreach (var item in query.ToList())
                    {
                        list.Add(Mapper.Map<OglasEF, Oglas>(item));
                    }
                }
                return list;
            }
        }

        public List<Oglas> OglasiPoAvtorId(int idProdajalec)
        {
            using (FleamartContext db = new FleamartContext())
            {
                var query = from x in db.Oglasi
                            where x.AvtorId == idProdajalec
                            select x;
                
                query = query.OrderByDescending(x => x.CasOd);

                List<Oglas> list = new List<Oglas>();
                if (query.Count() != 0)
                {
                    foreach (var item in query.ToList())
                    {
                        list.Add(Mapper.Map<OglasEF, Oglas>(item));
                    }
                }
                return list;
            }
        }
        //za profil prodajalca
        public double VrniPovprecjeOcen(int uporabnikId)
        {
            using (FleamartContext db = new FleamartContext())
            {
                //vsi oglasi od avtorja
                var queryOglasi = from z in db.Oglasi where z.AvtorId == uporabnikId select z.Id;
                
                var query = from s in db.Ocene
                            where queryOglasi.Contains(s.OglasId)
                            select s;
                double povprecje = 0.0;
                if (query.Count() != 0)
                {
                    foreach (var item in query.ToList())
                    {
                        povprecje = povprecje + item.Ocena;
                    }
                    povprecje = povprecje / query.Count();
                }
                
                return povprecje;
            }
        }

    }
}
