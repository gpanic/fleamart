
package com.fleamart.beans;

import com.fleamart.helpers.ConverterHelper;
import com.fleamart.obj.SupportTicketObj;
import com.fleamart.supportticket.ws.ISupportTicketService;
import com.fleamart.supportticket.ws.SupportTicketService;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

@ManagedBean(name = "supportUpdateBean")
@ViewScoped
public class SupportUpdateBean implements Serializable {
    
    private ISupportTicketService service;
    
    private SupportTicketObj ticket;
    private int ticketId;

    public SupportUpdateBean() {
        System.err.println("AAAAAAAAAAa");
        service = new SupportTicketService().getBasicHttpBindingISupportTicketService();
//        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
//        String qs = request.getQueryString();
//        String regex = ".*id=(\\d).*";
//        if(qs != null) {
//            if(qs.matches(regex)) {
//                Pattern p = Pattern.compile(regex);
//                Matcher m = p.matcher(qs);
//                if(m.find()) {
//                    ticket = ConverterHelper.supportTicketWs2Obj(service.readSupportTicket(Integer.parseInt(m.group(1))));
//                }
//            } else {
//                ticket = new SupportTicketObj();
//            }
//        }
        ticketId = 0;
//        System.err.println(ticket.getId());
    }
    
//    @PostConstruct
//    public void init() {
//        if(ticketId > 0) {
//            readTicket();
//        }
//    }
//    
    private void readTicket() {
        ticket = ConverterHelper.supportTicketWs2Obj(service.readSupportTicket(ticketId));
    }
    
    public void updateTicket() {
        System.err.println(ticketId);
    }

    public SupportTicketObj getTicket() {
        return ticket;
    }

    public void setTicket(SupportTicketObj ticket) {
        this.ticket = ticket;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

}
