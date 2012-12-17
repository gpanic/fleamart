package com.fleamart.beans;
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
	private String izbranaKategorija;
	private String searchParam;
	
	public KategorijaBean() {
		this.kategorije = new HashMap<String,String>();

		try {
			KategorijeService srv = new KategorijeService();
			ArrayOfKategorija kat = srv.getBasicHttpBindingIKategorijaService().vrniKategorije();
			ObjectFactory of = new ObjectFactory();
			
			List<Kategorija> kategorijeList = kat.getKategorija();
			for (Kategorija k : kategorijeList) {
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
}
