package com.fleamart.beans;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import com.fleamart.obj.Oglas;


@ManagedBean(name="oglasBean")
@RequestScoped
public class OglasBean {
	
	private List<Oglas> oglasi;

	public OglasBean() {

	}
	
	public List<Oglas> getOglasi() {
		return oglasi;
	}

	public void setOglasi(List<Oglas> oglasi) {
		this.oglasi = oglasi;
	}
}
