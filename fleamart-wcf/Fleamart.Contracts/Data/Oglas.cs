using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.Contracts.Data
{
    [DataContract(Name = "Oglas", Namespace = "http//www.fleamart.com/")]
    public class Oglas
    {
        [DataMember]
        public int Id { get; set; }

        [DataMember]
        public string Naslov { get; set; }

        [DataMember] //to je "boolean"
        public int Avkcija { get; set; }

        [DataMember]
        public double Cena { get; set; }

        [DataMember]
        public double? ZadnjaCenaAvkcija { get; set; }

        [DataMember]
        public string Opis { get; set; }

        [DataMember]
        public List<string> Slike { get; set; }

        [DataMember]
        public DateTime CasOd { get; set; }

        [DataMember]
        public DateTime CasDo { get; set; }

        [DataMember]
        public DateTime CasSpremenjeno { get; set; }

        [DataMember]
        public int Status { get; set; }

        [DataMember]
        public List<Ponudba> Ponudbe { get; set; }

        [DataMember]
        public int? StatusNakupa { get; set; }

        [DataMember]
        public Uporabnik Avtor { get; set; }

        [DataMember]
        public Uporabnik Kupec { get; set; }

        [DataMember]
        public List<Komentar> Komentarji { get; set; }
    }
}
