/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fleamart.helpers;

import com.fleamart.beans.OglasBean;
import com.fleamart.beans.PonudbaBean;
import com.fleamart.obj.AvtomatskiPonudnikObj;
import com.fleamart.obj.KategorijaObj;
import com.fleamart.obj.KomentarObj;
import com.fleamart.obj.NaslovObj;
import com.fleamart.obj.OglasObj;
import com.fleamart.obj.PonudbaObj;
import com.fleamart.obj.PrivatnoSporociloObj;
import com.fleamart.obj.SeznamZeljaObj;
import com.fleamart.obj.SupportTicketKategorijaObj;
import com.fleamart.obj.SupportTicketKomentarObj;
import com.fleamart.obj.SupportTicketObj;
import com.fleamart.obj.SupportTicketStatusObj;
import com.fleamart.obj.UporabnikObj;
import com.fleamart.oglas.ws.ArrayOfKomentar;
import com.fleamart.oglas.ws.ArrayOfstring;
import com.fleamart.oglas.ws.Kategorija;
import com.fleamart.oglas.ws.Naslov;
import com.fleamart.oglas.ws.Oglas;
import com.fleamart.oglas.ws.Ponudba;
import com.fleamart.oglas.ws.Uporabnik;
import com.fleamart.pm.ws.PrivatnoSporocilo;
import com.fleamart.seznamZelja.ws.SeznamZelja;
import com.fleamart.supportticket.ws.SupportTicket;
import com.fleamart.supportticket.ws.SupportTicketKategorija;
import com.fleamart.supportticket.ws.SupportTicketKomentar;
import com.fleamart.supportticket.ws.SupportTicketStatus;
import com.fleamart.uporabnik.ws.ObjectFactory;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

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
        o.setStatusNakupa(of.createOglasStatusNakupa(obj.getStatusNakupa()));
        
        o.setAvtor(uporabnikObj2WS(obj.getAvtor()));
        if (obj.getKupec() != null) {
            o.setKupec(of.createOglasKupec(uporabnikObj2WS(obj.getKupec())));
        }
        try {
            if (obj.getCasOd() != null) {
                o.setCasOd(DatatypeFactory.newInstance().newXMLGregorianCalendar(obj.getCasOd()));
            }
            if (obj.getCasDo() != null) {
                o.setCasDo(DatatypeFactory.newInstance().newXMLGregorianCalendar(obj.getCasDo()));
            }
            if (obj.getCasSpremenjeno() != null) {
                o.setCasSpremenjeno(of.createOglasCasSpremenjeno(DatatypeFactory.newInstance().newXMLGregorianCalendar(obj.getCasSpremenjeno())));
            }
            
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(OglasBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ArrayOfstring slike = of.createArrayOfstring();
        for (String slika : obj.getSlike()) {
            if (slika.length() > 0) {
                slike.getString().add(slika);
            }
        }
        o.setSlike(of.createOglasSlike(slike));
        
        ArrayOfKomentar komentarji = of.createArrayOfKomentar();
        for (KomentarObj ko : obj.getKomentarji()) {
            komentarji.getKomentar().add(komentarObj2Ws(ko));
        }
        o.setKomentarji(of.createOglasKomentarji(komentarji));
        
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
        if (ows.getCasSpremenjeno().getValue() != null) {
            o.setCasSpremenjeno(ows.getCasSpremenjeno().getValue().toGregorianCalendar());
        }
        o.setStatus(ows.getStatus());
        o.setStatusNakupa(ows.getStatusNakupa().getValue());
        o.setAvtor(uporabnikWs2Obj(ows.getAvtor()));
        if (ows.getKupec().getValue() != null) {
            o.setKupec(uporabnikWs2Obj(ows.getKupec().getValue()));
        }
        o.setKategorija(kategorijaWs2Obj(ows.getKategorija().getValue()));
        o.setKomentarji(komentarListWs2Obj(ows.getKomentarji().getValue()));
        return o;
    }
    
    public static com.fleamart.ponudba.ws.Ponudba ponudbaObj2WS(PonudbaObj obj) {
        com.fleamart.ponudba.ws.ObjectFactory of = new com.fleamart.ponudba.ws.ObjectFactory();
        com.fleamart.ponudba.ws.Ponudba p = of.createPonudba();
        
        try {
            if (obj.getCas() != null) {
                p.setCas(DatatypeFactory.newInstance().newXMLGregorianCalendar(obj.getCas()));
            }
            
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(PonudbaBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        p.setId(obj.getId());
        p.setZnesek(obj.getZnesek());
        
        com.fleamart.ponudba.ws.Oglas o = of.createOglas();
        o.setId(obj.getOglas().getId());
        p.setOglas(of.createOglas(o));
        
        com.fleamart.ponudba.ws.Uporabnik u = of.createUporabnik();
        u.setId(obj.getUporabnik().getId());
        p.setUporabnik(of.createUporabnik(u));
        
        return p;
        
    }
    
    public static PonudbaObj ponudbaWs2Obj(Ponudba pon) {
        PonudbaObj p = new PonudbaObj();
        p.setId(pon.getId());
        p.setCas(pon.getCas().toGregorianCalendar());
        p.setOglas(oglasWs2Obj(pon.getOglas().getValue()));
        p.setUporabnik(uporabnikWs2Obj(pon.getUporabnik().getValue()));
        p.setZnesek(pon.getZnesek());
        return p;
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

    //prejme Uporabnik iz uporabnika.ws
    public static UporabnikObj uporabnikWs22Obj(com.fleamart.uporabnik.ws.Uporabnik uws) {
        UporabnikObj u = new UporabnikObj();
        u.setId(uws.getId());
        u.setVloga(uws.getVloga());
        u.setIme(uws.getIme().getValue());
        u.setPriimek(uws.getPriimek().getValue());
        u.setEmail(uws.getEmail().getValue());
        u.setUpime(uws.getUpime().getValue());
        u.setGeslo(uws.getGeslo().getValue());
        u.setTelefon(uws.getTelefon().getValue());
        u.setNaslov(naslovWs22Obj(uws.getNaslov().getValue()));
        
        return u;
        
    }
    
    public static KategorijaObj kategorijaWs2Obj(Kategorija kws) {
        KategorijaObj k = new KategorijaObj();
        k.setId(kws.getId());
        k.setNaziv(kws.getNaziv().getValue());
        return k;
    }
    
    public static NaslovObj naslovWs2Obj(Naslov nws) {
        NaslovObj n = new NaslovObj();
        
        n.setId(nws.getId());
        n.setUlica(nws.getUlica().getValue());
        n.setPostnaStevilka(nws.getPostnaStevilka());
        n.setObcina(nws.getObcina().getValue());
        n.setDrzava(nws.getDrzava().getValue());
        return n;
    }
    
    public static List<KomentarObj> komentarListWs2Obj(ArrayOfKomentar kwsl) {
        ArrayList<KomentarObj> kl = new ArrayList<KomentarObj>();
        for (com.fleamart.oglas.ws.Komentar k : kwsl.getKomentar()) {
            kl.add(komentarWs2Obj(k));
        }
        return kl;
    }
    
    public static KomentarObj komentarWs2Obj(com.fleamart.oglas.ws.Komentar kws) {
        return new KomentarObj(kws.getId(), kws.getSporocilo(), kws.getCas().toGregorianCalendar(), uporabnikWs2Obj(kws.getAvtor()));
        
    }
    
    public static com.fleamart.oglas.ws.Komentar komentarObj2Ws(KomentarObj obj) {
        com.fleamart.oglas.ws.Komentar k = new com.fleamart.oglas.ws.Komentar();
        k.setId(obj.getId());
        k.setSporocilo(obj.getSporocilo());
        k.setAvtor(uporabnikObj2WS(obj.getAvtor()));
        
        try {
            k.setCas(DatatypeFactory.newInstance().newXMLGregorianCalendar(obj.getCas()));
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(ConverterHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return k;
    }
    //prejme naslov iz uporabnik.ws

    private static NaslovObj naslovWs22Obj(com.fleamart.uporabnik.ws.Naslov nws) {
        NaslovObj n = new NaslovObj();
        n.setId(nws.getId());
        n.setUlica(nws.getUlica().getValue());
        n.setPostnaStevilka(nws.getPostnaStevilka());
        n.setObcina(nws.getObcina().getValue());
        n.setDrzava(nws.getDrzava().getValue());
        return n;
    }
    
    public static PrivatnoSporociloObj PrivatnoSporociloWs2PrivatnoSporociloObj(PrivatnoSporocilo psws) {
        PrivatnoSporociloObj ps = new PrivatnoSporociloObj();
        try {
            ps.setId(psws.getPrivatnoSporociloId());
            ps.setCas(psws.getCas().toGregorianCalendar());
            ps.setSporocilo(psws.getSporocilo().getValue());
            UporabnikObj posiljatelj = new UporabnikObj();
            posiljatelj.setUpime(psws.getPosiljatelj().getValue().getUpime().getValue());
            ps.setPosiljatelj(posiljatelj);
            return ps;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }
    
    public static SupportTicketKategorijaObj supportTicketKategorijaWs2Obj(SupportTicketKategorija ws) {
        SupportTicketKategorijaObj obj = new SupportTicketKategorijaObj();
        obj.setId(ws.getId());
        obj.setNaziv(ws.getNaziv().getValue());
        return obj;
    }
    
    public static SupportTicketKategorija supportTicketKategorijaObj2Ws(SupportTicketKategorijaObj obj) {
        com.fleamart.supportticket.ws.ObjectFactory of = new com.fleamart.supportticket.ws.ObjectFactory();
        SupportTicketKategorija ws = new SupportTicketKategorija();
        ws.setId(obj.getId());
        ws.setNaziv(of.createSupportTicketKategorijaNaziv(obj.getNaziv()));
        return ws;
    }
    
    public static SupportTicketStatusObj supportTicketStatusWs2Obj(SupportTicketStatus ws) {
        SupportTicketStatusObj obj = new SupportTicketStatusObj();
        obj.setId(ws.getId());
        obj.setNaziv(ws.getNaziv().getValue());
        obj.setOpis(ws.getOpis().getValue());
        return obj;
    }
    
    public static SupportTicketStatus supportTicketStatusObj2Ws(SupportTicketStatusObj obj) {
        com.fleamart.supportticket.ws.ObjectFactory of = new com.fleamart.supportticket.ws.ObjectFactory();
        SupportTicketStatus ws = new SupportTicketStatus();
        ws.setId(obj.getId());
        ws.setNaziv(of.createSupportTicketStatusNaziv(obj.getNaziv()));
        ws.setOpis(of.createSupportTicketStatusOpis(obj.getOpis()));
        return ws;
    }
    
    public static SupportTicketObj supportTicketWs2Obj(SupportTicket ws) {
        SupportTicketObj obj = new SupportTicketObj();
        obj.setId(ws.getId());
        obj.setNaslov(ws.getNaslov().getValue());
        obj.setVsebina(ws.getVsebina().getValue());
        if (ws.getCasUstvarjen().getValue() != null) {
            obj.setCasUstvarjen(ws.getCasUstvarjen().getValue().toGregorianCalendar());
        }
        if (ws.getCasZaprt().getValue() != null) {
            obj.setCasZaprt(ws.getCasZaprt().getValue().toGregorianCalendar());
        }
        if (ws.getAvtor().getValue() != null) {
            obj.setAvtor(supportTicketUporabnikWs2Obj(ws.getAvtor().getValue()));
        }
        if (ws.getTehnik().getValue() != null) {
            obj.setTehnik(supportTicketUporabnikWs2Obj(ws.getTehnik().getValue()));
        }
        obj.setSupportTicketKategorija(supportTicketKategorijaWs2Obj(ws.getSupportTicketKategorija().getValue()));
        obj.setSupportTicketStatus(supportTicketStatusWs2Obj(ws.getSupportTicketStatus().getValue()));
        List<SupportTicketKomentarObj> komentarji = new ArrayList<>();
        for (SupportTicketKomentar k : ws.getKomentarji().getValue().getSupportTicketKomentar()) {
            komentarji.add(supportTicketKomentarWs2Obj(k));
        }
        obj.setKomentarji(komentarji);
        return obj;
    }
    
    public static SupportTicket supportTicketObjt2Ws(SupportTicketObj obj) {
        com.fleamart.supportticket.ws.ObjectFactory of = new com.fleamart.supportticket.ws.ObjectFactory();
        SupportTicket ws = new SupportTicket();
        ws.setId(obj.getId());
        try {
            if (obj.getCasUstvarjen() != null) {
                ws.setCasUstvarjen(of.createSupportTicketCasUstvarjen(DatatypeFactory.newInstance().newXMLGregorianCalendar(obj.getCasUstvarjen())));
            }
            if (obj.getCasZaprt() != null) {
                ws.setCasZaprt(of.createSupportTicketCasZaprt(DatatypeFactory.newInstance().newXMLGregorianCalendar(obj.getCasZaprt())));
            }
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        if(obj.getAvtor() != null) {
            ws.setAvtor(of.createSupportTicketAvtor(supportTicketUporanikObj2Ws(obj.getAvtor())));
        }
        if(obj.getTehnik() != null) {
            ws.setTehnik(of.createSupportTicketTehnik(supportTicketUporanikObj2Ws(obj.getTehnik())));
        }
        ws.setSupportTicketKategorija(of.createSupportTicketKategorija(supportTicketKategorijaObj2Ws(obj.getSupportTicketKategorija())));
        ws.setSupportTicketStatus(of.createSupportTicketStatus(supportTicketStatusObj2Ws(obj.getSupportTicketStatus())));
        ws.setNaslov(of.createSupportTicketNaslov(obj.getNaslov()));
        ws.setVsebina(of.createSupportTicketVsebina(obj.getVsebina()));
        return ws;
    }
    
    public static UporabnikObj supportTicketUporabnikWs2Obj(com.fleamart.supportticket.ws.Uporabnik ws) {
        UporabnikObj obj = new UporabnikObj();
        obj.setId(ws.getId());
        obj.setEmail(ws.getEmail().getValue());
        obj.setIme(ws.getIme().getValue());
        obj.setPriimek(ws.getPriimek().getValue());
        obj.setUpime(ws.getUpime().getValue());
        obj.setVloga(ws.getVloga());
        return obj;
    }
    
    public static com.fleamart.supportticket.ws.Uporabnik supportTicketUporanikObj2Ws(UporabnikObj obj) {
        com.fleamart.supportticket.ws.Uporabnik ws = new com.fleamart.supportticket.ws.Uporabnik();
        ws.setId(obj.getId());
        return ws;
    }
    
    public static SupportTicketKomentarObj supportTicketKomentarWs2Obj(SupportTicketKomentar ws) {
        SupportTicketKomentarObj obj = new SupportTicketKomentarObj();
        obj.setId(ws.getId());
        obj.setAvtor(supportTicketUporabnikWs2Obj(ws.getAvtor().getValue()));
        if(ws.getCas().getValue() != null) {
            obj.setCas(ws.getCas().getValue().toGregorianCalendar());
        }
        obj.setSupportTicketId(ws.getSupportTicketId());
        obj.setVsebina(ws.getVsebina().getValue());
        return obj;
    }
    
    public static SupportTicketKomentar supportTicketKomentarObj2Ws(SupportTicketKomentarObj obj) {
        com.fleamart.supportticket.ws.ObjectFactory of = new com.fleamart.supportticket.ws.ObjectFactory();
        SupportTicketKomentar ws = new SupportTicketKomentar();
        ws.setId(obj.getId());
        ws.setAvtor(of.createSupportTicketKomentarAvtor(supportTicketUporanikObj2Ws(obj.getAvtor())));
        if(obj.getCas() != null) {
            try {
                ws.setCas(of.createSupportTicketKomentarCas(DatatypeFactory.newInstance().newXMLGregorianCalendar(obj.getCas())));
            } catch (DatatypeConfigurationException e) {
                e.printStackTrace();
            }
        }
        ws.setSupportTicketId(obj.getSupportTicketId());
        ws.setVsebina(of.createSupportTicketKomentarVsebina(obj.getVsebina()));
        return ws;
    }
}
