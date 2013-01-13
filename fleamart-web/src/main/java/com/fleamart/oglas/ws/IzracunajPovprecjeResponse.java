
package com.fleamart.oglas.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="izracunajPovprecjeResult" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
    "izracunajPovprecjeResult"
})
@XmlRootElement(name = "izracunajPovprecjeResponse")
public class IzracunajPovprecjeResponse {

    protected Double izracunajPovprecjeResult;

    /**
     * Gets the value of the izracunajPovprecjeResult property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIzracunajPovprecjeResult() {
        return izracunajPovprecjeResult;
    }

    /**
     * Sets the value of the izracunajPovprecjeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIzracunajPovprecjeResult(Double value) {
        this.izracunajPovprecjeResult = value;
    }

}
