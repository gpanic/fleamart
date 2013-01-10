package com.fleamart.beans;

import java.util.GregorianCalendar;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.fleamart.obj.OglasObj;
import com.fleamart.obj.PonudbaObj;
import com.fleamart.obj.UporabnikObj;
import com.fleamart.oglas.ws.Oglas;
import com.fleamart.ponudba.ws.IPonudbaService;
import com.fleamart.ponudba.ws.Ponudba;
import com.fleamart.ponudba.ws.PonudbaService;
import com.fleamart.beans.LoginBean;
import com.fleamart.helpers.ConverterHelper;

@ManagedBean(name = "ponudbaBean")
@RequestScoped
public class PonudbaBean
{
	private PonudbaObj ponudba;
	private String znesek;
	private String txt;

	public String getTxt()
	{
		return txt;
	}
	public void setTxt(String txt)
	{
		this.txt = txt;
	}
	public String getZnesek()
	{
		return znesek;
	}
	public void setZnesek(String znesek)
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

	public PonudbaBean()
	{
		ponudba = new PonudbaObj();
	}
	public String posljiPonudbo(OglasObj oglas, int idUpor)
	{
		try
		{
			UporabnikObj uporabnik = new UporabnikObj();
			String trenCena = oglas.getCena();
			double trenutnaCena = Double.parseDouble(trenCena);
			double znesekD = Double.parseDouble(znesek);
			if (znesekD > trenutnaCena)
			{
				uporabnik.setId(idUpor);
				ponudba.setCas(new GregorianCalendar());
				ponudba.setOglas(oglas);
				ponudba.setUporabnik(uporabnik);
				ponudba.setZnesek(znesekD);
				Ponudba p = ConverterHelper.ponudbaObj2WS(ponudba);
				PonudbaService client = new PonudbaService();
				boolean uspelo = client.getBasicHttpBindingIPonudbaService()
						.placeBidOnItem(p);
				if (uspelo == true)
				{
					oglas.setCena(znesek);
					txt = "Uspe�no oddana ponudba!";
					return "#";

				} else
				{
					txt = "Neuspe�no oddana ponudba!";
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
