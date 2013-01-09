package com.fleamart.beans;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.fleamart.kategorija.ws.ArrayOfKategorija;
import com.fleamart.kategorija.ws.Kategorija;
import com.fleamart.kategorija.ws.KategorijeService;
import com.fleamart.kategorija.ws.ObjectFactory;
import com.fleamart.obj.KategorijaObj;

@ManagedBean(name="kat")
@RequestScoped
public class KategorijaBean {

	private Map<String,String> kategorije;
	private List<String> kategorije_names;
	private String izbranaKategorija;
	private String searchParam;
	private String queryKategorija;
	private List<Kategorija> kategorijaObjList;
	private KategorijaObj kategorijaCreate;

	public KategorijaBean() {
		kategorijaCreate = new KategorijaObj();
		this.kategorije = new HashMap<String,String>();
		
		try {
			KategorijeService srv = new KategorijeService();
			this.kategorije_names = new ArrayList<String>();
			ArrayOfKategorija kat = srv.getBasicHttpBindingIKategorijaService().vrniKategorije();
			
			List<Kategorija> kategorijeList = kat.getKategorija();
			kategorijaObjList = kategorijeList;
			for (Kategorija k : kategorijeList) {
				kategorije_names.add(k.getNaziv().getValue());
				kategorije.put(k.getNaziv().getValue(), String.valueOf(k.getId()));
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public Map<String, String> getKategorije() {
		return kategorije;
	}
	public void setKategorije(Map<String, String> kategorije) {
		this.kategorije = kategorije;
	}

	public String getIzbranaKategorija() {
		return izbranaKategorija;
	}

	public void setIzbranaKategorija(String izbranaKategorija) {
		this.izbranaKategorija = izbranaKategorija;
	}

	public String getSearchParam() {
		return searchParam;
	}

	public void setSearchParam(String searchParam) {
		this.searchParam = searchParam;
	}

	public List<String> getKategorije_names() {
		return kategorije_names;
	}

	public void setKategorije_names(List<String> kategorije_names) {
		this.kategorije_names = kategorije_names;
	}
	
	public String getQueryKategorija() {
		return queryKategorija;
	}

	public void setQueryKategorija(String queryKategorija) {
		this.queryKategorija = queryKategorija;
	}
	
	public List<Kategorija> getKategorijaObjList() {
		return kategorijaObjList;
	}
	
	public KategorijaObj getKategorijaCreate() {
		return kategorijaCreate;
	}

	public void setKategorijaCreate(KategorijaObj kategorijaCreate) {
		this.kategorijaCreate = kategorijaCreate;
	}
	
	public void removeKategorija(int id) {
		Kategorija kremove = null;
		for(Kategorija k: kategorijaObjList) {
			if(k.getId().equals(id)) {
				kremove = k;
			}
		}
		kategorijaObjList.remove(kremove);
		KategorijeService srv = new KategorijeService();
		srv.getBasicHttpBindingIKategorijaService().izbrisiKategorijo(id);
	}
	
	public void createKategorija() {
		KategorijeService srv = new KategorijeService();
		ObjectFactory of = new ObjectFactory();
		Kategorija k = of.createKategorija();
		k.setNaziv(of.createKategorijaNaziv(kategorijaCreate.getNaziv()));
		boolean rezultat = srv.getBasicHttpBindingIKategorijaService().dodajKategorijo(k);
        String out = (rezultat) ? "/kategorija/list.xhtml" : "fail.xhtml";
        if (rezultat) {
            redirect(out);
        }
	}
	
    public void redirect(String path) {
        try {
            ExternalContext ec = FacesContext.getCurrentInstance()
                    .getExternalContext();
            ec.redirect(ec.getRequestContextPath() + path);
        } catch (IOException ex) {
            Logger.getLogger(OglasBean.class.getName()).log(
                    Level.SEVERE, null, ex);
        }
    }
}