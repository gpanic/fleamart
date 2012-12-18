using Fleamart.Contracts.Data;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.Dal.Entities
{
    public class PonudbaEF
    {
        public int Id { get; set; }
        public double Znesek { get; set; }
        public DateTime Cas { get; set; }

        public int UporabnikId { get; set; }
        public virtual UporabnikEF Uporabnik { get; set; }

        public int OglasId { get; set; }
        public virtual OglasEF Oglas { get; set; }

    }
}
