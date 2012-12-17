package com.fleamart.obj;

import java.util.Date;

public class Oglas {

    private String ime;
    private String slika;
    private double cena;
    private String opis;
    private Date datum;

    public Oglas(String ime, String slika, double cena, String opis, Date datum) {
        super();
        this.ime = ime;
        this.slika = slika;
        this.cena = cena;
        this.opis = opis;
        this.datum = datum;
    }

    public Oglas() {
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getSlika() {
        return slika;
    }

    public void setSlika(String slika) {
        this.slika = slika;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }
}
