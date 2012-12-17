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
    }
}
