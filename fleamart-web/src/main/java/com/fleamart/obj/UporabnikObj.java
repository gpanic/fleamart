/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fleamart.obj;

import java.io.Serializable;
import java.util.ArrayList;

public class UporabnikObj  implements Serializable{
    
    private int id;
    private int vloga;
    private String ime;
    private String priimek;
    private String email;
    private String upime;
    private String geslo;
    private String telefon;
    private NaslovObj naslov;
    private ArrayList<PrivatnoSporociloObj> privatnaSporocila;
    private ArrayList<SeznamZeljaObj> seznamZelja;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVloga() {
        return vloga;
    }

    public void setVloga(int vloga) {
        this.vloga = vloga;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPriimek() {
        return priimek;
    }

    public void setPriimek(String priimek) {
        this.priimek = priimek;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUpime() {
        return upime;
    }

    public void setUpime(String upime) {
        this.upime = upime;
    }

    public String getGeslo() {
        return geslo;
    }

    public void setGeslo(String geslo) {
        this.geslo = geslo;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public NaslovObj getNaslov() {
        return naslov;
    }

    public void setNaslov(NaslovObj naslov) {
        this.naslov = naslov;
    }

    public ArrayList<PrivatnoSporociloObj> getPrivatnaSporocila() {
        return privatnaSporocila;
    }

    public void setPrivatnaSporocila(ArrayList<PrivatnoSporociloObj> privatnaSporocila) {
        this.privatnaSporocila = privatnaSporocila;
    }

    public ArrayList<SeznamZeljaObj> getSeznamZelja() {
        return seznamZelja;
    }

    public void setSeznamZelja(ArrayList<SeznamZeljaObj> seznamZelja) {
        this.seznamZelja = seznamZelja;
    }

    @Override
    public String toString() {
        return "UporabnikObj{" + "id=" + id + ", vloga=" + vloga + ", ime=" + ime + ", priimek=" + priimek + ", email=" + email + ", upime=" + upime + ", geslo=" + geslo + ", telefon=" + telefon + ", naslov=" + naslov + ", privatnaSporocila=" + privatnaSporocila + ", seznamZelja=" + seznamZelja + '}';
    }
    
}
