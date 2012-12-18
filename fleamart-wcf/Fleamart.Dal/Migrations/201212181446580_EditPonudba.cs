namespace Fleamart.Dal.Migrations
{
    using System;
    using System.Data.Entity.Migrations;
    
    public partial class EditPonudba : DbMigration
    {
        public override void Up()
        {
            DropForeignKey("dbo.PonudbaEFs", "OglasEF_Id", "dbo.OglasEFs");
            DropIndex("dbo.PonudbaEFs", new[] { "OglasEF_Id" });
            AddColumn("dbo.PonudbaEFs", "OglasId", c => c.Int(nullable: false));
            AddForeignKey("dbo.PonudbaEFs", "OglasId", "dbo.OglasEFs", "Id", cascadeDelete: true);
            CreateIndex("dbo.PonudbaEFs", "OglasId");
            DropColumn("dbo.PonudbaEFs", "OglasEF_Id");
        }
        
        public override void Down()
        {
            AddColumn("dbo.PonudbaEFs", "OglasEF_Id", c => c.Int());
            DropIndex("dbo.PonudbaEFs", new[] { "OglasId" });
            DropForeignKey("dbo.PonudbaEFs", "OglasId", "dbo.OglasEFs");
            DropColumn("dbo.PonudbaEFs", "OglasId");
            CreateIndex("dbo.PonudbaEFs", "OglasEF_Id");
            AddForeignKey("dbo.PonudbaEFs", "OglasEF_Id", "dbo.OglasEFs", "Id");
        }
    }
}
