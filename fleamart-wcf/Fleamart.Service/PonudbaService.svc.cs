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
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "PonudbaService" in code, svc and config file together.
    // NOTE: In order to launch WCF Test Client for testing this service, please select PonudbaService.svc or PonudbaService.svc.cs at the Solution Explorer and start debugging.
    public class PonudbaService : IPonudbaService
    {
        private PonudbaEFDao pdao = new PonudbaEFDao();

        public bool placeBidOnItem(Ponudba p)
        {
            return pdao.Create(p);
        }
    }
}
