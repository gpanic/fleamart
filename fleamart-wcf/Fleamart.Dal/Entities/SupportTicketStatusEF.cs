﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.Dal.Entities
{
    public class SupportTicketStatusEF
    {
        public int Id { get; set; }
        public string Naziv { get; set; }
        public string Opis { get; set; }
    }
}
