using Fleamart.Contracts.Data;
using System.Linq;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;
namespace Fleamart.Contracts.Service
{
    [ServiceContract]
    public interface IPonudbaService
    {
        [OperationContract]
        bool placeBidOnItem(Ponudba p, bool autoBider);

    }
}
