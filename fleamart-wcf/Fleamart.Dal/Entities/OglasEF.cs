using Fleamart.Dal.Entities;
using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.Dal.Entities
{
    public class OglasEF
    {
        public int Id { get; set; }

        [Required]
        public string Naslov { get; set; }
        public bool Avkcija { get; set; } 
        public double Cena { get; set; }
        public double? ZadnjaCenaAvkcija { get; set; }
        
        [Required]
        public string Opis { get; set; }
        public DateTime CasOd { get; set; }
        public DateTime CasDo { get; set; }
        public DateTime? CasSpremenjeno { get; set; }
        public int Status { get; set; }

        public List<PonudbaEF> Ponudbe { get; set; }

        public int? StatusNakupa { get; set; }

        public int? AvtorId { get; set; }
        public virtual UporabnikEF Avtor { get; set; }

        public int? KupecId { get; set; }
        public virtual UporabnikEF Kupec { get; set; }

        public int? KategorijaId { get; set; }
        public virtual KategorijaEF Kategorija { get; set; }

        public List<KomentarEF> Komentarji { get; set; }

        public List<String> Slike;
        public string SlikeBaza
        {
            get
            {
                return String.Join(";", Slike);
            }
            set
            {
                Slike = value.Split(';').ToList();
            }
        }
    }
}
