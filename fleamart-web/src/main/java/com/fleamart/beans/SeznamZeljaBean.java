package com.fleamart.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.fleamart.obj.OglasObj;
import com.fleamart.obj.SeznamZeljaObj;
import com.fleamart.obj.UporabnikObj;

@ManagedBean(name = "seznamZeljaBean")
@RequestScoped
public class SeznamZeljaBean
{
	private SeznamZeljaObj seznamZelja;

	public SeznamZeljaObj getSeznamZelja()
	{
		return seznamZelja;
	}

	public void setSeznamZelja(SeznamZeljaObj seznamZelja)
	{
		this.seznamZelja = seznamZelja;
	}
	
	public SeznamZeljaBean(){
		seznamZelja = new SeznamZeljaObj();
	}
	
	public String dodajZeljo(OglasObj oglas, int idUpor){
		try{
			UporabnikObj uporabnik = new UporabnikObj();
			uporabnik.setId(idUpor);
			seznamZelja.setUporabnik(uporabnik);
			seznamZelja.setOglas(oglas);
			//TODO: CONVENTER HELPER......
			
			//!!!!!!!!!!!!!ZBRIŠI POTEM
			return "#";
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return "#";
		}
	}
	

}
