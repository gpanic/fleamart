using Fleamart.Contracts.Data;
using System;
using System.Collections.Generic;
using System.Linq;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.Contracts.Service
{
    [ServiceContract]
    public interface IOglasService
    {
        [OperationContract]
        bool CreateOglas(Oglas o);

        [OperationContract]
        Oglas ReadOglas(int id);

        [OperationContract]
        Oglas ReadOglasLast(int idAvtor);

        [OperationContract]
        bool UpdateOglas(Oglas o);

        [OperationContract]
        bool DeleteOglas(int id);

        [OperationContract]
        List<Oglas> GetOglasi();

        [OperationContract]
        List<Oglas> ListOglasiAvtor(int idAvtor, int? status, int? statusNakupa);

        [OperationContract]
        List<Oglas> ListOglasiKupec(int idKupec, int statusNakupa);

        [OperationContract]
        List<Oglas> ListOglasiAdmin(int? status, int? statusNakupa);

        [OperationContract]
        List<Oglas> SearchOglasi(String kategorija, String param);

        //za seznam zelja
        [OperationContract]
        bool dodajZeljo(Oglas s, Uporabnik u);

        [OperationContract]
        bool izbrisiZeljo(int id);

        [OperationContract]
        List<Oglas> pridobiSeznamZelja(int uporabnikId);

        [OperationContract]
        List<Oglas> pridobiOglaseProdajalca(int prodajalecId);

        [OperationContract]
        double izracunajPovprecje(int uporabnikId);

        [OperationContract]
        bool DeleteKomentar(int id);
    }
}
