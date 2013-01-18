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

        public Uporabnik loginCheck(string upImeV, string passV)
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
                    return null;
                }
                if (up.Geslo == passV)
                {
                    return up;
                }
                else
                {
                    return null;
                }
            }
            catch (System.IO.IOException e)
            {
                Console.WriteLine("Error " + e.Message);
                return null;
            }

        }

        public Uporabnik ReadUporabnik(int Id)
        {
            Uporabnik u = new UporabnikEFDao().Read(Id);
            return u;
		}

        public Uporabnik ProfilUporabnika(int Id)
        {
            return udao.Read2(Id);
        }



        public bool UpdateUporabnik(Uporabnik u)
        {
            return udao.Update(u);
        }

        public List<Uporabnik> ListUporabnik()
        {
            return udao.List();
        }


        public bool DeleteUporabnik(int id)
        {
            return udao.Delete(id);
        }
    }
}
