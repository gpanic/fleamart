using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.Dal.Entities
{
    public class NaslovEF
    {
        public int Id { get; set; }
        public string Ulica { get; set; }
        public int PostnaStevilka { get; set; }
        public string Obcina { get; set; }
        public string Drzava { get; set; }
    }
}
