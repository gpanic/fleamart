package com.fleamart.obj;


public class Kategorija {

	private String ime;
	private int Id;
	
	public Kategorija(String ime, int Id) {
		super();
		this.ime = ime;
		this.Id = Id;
	}
	
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
	
}
