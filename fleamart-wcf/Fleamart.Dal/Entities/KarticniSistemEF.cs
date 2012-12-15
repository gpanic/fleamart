using Fleamart.Contracts.Data;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.Dal.Entities
{
    class KarticniSistemEF
    {
        public int Id { get; set; }
        public string Naslov { get; set; }
        public string Opis { get; set; }
        public int Status { get; set; }
        public DateTime CasNastanka { get; set; }
        public DateTime CasRazresitve { get; set; }

        public int AvtorId { get; set; }
        public virtual UporabnikEF Avtor { get; set; }

        public int KategorijaId { get; set; }
        public virtual KategorijaKarticnegaSistemaEF Kategorija { get; set; }
    }
}
