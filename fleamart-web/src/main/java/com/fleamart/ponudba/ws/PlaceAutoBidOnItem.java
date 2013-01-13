
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
 *         &lt;element name="a" type="{http//www.fleamart.com/}AvtomatskiPonudnik" minOccurs="0"/>
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
    "a"
})
@XmlRootElement(name = "placeAutoBidOnItem", namespace = "http://tempuri.org/")
public class PlaceAutoBidOnItem {

    @XmlElementRef(name = "a", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<AvtomatskiPonudnik> a;

    /**
     * Gets the value of the a property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AvtomatskiPonudnik }{@code >}
     *     
     */
    public JAXBElement<AvtomatskiPonudnik> getA() {
        return a;
    }

    /**
     * Sets the value of the a property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AvtomatskiPonudnik }{@code >}
     *     
     */
    public void setA(JAXBElement<AvtomatskiPonudnik> value) {
        this.a = value;
    }

}
