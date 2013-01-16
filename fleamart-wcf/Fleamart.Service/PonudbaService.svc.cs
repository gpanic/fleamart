using Fleamart.Contracts.Data;
using Fleamart.Contracts.Service;
using Fleamart.Dal.Dao;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace Fleamart.Service
{
    public class PonudbaService : IPonudbaService
    {
        private PonudbaEFDao pdao = new PonudbaEFDao();
        private AvtomatskiPonudnikEFDao apdao = new AvtomatskiPonudnikEFDao();

        public bool placeBidOnItem(Ponudba p, bool autoBider)
        {
            
            OglasEFDao odao = new OglasEFDao();
            Oglas oglas = odao.Read(p.Oglas.Id);

            //ce je cas ze potekel
            if (oglas.CasDo < DateTime.Now)
            {
                oglas.Status = 1;
                odao.Update(oglas);
                return false;
            }
            
            bool vraca = false;
            Ponudba zeObstojeca= pdao.obstajaPonudba(p.Uporabnik.Id, p.Oglas.Id);
            if (zeObstojeca != null)
            {
                zeObstojeca.Znesek = p.Znesek;
                vraca = pdao.Update(zeObstojeca);
            }
            else
            {
                vraca = pdao.Create(p);

            }
            oglas.Kupec = p.Uporabnik;
            
            if (!autoBider)
            {
                oglas.Cena = p.Znesek;
            }
            else
            {
                double korak = 1.0;
                //oglas.Cena += korak;                
                //dobim ponudbe, kjer je vnesen znesek vecji od cene
                List<Ponudba> ponudbe =pdao.PonudbeZaAutobid(oglas.Cena, oglas.Id);
                bool bidaj = ponudbe.Count>0;
                while (bidaj)
                {
                    bidaj = false;

                    foreach (Ponudba ponudba in ponudbe)
                    {
                        if (ponudba.Znesek >= oglas.Cena && oglas.Kupec.Id != ponudba.Uporabnik.Id)
                        {
                            oglas.Cena += korak;
                            oglas.Kupec = ponudba.Uporabnik;
                            bidaj = true;
                        }
                    }
                }

            }

            //ce je zdaj cas ze potekel, nastavimo status oglasa na 1 - torej neaktiven
            if (oglas.CasDo < DateTime.Now)
            {
                oglas.Status = 1;
            }

            odao.Update(oglas);
            return vraca;
        }

    }
}
