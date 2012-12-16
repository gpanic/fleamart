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
    public class UporabnikEFDao : IDAO<Uporabnik>
    {
        public UporabnikEFDao()
        {
            Mapper.CreateMap<UporabnikEF, Uporabnik>();
            Mapper.CreateMap<Uporabnik, UporabnikEF>();
            Mapper.CreateMap<NaslovEF, Naslov>();
            Mapper.CreateMap<Naslov, NaslovEF>();
        }

        public bool Create(Uporabnik entity)
        {
            using (FleamartContext db = new FleamartContext())
            {
                if (entity != null)
                {
                    UporabnikEF ef = Mapper.Map<Uporabnik, UporabnikEF>(entity);
                    ef.PrivatnaSporocila = null;
                    ef.SeznamZelja = null;
                    db.Uporabniki.Add(ef);
                    db.SaveChanges();
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }

        public Uporabnik Read(int id)
        {
            using (FleamartContext db = new FleamartContext())
            {
                UporabnikEF ef = db.Uporabniki.Find(id);
                if (ef != null)
                {
                    return Mapper.Map<UporabnikEF, Uporabnik>(ef);
                }
                else
                {
                    return null;
                }
            }
        }

        public bool Update(Uporabnik entity)
        {
            using (FleamartContext db = new FleamartContext())
            {
                if (entity != null)
                {
                    UporabnikEF ef = Mapper.Map<Uporabnik, UporabnikEF>(entity);
                    db.Uporabniki.Attach(ef);
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
                UporabnikEF ef = db.Uporabniki.Find(id);
                if (ef != null)
                {
                    db.Uporabniki.Remove(ef);
                    db.SaveChanges();
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }

        public List<Uporabnik> List()
        {
            using (FleamartContext db = new FleamartContext())
            {
                List<Uporabnik> list = new List<Uporabnik>();
                foreach (var item in db.Uporabniki.ToList())
                {
                    list.Add(Mapper.Map<UporabnikEF, Uporabnik>(item));
                }
                return list;
            }
        }

        public Uporabnik Read(string username)
        {
            using (FleamartContext db = new FleamartContext())
            {
                UporabnikEF ef = db.Uporabniki.Where(u => u.Upime == username).FirstOrDefault();
                if (ef != null)
                {
                    return Mapper.Map<UporabnikEF, Uporabnik>(ef);
                }
                else
                {
                    return null;
                }
            }
        }
    }
}
