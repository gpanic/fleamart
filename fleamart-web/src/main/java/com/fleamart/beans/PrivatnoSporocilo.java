package com.fleamart.beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import com.fleamart.helpers.ConverterHelper;
import com.fleamart.obj.PrivatnoSporociloObj;
import com.fleamart.pm.ws.PrivatnoSporociloService;

@ManagedBean(name = "pmBean")
@ViewScoped
public class PrivatnoSporocilo implements Serializable {

	private List<PrivatnoSporociloObj> prejetaSporocila;
	private int neprebranih = 0;

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
}