using AutoMapper;
using Fleamart.Contracts.Data;
using Fleamart.Dal.Entities;
using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.Dal.Dao
{
    public class SeznamZeljaEFDao : IDAO<SeznamZelja>
    {
        public SeznamZeljaEFDao()
        {
            Mapper.CreateMap<SeznamZeljaEF, SeznamZelja>();
            Mapper.CreateMap<SeznamZelja, SeznamZeljaEF>();

            Mapper.CreateMap<UporabnikEF, Uporabnik>();
            Mapper.CreateMap<Uporabnik, UporabnikEF>();

            Mapper.CreateMap<OglasEF, Oglas>();
            Mapper.CreateMap<Oglas, OglasEF>();
        }

        public bool Create(SeznamZelja entity)
        {
            using (FleamartContext db = new FleamartContext())
            {
                if (entity != null)
                {
                    SeznamZeljaEF ef = Mapper.Map<SeznamZelja, SeznamZeljaEF>(entity);
                    ef.Uporabnik = null;
                    ef.Oglas = null;
                    db.SeznamZelja.Add(ef);
                    db.SaveChanges();
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }

        public SeznamZelja Read(int id)
        {
            using (FleamartContext db = new FleamartContext())
            {
                SeznamZeljaEF ef = db.SeznamZelja.Find(id);
                if (ef != null)
                {
                    return Mapper.Map<SeznamZeljaEF, SeznamZelja>(ef);
                }
                else
                {
                    return null;
                }
            }
        }

        public int ReadByIdOglasAndIdUser(int idOglas, int idUporabnik)
        {
            using (FleamartContext db = new FleamartContext())
            {
                var query = from x in db.SeznamZelja
                            where x.OglasId == idOglas && x.UporabnikId == idUporabnik                      
                            select x;
                int idZelje = 0;
                if (query.Count() != 0)
                {
                    foreach (var item in query.ToList())
                    {
                        idZelje = item.Id;
                    }
                }
                return idZelje;
            }
        }

        public bool Update(SeznamZelja entity)
        {
            using (FleamartContext db = new FleamartContext())
            {
                if (entity != null)
                {
                    SeznamZeljaEF ef = Mapper.Map<SeznamZelja, SeznamZeljaEF>(entity);
                    db.SeznamZelja.Attach(ef);
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
                SeznamZeljaEF ef = db.SeznamZelja.Find(id);
                if (ef != null)
                {
                    db.SeznamZelja.Remove(ef);
                    db.SaveChanges();
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }

        public List<SeznamZelja> List()
        {
            using (FleamartContext db = new FleamartContext())
            {
                List<SeznamZelja> list = new List<SeznamZelja>();
                foreach (var item in db.SeznamZelja.ToList())
                {
                    list.Add(Mapper.Map<SeznamZeljaEF, SeznamZelja>(item));
                }
                return list;
            }
        }

        /*
        public List<SeznamZelja> List(int uporabnikId)
        {
            using (FleamartContext db = new FleamartContext())
            {                
                var query = from s in db.SeznamZelja
                            where s.UporabnikId == uporabnikId
                            select s;

                List<SeznamZelja> list = new List<SeznamZelja>();
                if (query.Count()!=0)
                {
                    foreach (var item in query.ToList())
                    {
                        list.Add(Mapper.Map<SeznamZeljaEF, SeznamZelja>(item));
                    }
                }
                return list;
            }
        }
         */
        public List<Oglas> List(int uporabnikId)
        {
            using (FleamartContext db = new FleamartContext())
            {
                //seznam idOglas iz tabele SeznamZelja
                var querySeznamZelja = from z in db.SeznamZelja where z.UporabnikId == uporabnikId select z.OglasId;
                //seznam oglasov iz tabele Oglas, kjer je id enak seznamu zgoraj
                var query = from s in db.Oglasi
                            where querySeznamZelja.Contains(s.Id)
                            select s;

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
    }
}
