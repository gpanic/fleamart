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
import com.fleamart.supportticket.ws.Uporabnik;
import com.fleamart.uporabnik.ws.UporabnikService;
import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
    private SupportTicketObj ticketRead;
    private int ticketReadId;
    private SupportTicketObj ticketCreate;
    private SupportTicketKomentarObj komentarCreate;
    private int selectedKategorija;
    private int selectedStatus;
    private int ticketUpdateId;
    private SupportTicketObj ticketUpdate;
    private SupportTicketObj ticketUpdateOld;
    
    private List<UporabnikObj> uporabniki;
    private int selectedTehnik;


    public SupportBean() {
        service = new SupportTicketService().getBasicHttpBindingISupportTicketService();
        ticketUpdate = new SupportTicketObj();
        ticketUpdateOld = new SupportTicketObj();
        
//        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
//        String qs = request.getQueryString();
//        String regex = ".*id=(\\d).*";
//        if(qs != null) {
//            if(qs.matches(regex)) {
//                Pattern p = Pattern.compile(regex);
//                Matcher m = p.matcher(qs);
//                if(m.find()) {
//                    ticketUpdate = ConverterHelper.supportTicketWs2Obj(service.readSupportTicket(Integer.parseInt(m.group(1))));
//                }
//            } else {
//                ticketUpdate = new SupportTicketObj();
//            }
//        }
        kategorije = new ArrayList<>();
        kategorijaCreate = new SupportTicketKategorijaObj();

        statusi = new ArrayList<>();
        statusCreate = new SupportTicketStatusObj();

        tickets = new ArrayList<>();
        komentarCreate = new SupportTicketKomentarObj();
        ticketCreate = new SupportTicketObj();
        selectedKategorija = 0;
        selectedStatus = 0;
        ticketUpdateId = 0;
        
        uporabniki = new ArrayList<>();
        selectedTehnik = 0;

        getKategorijeFromService();
        getStatusiFromService();
        getTicketsFromService();
        getUporabnikiFromService();
    }

    @PostConstruct
    public void init() {
        String view = FacesContext.getCurrentInstance().getViewRoot().getViewId();
        switch (view) {
            case "/pomoc/nalog/read.xhtml":
                getTicketFromService();
                break;
            case "/pomoc/nalog/update.xhtml":
                initTicketUpdate();
                break;
            default:
                break;
        }
    }

    
    public void initTicketUpdate() {
        if(ticketUpdate.getId() > 0) {
            ticketUpdate = ConverterHelper.supportTicketWs2Obj(service.readSupportTicket(ticketUpdate.getId()));
            if(ticketUpdate.getTehnik() != null) {
                selectedTehnik = ticketUpdate.getTehnik().getId();
            }
            if(ticketUpdate.getSupportTicketKategorija() != null) {
                selectedKategorija = ticketUpdate.getSupportTicketKategorija().getId();
            }
            if(ticketUpdate.getSupportTicketStatus() != null) {
                selectedStatus = ticketUpdate.getSupportTicketStatus().getId();
            }
        }
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

    public void createTicketKomentar() {
        komentarCreate.setCas(new GregorianCalendar());
        UporabnikObj avtor = new UporabnikObj();
        avtor.setId(loginBean.getIdUser());
        komentarCreate.setAvtor(avtor);
        komentarCreate.setSupportTicketId(getTicketReadId());
        service.createSupportTicketKomentar(ConverterHelper.supportTicketKomentarObj2Ws(komentarCreate));
        getTicketFromService();
        komentarCreate = new SupportTicketKomentarObj();
    }
    
    public void deleteTicketKomentar(int id) {
        service.deleteSupportTicketKomentar(id);
        getTicketFromService();
    }
    
    public boolean isOwnerOfKomentar(int idKomentar) {
        for(SupportTicketKomentarObj k : getTicketRead().getKomentarji()) {
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
        SupportTicket ticket = service.readSupportTicket(getTicketReadId());
        if (ticket != null) {
            ticketRead = ConverterHelper.supportTicketWs2Obj(ticket);
        }
    }
    
    public void createTicket() {
        if(loginBean.getIdUser() > 0) {
            UporabnikObj avtor = new UporabnikObj();
            avtor.setId(loginBean.getIdUser());
            ticketCreate.setAvtor(avtor);
            ticketCreate.setCasUstvarjen(new GregorianCalendar());
            SupportTicketKategorijaObj kategorija = new SupportTicketKategorijaObj();
            kategorija.setId(selectedKategorija);
            ticketCreate.setSupportTicketKategorija(kategorija);
            SupportTicketStatusObj status = new SupportTicketStatusObj();
            status.setId(selectedStatus);
            ticketCreate.setSupportTicketStatus(status);
            boolean created = service.createSupportTicket(ConverterHelper.supportTicketObjt2Ws(ticketCreate));
            if (created) {
                JSFHelper.redirect("/pomoc/nalog/list.xhtml");
            }
        }
    }
    
    public void updateTicket() {
        System.err.println("UPDATE TICKET");
        int id = ticketUpdate.getId();
        System.err.println(id);
        ticketUpdateOld = ConverterHelper.supportTicketWs2Obj(service.readSupportTicket(id));
        UporabnikObj tehnik = new UporabnikObj();
        tehnik.setId(selectedTehnik);
        ticketUpdateOld.setTehnik(tehnik);
        SupportTicketKategorijaObj kategorija = new SupportTicketKategorijaObj();
        kategorija.setId(selectedKategorija);
        ticketUpdateOld.setSupportTicketKategorija(kategorija);
        SupportTicketStatusObj status = new SupportTicketStatusObj();
        status.setId(selectedStatus);
        ticketUpdateOld.setSupportTicketStatus(status);
        ticketUpdateOld.setNaslov(ticketUpdate.getNaslov());
        ticketUpdateOld.setVsebina(ticketUpdate.getVsebina());
        
        boolean updated = service.updateSupportTicket(ConverterHelper.supportTicketObjt2Ws(ticketUpdateOld));
        ticketUpdate = ConverterHelper.supportTicketWs2Obj(service.readSupportTicket(ticketUpdate.getId()));
        if (updated) {
            JSFHelper.redirect("/pomoc/nalog/list.xhtml");
        }
    }
    
    private void getUporabnikiFromService() {
        uporabniki = new ArrayList<>();
        for(Uporabnik u : service.listUporabnik().getUporabnik()) {
            uporabniki.add(ConverterHelper.supportTicketUporabnikWs2Obj(u));
        }
    }

    //GETTERS AND SETTERS
    public LoginBean getLoginBean() {
        return loginBean;
    }

    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }

    public SupportTicketObj getTicketRead() {
        return ticketRead;
    }

    public void setTicketRead(SupportTicketObj ticketRead) {
        this.ticketRead = ticketRead;
    }

    public int getTicketReadId() {
        return ticketReadId;
    }

    public void setTicketReadId(int ticketReadId) {
        this.ticketReadId = ticketReadId;
    }
    
    public SupportTicketKomentarObj getKomentarCreate() {
        return komentarCreate;
    }

    public void setKomentarCreate(SupportTicketKomentarObj komentarCreate) {
        this.komentarCreate = komentarCreate;
    }
    
    public List<SupportTicketStatusObj> getStatusi() {
        return statusi;
    }

    public SupportTicketStatusObj getStatusCreate() {
        return statusCreate;
    }
    
    public List<SupportTicketKategorijaObj> getKategorije() {
        return kategorije;
    }

    public SupportTicketKategorijaObj getKategorijaCreate() {
        return kategorijaCreate;
    }

    public SupportTicketObj getTicketCreate() {
        return ticketCreate;
    }
    
    public void setTicketCreate(SupportTicketObj ticketCreate) {
        this.ticketCreate = ticketCreate;
    }

    public int getSelectedKategorija() {
        return selectedKategorija;
    }

    public void setSelectedKategorija(int selectedKategorija) {
        this.selectedKategorija = selectedKategorija;
    }

    public int getSelectedStatus() {
        return selectedStatus;
    }

    public void setSelectedStatus(int selectedStatus) {
        this.selectedStatus = selectedStatus;
    }

    public int getTicketUpdateId() {
        return ticketUpdateId;
    }

    public void setTicketUpdateId(int ticketUpdateId) {
        this.ticketUpdateId = ticketUpdateId;
    }

    public SupportTicketObj getTicketUpdate() {
        return ticketUpdate;
    }

    public void setTicketUpdate(SupportTicketObj ticketUpdate) {
        this.ticketUpdate = ticketUpdate;
    }

    public List<UporabnikObj> getUporabniki() {
        return uporabniki;
    }

    public void setUporabniki(List<UporabnikObj> uporabniki) {
        this.uporabniki = uporabniki;
    }

    public int getSelectedTehnik() {
        return selectedTehnik;
    }

    public void setSelectedTehnik(int selectedTehnik) {
        this.selectedTehnik = selectedTehnik;
    }
    
}
