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

        [DataMember] 
        public bool Avkcija { get; set; }

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
        public DateTime? CasSpremenjeno { get; set; }

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

        [DataMember]
        public Kategorija Kategorija { get; set; }

        public override string ToString()
        {
            return string.Format("Id: {0}, Naslov: {1}, Avkcija: {2}, Cena: {3}, ZadnjaCenaAvkcija: {4}, Opis: {5}, Slike: {6}, CasOd: {7}, CasDo: {8}, CasSpremenjeno: {9}, Status: {10}, Ponudbe: {11}, StatusNakupa: {12}, Avtor: {13}, Kupec: {14}, Komentarji: {15}, Kategorija: {16}", Id, Naslov, Avkcija, Cena, ZadnjaCenaAvkcija, Opis, Slike, CasOd, CasDo, CasSpremenjeno, Status, Ponudbe, StatusNakupa, Avtor, Kupec, Komentarji, Kategorija);
        }
    }
}
