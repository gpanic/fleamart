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

    }
}
