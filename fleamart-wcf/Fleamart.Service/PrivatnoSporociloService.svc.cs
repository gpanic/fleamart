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
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "PrivatnoSporociloService" in code, svc and config file together.
    // NOTE: In order to launch WCF Test Client for testing this service, please select PrivatnoSporociloService.svc or PrivatnoSporociloService.svc.cs at the Solution Explorer and start debugging.
    public class PrivatnoSporociloService : IPrivatnoSporociloService
    {

        public bool DodajNovoSporocilo(Contracts.Data.PrivatnoSporocilo ps)
        {
            return new PrivatnoSporociloDao().Create(ps);
        }

        public bool IzbrisiSporocilo(int UserId, int SporociloId)
        {
            PrivatnoSporocilo ps = new PrivatnoSporociloDao().Read(SporociloId);
            try
            {
                if (UserId != ps.PrejemnikId) return false;
            }
            catch (Exception e)
            {
                return false;
            }
            new PrivatnoSporociloDao().Delete(ps.Id);
            return true;
        }

        public List<PrivatnoSporocilo> VrniPrivatnaSporocilaUporabnika(int UporabnikId)
        {
            return new PrivatnoSporociloDao().PrivatnaSporocilaUporabnika(UporabnikId);
        }


        public void OznaciSporociloKotPrebrano(int SporociloId)
        {
            new PrivatnoSporociloDao().OznaciSporociloKotPrebrano(SporociloId);
        }
    }
}
