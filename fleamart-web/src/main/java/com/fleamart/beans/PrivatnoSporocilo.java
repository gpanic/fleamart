package com.fleamart.beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.fleamart.helpers.ConverterHelper;
import com.fleamart.obj.PrivatnoSporociloObj;
import com.fleamart.pm.ws.PrivatnoSporociloService;
import com.fleamart.uporabnik.ws.Uporabnik;
import com.fleamart.uporabnik.ws.UporabnikService;

@ManagedBean(name = "pmBean")
@ViewScoped
public class PrivatnoSporocilo implements Serializable {

	private List<PrivatnoSporociloObj> prejetaSporocila;
	private int neprebranih = 0;
	private String prejemnik;
	private String prejemnikUpIme;
	private String sporocilo;
	private String info;
	private int posiljatelj;

	public List<PrivatnoSporociloObj> getPrejetaSporocila() {
		return prejetaSporocila;
	}

	public void setPrejetaSporocila(List<PrivatnoSporociloObj> prejetaSporocila) {
		this.prejetaSporocila = prejetaSporocila;
	}

	public void setPrejetaSporocilaPrijavljenegaUporabnika() throws IOException {
		LoginBean lb = (LoginBean) FacesContext.getCurrentInstance()
				.getExternalContext().getSessionMap().get("loginBean");
		if (lb.getIdUser() != 0) {
			List<com.fleamart.pm.ws.PrivatnoSporocilo> pslist = new PrivatnoSporociloService()
					.getBasicHttpBindingIPrivatnoSporociloService()
					.vrniPrivatnaSporocilaUporabnika(lb.getIdUser())
					.getPrivatnoSporocilo();
			this.prejetaSporocila = new ArrayList<PrivatnoSporociloObj>();
			this.neprebranih = 0;
			for (com.fleamart.pm.ws.PrivatnoSporocilo ps : pslist) {
				if (!ps.isPrebrano())
					this.setNeprebranih(this.getNeprebranih() + 1);
				this.prejetaSporocila.add(ConverterHelper
						.PrivatnoSporociloWs2PrivatnoSporociloObj(ps));
			}
		}
	}

	public int getNeprebranih() {
		return neprebranih;
	}

	public void setNeprebranih(int neprebranih) {
		this.neprebranih = neprebranih;
	}

	public void oznaciKotPrebrano() {
		FacesContext fc = FacesContext.getCurrentInstance();
		HttpServletRequest request = (HttpServletRequest) fc
				.getExternalContext().getRequest();
		try {
			for (PrivatnoSporociloObj ps : this.prejetaSporocila) {
				if (ps.getId() == Integer.parseInt(request.getParameter("sporocilo")) && !ps.isPrebrano()) {
					new PrivatnoSporociloService().getBasicHttpBindingIPrivatnoSporociloService().oznaciSporociloKotPrebrano(ps.getId());
				}
			}
		} catch (Exception e) {

		}
	}
	
	public void findPrejemnikById() throws IOException {
		try {
			int uporabnikId = Integer.parseInt(this.prejemnik);
			LoginBean lb = (LoginBean)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("loginBean");
			if (uporabnikId == lb.getIdUser()) FacesContext.getCurrentInstance().getExternalContext().redirect("/fleamart-web/browse.xhtml");
			this.posiljatelj = lb.getIdUser();
			Uporabnik prej = new UporabnikService().getBasicHttpBindingIUporabnikService().readUporabnik(uporabnikId);
			if (prej == null) FacesContext.getCurrentInstance().getExternalContext().redirect("/fleamart-web/browse.xhtml");
			this.prejemnikUpIme = prej.getUpime().getValue();
		} catch (NumberFormatException e) {
			FacesContext.getCurrentInstance().getExternalContext().redirect("/fleamart-web/browse.xhtml");
		}
	}
	
	public String getPrejemnik() {
		return prejemnik;
	}

	public void setPrejemnik(String prejemnik) {
		this.prejemnik = prejemnik;
	}

	public String getPrejemnikUpIme() {
		return prejemnikUpIme;
	}

	public void setPrejemnikUpIme(String prejemnikUpIme) {
		this.prejemnikUpIme = prejemnikUpIme;
	}
	
	public void PosljiNovoSporocilo() throws IOException, DatatypeConfigurationException {
		com.fleamart.pm.ws.ObjectFactory of = new com.fleamart.pm.ws.ObjectFactory();
		com.fleamart.pm.ws.PrivatnoSporocilo ps = of.createPrivatnoSporocilo();
		ps.setPosiljateljId(this.getPosiljatelj());
		ps.setPrejemnikId(Integer.parseInt(this.prejemnik));
		ps.setCas(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));
		ps.setSporocilo(of.createPrivatnoSporociloSporocilo(this.sporocilo));
		boolean uspesno = new PrivatnoSporociloService().getBasicHttpBindingIPrivatnoSporociloService().dodajNovoSporocilo(ps);
		String url = "/fleamart-web/profile/messages.xhtml?info=";
		url += (uspesno) ? "uspesno" : "neuspesno";
		FacesContext.getCurrentInstance().getExternalContext().redirect(url);
	}
	
	public String getSporocilo() {
		return sporocilo;
	}

	public void setSporocilo(String sporocilo) {
		this.sporocilo = sporocilo;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public int getPosiljatelj() {
		return posiljatelj;
	}

	public void setPosiljatelj(int posiljatelj) {
		this.posiljatelj = posiljatelj;
	}
}