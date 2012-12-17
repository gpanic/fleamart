using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;

namespace Fleamart.Contracts.Data
{
    [DataContract(Name = "Komentar", Namespace = "http//www.fleamart.com/")]
    public class Komentar
    {
        [DataMember]
        public int Id { get; set; }

        [DataMember]
        public string Sporocilo { get; set; }

        [DataMember]
        public DateTime Cas { get; set; }

        [DataMember]
        public Uporabnik Avtor { get; set; }
    }
}
