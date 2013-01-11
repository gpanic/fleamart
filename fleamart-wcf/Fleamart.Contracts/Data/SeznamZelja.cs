using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;

namespace Fleamart.Contracts.Data
{
    [DataContract(Name = "SeznamZelja", Namespace = "http//www.fleamart.com/")]
    public class SeznamZelja
    {
        [DataMember]
        public int Id { get; set; }

        [DataMember]
        public Uporabnik Uporabnik { get; set; }

        [DataMember]
        public Oglas Oglas { get; set; }

    }
}
