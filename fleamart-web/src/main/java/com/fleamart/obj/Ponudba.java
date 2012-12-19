package com.fleamart.obj;

public class Ponudba
{
	private double znesek;
	private int idUporabnik;
	private int idOglas;
	
	public Ponudba(double znesek, int idUporabnik, int idOglas) {
        super();
        this.znesek = znesek;
        this.idUporabnik = idUporabnik;
        this.idOglas = idOglas;
    }
	
	public double getZnesek()
	{
		return znesek;
	}
	public void setZnesek(double znesek)
	{
		this.znesek = znesek;
	}
	public int getIdUporabnik()
	{
		return idUporabnik;
	}
	public void setIdUporabnik(int idUporabnik)
	{
		this.idUporabnik = idUporabnik;
	}
	public int getIdOglas()
	{
		return idOglas;
	}
	public void setIdOglas(int idOglas)
	{
		this.idOglas = idOglas;
	}
	

}
