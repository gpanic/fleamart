using Fleamart.Contracts.Data;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.Dal.Entities
{
    public class NarocenaKategorijaEF
    {
        public int Id { get; set; }

        public int UporabnikId { get; set; }
        public UporabnikEF Uporabnik { get; set; }

        public int KategorijaId { get; set; }
        public KategorijaEF Kategorija { get; set; }
    }
}
