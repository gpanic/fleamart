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
    public interface IUporabnikService
    {
        [OperationContract]
        String registrirajUporabnika(Uporabnik uporabnik);

        [OperationContract]
        bool LoginCheck(string upImeV, string passV);

    }
}
