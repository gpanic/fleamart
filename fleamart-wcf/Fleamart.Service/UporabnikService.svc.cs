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

        public int loginCheck(string upImeV, string passV)
        {
            try
            {               
                /*
                //za kodiranje gesla
                var data = Encoding.ASCII.GetBytes(passV);
                string kript = Convert.ToBase64String(System.Security.Cryptography.MD5.Create().ComputeHash(data));
                */
                Fleamart.Contracts.Data.Uporabnik up = new Fleamart.Dal.Dao.UporabnikEFDao().Read(upImeV);
                if (up == null)
                {
                    return 0;
                }
                if (up.Geslo == passV)
                {
                    return up.Id;
                }
                else
                {
                    return 0;
                }
            }
            catch (System.IO.IOException e)
            {
                Console.WriteLine("Error " + e.Message);
                return 0;
            }

        }

        public Uporabnik ReadUporabnik(int Id)
        {
            Uporabnik u = new UporabnikEFDao().Read(Id);
            
            // Zaradi ciklične reference med uporabnikom in prejemnikom, je potrebno prejemnika nastaviti na null, drugače je exeption pri vračanju!
            if (u.PrivatnaSporocila != null)
            {
                foreach (PrivatnoSporocilo ps in u.PrivatnaSporocila)
                {
                    ps.Prejemnik = null;
                }
            }
            return u;
		}

        public Uporabnik ProfilUporabnika(int Id)
        {
            return udao.Read2(Id);
        }
      
    }
}
