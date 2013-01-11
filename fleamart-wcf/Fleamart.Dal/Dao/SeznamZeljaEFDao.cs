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

        //Glej OglasiEFDao
        /*
        public List<SeznamZelja> ListZeljaPoIdUporabnika(int uporabnikId)
        {
            using (FleamartContext db = new FleamartContext())
            {
               
            }
        }
        */
    }
}
