using Fleamart.Contracts.Data;
using Fleamart.Contracts.Service;
using Fleamart.Dal.Dao;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace Fleamart.Service
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "SupportTicketService" in code, svc and config file together.
    // NOTE: In order to launch WCF Test Client for testing this service, please select SupportTicketService.svc or SupportTicketService.svc.cs at the Solution Explorer and start debugging.
    public class SupportTicketService : ISupportTicketService
    {
        private SupportTicketEFDao stdao;
        private SupportTicketKategorijaEFDao stkadao;
        private SupportTicketStatusEFDao stsdao;
        private SupportTicketKomentarEFDao stkodao;

        public SupportTicketService()
        {
            stdao = new SupportTicketEFDao();
            stkadao = new SupportTicketKategorijaEFDao();
            stsdao = new SupportTicketStatusEFDao();
            stkodao = new SupportTicketKomentarEFDao();
        }

        public bool CreateSupportTicket(SupportTicket t)
        {
            return stdao.Create(t);
        }

        public SupportTicket ReadSupportTicket(int id)
        {
            return stdao.Read(id);
        }

        public bool UpdateSupportTicket(SupportTicket t)
        {
            return stdao.Update(t);
        }

        public bool DeleteSupportTicket(int id)
        {
            return stdao.Delete(id);
        }

        public List<SupportTicket> ListSupportTicket()
        {
            return stdao.List();
        }

        public bool CreateSupportTicketKategorija(SupportTicketKategorija k)
        {
            return stkadao.Create(k);
        }

        public bool DeleteSupportTicketKategorija(int id)
        {
            return stkadao.Delete(id);
        }

        public List<SupportTicketKategorija> ListSupportTicketKategorija()
        {
            return stkadao.List();
        }

        public bool CreateSupportTicketStatus(SupportTicketStatus s)
        {
            return stsdao.Create(s);
        }

        public bool DeleteSupportTicketStatus(int id)
        {
            return stsdao.Delete(id);
        }

        public List<SupportTicketStatus> ListSupportTicketStatus()
        {
            return stsdao.List();
        }

        public bool CreateSupportTicketKomentar(SupportTicketKomentar k)
        {
            return stkodao.Create(k);
        }

        public bool UpdateSupportTicketKomentar(SupportTicketKomentar k)
        {
            return stkodao.Update(k);
        }

        public bool DeleteSupportTicketKomentar(int id)
        {
            return stkodao.Delete(id);
        }

        public List<SupportTicketKomentar> ListSupportTicketKomentar(int supportTicketId)
        {
            return stkodao.List().Where(x => x.SupportTicketId == supportTicketId).ToList();
        }


        public List<Uporabnik> ListUporabnik()
        {
            UporabnikEFDao dao = new UporabnikEFDao();
            return dao.List();
        }
    }
}
