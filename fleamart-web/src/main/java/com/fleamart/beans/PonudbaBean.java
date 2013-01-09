package com.fleamart.beans;

import java.util.GregorianCalendar;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.fleamart.obj.OglasObj;
import com.fleamart.obj.PonudbaObj;
import com.fleamart.obj.UporabnikObj;
import com.fleamart.oglas.ws.Oglas;
import com.fleamart.ponudba.ws.IPonudbaService;
import com.fleamart.ponudba.ws.PonudbaService;
import com.fleamart.beans.LoginBean;
import com.fleamart.helpers.ConverterHelper;

@ManagedBean(name = "ponudbaBean")
@RequestScoped
public class PonudbaBean
{
	private PonudbaObj ponudba;
	private double znesek;
	private String txt;
	
	public String getTxt()
	{
		return txt;
	}
	public void setTxt(String txt)
	{
		this.txt = txt;
	}
	public double getZnesek()
	{
		return znesek;
	}
	public void setZnesek(double znesek)
	{
		this.znesek = znesek;
	}
	public PonudbaObj getPonudba()
	{
		return ponudba;
	}
	public void setPonudba(PonudbaObj ponudba)
	{
		this.ponudba = ponudba;
	}
		
	public PonudbaBean(){
		ponudba = new PonudbaObj();
	}
	public String posljiPonudbo()
	{
		try
		{	
			OglasObj oglas = new OglasObj();
			UporabnikObj uporabnik = new UporabnikObj();
			
			String trenCena = oglas.getCena();
			double trenutnaCena = Double.parseDouble(trenCena);
			
			if (znesek > trenutnaCena)
			{
				LoginBean lb = new LoginBean();				
				int id = lb.getIdUser();
				uporabnik.setId(id);
				
				int idOglas = oglas.getId();
				oglas.setId(idOglas);
				
				//damo na ponudbo
				ponudba.setCas(new GregorianCalendar());
				ponudba.setOglas(oglas);
				ponudba.setUporabnik(uporabnik);
				ponudba.setZnesek(znesek);
				
				//naredi ConverterHelper!!!, da spodnje vrstice delajo!!
				//Ponudba p = ConverterHelper.oglasObj2Ws(oglas);
				
				PonudbaService client = new PonudbaService();
				boolean uspelo = false;
				//uspelo = client.getBasicHttpBindingIPonudbaService().placeBidOnItem(ponudba);
				if (uspelo == true)
				{
					oglas.setCena(znesek);
					txt = "Uspešno oddana ponudba!";
					return "#";

				} else
				{
					txt = "Neuspešno oddana ponudba!";
					return "#";
				}

			} else
			{
				txt = "Vpisali ste prenizko ceno!";
				return "oglas";
			}

		} catch (Exception e)
		{
			e.printStackTrace();
			return "#";
		}

	}

}
