using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;

namespace Fleamart.Contracts.Data
{
    [DataContract(Name = "AvtomatskiPonudnik", Namespace = "http//www.fleamart.com/")]
    public class AvtomatskiPonudnik
    {
        [DataMember]
        public int Id { get; set; }

        [DataMember]
        public double MaxCena { get; set; }

        [DataMember]
        public bool Aktiven { get; set; }

        [DataMember]
        public Oglas Oglas { get; set; }

        [DataMember]
        public Uporabnik Uporabnik { get; set; }

    }
}
