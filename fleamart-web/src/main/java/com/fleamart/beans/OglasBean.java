package com.fleamart.beans;

import com.fleamart.obj.OglasObj;
import com.fleamart.oglas.ws.*;
import java.awt.event.ActionEvent;
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

    Oglas oglasws;
    private List<Oglas> oglasi;
    OglasObj oglas;

    public OglasBean() {
    }

    public OglasObj getOglas() {
        if(oglas == null)
            oglas = new OglasObj();
        return oglas;
    }

    public void setOglas(OglasObj oglas) {
        this.oglas = oglas;
    }

    public List<Oglas> getOglasi() {
        return oglasi;
    }

    public void setOglasi(List<Oglas> oglasi) {
        this.oglasi = oglasi;
    }

    public void createOglas() {
        System.out.println(oglas);

//        try {
//            GregorianCalendar gc = new GregorianCalendar();
//            oglas.setCasOd(DatatypeFactory.newInstance().newXMLGregorianCalendar(gc));
//            gc.add(Calendar.DATE, 30);
//            oglas.setCasDo(DatatypeFactory.newInstance().newXMLGregorianCalendar(gc));
//        } catch (DatatypeConfigurationException ex) {
//            Logger.getLogger(OglasBean.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        OglasService client = new OglasService();
//        client.getBasicHttpBindingIOglasService().createOglas(oglas);
//        oglas = null;
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
