package com.fleamart.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import com.fleamart.helpers.ConverterHelper;
import com.fleamart.kategorija.ws.ArrayOfKategorija;
import com.fleamart.kategorija.ws.KategorijeService;
import com.fleamart.obj.KategorijaObj;
import com.fleamart.obj.OglasObj;
import com.fleamart.oglas.ws.ArrayOfOglas;
import com.fleamart.oglas.ws.Oglas;
import com.fleamart.oglas.ws.OglasService;
import java.util.ArrayList;

@ManagedBean(name = "oglasBean")
@RequestScoped
public class OglasBean {

    private List<OglasObj> oglasi;
    private OglasObj oglas;
    private List<KategorijaObj> kategorije;
    private KategorijaObj kategorija;
    private String searchParam;
    private String queryKateg;
    private int aktivni = 0; //v oglas/list.xhtml

    @PostConstruct
    public void init() {
        FacesContext fc = FacesContext.getCurrentInstance();
        String view = fc.getViewRoot().getViewId();

        HttpServletRequest request = (HttpServletRequest) fc
                .getExternalContext().getRequest();

        if (view.equals("/browse.xhtml")) {
            OglasService c = new OglasService();
            List<Oglas> oglasiWS = null;
            ArrayOfOglas oglasi = null;

            this.listKategorije();
            this.kategorije.add(0, new KategorijaObj(0, "Vse kategorije"));

            String kat = request.getParameter("kategorija");
            String param = request.getParameter("param");

            if (kat != null) {
                if (kat.equals("Vse kategorije") || kat.equals(""))
                    kat = null;

                if (param != null)
                    if (param.equals(""))
                        param = null;

                oglasi = c.getBasicHttpBindingIOglasService().searchOglasi(
                        kat, param);
                oglasiWS = oglasi.getOglas();

            } else {
                oglasi = c.getBasicHttpBindingIOglasService().getOglasi();
                oglasiWS = oglasi.getOglas();
            }

            for (Oglas oWS : oglasiWS) {
                this.oglasi.add(ConverterHelper.oglasWs2Obj(oWS));
            }
        }
    }

    public OglasBean() {
        oglasi = new ArrayList<OglasObj>();
        oglas = new OglasObj();
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
        ArrayOfKategorija kat = client.getBasicHttpBindingIKategorijaService()
                .vrniKategorije();
        List<com.fleamart.kategorija.ws.Kategorija> kategorijeList = kat
                .getKategorija();

        for (com.fleamart.kategorija.ws.Kategorija k : kategorijeList)
            kategorije.add(new KategorijaObj(k.getId().intValue(), k.getNaziv()
                    .getValue()));
    }

    public OglasObj getOglas() {
        return oglas;
    }

    public void setOglas(OglasObj oglas) {
        this.oglas = oglas;
    }

    public int getAktivni() {
        return aktivni;
    }

    public void setAktivni(int aktivni) {
        this.aktivni = aktivni;
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

    public String getSearchParam() {
        return searchParam;
    }

    public void setSearchParam(String searchParam) {
        this.searchParam = searchParam;
    }

    public String getQueryKateg() {
        return queryKateg;
    }

    public void setQueryKateg(String queryKateg) {
        boolean nas = false;
        for (KategorijaObj kategorija : this.kategorije) {
            if (queryKateg.equals(kategorija.getNaziv())) {
                nas = true;
                break;
            }
        }
        if (!nas)
            queryKateg = this.kategorije.get(0).getNaziv();
        this.queryKateg = queryKateg;
    }
}
