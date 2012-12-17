using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.Contracts.Data
{
    [DataContract(Name = "Naslov", Namespace = "http//www.fleamart.com/")]
    public class Naslov
    {
        [DataMember]
        public int Id { get; set; }

        [DataMember]
        public string Ulica { get; set; }

        [DataMember]
        public int PostnaStevilka { get; set; }

        [DataMember]
        public string Obcina { get; set; }

        [DataMember]
        public string Drzava { get; set; }
    }
}
