
package com.fleamart.ponudba.ws;

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
 *         &lt;element name="p" type="{http//www.fleamart.com/}Ponudba" minOccurs="0"/>
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
    "p"
})
@XmlRootElement(name = "placeBidOnItem", namespace = "http://tempuri.org/")
public class PlaceBidOnItem {

    @XmlElementRef(name = "p", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Ponudba> p;

    /**
     * Gets the value of the p property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Ponudba }{@code >}
     *     
     */
    public JAXBElement<Ponudba> getP() {
        return p;
    }

    /**
     * Sets the value of the p property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Ponudba }{@code >}
     *     
     */
    public void setP(JAXBElement<Ponudba> value) {
        this.p = value;
    }

}
