package com.fleamart.beans;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

import com.fleamart.helpers.ConverterHelper;
import com.fleamart.helpers.JSFHelper;
import com.fleamart.obj.SupportTicketKategorijaObj;
import com.fleamart.obj.SupportTicketKomentarObj;
import com.fleamart.obj.SupportTicketObj;
import com.fleamart.obj.SupportTicketStatusObj;
import com.fleamart.obj.UporabnikObj;
import com.fleamart.supportticket.ws.ISupportTicketService;
import com.fleamart.supportticket.ws.SupportTicketKategorija;
import com.fleamart.supportticket.ws.SupportTicketService;
import com.fleamart.supportticket.ws.SupportTicketStatus;
import com.fleamart.supportticket.ws.SupportTicket;
import java.io.Serializable;
import java.util.GregorianCalendar;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

@ManagedBean(name = "supportBean")
@RequestScoped
public class SupportBean implements Serializable {

    @ManagedProperty(value = "#{loginBean}")
    private LoginBean loginBean;
    
    private ISupportTicketService service;
    
    private List<SupportTicketKategorijaObj> kategorije;
    private SupportTicketKategorijaObj kategorijaCreate;
    
    private List<SupportTicketStatusObj> statusi;
    private SupportTicketStatusObj statusCreate;
    
    private List<SupportTicketObj> tickets;
    private SupportTicketObj readTicket;
    private int readTicketId;
    private SupportTicketKomentarObj komentarCreate;

    public SupportBean() {
        service = new SupportTicketService().getBasicHttpBindingISupportTicketService();

        kategorije = new ArrayList<>();
        kategorijaCreate = new SupportTicketKategorijaObj();

        statusi = new ArrayList<>();
        statusCreate = new SupportTicketStatusObj();

        tickets = new ArrayList<>();
        komentarCreate = new SupportTicketKomentarObj();

        getKategorijeFromService();
        getStatusiFromService();
        getTicketsFromService();
    }

    @PostConstruct
    public void init() {
        getTicketFromService();
    }

    public List<SupportTicketKategorijaObj> getKategorije() {
        return kategorije;
    }

    public SupportTicketKategorijaObj getKategorijaCreate() {
        return kategorijaCreate;
    }

    public void createKategorija() {
        boolean created = service.createSupportTicketKategorija(ConverterHelper.supportTicketKategorijaObj2Ws(kategorijaCreate));
        if (created) {
            JSFHelper.redirect("/pomoc/nalog/kategorija/list.xhtml");
        }
    }

    public boolean deleteKategorija(int id) {
        boolean deleted = service.deleteSupportTicketKategorija(id);
        getKategorijeFromService();
        return deleted;
    }

    private void getKategorijeFromService() {
        kategorije = new ArrayList<>();
        List<SupportTicketKategorija> wsList = service.listSupportTicketKategorija().getSupportTicketKategorija();
        for (SupportTicketKategorija k : wsList) {
            kategorije.add(ConverterHelper.supportTicketKategorijaWs2Obj(k));
        }
    }

    public List<SupportTicketStatusObj> getStatusi() {
        return statusi;
    }

    public SupportTicketStatusObj getStatusCreate() {
        return statusCreate;
    }

    public void createStatus() {
        boolean created = service.createSupportTicketStatus(ConverterHelper.supportTicketStatusObj2Ws(statusCreate));
        if (created) {
            JSFHelper.redirect("/pomoc/nalog/status/list.xhtml");
        }
    }

    public boolean deleteStatus(int id) {
        boolean deleted = service.deleteSupportTicketStatus(id);
        getStatusiFromService();
        return deleted;
    }

    private void getStatusiFromService() {
        statusi = new ArrayList<>();
        List<SupportTicketStatus> wsList = service.listSupportTicketStatus().getSupportTicketStatus();
        for (SupportTicketStatus s : wsList) {
            statusi.add(ConverterHelper.supportTicketStatusWs2Obj(s));
        }
    }

    public List<SupportTicketObj> getTickets() {
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        return tickets;
    }

    private void getTicketsFromService() {
        tickets = new ArrayList<>();
        List<SupportTicket> wsList = service.listSupportTicket().getSupportTicket();
        for (SupportTicket t : wsList) {
            getTickets().add(ConverterHelper.supportTicketWs2Obj(t));
        }
    }

    public SupportTicketObj getReadTicket() {
        return readTicket;
    }

    public int getReadTicketId() {
        return readTicketId;
    }

    public void setReadTicketId(int readTicketId) {
        this.readTicketId = readTicketId;
    }

    public SupportTicketKomentarObj getKomentarCreate() {
        return komentarCreate;
    }

    public void setKomentarCreate(SupportTicketKomentarObj komentarCreate) {
        this.komentarCreate = komentarCreate;
    }

    public void createTicketKomentar() {
        komentarCreate.setCas(new GregorianCalendar());
        UporabnikObj avtor = new UporabnikObj();
        avtor.setId(loginBean.getIdUser());
        komentarCreate.setAvtor(avtor);
        komentarCreate.setSupportTicketId(readTicketId);
        service.createSupportTicketKomentar(ConverterHelper.supportTicketKomentarObj2Ws(komentarCreate));
        getTicketFromService();
        komentarCreate = new SupportTicketKomentarObj();
    }
    
    public void deleteTicketKomentar(int id) {
        service.deleteSupportTicketKomentar(id);
        getTicketFromService();
    }
    
    public boolean isOwnerOfKomentar(int idKomentar) {
        for(SupportTicketKomentarObj k : readTicket.getKomentarji()) {
            if(k.getId() == idKomentar) {
                if(k.getAvtor().getId() == loginBean.getIdUser()) {
                    return true;
                }
                break;
            }
        }
        return false;
    }

    private void getTicketFromService() {
        SupportTicket ticket = service.readSupportTicket(readTicketId);
        if (ticket != null) {
            readTicket = ConverterHelper.supportTicketWs2Obj(ticket);
        }
    }

    public LoginBean getLoginBean() {
        return loginBean;
    }

    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }
}
