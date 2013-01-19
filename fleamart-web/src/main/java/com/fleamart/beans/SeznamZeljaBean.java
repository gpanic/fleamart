package com.fleamart.beans;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import com.fleamart.helpers.ConverterHelper;
import com.fleamart.obj.OglasObj;
import com.fleamart.obj.SeznamZeljaObj;
import com.fleamart.obj.UporabnikObj;
import com.fleamart.oglas.ws.OglasService;

@ManagedBean(name = "seznamZeljaBean")
@RequestScoped
public class SeznamZeljaBean
{
	private SeznamZeljaObj seznamZelja;
	private List<SeznamZeljaObj> zelje;
	private OglasObj oglas;
	private List<OglasObj> oglasi;
	private String txt;
	private String redirectlink;
	@PostConstruct
    public void init() {
        String view = FacesContext.getCurrentInstance().getViewRoot().getViewId();
        switch (view) {
            case "/oglas/wishlist.xhtml":
            	initOglasListZelje();
                break;                                   	
        }
    }

	public SeznamZeljaObj getSeznamZelja()
	{
		return seznamZelja;
	}

	public void setSeznamZelja(SeznamZeljaObj seznamZelja)
	{
		this.seznamZelja = seznamZelja;
	}

	public String getTxt()
	{
		return txt;
	}

	public void setTxt(String txt)
	{
		this.txt = txt;
	}

	public List<SeznamZeljaObj> getZelje()
	{
		return zelje;
	}

	public void setZelje(List<SeznamZeljaObj> zelje)
	{
		this.zelje = zelje;
	}

	public OglasObj getOglas()
	{
		return oglas;
	}

	public void setOglas(OglasObj oglas)
	{
		this.oglas = oglas;
	}

	public List<OglasObj> getOglasi()
	{
		return oglasi;
	}

	public void setOglasi(List<OglasObj> oglasi)
	{
		this.oglasi = oglasi;
	}
	
	public String getRedirectlink()
	{
		return redirectlink;
	}

	public void setRedirectlink(String redirectlink)
	{
		this.redirectlink = redirectlink;
	}

	public SeznamZeljaBean()
	{
		seznamZelja = new SeznamZeljaObj();
		zelje = new ArrayList<SeznamZeljaObj>();
		oglas = new OglasObj();
		oglasi = new ArrayList<OglasObj>();
	}
	public void initOglasListZelje() {
        listOglasiZelje();
    }
	public void listOglasiZelje() {
		LoginBean loginb = (LoginBean)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("loginBean");
		int idUporabnik = loginb.getIdUser();
		OglasService client = new OglasService();
		List<com.fleamart.oglas.ws.Oglas> seznam = client
				.getBasicHttpBindingIOglasService()
				.pridobiSeznamZelja(idUporabnik).getOglas();
		oglasi.clear();
		for (com.fleamart.oglas.ws.Oglas s : seznam)
		{
			oglasi.add(ConverterHelper.oglasWs2Obj(s));
		}
    }
	
	public void izbrisiZeljo()
	{ 
		try
		{
			LoginBean loginb = (LoginBean)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("loginBean");
			int idUporabnik = loginb.getIdUser();
			OglasService client = new OglasService();
			boolean vrne = client.getBasicHttpBindingIOglasService().izbrisiZeljo(oglas.getId(), idUporabnik);
			if (vrne == true)
			{
				redirect(redirectlink);

			} else
			{
				redirect(redirectlink);
			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void redirect(String path) {
        try {
            ExternalContext ec = FacesContext.getCurrentInstance()
                    .getExternalContext();
            ec.redirect(ec.getRequestContextPath() + path);
        } catch (IOException ex) {
            ex.getStackTrace();
        }
    }
	
	public String dodajZeljo(OglasObj oglas, int idUpor)
	{
		try
		{
			UporabnikObj uporabnik = new UporabnikObj();
			uporabnik.setId(idUpor);
			com.fleamart.oglas.ws.Uporabnik uporabnikZaWs = ConverterHelper
					.uporabnikObj2WS(uporabnik);
			com.fleamart.oglas.ws.Oglas oglasZaWs = ConverterHelper
					.oglasObj2Ws(oglas);

			OglasService client = new OglasService();
			boolean vrne = client.getBasicHttpBindingIOglasService()
					.dodajZeljo(oglasZaWs, uporabnikZaWs);
			if (vrne == true)
			{
				txt = "Oglas dodan na seznam želja!";
				return "#";

			} else
			{
				txt = "Neuspešno dodan oglas na seznam želja!";
				return "#";
			}
		} catch (Exception e)
		{
			e.printStackTrace();
			return "#";
		}
	}

}
