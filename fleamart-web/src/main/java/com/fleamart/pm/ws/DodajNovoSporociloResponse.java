
package com.fleamart.pm.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DodajNovoSporociloResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dodajNovoSporociloResult"
})
@XmlRootElement(name = "DodajNovoSporociloResponse", namespace = "http://tempuri.org/")
public class DodajNovoSporociloResponse {

    @XmlElement(name = "DodajNovoSporociloResult", namespace = "http://tempuri.org/")
    protected Boolean dodajNovoSporociloResult;

    /**
     * Gets the value of the dodajNovoSporociloResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDodajNovoSporociloResult() {
        return dodajNovoSporociloResult;
    }

    /**
     * Sets the value of the dodajNovoSporociloResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDodajNovoSporociloResult(Boolean value) {
        this.dodajNovoSporociloResult = value;
    }

}
