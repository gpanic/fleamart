package com.fleamart.helpers;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
			Logger.getLogger(OglasBean.class.getName()).log(Level.SEVERE, null,
					ex);
		}
	}

	public static String encrpyt(String password) {
		byte[] plainText = password.getBytes();
        MessageDigest md = null;
 
        try {       
            md = MessageDigest.getInstance("SHA");
        } catch (Exception e) {
            e.printStackTrace();
        }
         
        md.reset();     
        md.update(plainText);
        byte[] encodedPassword = md.digest();
 
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < encodedPassword.length; i++) {
            if ((encodedPassword[i] & 0xff) < 0x10) {
                sb.append("0");
            }
 
            sb.append(Long.toString(encodedPassword[i] & 0xff, 16));
        }
        return sb.toString();
	}

}
