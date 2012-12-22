/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fleamart.obj;


public class NaslovObj {
    private int id;
    private String ulica;
    private int postnaStevilka;
    private String obcina;
    private String drzava;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public int getPostnaStevilka() {
        return postnaStevilka;
    }

    public void setPostnaStevilka(int postnaStevilka) {
        this.postnaStevilka = postnaStevilka;
    }

    public String getObcina() {
        return obcina;
    }

    public void setObcina(String obcina) {
        this.obcina = obcina;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    @Override
    public String toString() {
        return "NaslovObj{" + "id=" + id + ", ulica=" + ulica + ", postnaStevilka=" + postnaStevilka + ", obcina=" + obcina + ", drzava=" + drzava + '}';
    }
    
}
