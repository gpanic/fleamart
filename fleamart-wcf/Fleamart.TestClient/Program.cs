using Fleamart.TestClient.FleamartServiceReference;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.TestClient
{
    class Program
    {
        static void Main(string[] args)
        {
            FleamartServiceClient client = new FleamartServiceClient();
            string response = client.TestOperation();
            Console.WriteLine(response);
            Console.ReadLine();

        }
    }
}
