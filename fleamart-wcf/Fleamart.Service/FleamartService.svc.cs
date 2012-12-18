using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;
using Fleamart.Dal;
using Fleamart.Contracts.Service;
using Fleamart.Dal.Dao;
using Fleamart.Contracts.Data;

namespace Fleamart.Service
{
    public class FleamartService : IFleamartService
    {
        public string TestOperation()
        {
            return "test";
        }

        public bool placeBidOnItem(double znesek, int idUporabnika, int idOglas)
        {
            try
            {
                
                DateTime cas = DateTime.Now;
                Uporabnik up = new Uporabnik();
                up.Id = idUporabnika;
                Oglas og = new Oglas();
                og.Id = idOglas;
                Fleamart.Contracts.Data.Ponudba ponudba = new Fleamart.Contracts.Data.Ponudba();
                ponudba.Cas = cas;
                ponudba.Znesek = znesek;
                ponudba.Uporabnik = up;
                ponudba.Oglas = og;
                
                if (new Fleamart.Dal.Dao.PonudbaEFDao().Create(ponudba) == true)
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
                Console.WriteLine("Error " + e.Message);
                return false;
            }
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
    }
}
