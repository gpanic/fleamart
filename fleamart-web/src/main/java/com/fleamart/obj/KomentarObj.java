/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fleamart.obj;

import java.io.Serializable;
import java.util.GregorianCalendar;

public class KomentarObj implements Serializable{
    private int id;
    private String sporocilo;
    private GregorianCalendar cas;
    private UporabnikObj avtor;

    public KomentarObj(int id, String sporocilo, GregorianCalendar cas, UporabnikObj avtor) {
        this.id = id;
        this.sporocilo = sporocilo;
        this.cas = cas;
        this.avtor = avtor;
    }

    public KomentarObj(String sporocilo, GregorianCalendar cas, UporabnikObj avtor) {
        this.sporocilo = sporocilo;
        this.cas = cas;
        this.avtor = avtor;
    }
    
    

    public KomentarObj() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSporocilo() {
        return sporocilo;
    }

    public void setSporocilo(String sporocilo) {
        this.sporocilo = sporocilo;
    }

    public GregorianCalendar getCas() {
        return cas;
    }

    public void setCas(GregorianCalendar cas) {
        this.cas = cas;
    }

    public UporabnikObj getAvtor() {
        return avtor;
    }

    public void setAvtor(UporabnikObj avtor) {
        this.avtor = avtor;
    }

    @Override
    public String toString() {
        return "KomentarObj{" + "id=" + id + ", sporocilo=" + sporocilo + ", cas=" + cas + ", avtor=" + avtor + '}';
    }
    
}
