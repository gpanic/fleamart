package com.fleamart.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.fleamart.obj.Oglas;


@ManagedBean(name="oglasBean")
@RequestScoped
public class OglasBean {
	
	private List<Oglas> oglasi;

	public OglasBean() {
		oglasi = new ArrayList<Oglas>();
		oglasi.add(new Oglas("ime oglasa","http://mmc.bolha.com/3/image/127007/129644/Snezne-verige-Hilfer_50a12a39ae561.jpg", 25.4,"to je neki opis",new Date()));
		oglasi.add(new Oglas("ime oglasa","http://s4.bolha.si/3/thumb2/133001/133763/Iphone-5-16-G--bele-in-crne-barve_50ca16f60928a.jpg", 25.4,"to je neki opis",new Date()));
		oglasi.add(new Oglas("ime oglasa","http://s4.bolha.si/1/thumb2/133001/134018/NOKIA-700-CRNE-BARVE_50ce29b046677.jpg", 25.4,"to je neki opis",new Date()));
		oglasi.add(new Oglas("ime oglasa","http://mmc.bolha.com/3/image/127007/129644/Snezne-verige-Hilfer_50a12a39ae561.jpg", 25.4,"to je neki opis",new Date()));
		oglasi.add(new Oglas("ime oglasa","http://mmc.bolha.com/3/image/127007/129644/Snezne-verige-Hilfer_50a12a39ae561.jpg", 25.4,"to je neki opis",new Date()));
	}
	
	public List<Oglas> getOglasi() {
		return oglasi;
	}

	public void setOglasi(List<Oglas> oglasi) {
		this.oglasi = oglasi;
	}
	
	
}
