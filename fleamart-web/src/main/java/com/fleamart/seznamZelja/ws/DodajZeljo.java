
package com.fleamart.seznamZelja.ws;

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
 *         &lt;element name="s" type="{http//www.fleamart.com/}Oglas" minOccurs="0"/>
 *         &lt;element name="u" type="{http//www.fleamart.com/}Uporabnik" minOccurs="0"/>
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
    "s",
    "u"
})
@XmlRootElement(name = "dodajZeljo", namespace = "http://tempuri.org/")
public class DodajZeljo {

    @XmlElementRef(name = "s", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Oglas> s;
    @XmlElementRef(name = "u", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Uporabnik> u;

    /**
     * Gets the value of the s property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Oglas }{@code >}
     *     
     */
    public JAXBElement<Oglas> getS() {
        return s;
    }

    /**
     * Sets the value of the s property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Oglas }{@code >}
     *     
     */
    public void setS(JAXBElement<Oglas> value) {
        this.s = value;
    }

    /**
     * Gets the value of the u property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Uporabnik }{@code >}
     *     
     */
    public JAXBElement<Uporabnik> getU() {
        return u;
    }

    /**
     * Sets the value of the u property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Uporabnik }{@code >}
     *     
     */
    public void setU(JAXBElement<Uporabnik> value) {
        this.u = value;
    }

}
