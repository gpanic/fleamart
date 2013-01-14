package com.fleamart.helpers;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.fleamart.beans.OglasBean;

public class JSFHelper {
	
	public static void redirect(String path) {
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
