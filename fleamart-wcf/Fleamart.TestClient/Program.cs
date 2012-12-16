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

            //test na zacetku
            string imeZ = "miha";
            string gesZ = "geslo";
            bool vrne = client.LoginCheck(imeZ, gesZ);
            if (vrne == true)
            {
                Console.WriteLine("enako");
            }
            else
            {
                Console.WriteLine("ni enako");
            }

            Console.ReadLine();

        }
    }
}
