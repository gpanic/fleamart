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
    public interface IOglasService
    {
        [OperationContract]
        bool CreateOglas(Oglas o);

        [OperationContract]
        Oglas ReadOglas(int id);

        [OperationContract]
        bool UpdateOglas(Oglas o);

        [OperationContract]
        bool DeleteOglas(int id);

    }
}
