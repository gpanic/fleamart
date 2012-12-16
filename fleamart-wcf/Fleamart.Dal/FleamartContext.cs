using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Fleamart.Dal.Entities;

namespace Fleamart.Dal
{
    public class FleamartContext : DbContext
    {
        public DbSet<AvtomatskiPonudnikEF> AvtomatskiPonudbniki { get; set; }
        public DbSet<KarticniSistemEF> KarticniSistemi { get; set; }
        public DbSet<KategorijaEF> Kategorije { get; set; }
        public DbSet<KategorijaKarticnegaSistemaEF> KategorijeKarticnegaSistema { get; set; }
        public DbSet<KomentarEF> Komentarji { get; set; }
        public DbSet<NarocenaKategorijaEF> NaroceneKategorije { get; set; }
        public DbSet<NaslovEF> Naslovi { get; set; }
        public DbSet<OcenaEF> Ocene { get; set; }
        public DbSet<OglasEF> Oglasi { get; set; }
        public DbSet<PonudbaEF> Ponudbe { get; set; }
        public DbSet<PrivatnoSporociloEF> PrivatnaSporocila { get; set; }
        public DbSet<SeznamZeljaEF> SeznamZelja { get; set; }
        public DbSet<UporabnikEF> Uporabniki { get; set; }

        protected override void OnModelCreating(DbModelBuilder mb)
        {
     
           
        }
    }
}
