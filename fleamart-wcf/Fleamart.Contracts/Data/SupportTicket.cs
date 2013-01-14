using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.Contracts.Data
{
    [DataContract(Name = "SupportTicket", Namespace = "http//www.fleamart.com/")]
    public class SupportTicket
    {
        [DataMember]
        public int Id { get; set; }

        [DataMember]
        public string Naslov { get; set; }

        [DataMember]
        public string Vsebina { get; set; }

        [DataMember]
        public DateTime? CasUstvarjen { get; set; }

        [DataMember]
        public DateTime? CasZaprt { get; set; }

        [DataMember]
        public SupportTicketStatus SupportTicketStatus { get; set; }

        [DataMember]
        public SupportTicketKategorija SupportTicketKategorija { get; set; }

        [DataMember]
        public Uporabnik Avtor { get; set; }

        [DataMember]
        public Uporabnik Tehnik { get; set; }

        [DataMember]
        public List<SupportTicketKomentar> Komentarji { get; set; }
    }
}
