using Fleamart.Contracts.Data;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.Dal.Entities
{
    public class KomentarEF
    {
        public int Id { get; set; }
        public string Sporocilo { get; set; }
        public DateTime Cas { get; set; }

        public int AvtorId { get; set; }
        public virtual UporabnikEF Avtor { get; set; }

    }
}
