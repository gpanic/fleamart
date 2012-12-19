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
    public class KategorijaEFDao : IDAO<Kategorija>
    {
        public KategorijaEFDao()
        {
            Mapper.CreateMap<KategorijaEF, Kategorija>();
            Mapper.CreateMap<Kategorija, KategorijaEF>();
        }


        public bool Create(Kategorija entity)
        {
            using (FleamartContext db = new FleamartContext())
            {
                if (entity != null)
                {
                    KategorijaEF kat = Mapper.Map<Kategorija, KategorijaEF>(entity);
                    db.Kategorije.Add(kat);
                    db.SaveChanges();
                    return true;
                }
                return false;
            }
        }

        public Kategorija Read(int id)
        {
            using (FleamartContext db = new FleamartContext())
            {
                KategorijaEF katef = db.Kategorije.FirstOrDefault(x => x.Id == id);
                Kategorija kat = (katef != null) ? Mapper.Map<KategorijaEF, Kategorija>(katef) : null;
                return kat;

            }
        }

        public bool Update(Kategorija entity)
        {
            using (FleamartContext db = new FleamartContext())
            {
                if (entity != null)
                {
                    KategorijaEF katef = Mapper.Map<Kategorija, KategorijaEF>(entity);
                    db.Kategorije.Attach(katef);
                    db.Entry(katef).State = EntityState.Modified;
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
                KategorijaEF katef = db.Kategorije.FirstOrDefault(x => x.Id == id);
                if (katef == null) return false;
                db.Kategorije.Remove(katef);
                db.SaveChanges();
                return true;
            }
        }

        public List<Kategorija> List()
        {
            using (FleamartContext db = new FleamartContext())
            {
                List<KategorijaEF> kategorijeef = db.Kategorije.ToList();
                List<Kategorija> kategorije = new List<Kategorija>();

                foreach (KategorijaEF kat in kategorijeef)
                {
                    kategorije.Add(Mapper.Map<KategorijaEF, Kategorija>(kat));
                }
                return kategorije;
            }
        }

    }
}
