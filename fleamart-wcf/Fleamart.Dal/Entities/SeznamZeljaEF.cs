using Fleamart.Contracts.Data;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.Dal.Entities
{
    public class SeznamZeljaEF
    {
        public int Id { get; set; }

        public int OglasId { get; set; }
        public virtual OglasEF Oglas { get; set; }

    }
}
