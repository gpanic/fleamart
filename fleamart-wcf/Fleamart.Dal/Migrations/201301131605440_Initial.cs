namespace Fleamart.Dal.Migrations
{
    using System;
    using System.Data.Entity.Migrations;
    
    public partial class Initial : DbMigration
    {
        public override void Up()
        {
            CreateTable(
                "dbo.AvtomatskiPonudnikEFs",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        MaxCena = c.Double(nullable: false),
                        Aktiven = c.Boolean(nullable: false),
                        OglasId = c.Int(nullable: false),
                        UporabnikId = c.Int(nullable: false),
                    })
                .PrimaryKey(t => t.Id)
                .ForeignKey("dbo.OglasEFs", t => t.OglasId, cascadeDelete: true)
                .ForeignKey("dbo.UporabnikEFs", t => t.UporabnikId, cascadeDelete: true)
                .Index(t => t.OglasId)
                .Index(t => t.UporabnikId);
            
            CreateTable(
                "dbo.OglasEFs",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        Naslov = c.String(nullable: false),
                        Avkcija = c.Boolean(nullable: false),
                        Cena = c.Double(nullable: false),
                        ZadnjaCenaAvkcija = c.Double(),
                        Opis = c.String(nullable: false),
                        CasOd = c.DateTime(nullable: false),
                        CasDo = c.DateTime(nullable: false),
                        CasSpremenjeno = c.DateTime(),
                        Status = c.Int(nullable: false),
                        StatusNakupa = c.Int(),
                        AvtorId = c.Int(),
                        KupecId = c.Int(),
                        KategorijaId = c.Int(nullable: false),
                        SlikeBaza = c.String(),
                    })
                .PrimaryKey(t => t.Id)
                .ForeignKey("dbo.UporabnikEFs", t => t.AvtorId)
                .ForeignKey("dbo.UporabnikEFs", t => t.KupecId)
                .ForeignKey("dbo.KategorijaEFs", t => t.KategorijaId, cascadeDelete: true)
                .Index(t => t.AvtorId)
                .Index(t => t.KupecId)
                .Index(t => t.KategorijaId);
            
            CreateTable(
                "dbo.PonudbaEFs",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        Znesek = c.Double(nullable: false),
                        Cas = c.DateTime(nullable: false),
                        UporabnikId = c.Int(nullable: false),
                        OglasId = c.Int(nullable: false),
                    })
                .PrimaryKey(t => t.Id)
                .ForeignKey("dbo.UporabnikEFs", t => t.UporabnikId, cascadeDelete: true)
                .ForeignKey("dbo.OglasEFs", t => t.OglasId, cascadeDelete: true)
                .Index(t => t.UporabnikId)
                .Index(t => t.OglasId);
            
            CreateTable(
                "dbo.UporabnikEFs",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        Vloga = c.Int(nullable: false),
                        Ime = c.String(),
                        Priimek = c.String(),
                        Email = c.String(),
                        Upime = c.String(),
                        Geslo = c.String(),
                        Telefon = c.String(),
                        NaslovId = c.Int(),
                    })
                .PrimaryKey(t => t.Id)
                .ForeignKey("dbo.NaslovEFs", t => t.NaslovId)
                .Index(t => t.NaslovId);
            
            CreateTable(
                "dbo.NaslovEFs",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        Ulica = c.String(),
                        PostnaStevilka = c.Int(nullable: false),
                        Obcina = c.String(),
                        Drzava = c.String(),
                    })
                .PrimaryKey(t => t.Id);
            
            CreateTable(
                "dbo.PrivatnoSporociloEFs",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        Sporocilo = c.String(),
                        Cas = c.DateTime(nullable: false),
                        PosiljateljtId = c.Int(nullable: false),
                        Posiljatelj_Id = c.Int(),
                    })
                .PrimaryKey(t => t.Id)
                .ForeignKey("dbo.UporabnikEFs", t => t.Posiljatelj_Id)
                .Index(t => t.Posiljatelj_Id);
            
            CreateTable(
                "dbo.SeznamZeljaEFs",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        OglasId = c.Int(nullable: false),
                        UporabnikEF_Id = c.Int(),
                    })
                .PrimaryKey(t => t.Id)
                .ForeignKey("dbo.OglasEFs", t => t.OglasId, cascadeDelete: true)
                .ForeignKey("dbo.UporabnikEFs", t => t.UporabnikEF_Id)
                .Index(t => t.OglasId)
                .Index(t => t.UporabnikEF_Id);
            
            CreateTable(
                "dbo.KategorijaEFs",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        Naziv = c.String(),
                    })
                .PrimaryKey(t => t.Id);
            
            CreateTable(
                "dbo.KomentarEFs",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        Sporocilo = c.String(),
                        Cas = c.DateTime(nullable: false),
                        AvtorId = c.Int(nullable: false),
                        OglasEF_Id = c.Int(),
                    })
                .PrimaryKey(t => t.Id)
                .ForeignKey("dbo.UporabnikEFs", t => t.AvtorId, cascadeDelete: true)
                .ForeignKey("dbo.OglasEFs", t => t.OglasEF_Id)
                .Index(t => t.AvtorId)
                .Index(t => t.OglasEF_Id);
            
            CreateTable(
                "dbo.KarticniSistemEFs",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        Naslov = c.String(),
                        Opis = c.String(),
                        Status = c.Int(nullable: false),
                        CasNastanka = c.DateTime(nullable: false),
                        CasRazresitve = c.DateTime(nullable: false),
                        AvtorId = c.Int(nullable: false),
                        KategorijaId = c.Int(nullable: false),
                    })
                .PrimaryKey(t => t.Id)
                .ForeignKey("dbo.UporabnikEFs", t => t.AvtorId, cascadeDelete: true)
                .ForeignKey("dbo.KategorijaKarticnegaSistemaEFs", t => t.KategorijaId, cascadeDelete: true)
                .Index(t => t.AvtorId)
                .Index(t => t.KategorijaId);
            
            CreateTable(
                "dbo.KategorijaKarticnegaSistemaEFs",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        Naziv = c.String(),
                    })
                .PrimaryKey(t => t.Id);
            
            CreateTable(
                "dbo.NarocenaKategorijaEFs",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        UporabnikId = c.Int(nullable: false),
                        KategorijaId = c.Int(nullable: false),
                    })
                .PrimaryKey(t => t.Id)
                .ForeignKey("dbo.UporabnikEFs", t => t.UporabnikId, cascadeDelete: true)
                .ForeignKey("dbo.KategorijaEFs", t => t.KategorijaId, cascadeDelete: true)
                .Index(t => t.UporabnikId)
                .Index(t => t.KategorijaId);
            
            CreateTable(
                "dbo.OcenaEFs",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        Tip = c.Int(nullable: false),
                        Ocena = c.Int(nullable: false),
                        OglasId = c.Int(nullable: false),
                    })
                .PrimaryKey(t => t.Id)
                .ForeignKey("dbo.OglasEFs", t => t.OglasId, cascadeDelete: true)
                .Index(t => t.OglasId);
            
            CreateTable(
                "dbo.SupportTicketEFs",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        Naslov = c.String(),
                        Vsebina = c.String(),
                        CasUstvarjen = c.DateTime(),
                        CasZaprt = c.DateTime(),
                        StatusId = c.Int(nullable: false),
                        KategorijaId = c.Int(nullable: false),
                        AvtorId = c.Int(nullable: false),
                        TehnikId = c.Int(nullable: false),
                    })
                .PrimaryKey(t => t.Id)
                .ForeignKey("dbo.SupportTicketStatusEFs", t => t.StatusId, cascadeDelete: true)
                .ForeignKey("dbo.SupportTicketKategorijaEFs", t => t.KategorijaId, cascadeDelete: true)
                .ForeignKey("dbo.UporabnikEFs", t => t.AvtorId)
                .ForeignKey("dbo.UporabnikEFs", t => t.TehnikId)
                .Index(t => t.StatusId)
                .Index(t => t.KategorijaId)
                .Index(t => t.AvtorId)
                .Index(t => t.TehnikId);
            
            CreateTable(
                "dbo.SupportTicketStatusEFs",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        Naziv = c.String(),
                        Opis = c.String(),
                    })
                .PrimaryKey(t => t.Id);
            
            CreateTable(
                "dbo.SupportTicketKategorijaEFs",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        Naziv = c.String(),
                    })
                .PrimaryKey(t => t.Id);
            
            CreateTable(
                "dbo.SupportTicketKomentarEFs",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        Cas = c.DateTime(),
                        Vsebina = c.String(),
                        AvtorId = c.Int(nullable: false),
                        SupportTicketId = c.Int(nullable: false),
                    })
                .PrimaryKey(t => t.Id)
                .ForeignKey("dbo.UporabnikEFs", t => t.AvtorId, cascadeDelete: true)
                .ForeignKey("dbo.SupportTicketEFs", t => t.SupportTicketId, cascadeDelete: true)
                .Index(t => t.AvtorId)
                .Index(t => t.SupportTicketId);
            
        }
        
        public override void Down()
        {
            DropIndex("dbo.SupportTicketKomentarEFs", new[] { "SupportTicketId" });
            DropIndex("dbo.SupportTicketKomentarEFs", new[] { "AvtorId" });
            DropIndex("dbo.SupportTicketEFs", new[] { "TehnikId" });
            DropIndex("dbo.SupportTicketEFs", new[] { "AvtorId" });
            DropIndex("dbo.SupportTicketEFs", new[] { "KategorijaId" });
            DropIndex("dbo.SupportTicketEFs", new[] { "StatusId" });
            DropIndex("dbo.OcenaEFs", new[] { "OglasId" });
            DropIndex("dbo.NarocenaKategorijaEFs", new[] { "KategorijaId" });
            DropIndex("dbo.NarocenaKategorijaEFs", new[] { "UporabnikId" });
            DropIndex("dbo.KarticniSistemEFs", new[] { "KategorijaId" });
            DropIndex("dbo.KarticniSistemEFs", new[] { "AvtorId" });
            DropIndex("dbo.KomentarEFs", new[] { "OglasEF_Id" });
            DropIndex("dbo.KomentarEFs", new[] { "AvtorId" });
            DropIndex("dbo.SeznamZeljaEFs", new[] { "UporabnikEF_Id" });
            DropIndex("dbo.SeznamZeljaEFs", new[] { "OglasId" });
            DropIndex("dbo.PrivatnoSporociloEFs", new[] { "Posiljatelj_Id" });
            DropIndex("dbo.UporabnikEFs", new[] { "NaslovId" });
            DropIndex("dbo.PonudbaEFs", new[] { "OglasId" });
            DropIndex("dbo.PonudbaEFs", new[] { "UporabnikId" });
            DropIndex("dbo.OglasEFs", new[] { "KategorijaId" });
            DropIndex("dbo.OglasEFs", new[] { "KupecId" });
            DropIndex("dbo.OglasEFs", new[] { "AvtorId" });
            DropIndex("dbo.AvtomatskiPonudnikEFs", new[] { "UporabnikId" });
            DropIndex("dbo.AvtomatskiPonudnikEFs", new[] { "OglasId" });
            DropForeignKey("dbo.SupportTicketKomentarEFs", "SupportTicketId", "dbo.SupportTicketEFs");
            DropForeignKey("dbo.SupportTicketKomentarEFs", "AvtorId", "dbo.UporabnikEFs");
            DropForeignKey("dbo.SupportTicketEFs", "TehnikId", "dbo.UporabnikEFs");
            DropForeignKey("dbo.SupportTicketEFs", "AvtorId", "dbo.UporabnikEFs");
            DropForeignKey("dbo.SupportTicketEFs", "KategorijaId", "dbo.SupportTicketKategorijaEFs");
            DropForeignKey("dbo.SupportTicketEFs", "StatusId", "dbo.SupportTicketStatusEFs");
            DropForeignKey("dbo.OcenaEFs", "OglasId", "dbo.OglasEFs");
            DropForeignKey("dbo.NarocenaKategorijaEFs", "KategorijaId", "dbo.KategorijaEFs");
            DropForeignKey("dbo.NarocenaKategorijaEFs", "UporabnikId", "dbo.UporabnikEFs");
            DropForeignKey("dbo.KarticniSistemEFs", "KategorijaId", "dbo.KategorijaKarticnegaSistemaEFs");
            DropForeignKey("dbo.KarticniSistemEFs", "AvtorId", "dbo.UporabnikEFs");
            DropForeignKey("dbo.KomentarEFs", "OglasEF_Id", "dbo.OglasEFs");
            DropForeignKey("dbo.KomentarEFs", "AvtorId", "dbo.UporabnikEFs");
            DropForeignKey("dbo.SeznamZeljaEFs", "UporabnikEF_Id", "dbo.UporabnikEFs");
            DropForeignKey("dbo.SeznamZeljaEFs", "OglasId", "dbo.OglasEFs");
            DropForeignKey("dbo.PrivatnoSporociloEFs", "Posiljatelj_Id", "dbo.UporabnikEFs");
            DropForeignKey("dbo.UporabnikEFs", "NaslovId", "dbo.NaslovEFs");
            DropForeignKey("dbo.PonudbaEFs", "OglasId", "dbo.OglasEFs");
            DropForeignKey("dbo.PonudbaEFs", "UporabnikId", "dbo.UporabnikEFs");
            DropForeignKey("dbo.OglasEFs", "KategorijaId", "dbo.KategorijaEFs");
            DropForeignKey("dbo.OglasEFs", "KupecId", "dbo.UporabnikEFs");
            DropForeignKey("dbo.OglasEFs", "AvtorId", "dbo.UporabnikEFs");
            DropForeignKey("dbo.AvtomatskiPonudnikEFs", "UporabnikId", "dbo.UporabnikEFs");
            DropForeignKey("dbo.AvtomatskiPonudnikEFs", "OglasId", "dbo.OglasEFs");
            DropTable("dbo.SupportTicketKomentarEFs");
            DropTable("dbo.SupportTicketKategorijaEFs");
            DropTable("dbo.SupportTicketStatusEFs");
            DropTable("dbo.SupportTicketEFs");
            DropTable("dbo.OcenaEFs");
            DropTable("dbo.NarocenaKategorijaEFs");
            DropTable("dbo.KategorijaKarticnegaSistemaEFs");
            DropTable("dbo.KarticniSistemEFs");
            DropTable("dbo.KomentarEFs");
            DropTable("dbo.KategorijaEFs");
            DropTable("dbo.SeznamZeljaEFs");
            DropTable("dbo.PrivatnoSporociloEFs");
            DropTable("dbo.NaslovEFs");
            DropTable("dbo.UporabnikEFs");
            DropTable("dbo.PonudbaEFs");
            DropTable("dbo.OglasEFs");
            DropTable("dbo.AvtomatskiPonudnikEFs");
        }
    }
}
