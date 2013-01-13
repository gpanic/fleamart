namespace Fleamart.Dal.Migrations
{
    using System;
    using System.Data.Entity.Migrations;
    
    public partial class Initial2 : DbMigration
    {
        public override void Up()
        {
            AlterColumn("dbo.SupportTicketEFs", "AvtorId", c => c.Int());
            AlterColumn("dbo.SupportTicketEFs", "TehnikId", c => c.Int());
        }
        
        public override void Down()
        {
            AlterColumn("dbo.SupportTicketEFs", "TehnikId", c => c.Int(nullable: false));
            AlterColumn("dbo.SupportTicketEFs", "AvtorId", c => c.Int(nullable: false));
        }
    }
}
