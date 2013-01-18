using Fleamart.Dal.Entities;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.Dal.Entities
{
    public class UporabnikEF
    {
        public int Id { get; set; } // 1 == navaden uporabnik, 2 == admin
        public int Vloga { get; set; }
        public string Ime { get; set; }
        public string Priimek { get; set; }
        public string Email { get; set; }
        public string Upime { get; set; }
        public string Geslo { get; set; }
        public string Telefon { get; set; }
        
        public int? NaslovId { get; set; }
        public virtual NaslovEF Naslov { get; set; }
        public virtual List<PrivatnoSporociloEF> PrivatnaSporocila { get; set; }
        public List<SeznamZeljaEF> SeznamZelja { get; set; }

    }
}
