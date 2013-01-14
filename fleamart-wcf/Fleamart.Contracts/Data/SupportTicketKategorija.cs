using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.Contracts.Data
{
    [DataContract(Name = "SupportTicketKategorija", Namespace = "http//www.fleamart.com/")]
    public class SupportTicketKategorija
    {
        [DataMember]
        public int Id { get; set; }

        [DataMember]
        public string Naziv { get; set; }
    }
}
