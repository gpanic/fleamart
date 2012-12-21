/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fleamart.helpers;

import com.fleamart.beans.OglasBean;
import com.fleamart.obj.OglasObj;
import com.fleamart.obj.UporabnikObj;
import com.fleamart.oglas.ws.ArrayOfstring;
import com.fleamart.oglas.ws.Oglas;
import com.fleamart.oglas.ws.Uporabnik;
import com.fleamart.uporabnik.ws.ObjectFactory;
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
        
        
        o.setAvtor(of.createUporabnik(uporabnikObj2WS(obj.getAvtor())));
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
        
        return null;
        
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
        return null;
        
    }
}
