/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fleamart.obj;

import java.io.Serializable;
import java.util.GregorianCalendar;


public class PrivatnoSporociloObj implements Serializable {

	private int id;
	private String sporocilo;
	private GregorianCalendar cas;
	private boolean prebrano;
	
	private UporabnikObj posiljatelj;
	private UporabnikObj prejemnik;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSporocilo() {
		return sporocilo;
	}
	public void setSporocilo(String sporocilo) {
		this.sporocilo = sporocilo;
	}
	public GregorianCalendar getCas() {
		return cas;
	}
	public void setCas(GregorianCalendar cas) {
		this.cas = cas;
	}
	public boolean isPrebrano() {
		return prebrano;
	}
	public void setPrebrano(boolean prebrano) {
		this.prebrano = prebrano;
	}
	public UporabnikObj getPosiljatelj() {
		return posiljatelj;
	}
	public void setPosiljatelj(UporabnikObj posiljatelj) {
		this.posiljatelj = posiljatelj;
	}
	public UporabnikObj getPrejemnik() {
		return prejemnik;
	}
	public void setPrejemnik(UporabnikObj prejemnik) {
		this.prejemnik = prejemnik;
	}	
}
