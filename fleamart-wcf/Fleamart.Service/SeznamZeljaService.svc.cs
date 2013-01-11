using Fleamart.Contracts.Data;
using Fleamart.Contracts.Service;
using Fleamart.Dal.Dao;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace Fleamart.Service
{
    public class SeznamZeljaService : ISeznamZeljaService
    {
        private SeznamZeljaEFDao szdao = new SeznamZeljaEFDao();

        public bool dodajZeljo(SeznamZelja s)
        {
            return szdao.Create(s);
        }

        public bool izbrisiZeljo(int id)
        {
            return szdao.Delete(id);
        }

        public List<SeznamZelja> pridobiSeznamZelja(int uporabnikId)
        {
            return szdao.List(uporabnikId);
        }
    }
}
