using Fleamart.Contracts.Data;
using System.Collections.Generic;
using System.Linq;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.Contracts.Service
{
    [ServiceContract]
    public interface ISeznamZeljaService
    {
        [OperationContract]
        bool dodajZeljo(SeznamZelja s);

        [OperationContract]
        bool izbrisiZeljo(int id);

        [OperationContract]
        List<SeznamZelja> pridobiSeznamZelja(int uporabnikId);
        
    }
}
