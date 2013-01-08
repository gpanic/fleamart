package com.fleamart.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.fleamart.obj.OglasObj;
import com.fleamart.ponudba.ws.IPonudbaService;
import com.fleamart.ponudba.ws.PonudbaService;

@ManagedBean(name = "ponudbaBean")
@RequestScoped
public class PonudbaBean
{
	private double znesek;
	private int idUporabnik;
	private int idOglas;

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

	public String posljiPonudbo()
	{
		try
		{
			com.fleamart.obj.OglasObj oglas = new OglasObj();
			String trenCena = oglas.getCena();
			double trenutnaCena = Double.parseDouble(trenCena);
			if (znesek > trenutnaCena)
			{

				IPonudbaService service = new PonudbaService()
						.getBasicHttpBindingIPonudbaService();
				boolean uspelo = service.placeBidOnItem(znesek, idUporabnik,
						idOglas);
				if (uspelo == true)
				{
					oglas.setCena(znesek);
					return "#";

				} else
				{
					//TODO: naredi v oglasu txt, da ni uspelo!
					return "#";
				}

			} else
			{
				//TODO: naredi v oglasu txt, da je prenizka cena!
				return "oglas";
			}

		} catch (Exception e)
		{
			e.printStackTrace();
			return "#";
		}

	}

}
