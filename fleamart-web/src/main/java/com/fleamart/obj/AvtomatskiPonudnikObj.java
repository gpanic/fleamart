package com.fleamart.obj;

import java.util.GregorianCalendar;

public class AvtomatskiPonudnikObj
{
	private int id;
    private double maxCena;
    private boolean aktiven;
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
	public double getMaxCena()
	{
		return maxCena;
	}
	public void setMaxCena(double maxCena)
	{
		this.maxCena = maxCena;
	}
	public boolean isAktiven()
	{
		return aktiven;
	}
	public void setAktiven(boolean aktiven)
	{
		this.aktiven = aktiven;
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
        return "AvtomatskiPonudnikObj{" + "id=" + id + ", maxCena=" + maxCena + ", aktiven=" + aktiven + ", uporabnik=" + uporabnik + ", oglas=" + oglas + '}';
    }
    
}
