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
    public class PonudbaEFDao : IDAO<Ponudba>
    {
        public PonudbaEFDao()
        {
            Mapper.CreateMap<PonudbaEF, Ponudba>();
            Mapper.CreateMap<Ponudba, PonudbaEF>();

            Mapper.CreateMap<UporabnikEF, Uporabnik>();
            Mapper.CreateMap<Uporabnik, UporabnikEF>();

            Mapper.CreateMap<OglasEF, Oglas>();
            Mapper.CreateMap<Oglas, OglasEF>();
        }

        public bool Create(Ponudba entity)
        {
            using (FleamartContext db = new FleamartContext())
            {
                if (entity != null)
                {
                    PonudbaEF ef = Mapper.Map<Ponudba, PonudbaEF>(entity);
                    ef.Uporabnik = null;
                    ef.Oglas = null;
                    db.Ponudbe.Add(ef);
                    db.SaveChanges();
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }

        public Ponudba Read(int id)
        {
            using (FleamartContext db = new FleamartContext())
            {
                PonudbaEF ef = db.Ponudbe.Find(id);
                if (ef != null)
                {
                    return Mapper.Map<PonudbaEF, Ponudba>(ef);
                }
                else
                {
                    return null;
                }
            }
        }

        public bool Update(Ponudba entity)
        {
            using (FleamartContext db = new FleamartContext())
            {
                if (entity != null)
                {
                    PonudbaEF ef = Mapper.Map<Ponudba, PonudbaEF>(entity);
                    db.Ponudbe.Attach(ef);
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
                PonudbaEF ef = db.Ponudbe.Find(id);
                if (ef != null)
                {
                    db.Ponudbe.Remove(ef);
                    db.SaveChanges();
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }

        public List<Ponudba> List()
        {
            using (FleamartContext db = new FleamartContext())
            {
                List<Ponudba> list = new List<Ponudba>();
                foreach (var item in db.Ponudbe.ToList())
                {
                    list.Add(Mapper.Map<PonudbaEF, Ponudba>(item));
                }
                return list;
            }
        }

    }
}
