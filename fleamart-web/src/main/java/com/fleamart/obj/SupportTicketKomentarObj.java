package com.fleamart.obj;

import java.util.GregorianCalendar;

public class SupportTicketKomentarObj {
	
	private int id;
	private String vsebina;
	
	private UporabnikObj avtor;
	private GregorianCalendar cas;

	private int supportTicketId;
	
	public SupportTicketKomentarObj() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVsebina() {
		return vsebina;
	}

	public void setVsebina(String vsebina) {
		this.vsebina = vsebina;
	}

	public UporabnikObj getAvtor() {
		return avtor;
	}

	public void setAvtor(UporabnikObj avtor) {
		this.avtor = avtor;
	}

	public GregorianCalendar getCas() {
		return cas;
	}

	public void setCas(GregorianCalendar cas) {
		this.cas = cas;
	}

	public int getSupportTicketId() {
		return supportTicketId;
	}

	public void setSupportTicketId(int supportTicketId) {
		this.supportTicketId = supportTicketId;
	}

}
