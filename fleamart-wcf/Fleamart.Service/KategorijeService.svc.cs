using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;
using Fleamart.Contracts.Service;
using Fleamart.Dal.Dao;
using System.Diagnostics;
using Fleamart.Contracts.Data;

namespace Fleamart.Service
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "KategorijeService" in code, svc and config file together.
    // NOTE: In order to launch WCF Test Client for testing this service, please select KategorijeService.svc or KategorijeService.svc.cs at the Solution Explorer and start debugging.
    public class KategorijeService : IKategorijaService
    {
        public List<Kategorija> VrniKategorije()
        {
            return new KategorijaEFDao().List();
        }

        public bool DodajKategorijo(Kategorija k)
        {
            return new KategorijaEFDao().Create(k);
        }

        public bool IzbrisiKategorijo(int id)
        {
            return new KategorijaEFDao().Delete(id);
        }

        public bool DodajNarocenoKategorijo(NarocenaKategorija nk)
        {
            Debug.WriteLine("TO SE PROZI");
            NarocenaKategorijaEFDao nkdao = new NarocenaKategorijaEFDao();
            if (!nkdao.Exists(nk.Uporabnik, nk.Kategorija))
            {
                return nkdao.Create(nk);
            }
            else
            {
                return false;
            }
        }

        public bool IzbrisiNarocenoKategorijo(Uporabnik u, Kategorija k)
        {
            return new NarocenaKategorijaEFDao().Delete(u, k);
        }

        public List<Kategorija> VrniNaroceneKategorije(Uporabnik u)
        {
            List<NarocenaKategorija> list = new NarocenaKategorijaEFDao().List();
            list.Where(x => x.Uporabnik.Id == u.Id).ToList();
            List<Kategorija> kategorije = new List<Kategorija>();
            foreach (NarocenaKategorija nk in list)
            {
                kategorije.Add(nk.Kategorija);
            }
            return kategorije;
        }

        public List<Uporabnik> VrniNaroceneUporabnike(Kategorija k)
        {
            List<NarocenaKategorija> list = new NarocenaKategorijaEFDao().List();
            list.Where(x => x.Kategorija.Id == k.Id).ToList();
            List<Uporabnik> uporabniki = new List<Uporabnik>();
            foreach (NarocenaKategorija nk in list)
            {
                uporabniki.Add(nk.Uporabnik);
            }
            return uporabniki;
        }
    }
}
