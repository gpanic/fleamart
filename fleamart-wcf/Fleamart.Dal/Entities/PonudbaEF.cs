using Fleamart.Contracts.Data;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.Dal.Entities
{
    class PonudbaEF
    {
        public int Id { get; set; }
        public double Znesek { get; set; }
        public DateTime Cas { get; set; }
        public UporabnikEF Uporabnik { get; set; }
    }
}
