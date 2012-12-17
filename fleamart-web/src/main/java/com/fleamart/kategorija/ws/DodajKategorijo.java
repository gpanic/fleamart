
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
 *         &lt;element name="k" type="{http://schemas.datacontract.org/2004/07/Fleamart.Contracts.Data}Kategorija" minOccurs="0"/>
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
    "k"
})
@XmlRootElement(name = "DodajKategorijo")
public class DodajKategorijo {

    @XmlElementRef(name = "k", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Kategorija> k;

    /**
     * Gets the value of the k property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Kategorija }{@code >}
     *     
     */
    public JAXBElement<Kategorija> getK() {
        return k;
    }

    /**
     * Sets the value of the k property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Kategorija }{@code >}
     *     
     */
    public void setK(JAXBElement<Kategorija> value) {
        this.k = value;
    }

}
