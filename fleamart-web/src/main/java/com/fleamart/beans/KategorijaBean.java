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
import com.fleamart.kategorija.ws.NarocenaKategorija;
import com.fleamart.kategorija.ws.ObjectFactory;
import com.fleamart.kategorija.ws.Uporabnik;
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
	private List<Integer> naroceneKategorije;

	public KategorijaBean() {
		
		this.kategorije = new HashMap<String,String>();
		
		try {
			KategorijeService srv = new KategorijeService();
			this.kategorije_names = new ArrayList<String>();
			ArrayOfKategorija kat = srv.getBasicHttpBindingIKategorijaService().vrniKategorije();
			
			List<Kategorija> kategorijeList = kat.getKategorija();
			
			for (Kategorija k : kategorijeList) {
				kategorije_names.add(k.getNaziv().getValue());
				kategorije.put(k.getNaziv().getValue(), String.valueOf(k.getId()));
			}
			
			
			
			
			//ZA UREJANJE KATEGORIJ IN NAROCANJE NA KATEGORIJE
			kategorijaCreate = new KategorijaObj();
			naroceneKategorije = new ArrayList<>();
			kategorijaObjList = kategorijeList;
			LoginBean lb = (LoginBean)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("loginBean");
			Uporabnik u = new Uporabnik();
			u.setId(lb.getIdUser());
			ArrayOfKategorija naroceneKat = srv.getBasicHttpBindingIKategorijaService().vrniNaroceneKategorije(u);
			for (Kategorija k : naroceneKat.getKategorija()) {
				naroceneKategorije.add(k.getId());
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
    
    public boolean subscriptionStatus(int kategorijaId) {
    	if(naroceneKategorije.contains(kategorijaId)) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public String subscriptionStatusOutput(int kategorijaId) {
    	if(naroceneKategorije.contains(kategorijaId)) {
    		return "Da";
    	} else {
    		return "Ne";
    	}
    }
    
    public void subscribe(int uporabnikId, int kategorijaId) {
    	Uporabnik u = new Uporabnik();
    	u.setId(uporabnikId);
    	Kategorija k = new Kategorija();
    	k.setId(kategorijaId);
    	com.fleamart.kategorija.ws.ObjectFactory of = new com.fleamart.kategorija.ws.ObjectFactory();
    	KategorijeService srv = new KategorijeService();
    	NarocenaKategorija nk = new NarocenaKategorija();
    	nk.setKategorija(of.createNarocenaKategorijaKategorija(k));
    	nk.setUporabnik(of.createNarocenaKategorijaUporabnik(u));
    	srv.getBasicHttpBindingIKategorijaService().dodajNarocenoKategorijo(nk);
    	if(!naroceneKategorije.contains(kategorijaId)) {
    		naroceneKategorije.add(kategorijaId);
    	}
    }
    
    public void unsubscribe(int uporabnikId, int kategorijaId) {
    	Uporabnik u = new Uporabnik();
    	u.setId(uporabnikId);
    	Kategorija k = new Kategorija();
    	k.setId(kategorijaId);
    	KategorijeService srv = new KategorijeService();
    	srv.getBasicHttpBindingIKategorijaService().izbrisiNarocenoKategorijo(u, k);
    	if(naroceneKategorije.contains(kategorijaId)) {
    		naroceneKategorije.remove(naroceneKategorije.indexOf(kategorijaId));
    	}
    }
}