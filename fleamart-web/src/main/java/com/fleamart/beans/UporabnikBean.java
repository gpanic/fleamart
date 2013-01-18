package com.fleamart.beans;

import com.fleamart.helpers.ConverterHelper;
import com.fleamart.helpers.JSFHelper;
import com.fleamart.obj.UporabnikObj;
import com.fleamart.uporabnik.ws.ArrayOfUporabnik;
import com.fleamart.uporabnik.ws.UporabnikService;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.fleamart.uporabnik.ws.Uporabnik;
import java.io.Serializable;
import java.util.ArrayList;

@ManagedBean(name = "uporabnikBean")
@ViewScoped
public class UporabnikBean implements Serializable {
    
    private List<UporabnikObj> uporabniki;
    private UporabnikObj uporabnik;

    public UporabnikBean() {
        uporabniki = new ArrayList<>();
        uporabnik = new UporabnikObj();
        
        getUporabnikiFromService();
    }
    
    public void initUporabnikUpdate() {
        if(getUporabnik().getId() > 0) {
            setUporabnik(ConverterHelper.uporabnikWs22Obj(new UporabnikService().getBasicHttpBindingIUporabnikService().readUporabnik(getUporabnik().getId())));
        }
    }
    
    private void getUporabnikiFromService() {
        uporabniki = new ArrayList<>();
        ArrayOfUporabnik uarray = new UporabnikService().getBasicHttpBindingIUporabnikService().listUporabnik();
        for(Uporabnik u : uarray.getUporabnik()) {
            getUporabniki().add(ConverterHelper.uporabnikWs22Obj(u));
        }
    }
    
    public void deleteUporabnik(int id) {
        new UporabnikService().getBasicHttpBindingIUporabnikService().deleteUporabnik(id);
        getUporabnikiFromService();
    }
    
    public void updateUporabnik() {
        new UporabnikService().getBasicHttpBindingIUporabnikService().updateUporabnik(ConverterHelper.uporabnikObj22Ws(uporabnik));
        JSFHelper.redirect("/uporabnik/list.xhtml");
    }

    public List<UporabnikObj> getUporabniki() {
        return uporabniki;
    }

    public void setUporabniki(List<UporabnikObj> uporabniki) {
        this.uporabniki = uporabniki;
    }

    public UporabnikObj getUporabnik() {
        return uporabnik;
    }

    public void setUporabnik(UporabnikObj uporabnik) {
        this.uporabnik = uporabnik;
    }

}
