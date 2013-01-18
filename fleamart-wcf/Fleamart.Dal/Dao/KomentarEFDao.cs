using AutoMapper;
using Fleamart.Contracts.Data;
using Fleamart.Dal.Entities;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.Dal.Dao
{
    public class KomentarEFDao : IDAO<Komentar>
    {
        public KomentarEFDao()
        {
            Mapper.CreateMap<KomentarEF, Komentar>();
            Mapper.CreateMap<Komentar, KomentarEF>();
        }

        public bool Create(Komentar entity)
        {
            throw new NotImplementedException();
        }

        public Komentar Read(int id)
        {
            throw new NotImplementedException();
        }

        public bool Update(Komentar entity)
        {
            throw new NotImplementedException();
        }

        public bool Delete(int id)
        {
            using (FleamartContext db = new FleamartContext())
            {
                KomentarEF komef = db.Komentarji.FirstOrDefault(x => x.Id == id);
                if (komef == null) return false;
                db.Komentarji.Remove(komef);
                db.SaveChanges();
                return true;
            }
        }

        public List<Komentar> List()
        {
            throw new NotImplementedException();
        }
    }
}
