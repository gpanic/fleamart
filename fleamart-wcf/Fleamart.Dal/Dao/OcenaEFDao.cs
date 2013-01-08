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
    public class OcenaEFDao : IDAO<OcenaDTO>
    {

       public OcenaEFDao()
       {
           Mapper.CreateMap<OcenaEF, OcenaDTO>();
           Mapper.CreateMap<OcenaDTO, OcenaEF>();
           Mapper.CreateMap<Oglas, OglasEF>();
           Mapper.CreateMap<OglasEF, Oglas>();
       }

        public bool Create(OcenaDTO entity)
        {
            using (FleamartContext db = new FleamartContext())
            {
                if (entity == null) return false;
                OcenaEF ocenaef = Mapper.Map<OcenaDTO, OcenaEF>(entity);
                OglasEF oglas = db.Oglasi.FirstOrDefault(x => x.Id == entity.OglasId);
                ocenaef.Oglas = oglas;
                db.Ocene.Add(ocenaef);
                db.SaveChanges();
                return true;
            }
        }

        public OcenaDTO Read(int id)
        {
            using (FleamartContext db = new FleamartContext())
            {
                OcenaEF ocenaef = db.Ocene.FirstOrDefault(x => x.Id == id);
                OcenaDTO ocena = (ocenaef != null) ? Mapper.Map<OcenaEF, OcenaDTO>(ocenaef) : null;
                return ocena;
            }
        }

        public bool ReadByUporabnik(int uporabnikId, OcenaDTO ocena)
        {
            using (FleamartContext db = new FleamartContext())
            {
                OcenaEF ocenaef = db.Ocene.Where(x => x.OglasId == ocena.OglasId).Where(x => x.Oglas.KupecId == uporabnikId).Where(x => x.Tip == ocena.Tip).FirstOrDefault();
                return (ocenaef != null);
            }
                
        }

        public bool Update(OcenaDTO entity)
        {
            throw new NotImplementedException();
        }

        public bool Delete(int id)
        {
            throw new NotImplementedException();
        }

        public List<OcenaDTO> List()
        {
            throw new NotImplementedException();
        }
    }
}
