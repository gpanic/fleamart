using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.Contracts.Data
{
    public class Uporabnik
    {
        public int Id { get; set; }
        public int Vloga { get; set; }
        public string Ime { get; set; }
        public string Priimek { get; set; }
        public string Email { get; set; }
        public string Upime { get; set; }
        public string Geslo { get; set; }
        public string Telefon { get; set; }
        
        public int? NaslovId { get; set; }
        public virtual Naslov Naslov { get; set; }

    }
}
