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
        private AvtomatskiPonudnikEFDao apdao = new AvtomatskiPonudnikEFDao();

        public bool placeBidOnItem(Ponudba p)
        {
            OglasEFDao odao = new OglasEFDao();
            Oglas oglas = odao.Read(p.Oglas.Id);
            oglas.ZadnjaCenaAvkcija = p.Znesek;
            odao.Update(oglas);
            return pdao.Create(p);
        }

        public bool placeAutoBidOnItem(AvtomatskiPonudnik a)
        {
            return apdao.Create(a);
        }
    }
}
