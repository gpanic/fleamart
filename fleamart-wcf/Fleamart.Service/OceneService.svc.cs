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
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "OceneService" in code, svc and config file together.
    // NOTE: In order to launch WCF Test Client for testing this service, please select OceneService.svc or OceneService.svc.cs at the Solution Explorer and start debugging.
    public class OceneService : IOcenaService
    {
        OglasEFDao odao = new OglasEFDao();
        OcenaEFDao ocenadao = new OcenaEFDao();

        public List<Contracts.Data.Oglas> VrniNeocenjeneOglaseKupca(int kupecId)
        {
            return odao.ListProdaniNeocenjeni(kupecId);
        }


        public void oceniOglas(int kupecId, List<Contracts.Data.OcenaDTO> ocene)
        {
            Oglas oglas = null;
            foreach (OcenaDTO ocena in ocene)
            {
                oglas = odao.Read(ocena.OglasId);
                if (oglas.Kupec.Id != kupecId) break;

                if (ocenadao.ReadByUporabnik(kupecId, ocena)) continue;
                ocenadao.Create(ocena);
            }

            Console.WriteLine("bla");
        }
    }
}
