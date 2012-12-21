package com.fleamart.beans;

import com.fleamart.helpers.ConverterHelper;
import com.fleamart.kategorija.ws.*;
import com.fleamart.obj.KategorijaObj;
import com.fleamart.obj.OglasObj;
import com.fleamart.obj.UporabnikObj;
import com.fleamart.oglas.ws.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

@ManagedBean(name = "oglasBean")
@RequestScoped
public class OglasBean {

    private List<OglasObj> oglasi;
    private OglasObj oglas;
    private List<KategorijaObj> kategorije;
    private KategorijaObj kategorija;

    public OglasBean() {
    	oglasi = new ArrayList<OglasObj>();
    	OglasObj o = new OglasObj();
    	o.setId(55);
    	oglasi.add(o);
        oglas = new OglasObj();
        if (oglas.getSlike().isEmpty()) {
            oglas.getSlike().add("");
            oglas.getSlike().add("");
            oglas.getSlike().add("");
        }
        this.listKategorije();
    }

    public KategorijaObj getKategorija() {
        return kategorija;
    }

    public void setKategorija(KategorijaObj kategorija) {
        this.kategorija = kategorija;
    }

    public void listKategorije() {
        kategorije = new ArrayList<KategorijaObj>();
        KategorijeService client = new KategorijeService();
        ArrayOfKategorija kat = client.getBasicHttpBindingIKategorijaService().vrniKategorije();
        List<com.fleamart.kategorija.ws.Kategorija> kategorijeList = kat.getKategorija();
        for (com.fleamart.kategorija.ws.Kategorija k : kategorijeList)
            kategorije.add(new KategorijaObj(k.getId().intValue(), k.getNaziv().getValue()));
    }

    public OglasObj getOglas() {
        return oglas;
    }

    public void setOglas(OglasObj oglas) {
        this.oglas = oglas;
    }

    public List<OglasObj> getOglasi() {
        return oglasi;
    }

    public void setOglasi(List<OglasObj> oglasi) {
        this.oglasi = oglasi;
    }

    public List<KategorijaObj> getKategorije() {
        return kategorije;
    }

    public void setKategorije(List<KategorijaObj> kategorije) {
        this.kategorije = kategorije;
    }

    public String createOglas() {
        oglas.setCasOd(new GregorianCalendar());
        GregorianCalendar gc = new GregorianCalendar();
        gc.add(Calendar.DATE, 30);
        oglas.setCasDo(gc);
        UporabnikObj u = new UporabnikObj();
        u.setId(1); //kasneje prebrat iz seje
        oglas.setAvtor(u);
        Oglas o = ConverterHelper.oglasObj2Ws(oglas);
        
        OglasService client = new OglasService();
        Boolean rezultat = client.getBasicHttpBindingIOglasService().createOglas(o);
        String out = (rezultat) ? "read" : "fail";
        return out;
    }
//
//    public void readOglas(int id) {
//        OglasService client = new OglasService();
//        oglas = client.getBasicHttpBindingIOglasService().readOglas(id);
//    }
//
//    public void updateOglas(ActionEvent event) {
//        OglasService client = new OglasService();
//        client.getBasicHttpBindingIOglasService().updateOglas(oglas);
//    }
//
//    public void deleteOglas(int id) {
//        OglasService client = new OglasService();
//        client.getBasicHttpBindingIOglasService().deleteOglas(id);
//    }
}
