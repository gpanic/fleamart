using Fleamart.Contracts.Data;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.Dal.Entities
{
    public class AvtomatskiPonudnikEF
    {
        public int Id { get; set; }
        public double MaxCena { get; set; }
        public bool Aktiven { get; set; }

        public int OglasId { get; set; }
        public virtual OglasEF Oglas { get; set; }
        
        public int UporabnikId { get; set; }
        public virtual UporabnikEF Uporabnik { get; set; }

    }
}
