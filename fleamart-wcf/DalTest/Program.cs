using AutoMapper;
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
                db.Database.Initialize(true);
                Console.WriteLine("DATABASE INITIALIZED");
                Console.ReadLine();
            }
        }
    }
}
