
package com.fleamart.kategorija.ws;

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
 *         &lt;element name="nk" type="{http//www.fleamart.com/}NarocenaKategorija" minOccurs="0"/>
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
    "nk"
})
@XmlRootElement(name = "DodajNarocenoKategorijo")
public class DodajNarocenoKategorijo {

    @XmlElementRef(name = "nk", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<NarocenaKategorija> nk;

    /**
     * Gets the value of the nk property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NarocenaKategorija }{@code >}
     *     
     */
    public JAXBElement<NarocenaKategorija> getNk() {
        return nk;
    }

    /**
     * Sets the value of the nk property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NarocenaKategorija }{@code >}
     *     
     */
    public void setNk(JAXBElement<NarocenaKategorija> value) {
        this.nk = value;
    }

}
