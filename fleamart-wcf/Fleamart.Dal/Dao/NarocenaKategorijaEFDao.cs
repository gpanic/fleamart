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
    public class NarocenaKategorijaEFDao : IDAO<NarocenaKategorija>
    {
        public NarocenaKategorijaEFDao()
        {
            Mapper.CreateMap<NarocenaKategorijaEF, NarocenaKategorija>();
            Mapper.CreateMap<NarocenaKategorija, NarocenaKategorijaEF>();
            Mapper.CreateMap<KategorijaEF, Kategorija>();
            Mapper.CreateMap<Kategorija, KategorijaEF>();
            Mapper.CreateMap<UporabnikEF, Uporabnik>();
            Mapper.CreateMap<Uporabnik, UporabnikEF>();
        }

        public bool Create(NarocenaKategorija entity)
        {
            using (FleamartContext db = new FleamartContext())
            {
                if (entity != null)
                {
                    NarocenaKategorijaEF ef = Mapper.Map<NarocenaKategorija, NarocenaKategorijaEF>(entity);
                    UporabnikEF uef = db.Uporabniki.Find(entity.Uporabnik.Id);
                    KategorijaEF kef = db.Kategorije.Find(entity.Kategorija.Id);
                    if (uef != null && kef != null)
                    {
                        ef.Uporabnik = uef;
                        ef.Kategorija = kef;
                        db.NaroceneKategorije.Add(ef);
                        db.SaveChanges();
                        return true;
                    }
                    else
                    {
                        return false;
                    }
                }
                return false;
            }
        }

        public NarocenaKategorija Read(int id)
        {
            using (FleamartContext db = new FleamartContext())
            {
                var query = from x in db.NaroceneKategorije
                            .Include("Kategorija")
                            .Include("Uporabnik")
                            where x.Id == id
                            select x;
                NarocenaKategorijaEF ef = query.FirstOrDefault();
                NarocenaKategorija entity = (ef != null) ? Mapper.Map<NarocenaKategorijaEF, NarocenaKategorija>(ef) : null;
                return entity;

            }
        }

        public bool Update(NarocenaKategorija entity)
        {
            using (FleamartContext db = new FleamartContext())
            {
                if (entity != null)
                {
                    NarocenaKategorijaEF ef = Mapper.Map<NarocenaKategorija, NarocenaKategorijaEF>(entity);
                    db.NaroceneKategorije.Attach(ef);
                    db.Entry(ef).State = EntityState.Modified;
                    db.SaveChanges();
                    return true;
                }
                return false;
            }
        }

        public bool Delete(int id)
        {
            using (FleamartContext db = new FleamartContext())
            {
                NarocenaKategorijaEF ef = db.NaroceneKategorije.FirstOrDefault(x => x.Id == id);
                if (ef == null) return false;
                db.NaroceneKategorije.Remove(ef);
                db.SaveChanges();
                return true;
            }
        }

        public bool Delete(Uporabnik u, Kategorija k)
        {
            using (FleamartContext db = new FleamartContext())
            {
                var query = from x in db.NaroceneKategorije
                            where x.Uporabnik.Id == u.Id && x.Kategorija.Id == k.Id
                            select x;
                NarocenaKategorijaEF ef = query.FirstOrDefault();
                if (ef == null) return false;
                db.NaroceneKategorije.Remove(ef);
                db.SaveChanges();
                return true;
            }
        }

        public List<NarocenaKategorija> List()
        {
            using (FleamartContext db = new FleamartContext())
            {
                var query = from x in db.NaroceneKategorije
                            .Include("Kategorija")
                            .Include("Uporabnik")
                            select x;
                List<NarocenaKategorijaEF> efs = query.ToList();
                List<NarocenaKategorija> entities = new List<NarocenaKategorija>();

                foreach (NarocenaKategorijaEF ef in efs)
                {
                    entities.Add(Mapper.Map<NarocenaKategorijaEF, NarocenaKategorija>(ef));
                }
                return entities;
            }
        }

        public bool Exists(Uporabnik u, Kategorija k)
        {
            using (FleamartContext db = new FleamartContext())
            {
                var query = from x in db.NaroceneKategorije
                            where x.Kategorija.Id == k.Id && x.Uporabnik.Id == u.Id
                            select x;
                if (query.Count() > 0)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
    }
}
