namespace Fleamart.Dal.Migrations
{
    using System;
    using System.Data.Entity.Migrations;
    
    public partial class AddOglasToPonudba : DbMigration
    {
        public override void Up()
        {
            AddColumn("dbo.OglasEFs", "SlikeBaza", c => c.String());
            AlterColumn("dbo.OglasEFs", "Naslov", c => c.String(nullable: false));
            AlterColumn("dbo.OglasEFs", "Opis", c => c.String(nullable: false));
        }
        
        public override void Down()
        {
            AlterColumn("dbo.OglasEFs", "Opis", c => c.String());
            AlterColumn("dbo.OglasEFs", "Naslov", c => c.String());
            DropColumn("dbo.OglasEFs", "SlikeBaza");
        }
    }
}
