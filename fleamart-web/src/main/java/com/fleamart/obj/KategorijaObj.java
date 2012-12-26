package com.fleamart.obj;

import java.io.Serializable;

public class KategorijaObj  implements Serializable{

    private int id;
    private String naziv;

    public int getId() {
        return id;
    }

    public KategorijaObj() {
    }

    public KategorijaObj(int id, String naziv) {
        this.id = id;
        this.naziv = naziv;
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

    @Override
    public String toString() {
        return "KategorijaObj{" + "id=" + id + ", naziv=" + naziv + '}';
    }
}
