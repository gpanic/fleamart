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
        public DbSet<SupportTicketEF> SupportTickets { get; set; }
        public DbSet<SupportTicketStatusEF> SupportTicketStatusi { get; set; }
        public DbSet<SupportTicketKomentarEF> SupportTicketKomentarji { get; set; }
        public DbSet<SupportTicketKategorijaEF> SupportTicketKategorije { get; set; }

        protected override void OnModelCreating(DbModelBuilder mb)
        {
            mb.Entity<SupportTicketEF>().HasOptional(x => x.Avtor).WithMany().HasForeignKey(x => x.AvtorId).WillCascadeOnDelete(false);
            mb.Entity<SupportTicketEF>().HasOptional(x => x.Tehnik).WithMany().HasForeignKey(x => x.TehnikId).WillCascadeOnDelete(false);
            mb.Entity<UporabnikEF>().HasMany(x => x.PrivatnaSporocila).WithRequired(i => i.Prejemnik).WillCascadeOnDelete(false);
        }
    }
}
