/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fleamart.obj;

import java.util.GregorianCalendar;

public class PonudbaObj {
    
    private int id;
    private double znesek;
    private GregorianCalendar cas;
    private UporabnikObj uporabnik;
    private OglasObj oglas;

    public OglasObj getOglas()
	{
		return oglas;
	}

	public void setOglas(OglasObj oglas)
	{
		this.oglas = oglas;
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getZnesek() {
        return znesek;
    }

    public void setZnesek(double znesek) {
        this.znesek = znesek;
    }

    public GregorianCalendar getCas() {
        return cas;
    }

    public void setCas(GregorianCalendar cas) {
        this.cas = cas;
    }

    public UporabnikObj getUporabnik() {
        return uporabnik;
    }

    public void setUporabnik(UporabnikObj uporabnik) {
        this.uporabnik = uporabnik;
    }

    @Override
    public String toString() {
        return "PonudbaObj{" + "id=" + id + ", znesek=" + znesek + ", cas=" + cas + ", uporabnik=" + uporabnik + ", oglas=" + oglas + '}';
    }
    
}
