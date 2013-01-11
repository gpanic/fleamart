package com.fleamart.beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean(name = "kosaricaBean")
@SessionScoped
public class KosaricaBean implements Serializable {

    private List<Object[]> items;

    public KosaricaBean() {
        items = new ArrayList<>();
    }

    public List<Object[]> getItems() {
        return items;
    }

    public void addItem(int id, String ime, String cena) {
        boolean add = true;
        for (Object[] ol : items) {
            if ((int) ol[0] == id) {
                add = false;
            }
        }
        if (add) {
            items.add(new Object[]{id, ime, Double.parseDouble(cena)});
        }
    }

    public void removeItem(int id) {
        for (int i = 0; i < items.size(); i++) {
            if ((int) items.get(i)[0] == id) {
                items.remove(i);
                i--;
            }
        }
    }

    public double getTotal() {
        double total = 0;
        for (Object[] ol : items) {
            total += (double) ol[2];
        }
        return total;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void clearCart() {
        items = new ArrayList<>();
    }

    public boolean itemInCart(int id) {
        boolean contains = false;
        for (Object[] o : items) {
            if (((int) o[0]) == id) {
                contains = true;
            }
        }
        return contains;
    }

    public void schnellkauf(int id, String ime, String cena) {
        addItem(id, ime, cena);
        redirect("/oglas/nakup.xhtml");
    }
    
    public boolean nakupView(){
        String view = FacesContext.getCurrentInstance().getViewRoot().getViewId();
        return (view.equals("/oglas/nakup.xhtml")) ? false:true;
    }
    
    public void redirect(String path) {
        try {
            ExternalContext ec = FacesContext.getCurrentInstance()
                    .getExternalContext();
            ec.redirect(ec.getRequestContextPath() + path);
        } catch (IOException ex) {
            Logger.getLogger(OglasBean.class.getName()).log(
                    Level.SEVERE, null, ex);
        }
    }
}
