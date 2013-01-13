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
    public class AvtomatskiPonudnikEFDao : IDAO<AvtomatskiPonudnik>
    {
        public AvtomatskiPonudnikEFDao()
        {
            Mapper.CreateMap<AvtomatskiPonudnikEF, AvtomatskiPonudnik>();
            Mapper.CreateMap<AvtomatskiPonudnik, AvtomatskiPonudnikEF>();

            Mapper.CreateMap<OglasEF, Oglas>();
            Mapper.CreateMap<Oglas, OglasEF>();

            Mapper.CreateMap<UporabnikEF, Uporabnik>();
            Mapper.CreateMap<Uporabnik, UporabnikEF>();
        }

        public bool Create(AvtomatskiPonudnik entity)
        {
            using (FleamartContext db = new FleamartContext())
            {
                if (entity != null)
                {
                    AvtomatskiPonudnikEF ef = Mapper.Map<AvtomatskiPonudnik, AvtomatskiPonudnikEF>(entity);
                    ef.Uporabnik = null;
                    ef.Oglas = null;
                    db.AvtomatskiPonudbniki.Add(ef);
                    db.SaveChanges();
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }

        public AvtomatskiPonudnik Read(int id)
        {
            using (FleamartContext db = new FleamartContext())
            {
                AvtomatskiPonudnikEF ef = db.AvtomatskiPonudbniki.Find(id);
                if (ef != null)
                {
                    return Mapper.Map<AvtomatskiPonudnikEF, AvtomatskiPonudnik>(ef);
                }
                else
                {
                    return null;
                }
            }
        }

        public bool Update(AvtomatskiPonudnik entity)
        {
            using (FleamartContext db = new FleamartContext())
            {
                if (entity != null)
                {
                    AvtomatskiPonudnikEF ef = Mapper.Map<AvtomatskiPonudnik, AvtomatskiPonudnikEF>(entity);
                    db.AvtomatskiPonudbniki.Attach(ef);
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
                AvtomatskiPonudnikEF ef = db.AvtomatskiPonudbniki.Find(id);
                if (ef != null)
                {
                    db.AvtomatskiPonudbniki.Remove(ef);
                    db.SaveChanges();
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }

        public List<AvtomatskiPonudnik> List()
        {
            using (FleamartContext db = new FleamartContext())
            {
                List<AvtomatskiPonudnik> list = new List<AvtomatskiPonudnik>();
                foreach (var item in db.AvtomatskiPonudbniki.ToList())
                {
                    list.Add(Mapper.Map<AvtomatskiPonudnikEF, AvtomatskiPonudnik>(item));
                }
                return list;
            }
        }
    }
}
