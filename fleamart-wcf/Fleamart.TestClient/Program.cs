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

            /*
            double z = 50;
            int idU = 3;
            int idO = 2;
            bool vrne = client.placeBidOnItem(z, idU, idO);
            if (vrne == true)
            {
                Console.WriteLine("vpisan");
            }
            else
            {
                Console.WriteLine("ni vpisan");
            }

            
            //test na zacetku
            string u1 = "metka";
            string p1 = "novak";
            int vrne = client.LoginCheck(u1, p1);
            if (vrne != 0)
            {
                Console.WriteLine("enako");
            }
            else
            {
                Console.WriteLine("ni enako");
            }
            */
            Console.ReadLine();

        }
    }
}
