using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.Contracts.Data
{
    public class Oglas
    {
        public int Id { get; set; }
        public string Naslov { get; set; }
        public bool Avkcija { get; set; }
        public double Cena { get; set; }
        public string Opis { get; set; }
        public List<string> Slike { get; set; }
    }
}
