using Fleamart.Contracts.Data;
using System;
using System.Collections.Generic;
using System.Linq;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.Contracts.Service
{
    [ServiceContract]
    public interface IKategorijaService
    {
        [OperationContract]
        List<Kategorija> VrniKategorije();

        [OperationContract]
        bool DodajKategorijo(Kategorija k);

        [OperationContract]
        bool IzbrisiKategorijo(int id);
    }
}
