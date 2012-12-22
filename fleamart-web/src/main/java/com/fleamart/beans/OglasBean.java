package com.fleamart.beans;

import com.fleamart.kategorija.ws.*;
import com.fleamart.obj.KategorijaObj;
import com.fleamart.obj.OglasObj;
import com.fleamart.oglas.ws.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;


@ManagedBean(name = "oglasBean")
@RequestScoped
public class OglasBean {

    private List<Oglas> oglasi;
    OglasObj oglas;
    List<KategorijaObj> kategorije;
    KategorijaObj kategorija;
    private String searchParam;
    private String queryKateg;
    
    public OglasBean() {
    	listKategorije();
    	HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
    	
    	String kat = request.getParameter("kategorija");
    	String param = request.getParameter("param");
    	if (kat != null && param != null) {
    		System.out.println(kat + " in " + param);
    	}
    }

    public void listKategorije() {
        kategorije = new ArrayList<KategorijaObj>();
        KategorijeService client = new KategorijeService();
        ArrayOfKategorija kat = client.getBasicHttpBindingIKategorijaService().vrniKategorije();
        List<com.fleamart.kategorija.ws.Kategorija> kategorijeList = kat.getKategorija();
        kategorije.add(new KategorijaObj(0, "Vse kategorije"));
        for (com.fleamart.kategorija.ws.Kategorija k : kategorijeList) {
            kategorije.add(new KategorijaObj(k.getId().intValue(), k.getNaziv().getValue()));
        }
    }

    public OglasObj getOglas() {
        if (oglas == null) {
            oglas = new OglasObj();
            if (oglas.getSlike().isEmpty()) {
                oglas.getSlike().add("");
                oglas.getSlike().add("");
                oglas.getSlike().add("");
            }
        }
        this.listKategorije();
        return oglas;
    }

    public void setOglas(OglasObj oglas) {
        this.oglas = oglas;
    }

    public List<Oglas> getOglasi() {
        return oglasi;
    }

    public void setOglasi(List<Oglas> oglasi) {
        this.oglasi = oglasi;
    }

    public List<KategorijaObj> getKategorije() {
        return kategorije;
    }

    public void setKategorije(List<KategorijaObj> kategorije) {
        this.kategorije = kategorije;
    }

    public void createOglas() {
        GregorianCalendar gc = new GregorianCalendar();
        oglas.setCasOd(gc);
        gc.add(Calendar.DATE, 30);
        oglas.setCasDo(gc);


//        ObjectFactory of = new ObjectFactory();
        Uporabnik up = new Uporabnik();
        up.setId(1);
//        oglas.setAvtor(of.createUporabnik(up));
        OglasService client = new OglasService();
    }
//
//    public void readOglas(int id) {
//        OglasService client = new OglasService();
//        oglas = client.getBasicHttpBindingIOglasService().readOglas(id);
//    }
//
//    public void updateOglas(ActionEvent event) {
//        OglasService client = new OglasService();
//        client.getBasicHttpBindingIOglasService().updateOglas(oglas);
//    }
//
//    public void deleteOglas(int id) {
//        OglasService client = new OglasService();
//        client.getBasicHttpBindingIOglasService().deleteOglas(id);
//    }

	public String getSearchParam() {
		return searchParam;
	}

	public void setSearchParam(String searchParam) {
		this.searchParam = searchParam;
	}

	public String getQueryKateg() {
		return queryKateg;
	}
	
	public void setQueryKateg(String queryKateg) {
		boolean nas = false;
		for(KategorijaObj kategorija : this.kategorije) {
			if (queryKateg.equals(kategorija.getNaziv())) {
				nas = true;
				break;
			}
		}
		if (!nas) queryKateg = this.kategorije.get(0).getNaziv();
		this.queryKateg = queryKateg;
	}
}
