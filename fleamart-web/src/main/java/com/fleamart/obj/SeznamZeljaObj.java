/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fleamart.obj;

public class SeznamZeljaObj {
    private int id;
	private UporabnikObj uporabnik;
    private OglasObj oglas;
    
    public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public UporabnikObj getUporabnik()
	{
		return uporabnik;
	}
	public void setUporabnik(UporabnikObj uporabnik)
	{
		this.uporabnik = uporabnik;
	}
	public OglasObj getOglas()
	{
		return oglas;
	}
	public void setOglas(OglasObj oglas)
	{
		this.oglas = oglas;
	}
	
	@Override
    public String toString() {
        return "SeznamZeljaObj{" + "id=" + id + ", uporabnik=" + uporabnik + ", oglas=" + oglas + '}';
    }

}
