
package com.fleamart.pm.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="ps" type="{http//www.fleamart.com/}PrivatnoSporocilo" minOccurs="0"/>
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
    "ps"
})
@XmlRootElement(name = "DodajNovoSporocilo", namespace = "http://tempuri.org/")
public class DodajNovoSporocilo {

    @XmlElementRef(name = "ps", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<PrivatnoSporocilo> ps;

    /**
     * Gets the value of the ps property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrivatnoSporocilo }{@code >}
     *     
     */
    public JAXBElement<PrivatnoSporocilo> getPs() {
        return ps;
    }

    /**
     * Sets the value of the ps property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrivatnoSporocilo }{@code >}
     *     
     */
    public void setPs(JAXBElement<PrivatnoSporocilo> value) {
        this.ps = value;
    }

}
