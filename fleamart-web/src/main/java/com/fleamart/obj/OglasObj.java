package com.fleamart.obj;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

public class OglasObj {

    private int id;
    private String naslov;
    private boolean avkcija;
    private double cena;
    private double zadnjaCenaAvkcija;
    private String opis;
    private ArrayList<String> Slike;
    private GregorianCalendar casOd;
    private GregorianCalendar casDo;
    private GregorianCalendar casSpremenjeno;
    private int status;
    private ArrayList<PonudbaObj> ponudbe;
    private int statusNakupa;
    private UporabnikObj avtor;
    private UporabnikObj kupec;
    private ArrayList<KomentarObj> komentarji;
    private ArrayList<KategorijaObj> kategorije;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public boolean isAvkcija() {
        return avkcija;
    }

    public void setAvkcija(boolean avkcija) {
        this.avkcija = avkcija;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public double getZadnjaCenaAvkcija() {
        return zadnjaCenaAvkcija;
    }

    public void setZadnjaCenaAvkcija(double zadnjaCenaAvkcija) {
        this.zadnjaCenaAvkcija = zadnjaCenaAvkcija;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public ArrayList<String> getSlike() {
        return Slike;
    }

    public void setSlike(ArrayList<String> Slike) {
        this.Slike = Slike;
    }

    public GregorianCalendar getCasOd() {
        return casOd;
    }

    public void setCasOd(GregorianCalendar casOd) {
        this.casOd = casOd;
    }

    public GregorianCalendar getCasDo() {
        return casDo;
    }

    public void setCasDo(GregorianCalendar casDo) {
        this.casDo = casDo;
    }

    public GregorianCalendar getCasSpremenjeno() {
        return casSpremenjeno;
    }

    public void setCasSpremenjeno(GregorianCalendar casSpremenjeno) {
        this.casSpremenjeno = casSpremenjeno;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public ArrayList<PonudbaObj> getPonudbe() {
        return ponudbe;
    }

    public void setPonudbe(ArrayList<PonudbaObj> ponudbe) {
        this.ponudbe = ponudbe;
    }

    public int getStatusNakupa() {
        return statusNakupa;
    }

    public void setStatusNakupa(int statusNakupa) {
        this.statusNakupa = statusNakupa;
    }

    public UporabnikObj getAvtor() {
        return avtor;
    }

    public void setAvtor(UporabnikObj avtor) {
        this.avtor = avtor;
    }

    public UporabnikObj getKupec() {
        return kupec;
    }

    public void setKupec(UporabnikObj kupec) {
        this.kupec = kupec;
    }

    public ArrayList<KomentarObj> getKomentarji() {
        return komentarji;
    }

    public void setKomentarji(ArrayList<KomentarObj> komentarji) {
        this.komentarji = komentarji;
    }

    public ArrayList<KategorijaObj> getKategorije() {
        return kategorije;
    }

    public void setKategorije(ArrayList<KategorijaObj> kategorije) {
        this.kategorije = kategorije;
    }
    
    @Override
    public String toString() {
        return "OglasObj{" + "id=" + id + ", naslov=" + naslov + ", avkcija=" + avkcija + ", cena=" + cena + ", zadnjaCenaAvkcija=" + zadnjaCenaAvkcija + ", opis=" + opis + ", Slike=" + Slike + ", casOd=" + casOd + ", casDo=" + casDo + ", casSpremenjeno=" + casSpremenjeno + ", status=" + status + ", ponudbe=" + ponudbe + ", statusNakupa=" + statusNakupa + ", avtor=" + avtor + ", kupec=" + kupec + ", komentarji=" + komentarji + ", kategorije=" + kategorije + '}';
    }
}
