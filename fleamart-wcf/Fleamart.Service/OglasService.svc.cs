using Fleamart.Contracts.Data;
using Fleamart.Contracts.Service;
using Fleamart.Dal.Dao;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Activation;
using System.ServiceModel.Web;
using System.Text;

namespace Fleamart.Service
{
    public class OglasService : IOglasService
    {
        private OglasEFDao odao = new OglasEFDao();

        public bool CreateOglas(Oglas o)
        {
            return odao.Create(o);
        }

        public Oglas ReadOglas(int id)
        {
            return odao.Read(id);
        }

        public bool UpdateOglas(Oglas o)
        {
            return odao.Update(o);
        }

        public bool DeleteOglas(int id)
        {
            return odao.Delete(id);
        }

        public List<Oglas> GetOglasi()
        {
            return odao.List();
        }

        public List<Oglas> SearchOglasi(string kategorija, string param)
        {
            if (kategorija == null && param == null) return this.GetOglasi();
            return odao.List(kategorija, param);
        }


        public List<Oglas> ListOglasiAvtor(int idAvtor, int? status, int? statusNakupa)
        {
            return odao.List(idAvtor, status, statusNakupa);
        }

        public List<Oglas> ListOglasiKupec(int idKupec, int statusNakupa)
        {
            return odao.List(idKupec, statusNakupa);
        }

        public Oglas ReadOglasLast(int idAvtor)
        {
            return odao.ReadLast(idAvtor);
        }

        //za seznam zelja

        private SeznamZeljaEFDao szdao = new SeznamZeljaEFDao();

        public bool dodajZeljo(Oglas s, Uporabnik u)
        {
            SeznamZelja sez = new SeznamZelja();
            sez.Oglas = s;
            sez.Uporabnik = u;
            return szdao.Create(sez);
        }

        public bool izbrisiZeljo(int id)
        {
            return szdao.Delete(id);
        }

        public List<Oglas> pridobiSeznamZelja(int uporabnikId)
        {
            return szdao.List(uporabnikId);
        }
        
        //za Profil prodajalca
        public List<Oglas> pridobiOglaseProdajalca(int prodajalecId)
        {
            return odao.OglasiPoAvtorId(prodajalecId);
        }

        public double izracunajPovprecje(int uporabnikId)
        {
            return odao.VrniPovprecjeOcen(uporabnikId);
        }

    }
}
