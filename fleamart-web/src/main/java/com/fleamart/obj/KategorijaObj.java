package com.fleamart.obj;


public class KategorijaObj {

	private int id;
        private String naziv;
        private int nadkategorijaId;
        private KategorijaObj nadkategorija;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getNadkategorijaId() {
        return nadkategorijaId;
    }

    public void setNadkategorijaId(int nadkategorijaId) {
        this.nadkategorijaId = nadkategorijaId;
    }

    public KategorijaObj getNadkategorija() {
        return nadkategorija;
    }

    public void setNadkategorija(KategorijaObj nadkategorija) {
        this.nadkategorija = nadkategorija;
    }

    @Override
    public String toString() {
        return "KategorijaObj{" + "id=" + id + ", naziv=" + naziv + ", nadkategorijaId=" + nadkategorijaId + ", nadkategorija=" + nadkategorija + '}';
    }
	
}
