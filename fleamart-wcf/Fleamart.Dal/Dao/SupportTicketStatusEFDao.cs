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
    public class SupportTicketStatusEFDao : IDAO<SupportTicketStatus>
    {

        public SupportTicketStatusEFDao()
        {
            Mapper.CreateMap<SupportTicketStatusEF, SupportTicketStatus>();
            Mapper.CreateMap<SupportTicketStatus, SupportTicketStatusEF>();
        }

        public bool Create(SupportTicketStatus entity)
        {
            using (FleamartContext db = new FleamartContext())
            {
                if (entity != null)
                {
                    SupportTicketStatusEF ef = Mapper.Map<SupportTicketStatus, SupportTicketStatusEF>(entity);
                    db.SupportTicketStatusi.Add(ef);
                    db.SaveChanges();
                    return true;
                }
                return false;
            }
        }

        public SupportTicketStatus Read(int id)
        {
            using (FleamartContext db = new FleamartContext())
            {
                SupportTicketStatusEF ef = db.SupportTicketStatusi.FirstOrDefault(x => x.Id == id);
                return Mapper.Map<SupportTicketStatusEF, SupportTicketStatus>(ef);
            }
        }

        public bool Update(SupportTicketStatus entity)
        {
            using (FleamartContext db = new FleamartContext())
            {
                if (entity != null)
                {
                    SupportTicketStatusEF ef = Mapper.Map<SupportTicketStatus, SupportTicketStatusEF>(entity);
                    db.SupportTicketStatusi.Attach(ef);
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
                SupportTicketStatusEF ef = db.SupportTicketStatusi.FirstOrDefault(x => x.Id == id);
                if (ef != null)
                {
                    db.SupportTicketStatusi.Remove(ef);
                    db.SaveChanges();
                    return true;
                }
                return false;
            }
        }

        public List<SupportTicketStatus> List()
        {
            using (FleamartContext db = new FleamartContext())
            {
                List<SupportTicketStatusEF> efList = db.SupportTicketStatusi.ToList();
                List<SupportTicketStatus> entityList = new List<SupportTicketStatus>();

                foreach (SupportTicketStatusEF ef in efList)
                {
                    entityList.Add(Mapper.Map<SupportTicketStatusEF, SupportTicketStatus>(ef));
                }
                return entityList;
            }
        }
    }
}
