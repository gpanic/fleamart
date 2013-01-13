using Fleamart.Contracts.Data;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.Dal.Entities
{
    public class PrivatnoSporociloEF
    {
        public int Id { get; set; }
        public string Sporocilo { get; set; }
        public DateTime Cas { get; set; }
        public Boolean Prebrano { get; set; }

        public int PosiljateljId { get; set; }
        public virtual UporabnikEF Posiljatelj { get; set; }

        public int PrejemnikId { get; set; }
        public virtual UporabnikEF Prejemnik { get; set; }
    }
}
