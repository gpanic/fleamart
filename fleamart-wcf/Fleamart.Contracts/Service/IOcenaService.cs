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
    public interface IOcenaService
    {
        [OperationContract]
        List<Oglas> VrniNeocenjeneOglaseKupca(int kupecId);

        [OperationContract]
        void oceniOglas(int kupecId, List<OcenaDTO> ocena);
    }
}
