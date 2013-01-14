package com.fleamart.beans;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

import com.fleamart.helpers.ConverterHelper;
import com.fleamart.helpers.JSFHelper;
import com.fleamart.obj.SupportTicketKategorijaObj;
import com.fleamart.obj.SupportTicketStatusObj;
import com.fleamart.supportticket.ws.ISupportTicketService;
import com.fleamart.supportticket.ws.SupportTicketKategorija;
import com.fleamart.supportticket.ws.SupportTicketService;
import com.fleamart.supportticket.ws.SupportTicketStatus;

@ManagedBean(name="supportBean")
@RequestScoped
public class SupportBean {
	
	private ISupportTicketService service;
	
	private List<SupportTicketKategorijaObj> kategorije;
	private SupportTicketKategorijaObj kategorijaCreate;
	
	private List<SupportTicketStatusObj> statusi;
	private SupportTicketStatusObj statusCreate;

	public SupportBean() {
		service = new SupportTicketService().getBasicHttpBindingISupportTicketService();
		kategorije = new ArrayList<>();
		kategorijaCreate = new SupportTicketKategorijaObj();
		statusi = new ArrayList<>();
		statusCreate = new SupportTicketStatusObj();
		
		getKategorijeFromService();
		getStatusiFromService();
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
		for(SupportTicketKategorija k : wsList) {
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
		for(SupportTicketStatus s : wsList) {
			statusi.add(ConverterHelper.supportTicketStatusWs2Obj(s));
		}
	}
}
