package com.fleamart.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.fleamart.helpers.ConverterHelper;
import com.fleamart.obj.OglasObj;
import com.fleamart.obj.SeznamZeljaObj;
import com.fleamart.obj.UporabnikObj;
import com.fleamart.oglas.ws.OglasService;
import com.fleamart.seznamZelja.ws.Oglas;
import com.fleamart.seznamZelja.ws.SeznamZelja;
import com.fleamart.seznamZelja.ws.SeznamZeljaService;
import com.fleamart.uporabnik.ws.Uporabnik;

@ManagedBean(name = "seznamZeljaBean")
@RequestScoped
public class SeznamZeljaBean
{
	private SeznamZeljaObj seznamZelja;
	private List<SeznamZeljaObj> zelje;
	private OglasObj oglas;
	private List<OglasObj> oglasi;
	private String txt;

	public SeznamZeljaObj getSeznamZelja()
	{
		return seznamZelja;
	}

	public void setSeznamZelja(SeznamZeljaObj seznamZelja)
	{
		this.seznamZelja = seznamZelja;
	}

	public String getTxt()
	{
		return txt;
	}

	public void setTxt(String txt)
	{
		this.txt = txt;
	}

	public List<SeznamZeljaObj> getZelje()
	{
		return zelje;
	}

	public void setZelje(List<SeznamZeljaObj> zelje)
	{
		this.zelje = zelje;
	}

	public OglasObj getOglas()
	{
		return oglas;
	}

	public void setOglas(OglasObj oglas)
	{
		this.oglas = oglas;
	}

	public List<OglasObj> getOglasi()
	{
		return oglasi;
	}

	public void setOglasi(List<OglasObj> oglasi)
	{
		this.oglasi = oglasi;
	}

	public SeznamZeljaBean()
	{
		seznamZelja = new SeznamZeljaObj();
		zelje = new ArrayList<SeznamZeljaObj>();
		oglas = new OglasObj();
		oglasi = new ArrayList<OglasObj>();
	}

	public String izbrisiZeljo(int id)
	{
		try
		{
			System.out
					.println("__________________________________________****************************************");
			OglasService client = new OglasService();
			boolean vrne = client.getBasicHttpBindingIOglasService()
					.izbrisiZeljo(id);
			if (vrne == true)
			{
				txt = "Oglas odstranjen iz seznama želja!";
				return "#";

			} else
			{
				txt = "Neuspešno odstranjen oglas na seznam želja!";
				return "#";
			}
		} catch (Exception e)
		{
			e.printStackTrace();
			return "#";
		}
	}

	public void prikaziSeznamZelja(int idUporabnik)
	{
		OglasService client = new OglasService();
		List<com.fleamart.oglas.ws.Oglas> seznam = client
				.getBasicHttpBindingIOglasService()
				.pridobiSeznamZelja(idUporabnik).getOglas();
		oglasi.clear();
		for (com.fleamart.oglas.ws.Oglas s : seznam)
		{
			oglasi.add(ConverterHelper.oglasWs2Obj(s));
		}

	}

	public String dodajZeljo(OglasObj oglas, int idUpor)
	{
		try
		{
			UporabnikObj uporabnik = new UporabnikObj();
			uporabnik.setId(idUpor);
			com.fleamart.oglas.ws.Uporabnik uporabnikZaWs = ConverterHelper
					.uporabnikObj2WS(uporabnik);
			com.fleamart.oglas.ws.Oglas oglasZaWs = ConverterHelper
					.oglasObj2Ws(oglas);

			OglasService client = new OglasService();
			boolean vrne = client.getBasicHttpBindingIOglasService()
					.dodajZeljo(oglasZaWs, uporabnikZaWs);
			if (vrne == true)
			{
				txt = "Oglas dodan na seznam želja!";
				return "#";

			} else
			{
				txt = "Neuspešno dodan oglas na seznam želja!";
				return "#";
			}
		} catch (Exception e)
		{
			e.printStackTrace();
			return "#";
		}
	}

}
