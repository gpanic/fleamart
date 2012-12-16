package com.fleamart.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

import com.fleamart.obj.*;

@ManagedBean(name="kat")
@RequestScoped
public class KategorijaBean {

	private Map<String,String> kategorije;
	private String izbranaKategorija;
	private String searchParam;
	private List<Kategorija> kateg;
	
	public KategorijaBean() {
		this.kategorije = new HashMap<String,String>();
		this.kateg = new ArrayList<Kategorija>();
		
		kateg.add(new Kategorija("ena",1));
		kateg.add(new Kategorija("dva",2));
		kateg.add(new Kategorija("tri",3));
		kateg.add(new Kategorija("stiri",4));
		kateg.add(new Kategorija("All categories",0));
		
		for (Kategorija k : this.kateg) {
			this.kategorije.put(k.getIme(), String.valueOf(k.getId()));
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
