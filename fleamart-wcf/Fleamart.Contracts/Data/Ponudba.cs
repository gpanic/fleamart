using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;

namespace Fleamart.Contracts.Data
{
    [DataContract(Name = "Ponudba", Namespace = "http//www.fleamart.com/")]
    public class Ponudba
    {
        [DataMember]
        public int Id { get; set; }

        [DataMember]
        public double Znesek { get; set; }

        [DataMember]
        public DateTime Cas { get; set; }

        [DataMember]
        public Uporabnik Uporabnik { get; set; }
    }
}
