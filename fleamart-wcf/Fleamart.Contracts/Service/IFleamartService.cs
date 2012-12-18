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
    public interface IFleamartService
    {
        [OperationContract]
        string TestOperation();

        [OperationContract]
        bool LoginCheck(string upImeV, string passV);

        [OperationContract]
        bool placeBidOnItem(double znesek, int idUporabnika, int idOglas);

    }
}
