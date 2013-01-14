using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;

namespace Fleamart.Contracts.Data
{
    [DataContract(Name = "PrivatnoSporocilo", Namespace = "http//www.fleamart.com/", IsReference=true)]
    public class PrivatnoSporocilo
    {
        [DataMember(Name="PrivatnoSporociloId")]
        public int Id { get; set; }

        [DataMember]
        public string Sporocilo { get; set; }

        [DataMember]
        public DateTime Cas { get; set; }

        [DataMember]
        public Boolean Prebrano { get; set; }

        [DataMember]
        public int PosiljateljId { get; set; }

        [DataMember]
        public Uporabnik Posiljatelj { get; set; }

        [DataMember]
        public int PrejemnikId { get; set; }

        [DataMember]
        public Uporabnik Prejemnik { get; set; }

    }
}
