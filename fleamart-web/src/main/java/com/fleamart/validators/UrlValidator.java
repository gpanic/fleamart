/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fleamart.validators;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("com.fleamart.validators.UrlValidator")
public class UrlValidator implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        if (value.toString().length() > 0) {
            boolean jeSlika = false;
            try {
                HttpURLConnection.setFollowRedirects(false);
                HttpURLConnection con = (HttpURLConnection) new URL(value.toString()).openConnection();
                con.setRequestMethod("HEAD");
                if ((con.getResponseCode() == HttpURLConnection.HTTP_OK)) {
                    if (con.getContentType().equals("image/jpeg") || con.getContentType().equals("image/png"))
                        jeSlika = true;
                } 
            } catch (IOException ex) {
                Logger.getLogger(UrlValidator.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (!jeSlika) {
                FacesMessage msg = new FacesMessage("Niz ni povezava do slike", "Niz mora biti povezava do slike");
                msg.setSeverity(FacesMessage.SEVERITY_ERROR);
                throw new ValidatorException(msg);
            }
        }
    }
}
