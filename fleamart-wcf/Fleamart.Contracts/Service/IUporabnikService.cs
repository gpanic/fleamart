﻿using Fleamart.Contracts.Data;
using System;
using System.Collections.Generic;
using System.Linq;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.Contracts.Service
{
    [ServiceContract]
    public interface IUporabnikService
    {
        [OperationContract]
        String registrirajUporabnika(Uporabnik uporabnik);

        [OperationContract]
        Uporabnik loginCheck(string upImeV, string passV);

        [OperationContract]
        Uporabnik ReadUporabnik(int Id);

        [OperationContract]
        Uporabnik ProfilUporabnika(int Id);

        [OperationContract]
        bool UpdateUporabnik(Uporabnik u);

        [OperationContract]
        List<Uporabnik> ListUporabnik();

        [OperationContract]
        bool DeleteUporabnik(int id);
    }
}
