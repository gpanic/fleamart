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
    public interface IPrivatnoSporociloService
    {
        [OperationContract]
        bool DodajNovoSporocilo(PrivatnoSporocilo ps);

        [OperationContract]
        bool IzbrisiSporocilo(int UserId, int SporociloId);

        [OperationContract]
        List<PrivatnoSporocilo> VrniPrivatnaSporocilaUporabnika(int UporabnikId);

        [OperationContract]
        void OznaciSporociloKotPrebrano(int SporociloId);
    }
}
