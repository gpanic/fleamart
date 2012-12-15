using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.Contracts.Data
{
    class Kategorija
    {
        public int Id { get; set; }
        public int? NadkategorijaId { get; set; }
        public string Naziv { get; set; }

        public virtual Kategorija Nadkategorija { get; set; }
    }
}
