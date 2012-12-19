using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.Contracts.Data
{
    [DataContract(Name = "Uporabnik", Namespace = "http//www.fleamart.com/")]
    public class Uporabnik
    {
        [DataMember]
        public int Id { get; set; }

        [DataMember]
        public int Vloga { get; set; }

        [DataMember]
        public string Ime { get; set; }

        [DataMember]
        public string Priimek { get; set; }

        [DataMember]
        public string Email { get; set; }

        [DataMember]
        public string Upime { get; set; }

        [DataMember]
        public string Geslo { get; set; }

        [DataMember]
        public string Telefon { get; set; }

        [DataMember]
        public Naslov Naslov { get; set; }

        [DataMember]
        public List<PrivatnoSporocilo> PrivatnaSporocila { get; set; }

        [DataMember]
        public List<SeznamZelja> SeznamZelja { get; set; }

        public override string ToString()
        {
            return string.Format("Id: {0}, Vloga: {1}, Ime: {2}, Priimek: {3}, Email: {4}, Upime: {5}, Geslo: {6}, Telefon: {7}, Naslov: {8}, PrivatnaSporocila: {9}, SeznamZelja: {10}", Id, Vloga, Ime, Priimek, Email, Upime, Geslo, Telefon, Naslov, PrivatnaSporocila, SeznamZelja);
        }
    }
}
