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
    public class SupportTicketEFDao : IDAO<SupportTicket>
    {
        public SupportTicketEFDao()
        {
            Mapper.CreateMap<SupportTicketEF, SupportTicket>();
            Mapper.CreateMap<SupportTicket, SupportTicketEF>();
            Mapper.CreateMap<SupportTicketKomentarEF, SupportTicketKomentar>();
            Mapper.CreateMap<SupportTicketKomentar, SupportTicketKomentarEF>();
            Mapper.CreateMap<UporabnikEF, Uporabnik>();
            Mapper.CreateMap<Uporabnik, UporabnikEF>();
            Mapper.CreateMap<NaslovEF, Naslov>();
            Mapper.CreateMap<Naslov, NaslovEF>();
            Mapper.CreateMap<SupportTicketStatusEF, SupportTicketStatus>();
            Mapper.CreateMap<SupportTicketStatus, SupportTicketStatusEF>();
            Mapper.CreateMap<SupportTicketKategorijaEF, SupportTicketKategorija>();
            Mapper.CreateMap<SupportTicketKategorija, SupportTicketKategorijaEF>();

        }

        public bool Create(SupportTicket entity)
        {
            using (FleamartContext db = new FleamartContext())
            {
                if (entity != null)
                {
                    SupportTicketEF ef = Mapper.Map<SupportTicket, SupportTicketEF>(entity);
                    if (ef.Avtor == null || ef.Kategorija == null || ef.Status == null) return false;
                    ef.Komentarji = null;
                    ef.Tehnik = null;
                    db.Uporabniki.Attach(ef.Avtor);
                    db.SupportTicketKategorije.Attach(ef.Kategorija);
                    db.SupportTicketStatusi.Attach(ef.Status);
                    db.SupportTickets.Add(ef);
                    db.SaveChanges();
                    return true;
                }
                return false;
            }
        }

        public SupportTicket Read(int id)
        {
            using (FleamartContext db = new FleamartContext())
            {
                SupportTicketEF ef = db.SupportTickets
                    .Include("Status")
                    .Include("Kategorija")
                    .Include("Avtor")
                    .Include("Tehnik")
                    .Include("Komentarji")
                    .FirstOrDefault(x => x.Id == id);
                return Mapper.Map<SupportTicketEF, SupportTicket>(ef);
            }
        }

        public bool Update(SupportTicket entity)
        {
            using (FleamartContext db = new FleamartContext())
            {
                if (entity != null)
                {
                    SupportTicketEF ef = Mapper.Map<SupportTicket, SupportTicketEF>(entity);
                    if (ef.Avtor == null || ef.Kategorija == null || ef.Status == null) return false;
                    db.SupportTickets.Attach(ef);
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
                SupportTicketEF ef = db.SupportTickets.FirstOrDefault(x => x.Id == id);
                if (ef != null)
                {
                    db.SupportTickets.Remove(ef);
                    db.SaveChanges();
                    return true;
                }
                return false;
            }
        }

        public List<SupportTicket> List()
        {
            using (FleamartContext db = new FleamartContext())
            {
                List<SupportTicketEF> efList = db.SupportTickets
                    .Include("Status")
                    .Include("Kategorija")
                    .Include("Avtor")
                    .Include("Tehnik")
                    .Include("Komentarji")
                    .ToList();
                List<SupportTicket> entityList = new List<SupportTicket>();

                foreach (SupportTicketEF ef in efList)
                {
                    entityList.Add(Mapper.Map<SupportTicketEF, SupportTicket>(ef));
                }
                return entityList;
            }
        }
    }
}
