using Fleamart.Contracts.Data;
using System;
using System.Collections.Generic;
using System.Linq;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.Contracts.Service
{
    [ServiceContract]
    public interface ISupportTicketService
    {
        [OperationContract]
        bool CreateSupportTicket(SupportTicket t);

        [OperationContract]
        SupportTicket ReadSupportTicket(int id);

        [OperationContract]
        bool UpdateSupportTicket(SupportTicket t);

        [OperationContract]
        bool DeleteSupportTicket(int id);

        [OperationContract]
        List<SupportTicket> ListSupportTicket();

        [OperationContract]
        bool CreateSupportTicketKategorija(SupportTicketKategorija k);

        [OperationContract]
        bool DeleteSupportTicketKategorija(int id);

        [OperationContract]
        List<SupportTicketKategorija> ListSupportTicketKategorija();

        [OperationContract]
        bool CreateSupportTicketStatus(SupportTicketStatus s);

        [OperationContract]
        bool DeleteSupportTicketStatus(int id);

        [OperationContract]
        List<SupportTicketStatus> ListSupportTicketStatus();

        [OperationContract]
        bool CreateSupportTicketKomentar(SupportTicketKomentar k);

        [OperationContract]
        bool UpdateSupportTicketKomentar(SupportTicketKomentar k);

        [OperationContract]
        bool DeleteSupportTicketKomentar(int id);

        [OperationContract]
        List<SupportTicketKomentar> ListSupportTicketKomentar(int supportTicketId);
    }
}
