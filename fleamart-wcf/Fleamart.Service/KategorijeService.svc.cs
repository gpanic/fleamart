using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;
using Fleamart.Contracts.Service;
using Fleamart.Dal.Dao;

namespace Fleamart.Service
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "KategorijeService" in code, svc and config file together.
    // NOTE: In order to launch WCF Test Client for testing this service, please select KategorijeService.svc or KategorijeService.svc.cs at the Solution Explorer and start debugging.
    public class KategorijeService : IKategorijaService
    {

        public List<Contracts.Data.Kategorija> VrniKategorije()
        {
            return new KategorijaEFDao().List();
        }

        public bool DodajKategorijo(Contracts.Data.Kategorija k)
        {
            return new KategorijaEFDao().Create(k);
        }

        public bool IzbrisiKategorijo(int id)
        {
            throw new NotImplementedException();
        }
    }
}
