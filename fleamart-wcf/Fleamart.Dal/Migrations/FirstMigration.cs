namespace Fleamart.Dal.Migrations
{
    using System;
    using System.Data.Entity.Migrations;
    
    public partial class InitialCreate : DbMigration
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
                        Naslov = c.String(),
                        Avkcija = c.Boolean(nullable: false),
                        Cena = c.Double(nullable: false),
                        ZadnjaCenaAvkcija = c.Double(),
                        Opis = c.String(),
                        CasOd = c.DateTime(nullable: false),
                        CasDo = c.DateTime(nullable: false),
                        CasSpremenjeno = c.DateTime(nullable: false),
                        Status = c.Int(nullable: false),
                        StatusNakupa = c.Int(),
                        AvtorId = c.Int(),
                        KupecId = c.Int(),
                    })
                .PrimaryKey(t => t.Id)
                .ForeignKey("dbo.UporabnikEFs", t => t.AvtorId)
                .ForeignKey("dbo.UporabnikEFs", t => t.KupecId)
                .Index(t => t.AvtorId)
                .Index(t => t.KupecId);
            
            CreateTable(
                "dbo.PonudbaEFs",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        Znesek = c.Double(nullable: false),
                        Cas = c.DateTime(nullable: false),
                        Uporabnik_Id = c.Int(),
                        OglasEF_Id = c.Int(),
                    })
                .PrimaryKey(t => t.Id)
                .ForeignKey("dbo.UporabnikEFs", t => t.Uporabnik_Id)
                .ForeignKey("dbo.OglasEFs", t => t.OglasEF_Id)
                .Index(t => t.Uporabnik_Id)
                .Index(t => t.OglasEF_Id);
            
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
                "dbo.KategorijaEFs",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        Nadkategorija = c.Int(nullable: false),
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
            
        }
        
        public override void Down()
        {
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
            DropIndex("dbo.PonudbaEFs", new[] { "OglasEF_Id" });
            DropIndex("dbo.PonudbaEFs", new[] { "Uporabnik_Id" });
            DropIndex("dbo.OglasEFs", new[] { "KupecId" });
            DropIndex("dbo.OglasEFs", new[] { "AvtorId" });
            DropIndex("dbo.AvtomatskiPonudnikEFs", new[] { "UporabnikId" });
            DropIndex("dbo.AvtomatskiPonudnikEFs", new[] { "OglasId" });
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
            DropForeignKey("dbo.PonudbaEFs", "OglasEF_Id", "dbo.OglasEFs");
            DropForeignKey("dbo.PonudbaEFs", "Uporabnik_Id", "dbo.UporabnikEFs");
            DropForeignKey("dbo.OglasEFs", "KupecId", "dbo.UporabnikEFs");
            DropForeignKey("dbo.OglasEFs", "AvtorId", "dbo.UporabnikEFs");
            DropForeignKey("dbo.AvtomatskiPonudnikEFs", "UporabnikId", "dbo.UporabnikEFs");
            DropForeignKey("dbo.AvtomatskiPonudnikEFs", "OglasId", "dbo.OglasEFs");
            DropTable("dbo.OcenaEFs");
            DropTable("dbo.NarocenaKategorijaEFs");
            DropTable("dbo.KategorijaEFs");
            DropTable("dbo.KategorijaKarticnegaSistemaEFs");
            DropTable("dbo.KarticniSistemEFs");
            DropTable("dbo.KomentarEFs");
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
