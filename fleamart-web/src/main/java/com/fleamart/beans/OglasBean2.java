/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fleamart.beans;

import com.fleamart.helpers.ConverterHelper;
import com.fleamart.kategorija.ws.ArrayOfKategorija;
import com.fleamart.kategorija.ws.KategorijeService;
import com.fleamart.obj.KategorijaObj;
import com.fleamart.obj.OglasObj;
import com.fleamart.obj.UporabnikObj;
import com.fleamart.oglas.ws.ObjectFactory;
import com.fleamart.oglas.ws.Oglas;
import com.fleamart.oglas.ws.OglasService;
import com.fleamart.oglas.ws.Uporabnik;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.FacesException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean(name = "oglasBean2")
@ViewScoped
public class OglasBean2 implements Serializable {

    private List<OglasObj> oglasi;
    private OglasObj oglas;
    private List<KategorijaObj> kategorije;
    private KategorijaObj kategorija;
    private int aktivni = 0; //v oglas/list.xhtml, oglas/read.xhtml, oglas/listProdano.xhtml, kot statusNakupa v oglas/listNakupi.xhtml
    private double zasluzek;
    @ManagedProperty(value = "#{loginBean}")
    private LoginBean loginBean;

    @PostConstruct
    public void init() {
        String view = FacesContext.getCurrentInstance().getViewRoot().getViewId();

        switch (view) {
            case "/oglas/list.xhtml":
                initOglasListAvtor();
                break;
            case "/oglas/listProdano.xhtml":
                initOglasListProdano();
                break;
            case "/oglas/listNakupi.xhtml":
                initOglasListKupljeno();
                break;
        }
    }

    public OglasBean2() {
        oglas = new OglasObj();
        oglasi = new ArrayList<OglasObj>();
    }

    public List<OglasObj> getOglasi() {
        return oglasi;
    }

    public void setOglasi(List<OglasObj> oglasi) {
        this.oglasi = oglasi;
    }

    public double getZasluzek() {
        return zasluzek;
    }

