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
        bool placeBidOnItem(double znesek, int idUporabnika, int idOglas);
    }
}
