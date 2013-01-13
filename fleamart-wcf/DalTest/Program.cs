using Fleamart.Contracts.Data;
using Fleamart.Dal;
using Fleamart.Dal.Dao;
using Fleamart.Dal.Entities;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.DalTest
{
    class Program
    {
        static void Main(string[] args)
        {
            using (var db = new FleamartContext())
            {
                //db.Database.Initialize(true);
                SupportTicketEFDao dao = new SupportTicketEFDao();
                //dao.Create(new SupportTicket { Avtor = new Uporabnik { Id = 1 }, Kategorija = new SupportTicketKategorija { Id = 1 }, Naslov = "naslov", Status = new SupportTicketStatus { Id = 1 }, Vsebina = "vsebina" });
                Console.WriteLine(dao.Update(new SupportTicket {Id=2, Kategorija = new SupportTicketKategorija { Id = 1 }, Status = new SupportTicketStatus { Id = 1 }, Vsebina = "ssssssss" }));
                Console.WriteLine("DATABASE INITIALIZED");
                Console.ReadLine();
            }
        }
    }
}
