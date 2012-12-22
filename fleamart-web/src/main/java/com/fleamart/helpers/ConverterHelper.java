/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fleamart.helpers;

import com.fleamart.beans.OglasBean;
import com.fleamart.obj.KategorijaObj;
import com.fleamart.obj.NaslovObj;
import com.fleamart.obj.OglasObj;
import com.fleamart.obj.UporabnikObj;
import com.fleamart.oglas.ws.ArrayOfstring;
import com.fleamart.oglas.ws.Kategorija;
import com.fleamart.oglas.ws.Naslov;
import com.fleamart.oglas.ws.Oglas;
import com.fleamart.oglas.ws.Uporabnik;
import com.fleamart.uporabnik.ws.ObjectFactory;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

/**
 *
 * @author Dejan
 */
public class ConverterHelper {

    public static Oglas oglasObj2Ws(OglasObj obj) {
        com.fleamart.oglas.ws.ObjectFactory of = new com.fleamart.oglas.ws.ObjectFactory();

        Oglas o = of.createOglas();
        o.setId(obj.getId());
        o.setNaslov(obj.getNaslov());
        o.setOpis(obj.getOpis());
        o.setAvkcija(obj.isAvkcija());
        o.setCena(Double.parseDouble(obj.getCena()));
        o.setZadnjaCenaAvkcija(of.createOglasZadnjaCenaAvkcija(obj.getZadnjaCenaAvkcija()));
        com.fleamart.oglas.ws.Kategorija k = of.createKategorija();
        k.setId(obj.getKategorija().getId());
        o.setKategorija(of.createKategorija(k));
        o.setStatus(obj.getStatus());

        o.setAvtor(uporabnikObj2WS(obj.getAvtor()));
        if (obj.getKupec() != null)
            o.setKupec(of.createOglasKupec(uporabnikObj2WS(obj.getKupec())));
        try {
            if (obj.getCasOd() != null)
                o.setCasOd(DatatypeFactory.newInstance().newXMLGregorianCalendar(obj.getCasOd()));
            if (obj.getCasDo() != null)
                o.setCasDo(DatatypeFactory.newInstance().newXMLGregorianCalendar(obj.getCasDo()));
            if (obj.getCasSpremenjeno() != null)
                o.setCasSpremenjeno(of.createOglasCasSpremenjeno(DatatypeFactory.newInstance().newXMLGregorianCalendar(obj.getCasSpremenjeno())));

        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(OglasBean.class.getName()).log(Level.SEVERE, null, ex);
        }

        ArrayOfstring slike = of.createArrayOfstring();
        for (String slika : obj.getSlike()) {
            if (slika.length() > 0)
                slike.getString().add(slika);
        }
        o.setSlike(of.createOglasSlike(slike));

        return o;
    }

    public static OglasObj oglasWs2Obj(Oglas ows) {
        OglasObj o = new OglasObj();
        o.setId(ows.getId());
        o.setNaslov(ows.getNaslov());
        o.setAvkcija(ows.isAvkcija());
        o.setCena(ows.getCena());
        if (!ows.getZadnjaCenaAvkcija().isNil()) {
        	o.setZadnjaCenaAvkcija(ows.getZadnjaCenaAvkcija().getValue());
        }
        o.setOpis(ows.getOpis());
        o.setSlike(ows.getSlike().getValue().getString());
        o.setCasOd(ows.getCasOd().toGregorianCalendar());
        o.setCasDo(ows.getCasDo().toGregorianCalendar());
        if (ows.getCasSpremenjeno().getValue() != null)
            o.setCasSpremenjeno(ows.getCasSpremenjeno().getValue().toGregorianCalendar());
        o.setStatus(ows.getStatus());
        if (ows.getStatusNakupa().getValue() != null)
            o.setStatusNakupa(ows.getStatusNakupa().getValue());
        o.setAvtor(uporabnikWs2Obj(ows.getAvtor()));
        if (ows.getKupec().getValue() != null)
            o.setKupec(uporabnikWs2Obj(ows.getKupec().getValue()));
        o.setKategorija(kategorijaWs2Obj(ows.getKategorija().getValue()));

        return o;
    }

    public static Uporabnik uporabnikObj2WS(UporabnikObj obj) {
        Uporabnik u = new Uporabnik();

        com.fleamart.uporabnik.ws.ObjectFactory of = new com.fleamart.uporabnik.ws.ObjectFactory();

        u.setId(obj.getId());
        u.setVloga(obj.getVloga());
        u.setIme(of.createUporabnikIme(obj.getIme()));
        u.setPriimek(of.createUporabnikPriimek(obj.getPriimek()));
        u.setEmail(of.createUporabnikEmail(obj.getEmail()));
        u.setUpime(of.createUporabnikUpime(obj.getUpime()));
        u.setGeslo(of.createUporabnikGeslo(obj.getGeslo()));
        u.setTelefon(of.createUporabnikTelefon(obj.getTelefon()));

        return u;
    }

    public static UporabnikObj uporabnikWs2Obj(Uporabnik uws) {
        UporabnikObj u = new UporabnikObj();
        u.setId(uws.getId());
        u.setVloga(uws.getVloga());
        u.setIme(uws.getIme().getValue());
        u.setPriimek(uws.getPriimek().getValue());
        u.setEmail(uws.getEmail().getValue());
        u.setUpime(uws.getUpime().getValue());
        u.setGeslo(uws.getGeslo().getValue());
        u.setTelefon(uws.getTelefon().getValue());
        u.setNaslov(naslovWs2Obj(uws.getNaslov().getValue()));

        return u;

    }

    private static KategorijaObj kategorijaWs2Obj(Kategorija kws) {
        KategorijaObj k = new KategorijaObj();
        k.setId(kws.getId());
        k.setNaziv(kws.getNaziv().getValue());
        return k;
    }

    private static NaslovObj naslovWs2Obj(Naslov nws) {
        NaslovObj n = new NaslovObj();

        n.setId(nws.getId());
        n.setUlica(nws.getUlica().getValue());
        n.setPostnaStevilka(nws.getPostnaStevilka());
        n.setObcina(nws.getObcina().getValue());
        n.setDrzava(nws.getDrzava().getValue());
        return n;
    }
}
