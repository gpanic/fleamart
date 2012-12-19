package com.fleamart.beans;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

import com.fleamart.kategorija.ws.ArrayOfKategorija;
import com.fleamart.kategorija.ws.Kategorija;
import com.fleamart.kategorija.ws.KategorijeService;
import com.fleamart.kategorija.ws.ObjectFactory;

@ManagedBean(name="kat")
@RequestScoped
public class KategorijaBean {

	private Map<String,String> kategorije;
	private List<String> kategorije_names;
	private String izbranaKategorija;
	private String searchParam;
	private String queryKategorija;
	
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
}