package com.fleamart.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.fleamart.uporabnik.ws.ObjectFactory;
import com.fleamart.uporabnik.ws.Naslov;
import com.fleamart.uporabnik.ws.Uporabnik;
import com.fleamart.uporabnik.ws.UporabnikService;

@ManagedBean(name="regBean")
@RequestScoped
public class RegistracijaBean {
	
	/* TO-DO
	 * validacija
	 */

	//ref na com.fleamart.uporabnik.ws
	private Uporabnik u;
	
	//fieldi
	private String uime;
	private String ime;
	private String priimek;
	private String email;
	private String geslo;
	private String geslo2;
	private String telefon;
	private String ulica;
	private int postnastev;
	private String obcina;
	private String drzava;
	
	public String getUime() {
		return uime;
	}
	public void setUime(String uime) {
		this.uime = uime;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPriimek() {
		return priimek;
	}
	public void setPriimek(String priimek) {
		this.priimek = priimek;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGeslo() {
		return geslo;
	}
	public void setGeslo(String geslo) {
		this.geslo = geslo;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getUlica() {
		return ulica;
	}
	public void setUlica(String ulica) {
		this.ulica = ulica;
	}
	public int getPostnastev() {
		return postnastev;
	}
	public void setPostnastev(int postnastev) {
		this.postnastev = postnastev;
	}
	public String getObcina() {
		return obcina;
	}
	public void setObcina(String obcina) {
		this.obcina = obcina;
	}
	public String getDrzava() {
		return drzava;
	}
	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}
	
	public String Registracija() {
		if (!this.geslo.equals(this.geslo2)) {
			return "fail";
		}
		this.setUporabnikWS();
		String resStr = new UporabnikService().getBasicHttpBindingIUporabnikService().registrirajUporabnika(this.u);
		String out = (resStr.equals("false")) ? "fail" : "login";
		return out;
	}
	public String getGeslo2() {
		return geslo2;
	}
	public void setGeslo2(String geslo2) {
		this.geslo2 = geslo2;
	}
	
	public void setUporabnikWS() {
		this.u = new Uporabnik();
		ObjectFactory of = new ObjectFactory();
		u.setUpime(of.createUporabnikUpime(this.uime));
		u.setIme(of.createUporabnikIme(this.ime));
		u.setPriimek(of.createUporabnikPriimek(this.priimek));
		u.setEmail(of.createUporabnikEmail(this.email));
		u.setGeslo(of.createUporabnikGeslo(this.geslo));
		u.setTelefon(of.createUporabnikTelefon(this.telefon));
		u.setVloga(1);
		Naslov naslov = new Naslov();
		naslov.setObcina(of.createNaslovObcina(this.obcina));
		naslov.setPostnaStevilka(this.postnastev);
		naslov.setDrzava(of.createNaslovDrzava(this.drzava));
		naslov.setUlica(of.createNaslovUlica(this.ulica));
		this.u.setNaslov(of.createNaslov(naslov));
	}
}