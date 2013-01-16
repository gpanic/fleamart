package com.fleamart.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.fleamart.helpers.ConverterHelper;
import com.fleamart.obj.OglasObj;
import com.fleamart.obj.UporabnikObj;
import com.fleamart.oglas.ws.Oglas;
import com.fleamart.oglas.ws.OglasService;
import com.fleamart.uporabnik.ws.Uporabnik;
import com.fleamart.uporabnik.ws.UporabnikService;

@ManagedBean(name = "profilUporabnikaBean")
@RequestScoped
public class ProfilUporabnikaBean
{
	int prodajalecId;
	UporabnikObj uporabnik;
	private List<OglasObj> oglasi;
	private double ocena;

	public UporabnikObj getUporabnik()
	{
		return uporabnik;
	}

	public void setUporabnik(UporabnikObj uporabnik)
	{
		this.uporabnik = uporabnik;
	}

	public UporabnikObj getProfilUporabnika()
	{
		return uporabnik;
	}

	public void setProfilUporabnika(UporabnikObj profilUporabnika)
	{
		this.uporabnik = profilUporabnika;
	}

	public ProfilUporabnikaBean()
	{
		uporabnik = new UporabnikObj();
		oglasi = new ArrayList<OglasObj>();
	}

	public List<OglasObj> getOglasi()
	{
		return oglasi;
	}

	public void setOglasi(List<OglasObj> oglasi)
	{
		this.oglasi = oglasi;
	}

	public double getOcena()
	{
		return ocena;
	}

	public void setOcena(double ocena)
	{
		this.ocena = ocena;
	}

	public int getProdajalecId()
	{
		return prodajalecId;
	}

	public void setProdajalecId(int prodajalecId)
	{
		this.prodajalecId = prodajalecId;
	}

	public void prikaziProfil()
	{	
			UporabnikService client = new UporabnikService();
			Uporabnik u1 = client.getBasicHttpBindingIUporabnikService().profilUporabnika(prodajalecId);
			uporabnik = ConverterHelper.uporabnikWs22Obj(u1);

			// seznam oglasov
			OglasService clientOgl = new OglasService();
			List<Oglas> oglasiws = clientOgl.getBasicHttpBindingIOglasService()
					.pridobiOglaseProdajalca(prodajalecId).getOglas();
			oglasi.clear();
			for (Oglas o : oglasiws)
			{
				oglasi.add(ConverterHelper.oglasWs2Obj(o));
			}

			ocena = clientOgl.getBasicHttpBindingIOglasService().izracunajPovprecje(prodajalecId);
		
	}

}
