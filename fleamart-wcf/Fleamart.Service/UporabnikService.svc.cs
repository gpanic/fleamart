using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;
using Fleamart.Contracts.Service;
using Fleamart.Dal.Dao;
using Fleamart.Contracts.Data;

namespace Fleamart.Service
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "UporabnikService" in code, svc and config file together.
    // NOTE: In order to launch WCF Test Client for testing this service, please select UporabnikService.svc or UporabnikService.svc.cs at the Solution Explorer and start debugging.
    public class UporabnikService : IUporabnikService
    {
        UporabnikEFDao udao = new UporabnikEFDao();
        public string registrirajUporabnika(Contracts.Data.Uporabnik uporabnik)
        {
            Uporabnik u = udao.Read(uporabnik.Upime);
            if (u != null) return "false";

            return udao.Create(uporabnik).ToString();
        }
    }
}
