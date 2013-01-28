package com.fleamart.beans;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.fleamart.helpers.JSFHelper;
import com.fleamart.uporabnik.ws.IUporabnikService;
import com.fleamart.uporabnik.ws.Uporabnik;
import com.fleamart.uporabnik.ws.UporabnikService;

@ManagedBean(name = "loginBean")
@SessionScoped
public class LoginBean implements Serializable {

    private String username, pass, txt;
    private int idUser;
    private int vloga;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getTxt() {
        return txt;
    }

    public int getVloga() {
        return vloga;
    }

    public void setVloga(int vloga) {
        this.vloga = vloga;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public LoginBean() {
    }

    public String checkUser() {
        try {

            int idUser = 0;
            IUporabnikService service = new UporabnikService()
                    .getBasicHttpBindingIUporabnikService();
            Uporabnik uporabnik = service.loginCheck(username, JSFHelper.encrpyt(pass));
            idUser = uporabnik.getId();
            if (idUser == 0) {
                setIdUser(0);
                // ce uporabnik ni uspesno vpisan je idUser=0
                txt = "Napačno uporabniško ime ali geslo, poskusite ponovno!";
                return "#";
            } else {
                setIdUser(idUser);
                setVloga(uporabnik.getVloga());
                pass = "";
                // ce je uporabnik uspesno vpisan
                return "index?faces-redirect=true";
            }

        } catch (Exception e) {

            e.printStackTrace();

        }
        return "";
    }

    public String logOut() {
        try {
            setIdUser(0);
            setUsername("");
            setPass("");

        } catch (Exception e) {

            e.printStackTrace();

        }
        return "index?faces-redirect=true";
    }

    public void checkIfLoggedIn() throws IOException {
        LoginBean lb = (LoginBean) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("loginBean");
        try {
            int uid = lb.getIdUser();
            if (uid == 0) {
                lb.setTxt("");
                FacesContext.getCurrentInstance().getExternalContext().redirect("/fleamart-web/login.xhtml");
            }
        } catch (Exception e) {
            lb.setTxt("");
            FacesContext.getCurrentInstance().getExternalContext().redirect("/fleamart-web/login.xhtml");
        }
    }
}
