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

    }
}
