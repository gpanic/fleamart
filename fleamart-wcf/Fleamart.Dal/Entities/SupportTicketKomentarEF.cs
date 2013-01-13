using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.Dal.Entities
{
    public class SupportTicketKomentarEF
    {
        public int Id { get; set; }
        public DateTime? Cas { get; set; }
        public string Vsebina { get; set; }

        public int AvtorId { get; set; }
        public virtual UporabnikEF Avtor { get; set; }

        public int SupportTicketId { get; set; }
        public virtual SupportTicketEF SupportTicket { get; set; }
    }
}
