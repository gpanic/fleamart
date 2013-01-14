using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.Dal.Entities
{
    public class SupportTicketEF
    {
        public int Id { get; set; }
        public string Naslov { get; set; }
        public string Vsebina { get; set; }
        public DateTime? CasUstvarjen { get; set; }
        public DateTime? CasZaprt { get; set; }

        public int SupportTicketStatusId { get; set; }
        public virtual SupportTicketStatusEF SupportTicketStatus { get; set; }

        public int SupportTicketKategorijaId { get; set; }
        public virtual SupportTicketKategorijaEF SupportTicketKategorija { get; set; }

        public int? AvtorId { get; set; }
        public virtual UporabnikEF Avtor { get; set; }

        public int? TehnikId { get; set; }
        public virtual UporabnikEF Tehnik { get; set; }

        public List<SupportTicketKomentarEF> Komentarji { get; set; }
    }
}
