using Fleamart.Contracts.Data;
using Fleamart.Contracts.Service;
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
    }
}