    public void setZasluzek(double zasluzek) {
        this.zasluzek = zasluzek;
    }

    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }

    public OglasObj getOglas() {
        return oglas;
    }

    public void setOglas(OglasObj oglas) {
        this.oglas = oglas;
    }

    public List<KategorijaObj> getKategorije() {
        return kategorije;
    }

    public void setKategorije(List<KategorijaObj> kategorije) {
        this.kategorije = kategorije;
    }

    public KategorijaObj getKategorija() {
        return kategorija;
    }

    public void setKategorija(KategorijaObj kategorija) {
        this.kategorija = kategorija;
    }

    public int getAktivni() {
        return aktivni;
    }

    public void setAktivni(int aktivni) {
        this.aktivni = aktivni;
    }

    public void listKategorije() {
        kategorije = new ArrayList<KategorijaObj>();
        KategorijeService client = new KategorijeService();
        ArrayOfKategorija kat = client.getBasicHttpBindingIKategorijaService()
                .vrniKategorije();
        List<com.fleamart.kategorija.ws.Kategorija> kategorijeList = kat
                .getKategorija();

        for (com.fleamart.kategorija.ws.Kategorija k : kategorijeList)
            kategorije.add(new KategorijaObj(k.getId().intValue(), k.getNaziv()
                    .getValue()));
    }

    public void createOglas() {
        oglas.setCasOd(new GregorianCalendar());
        GregorianCalendar gc = new GregorianCalendar();
        gc.add(Calendar.DATE, 30);
        oglas.setCasDo(gc);
        UporabnikObj u = new UporabnikObj();
        u.setId(loginBean.getIdUser());
        oglas.setAvtor(u);
        oglas.setStatus(0);
        Oglas o = ConverterHelper.oglasObj2Ws(oglas);

        OglasService client = new OglasService();
        Boolean rezultat = client.getBasicHttpBindingIOglasService().createOglas(o);
        String out = (rezultat) ? "/oglas/read.xhtml" : "fail.xhtml";
        if (rezultat) {
            o = client.getBasicHttpBindingIOglasService().readOglasLast(loginBean.getIdUser());
            out += "?id=" + o.getId();
            redirect(out);
        }
    }

    public void initOglasForm() {
        listKategorije();
        while (oglas.getSlike().size() < 3)
            oglas.getSlike().add("");
    }

    public void initOglasFormUpdate() {
        readOglas(oglas.getId());
        aktivni = oglas.getStatus();
        initOglasForm();
    }

    public void initOglasListAvtor() {
        listOglasiAvtor(aktivni, null);
    }

    public void initOglasRead() {
        readOglas(oglas.getId());
    }

    public void initOglasListProdano() {
        listOglasiAvtor(null, aktivni);
        if (aktivni == 1) {
            zasluzek = 0;
            for (OglasObj o : oglasi)
                zasluzek += o.getCenaInteger();
        }
    }

    public void initOglasListKupljeno() {
        listOglasiKupec(aktivni);
        zasluzek = 0;
        for (OglasObj o : oglasi)
            zasluzek += o.getCenaInteger();
    }

    public void deleteOglas() {
        OglasService client = new OglasService();
        client.getBasicHttpBindingIOglasService().deleteOglas(oglas.getId());
        redirect("/oglas/list.xhtml");
    }

    public void redirect(String path) {
        try {
            ExternalContext ec = FacesContext.getCurrentInstance()
                    .getExternalContext();
            ec.redirect(ec.getRequestContextPath() + path);
        } catch (IOException ex) {
            Logger.getLogger(OglasBean.class.getName()).log(
                    Level.SEVERE, null, ex);
        }
    }

    public void listOglasiAvtor(Integer status, Integer statusNakupa) {
        OglasService client = new OglasService();
        List<Oglas> oglasiws = client.getBasicHttpBindingIOglasService().listOglasiAvtor(loginBean.getIdUser(), status, statusNakupa).getOglas();

        oglasi.clear();
        for (Oglas o : oglasiws) {
            oglasi.add(ConverterHelper.oglasWs2Obj(o));
        }
    }

    public void listOglasiKupec(int statusNakupa) {
        OglasService client = new OglasService();
        List<Oglas> oglasiws = client.getBasicHttpBindingIOglasService().listOglasiKupec(loginBean.getIdUser(), statusNakupa).getOglas();

        oglasi.clear();
        for (Oglas o : oglasiws) {
            oglasi.add(ConverterHelper.oglasWs2Obj(o));
        }
    }

    public void readOglas(int id) {
        OglasService client = new OglasService();
        oglas = ConverterHelper.oglasWs2Obj(client.getBasicHttpBindingIOglasService().readOglas(id));
    }

    public void updateOglas() {
        GregorianCalendar gc = new GregorianCalendar();
        if (aktivni == 1 && oglas.getStatus() == 0) {
            oglas.setCasOd(new GregorianCalendar());
            gc.add(Calendar.DATE, 30);
            oglas.setCasDo(gc);
        } else
            oglas.setCasSpremenjeno(gc);

        OglasService client = new OglasService();
        client.getBasicHttpBindingIOglasService().updateOglas(ConverterHelper.oglasObj2Ws(oglas));
        redirect("/oglas/read.xhtml?id=" + oglas.getId());
    }

    public void kupiOglas(int idOglas) {
        OglasService client = new OglasService();
        Oglas o = client.getBasicHttpBindingIOglasService().readOglas(idOglas);
        if (o.getKupec().getValue() == null) {
            o.setStatusNakupa(new ObjectFactory().createOglasStatusNakupa(0));
            Uporabnik u = new Uporabnik();
            u.setId(loginBean.getIdUser());
            o.setKupec(new ObjectFactory().createOglasKupec(u));

            Boolean uspelo = client.getBasicHttpBindingIOglasService().updateOglas(o);

            if (uspelo) {
                redirect("/oglas/read.xhtml?id=" + idOglas);
            }
        }
    }

    public void kupiOglasPotrdiNakup(int idOglas) {
        OglasService client = new OglasService();
        Oglas o = client.getBasicHttpBindingIOglasService().readOglas(idOglas);
        o.setStatusNakupa(new ObjectFactory().createOglasStatusNakupa(1));

        Boolean uspelo = client.getBasicHttpBindingIOglasService().updateOglas(o);

        if (uspelo) {
            redirect("/oglas/listProdano.xhtml");
        }
    }
}
