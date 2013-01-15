package com.fleamart.obj;

import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.List;

public class SupportTicketObj implements Serializable  {
	
	private int id;
	private String naslov;
	private String vsebina;
	private GregorianCalendar casUstvarjen;
	private GregorianCalendar casZaprt;
	
	private UporabnikObj avtor;
	private UporabnikObj tehnik;
	private SupportTicketKategorijaObj supportTicketKategorija;
	private SupportTicketStatusObj supportTicketStatus;

	private List<SupportTicketKomentarObj> komentarji;

	public SupportTicketObj() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNaslov() {
		return naslov;
	}

	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}

	public String getVsebina() {
		return vsebina;
	}

	public void setVsebina(String vsebina) {
		this.vsebina = vsebina;
	}

	public GregorianCalendar getCasUstvarjen() {
		return casUstvarjen;
	}

	public void setCasUstvarjen(GregorianCalendar casUstvarjen) {
		this.casUstvarjen = casUstvarjen;
	}

	public GregorianCalendar getCasZaprt() {
		return casZaprt;
	}

	public void setCasZaprt(GregorianCalendar casZaprt) {
		this.casZaprt = casZaprt;
	}

	public UporabnikObj getAvtor() {
		return avtor;
	}

	public void setAvtor(UporabnikObj avtor) {
		this.avtor = avtor;
	}

	public UporabnikObj getTehnik() {
		return tehnik;
	}

	public void setTehnik(UporabnikObj tehnik) {
		this.tehnik = tehnik;
	}

	public SupportTicketKategorijaObj getSupportTicketKategorija() {
		return supportTicketKategorija;
	}

	public void setSupportTicketKategorija(
			SupportTicketKategorijaObj supportTicketKategorija) {
		this.supportTicketKategorija = supportTicketKategorija;
	}

	public SupportTicketStatusObj getSupportTicketStatus() {
		return supportTicketStatus;
	}

	public void setSupportTicketStatus(SupportTicketStatusObj supportTicketStatus) {
		this.supportTicketStatus = supportTicketStatus;
	}

	public List<SupportTicketKomentarObj> getKomentarji() {
		return komentarji;
	}

	public void setKomentarji(List<SupportTicketKomentarObj> komentarji) {
		this.komentarji = komentarji;
	}

}
