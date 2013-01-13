using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.Contracts.Data
{
    [DataContract(Name = "SupportTicketStatus", Namespace = "http//www.fleamart.com/")]
    public class SupportTicketKomentar
    {
        [DataMember]
        public int Id { get; set; }
        
        [DataMember]
        public DateTime? Cas { get; set; }

        [DataMember]
        public string Vsebina { get; set; }

        [DataMember]
        public Uporabnik Avtor { get; set; }

        [DataMember]
        public int SupportTicketId { get; set; }
    }
}
