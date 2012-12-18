using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.Contracts.Data
{
    [DataContract(Name = "Kategorija", Namespace = "http//www.fleamart.com/")]
    public class Kategorija
    {
        [DataMember]
        public int Id { get; set; }

        [DataMember]
        public string Naziv { get; set; }

        [DataMember]
        public Kategorija Nadkategorija { get; set; }

        [DataMember]
        public int NadkategorijaId { get; set; }

        public override string ToString()
        {
            return string.Format("Id: {0}, Naziv: {1}, Nadkategorija: {2}, NadkategorijaId: {3}", Id, Naziv, Nadkategorija, NadkategorijaId);
        }
    }
}
