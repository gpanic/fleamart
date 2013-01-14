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
    public class SupportTicketKomentarEFDao : IDAO<SupportTicketKomentar>
    {
        public SupportTicketKomentarEFDao()
        {
            Mapper.CreateMap<SupportTicketKomentarEF, SupportTicketKomentar>();
            Mapper.CreateMap<SupportTicketKomentar, SupportTicketKomentarEF>();
            Mapper.CreateMap<UporabnikEF, Uporabnik>();
            Mapper.CreateMap<Uporabnik, UporabnikEF>();
            Mapper.CreateMap<NaslovEF, Naslov>();
            Mapper.CreateMap<Naslov, NaslovEF>();
            Mapper.CreateMap<SupportTicketEF, SupportTicket>();
            Mapper.CreateMap<SupportTicket, SupportTicketEF>();
            Mapper.CreateMap<SupportTicketStatusEF, SupportTicketStatus>();
            Mapper.CreateMap<SupportTicketStatus, SupportTicketStatusEF>();
            Mapper.CreateMap<SupportTicketKategorijaEF, SupportTicketKategorija>();
            Mapper.CreateMap<SupportTicketKategorija, SupportTicketKategorijaEF>();
        }

        public bool Create(SupportTicketKomentar entity)
        {
            using (FleamartContext db = new FleamartContext())
            {
                if (entity != null)
                {
                    SupportTicketKomentarEF ef = Mapper.Map<SupportTicketKomentar, SupportTicketKomentarEF>(entity);
                    if (ef.Avtor == null || ef.SupportTicketId < 1) return false;
                    db.Uporabniki.Attach(ef.Avtor);
                    db.SupportTicketKomentarji.Add(ef);
                    db.SaveChanges();
                    return true;
                }
                return false;
            }
        }

        public SupportTicketKomentar Read(int id)
        {
            using (FleamartContext db = new FleamartContext())
            {
                SupportTicketKomentarEF ef = db.SupportTicketKomentarji
                    .Include("Avtor")
                    .Include("SupportTicket")
                    .FirstOrDefault(x => x.Id == id);
                return Mapper.Map<SupportTicketKomentarEF, SupportTicketKomentar>(ef);
            }
        }

        public bool Update(SupportTicketKomentar entity)
        {
            using (FleamartContext db = new FleamartContext())
            {
                if (entity != null)
                {
                    SupportTicketKomentarEF ef = Mapper.Map<SupportTicketKomentar, SupportTicketKomentarEF>(entity);
                    if (ef.Avtor == null || ef.SupportTicketId < 1) return false;
                    db.SupportTicketKomentarji.Attach(ef);
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
                SupportTicketKomentarEF ef = db.SupportTicketKomentarji.FirstOrDefault(x => x.Id == id);
                if (ef != null)
                {
                    db.SupportTicketKomentarji.Remove(ef);
                    db.SaveChanges();
                    return true;
                }
                return false;
            }
        }

        public List<SupportTicketKomentar> List()
        {
            using (FleamartContext db = new FleamartContext())
            {
                List<SupportTicketKomentarEF> efList = db.SupportTicketKomentarji
                    .Include("Avtor")
                    .Include("SupportTicket")
                    .ToList();
                List<SupportTicketKomentar> entityList = new List<SupportTicketKomentar>();

                foreach (SupportTicketKomentarEF ef in efList)
                {
                    entityList.Add(Mapper.Map<SupportTicketKomentarEF, SupportTicketKomentar>(ef));
                }
                return entityList;
            }
        }
    }
}
