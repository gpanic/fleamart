using Fleamart.Contracts.Service;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;

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
