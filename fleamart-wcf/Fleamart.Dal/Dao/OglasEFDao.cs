﻿using AutoMapper;
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
    public class OglasEFDao : IDAO<Oglas>
    {
        public OglasEFDao()
        {
            Mapper.CreateMap<Oglas, OglasEF>();
            Mapper.CreateMap<OglasEF, Oglas>();

            Mapper.CreateMap<Komentar, KomentarEF>();
            Mapper.CreateMap<KomentarEF, Komentar>();

            Mapper.CreateMap<Ponudba, PonudbaEF>();
            Mapper.CreateMap<PonudbaEF, Ponudba>();

            Mapper.CreateMap<Uporabnik, UporabnikEF>();
            Mapper.CreateMap<UporabnikEF, Uporabnik>();

            Mapper.CreateMap<Kategorija, KategorijaEF>();
            Mapper.CreateMap<KategorijaEF, Kategorija>();

            Mapper.CreateMap<Naslov, NaslovEF>();
            Mapper.CreateMap<NaslovEF, Naslov>();
        }

        public bool Create(Oglas entity)
        {
            using (FleamartContext db = new FleamartContext())
            {
                if (entity != null)
                {
                    OglasEF ef = Mapper.Map<Oglas, OglasEF>(entity);
                    ef.Kategorija = null;
                    ef.Avtor = null;
                    db.Oglasi.Add(ef);
                    db.SaveChanges();
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }

        public Oglas Read(int id)
        {
            using (FleamartContext db = new FleamartContext())
            {
                var query = from x in db.Oglasi.Include("Avtor")
                            where x.Id == id
                            select x;
                if (query.Count() != 0)
                {
                    return Mapper.Map<OglasEF,Oglas>(query.First());
                }
                else
                {
                    return null;
                }
            }
        }

        public bool Update(Oglas entity)
        {
            using (FleamartContext db = new FleamartContext())
            {
                if (entity != null)
                {
                    OglasEF ef = Mapper.Map<Oglas, OglasEF>(entity);
                    db.Oglasi.Attach(ef);
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
                OglasEF ef = db.Oglasi.Find(id);
                if (ef != null)
                {
                    db.Oglasi.Remove(ef);
                    db.SaveChanges();
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }

        public List<Oglas> List()
        {
            using (FleamartContext db = new FleamartContext())
            {
                List<OglasEF> oglasi_ef = db.Oglasi.ToList();
                List<Oglas> oglasi = (oglasi_ef != null) ? Mapper.Map<List<OglasEF>, List<Oglas>>(oglasi_ef) : null;
                return oglasi;
            }
        }

        public List<Oglas> List(String kategorija, String param)
        {
            using (FleamartContext db = new FleamartContext())
            {
                List<OglasEF> oglasi_ef = null;
                if (param == null)
                {
                    oglasi_ef = db.Oglasi.Where(x => x.Kategorija.Naziv.Equals(kategorija)).ToList();
                }
                else if (kategorija != null && param != null)
                {
                    oglasi_ef = db.Oglasi.Where(x => x.Kategorija.Naziv == kategorija).Where(x => x.Naslov.Contains(param)).ToList();
                }
                else if (kategorija == null && param != null)
                {
                    oglasi_ef = db.Oglasi.Where(x => x.Naslov.Contains(param)).ToList();
                }
                 
                List<Oglas> oglasi = (oglasi_ef != null) ? Mapper.Map<List<OglasEF>, List<Oglas>>(oglasi_ef) : null;
                return oglasi;
            }
        }
    }
}
