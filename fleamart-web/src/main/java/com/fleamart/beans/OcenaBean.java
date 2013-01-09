package com.fleamart.beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.fleamart.obj.OglasObj;
import com.fleamart.obj.UporabnikObj;
import com.fleamart.oceni.ws.*;

@ManagedBean(name = "ocenaBean")
@ViewScoped
public class OcenaBean implements Serializable {

	private String ocena_oi; // tip 1
	private String ocena_cd; // tip 2
	private String ocena_kom; // tip 3
	private String nakupId;
	private OglasObj oglas;
	private ArrayList<OglasObj> oglasi;

	public OcenaBean() {}

	public void submitRating() throws IOException {
		OceneService serv = new OceneService();
		ArrayOfOcenaDTO arrOc = new ObjectFactory().createArrayOfOcenaDTO();
		OcenaDTO oc1 = new OcenaDTO();
		oc1.setOcena(Integer.parseInt(this.ocena_oi));
		oc1.setTip(1);
		oc1.setOglasId(Integer.parseInt(this.nakupId));

		OcenaDTO oc2 = new OcenaDTO();
		oc2.setOcena(Integer.parseInt(this.ocena_cd));
		oc2.setTip(2);
		oc2.setOglasId(Integer.parseInt(this.nakupId));
		
		OcenaDTO oc3 = new OcenaDTO();
		oc3.setOcena(Integer.parseInt(this.ocena_kom));
		oc3.setTip(3);
		oc3.setOglasId(Integer.parseInt(this.nakupId));
		
		arrOc.getOcenaDTO().add(oc1);
		arrOc.getOcenaDTO().add(oc2);
		arrOc.getOcenaDTO().add(oc3);
		
		//TO-DO get id prijavljenega uporabnika
		serv.getBasicHttpBindingIOcenaService().oceniOglas(1, arrOc);
		
		String path = FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath();
		FacesContext.getCurrentInstance().getExternalContext().redirect(path + "/ratepurchase.xhtml");
	}
	
	public String getOcena_oi() {
		return ocena_oi;
	}

	public void setOcena_oi(String ocena_oi) {
		this.ocena_oi = ocena_oi;
	}

	public String getOcena_cd() {
		return ocena_cd;
	}

	public void setOcena_cd(String ocena_cd) {
		this.ocena_cd = ocena_cd;
	}

	public String getOcena_kom() {
		return ocena_kom;
	}

	public void setOcena_kom(String ocena_kom) {
		this.ocena_kom = ocena_kom;
	}

	public OglasObj getOglas() {
		return oglas;
	}

	public void setOglas(OglasObj oglas) {
		this.oglas = oglas;
	}

	public ArrayList<OglasObj> getOglasi() {
		return oglasi;
	}

	public void setOglasi(ArrayList<OglasObj> oglasi) {
		this.oglasi = oglasi;
	}

	public String getNakupId() {
		return nakupId;
	}

	public void setNakupId(String nakupId) {
		this.nakupId = nakupId;
	}

	public void preRender() {
		oglasi = new ArrayList<OglasObj>();
		OceneService serv = new OceneService();
		List<Oglas> oglasi_ws = serv.getBasicHttpBindingIOcenaService()
				.vrniNeocenjeneOglaseKupca(1).getOglas();

		for (Oglas obj : oglasi_ws) {
			OglasObj o = new OglasObj();
			o.setId(obj.getId());
			o.setNaslov(obj.getNaslov());
			o.setOpis(obj.getOpis());
			o.setCasOd(obj.getCasOd().toGregorianCalendar());
			o.setCena(String.valueOf(obj.getCena()));
			o.setSlike(obj.getSlike().getValue().getString());
			UporabnikObj u = new UporabnikObj();
			u.setUpime(obj.getAvtor().getUpime().getValue());
			o.setAvtor(u);
			this.oglasi.add(o);
		}

		if (this.nakupId != null) {
			try {
				int id = Integer.parseInt(this.nakupId);
				this.getOglasFromList(id);
			} catch (Exception e) {
				this.nakupId = null;
			}
		}
	}

	private void getOglasFromList(int oglasId) {
		boolean ex = false;
		for (OglasObj oglas : this.oglasi) {
			if (oglasId == oglas.getId()) {
				this.oglas = oglas;
				ex = true;
				break;
			}
		}
		if (!ex)
			this.nakupId = null;
	}
}
