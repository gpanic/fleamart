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
    public class SupportTicketKategorijaEFDao : IDAO<SupportTicketKategorija>
    {
        public SupportTicketKategorijaEFDao()
        {
            Mapper.CreateMap<SupportTicketKategorijaEF, SupportTicketKategorija>();
            Mapper.CreateMap<SupportTicketKategorija, SupportTicketKategorijaEF>();
        }

        public bool Create(SupportTicketKategorija entity)
        {
            using (FleamartContext db = new FleamartContext())
            {
                if (entity != null)
                {
                    SupportTicketKategorijaEF ef = Mapper.Map<SupportTicketKategorija, SupportTicketKategorijaEF>(entity);
                    db.SupportTicketKategorije.Add(ef);
                    db.SaveChanges();
                    return true;
                }
                return false;
            }
        }

        public SupportTicketKategorija Read(int id)
        {
            using (FleamartContext db = new FleamartContext())
            {
                SupportTicketKategorijaEF ef = db.SupportTicketKategorije.FirstOrDefault(x => x.Id == id);
                return Mapper.Map<SupportTicketKategorijaEF, SupportTicketKategorija>(ef);
            }
        }

        public bool Update(SupportTicketKategorija entity)
        {
            using (FleamartContext db = new FleamartContext())
            {
                if (entity != null)
                {
                    SupportTicketKategorijaEF ef = Mapper.Map<SupportTicketKategorija, SupportTicketKategorijaEF>(entity);
                    db.SupportTicketKategorije.Attach(ef);
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
                SupportTicketKategorijaEF ef = db.SupportTicketKategorije.FirstOrDefault(x => x.Id == id);
                if (ef != null)
                {
                    db.SupportTicketKategorije.Remove(ef);
                    db.SaveChanges();
                    return true;
                }
                return false;
            }
        }

        public List<SupportTicketKategorija> List()
        {
            using (FleamartContext db = new FleamartContext())
            {
                List<SupportTicketKategorijaEF> efList = db.SupportTicketKategorije.ToList();
                List<SupportTicketKategorija> entityList = new List<SupportTicketKategorija>();

                foreach (SupportTicketKategorijaEF ef in efList)
                {
                    entityList.Add(Mapper.Map<SupportTicketKategorijaEF, SupportTicketKategorija>(ef));
                }
                return entityList;
            }
        }
    }
}
