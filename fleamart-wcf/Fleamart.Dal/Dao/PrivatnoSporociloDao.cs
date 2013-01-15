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
    public class PrivatnoSporociloDao : IDAO<PrivatnoSporocilo>
    {

        public PrivatnoSporociloDao()
        {
            Mapper.CreateMap<PrivatnoSporocilo, PrivatnoSporociloEF>();
            Mapper.CreateMap<PrivatnoSporociloEF, PrivatnoSporocilo>();

            Mapper.CreateMap<Uporabnik, UporabnikEF>();
            Mapper.CreateMap<UporabnikEF, Uporabnik>();

            Mapper.CreateMap<NaslovEF, Naslov>();
            Mapper.CreateMap<Naslov, NaslovEF>();
        }

        public bool Create(PrivatnoSporocilo entity)
        {
            using (FleamartContext db = new FleamartContext())
            {
                if (entity != null)
                {
                    PrivatnoSporociloEF psef = Mapper.Map<PrivatnoSporocilo, PrivatnoSporociloEF>(entity);
                    db.PrivatnaSporocila.Add(psef);
                    db.SaveChanges();
                    return true;
                }
                return false;
            }
        }

        public PrivatnoSporocilo Read(int id)
        {
            using (FleamartContext db = new FleamartContext())
            {
                PrivatnoSporociloEF psef = db.PrivatnaSporocila.FirstOrDefault(x => x.Id == id);
                PrivatnoSporocilo ps = (psef != null) ? Mapper.Map<PrivatnoSporociloEF, PrivatnoSporocilo>(psef) : null;
                return ps;
            }
        }

        public bool Update(PrivatnoSporocilo entity)
        {
            throw new NotImplementedException();
        }

        public bool Delete(int id)
        {
            using (FleamartContext db = new FleamartContext())
            {
                PrivatnoSporociloEF psef = db.PrivatnaSporocila.FirstOrDefault(x => x.Id == id);
                if (psef == null) return false;
                db.PrivatnaSporocila.Remove(psef);
                db.SaveChanges();
                return true;
            }
        }

        public bool DeletePrivatnoSporocilo(int UporabnikId, int SporociloId)
        {
            using (FleamartContext db = new FleamartContext())
            {
                return false;
            }
        }

        public List<PrivatnoSporocilo> List()
        {
            throw new NotImplementedException();
        }

        public List<PrivatnoSporocilo> PrivatnaSporocilaUporabnika(int Uporabnikid)
        {
            using (FleamartContext db = new FleamartContext())
            {
                db.Configuration.LazyLoadingEnabled = false;
                List<PrivatnoSporociloEF> sporocila_ef = db.PrivatnaSporocila.Include("Posiljatelj").Where(x => x.Prejemnik.Id == Uporabnikid).OrderByDescending(x => x.Id).ToList();
                List<PrivatnoSporocilo> sporocila = (sporocila_ef != null) ? Mapper.Map<List<PrivatnoSporociloEF>,List<PrivatnoSporocilo>>(sporocila_ef) : null;
                return sporocila;
            }
        }

        public void OznaciSporociloKotPrebrano(int SporociloId)
        {
            using (FleamartContext db = new FleamartContext())
            {
                PrivatnoSporociloEF psef = db.PrivatnaSporocila.FirstOrDefault(x => x.Id == SporociloId);
                db.PrivatnaSporocila.Attach(psef);
                psef.Prebrano = true;
                db.SaveChanges();
            }
        }
    }
}
