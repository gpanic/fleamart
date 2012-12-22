package com.fleamart.beans;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import com.fleamart.helpers.ConverterHelper;
import com.fleamart.kategorija.ws.ArrayOfKategorija;
import com.fleamart.kategorija.ws.KategorijeService;
import com.fleamart.obj.KategorijaObj;
import com.fleamart.obj.OglasObj;
import com.fleamart.obj.UporabnikObj;
import com.fleamart.oglas.ws.Oglas;
import com.fleamart.oglas.ws.OglasService;

@ManagedBean(name = "oglasBean")
@RequestScoped
public class OglasBean {

    private List<OglasObj> oglasi;
    private OglasObj oglas;
    private List<KategorijaObj> kategorije;
    private KategorijaObj kategorija;
    private String searchParam;
    private String queryKateg;

    @PostConstruct
    public void init() {
        FacesContext fc = FacesContext.getCurrentInstance();
        String view = fc.getViewRoot().getViewId();

        if (view.equals("/oglas/read.xhtml")) {
            try {
                HttpServletRequest request = (HttpServletRequest) fc.getExternalContext().getRequest();
                readOglas(Integer.parseInt(request.getParameter("id")));
            } catch (Exception e) {
                try {
                    ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
                    ec.redirect(ec.getRequestContextPath() + "/index.xhtml");
                } catch (IOException ex) {
                    Logger.getLogger(OglasBean.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            if (view.equals("/oglas/create.xhtml")) {
                oglas.getSlike().add("");
                oglas.getSlike().add("");
                oglas.getSlike().add("");

                this.listKategorije();
            }
        }
    }

    public OglasBean() {
    	listKategorije();
    	HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
    	
    	String kat = request.getParameter("kategorija");
    	String param = request.getParameter("param");
    	if (kat != null && param != null) {
    		System.out.println(kat + " in " + param);
    	}
        oglasi = new ArrayList<OglasObj>();
    }

    public KategorijaObj getKategorija() {
        return kategorija;
    }

    public void setKategorija(KategorijaObj kategorija) {
        this.kategorija = kategorija;
    }

    public void listKategorije() {
        kategorije = new ArrayList<KategorijaObj>();
        KategorijeService client = new KategorijeService();
        ArrayOfKategorija kat = client.getBasicHttpBindingIKategorijaService().vrniKategorije();
        List<com.fleamart.kategorija.ws.Kategorija> kategorijeList = kat.getKategorija();

        for (com.fleamart.kategorija.ws.Kategorija k : kategorijeList)
            kategorije.add(new KategorijaObj(k.getId().intValue(), k.getNaziv().getValue()));
    }

    public OglasObj getOglas() {
        return oglas;
    }

    public void setOglas(OglasObj oglas) {
        this.oglas = oglas;
    }

    public List<OglasObj> getOglasi() {
        return oglasi;
    }

    public void setOglasi(List<OglasObj> oglasi) {
        this.oglasi = oglasi;
    }

    public List<KategorijaObj> getKategorije() {
        return kategorije;
    }

    public void setKategorije(List<KategorijaObj> kategorije) {
        this.kategorije = kategorije;
    }

    public String createOglas() {
        oglas.setCasOd(new GregorianCalendar());
        GregorianCalendar gc = new GregorianCalendar();
        gc.add(Calendar.DATE, 30);
        oglas.setCasDo(gc);
        UporabnikObj u = new UporabnikObj();
        u.setId(1); //kasneje prebrat iz seje
        oglas.setAvtor(u);
        oglas.setStatus(0);
        Oglas o = ConverterHelper.oglasObj2Ws(oglas);

        OglasService client = new OglasService();
        Boolean rezultat = client.getBasicHttpBindingIOglasService().createOglas(o);
        String out = (rezultat) ? "read" : "fail";
        return out;
    }

    public void readOglas(int id) {
        OglasService client = new OglasService();
        oglas = ConverterHelper.oglasWs2Obj(client.getBasicHttpBindingIOglasService().readOglas(id));
    }
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
