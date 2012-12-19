package com.fleamart.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.fleamart.obj.OglasObj;

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
			/*
			com.fleamart.obj.OglasObj oglas = new OglasObj();
			double trenutnaCena = oglas.getCena();
			if (znesek > trenutnaCena)
			{
				
				fleamart.PonudbaWebServiceService service = new Ponudba.client.PonudbaWebServiceService();
				fleamart.client.PonudbaWebService port = service
						.getPonudbaWebServicePort();

				Boolean uspelo = port.placeBidOnItem(znesek, idUporabnik,
						idOglas);
				if (uspelo == true)
				{
					oglas.setCena(znesek);
					return "oglas";
					System.out.println("Ponudba poslana.");¸
					
				} else
				{
					return "oglas";
					System.out.println("Ponudbe ni bilo mogoèe poslati.");
				}

			} else
			{
				System.out.println("Prenizka cena!");
				return "oglas";
			}
			
			*/
			//zbrisi
			return "";
		} catch (Exception e)
		{
			e.printStackTrace();
			return "";
		}

	}

}
