using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.Contracts.Data
{
    [DataContract(Name = "OcenaDTO", Namespace = "http//www.fleamart.com/")]
    public class OcenaDTO
    {
        [DataMember]
        public int Id { get; set; }

        [DataMember]
        public int Tip { get; set; }

        [DataMember]
        public int Ocena { get; set; }

        [DataMember]
        public int OglasId { get; set; }

        [DataMember]
        public Oglas Oglas { get; set; }

    }
}
