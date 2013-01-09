using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.Contracts.Data
{
    [DataContract(Name = "NarocenaKategorija", Namespace = "http//www.fleamart.com/")]
    public class NarocenaKategorija
    {
        [DataMember]
        public int Id { get; set; }

        [DataMember]
        public Uporabnik Uporabnik { get; set; }

        [DataMember]
        public Kategorija Kategorija { get; set; }
    }
}
