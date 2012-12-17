using Fleamart.Contracts.Service;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;
using Fleamart.Dal;

namespace Fleamart.Service
{
    public class FleamartService : IFleamartService
    {
        public string TestOperation()
        {
            return "test";
        }


        public bool LoginCheck(string upImeV, string passV)
        {
            try
            {
                Fleamart.Contracts.Data.Uporabnik up = new Fleamart.Dal.Dao.UporabnikEFDao().Read(upImeV);
                if (up == null)
                {
                    return false;
                }
                    
                if (up.Geslo == passV)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
            catch (System.IO.IOException e)
            {
                Console.WriteLine("Error "+ e.Message);
                return false;
            }
                        
        }


        #region Kategorije
        public List<Contracts.Data.Kategorija> VrniKategorije()
        {
            throw new NotImplementedException();
        }

        public bool DodajKategorijo(Contracts.Data.Kategorija k)
        {
            throw new NotImplementedException();
        }

        public bool IzbrisiKategorijo(int id)
        {
            throw new NotImplementedException();
        }
        #endregion
    }
}
