package com.fleamart.obj;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;


public class OglasObj  implements Serializable{

    private int id;
    private String naslov;
    private boolean avkcija;
    private String cena;
    private double zadnjaCenaAvkcija;
    private String opis;
    private List<String> Slike = new ArrayList<>();
    private GregorianCalendar casOd;
    private GregorianCalendar casDo;
    private GregorianCalendar casSpremenjeno;
    private int status;
    private List<PonudbaObj> ponudbe;
    private Integer statusNakupa;
    private UporabnikObj avtor;
    private UporabnikObj kupec;
    private List<KomentarObj> komentarji = new ArrayList<>();
    private KategorijaObj kategorija;

    public OglasObj() {
        kategorija = new KategorijaObj();
    }

    
    public KategorijaObj getKategorija() {
        return kategorija;
    }

    public void setKategorija(KategorijaObj kategorija) {
        this.kategorija = kategorija;
    }

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

    public String getCena() {
        return cena;
    }
    
    public double getCenaInteger() {
        return Double.parseDouble(cena);
    }

    public void setCena(String cena) {
        this.cena = cena;
    }
    
    public void setCena(double cena) {
        this.cena = Double.toString(cena);
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

    public List<String> getSlike() {
        return Slike;
    }

    public void setSlike(List<String> Slike) {
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

    public List<PonudbaObj> getPonudbe() {
        return ponudbe;
    }

    public void setPonudbe(List<PonudbaObj> ponudbe) {
        this.ponudbe = ponudbe;
    }

    public Integer getStatusNakupa() {
        return statusNakupa;
    }

    public void setStatusNakupa(Integer statusNakupa) {
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

    public List<KomentarObj> getKomentarji() {
        return komentarji;
    }

    public void setKomentarji(List<KomentarObj> komentarji) {
        this.komentarji = komentarji;
    }

    @Override
    public String toString() {
        return "OglasObj{" + "id=" + id + ", naslov=" + naslov + ", avkcija=" + avkcija + ", cena=" + cena + ", zadnjaCenaAvkcija=" + zadnjaCenaAvkcija + ", opis=" + opis + ", Slike=" + Slike + ", casOd=" + casOd + ", casDo=" + casDo + ", casSpremenjeno=" + casSpremenjeno + ", status=" + status + ", ponudbe=" + ponudbe + ", statusNakupa=" + statusNakupa + ", avtor=" + avtor + ", kupec=" + kupec + ", komentarji=" + komentarji + ", kategorija=" + kategorija + '}';
    }
}
