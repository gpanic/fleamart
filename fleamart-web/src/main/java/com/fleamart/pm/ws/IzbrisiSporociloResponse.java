
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
 *         &lt;element name="IzbrisiSporociloResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "izbrisiSporociloResult"
})
@XmlRootElement(name = "IzbrisiSporociloResponse", namespace = "http://tempuri.org/")
public class IzbrisiSporociloResponse {

    @XmlElement(name = "IzbrisiSporociloResult", namespace = "http://tempuri.org/")
    protected Boolean izbrisiSporociloResult;

    /**
     * Gets the value of the izbrisiSporociloResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIzbrisiSporociloResult() {
        return izbrisiSporociloResult;
    }

    /**
     * Sets the value of the izbrisiSporociloResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIzbrisiSporociloResult(Boolean value) {
        this.izbrisiSporociloResult = value;
    }

}
