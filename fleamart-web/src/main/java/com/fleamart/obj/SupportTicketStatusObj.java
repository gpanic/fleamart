package com.fleamart.obj;

import java.io.Serializable;

public class SupportTicketStatusObj implements Serializable  {
	
	private int id;
	private String naziv;
	private String opis;
	
	public SupportTicketStatusObj() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

}
