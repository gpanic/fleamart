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

        public List<Oglas> getOglasi()
        {
            return odao.List();
        }

        public List<Oglas> searchOglasi(string kategorija, string param)
        {
            if (kategorija == null && param == null) return this.getOglasi();
            return odao.List(kategorija, param);
        }
    }
}
