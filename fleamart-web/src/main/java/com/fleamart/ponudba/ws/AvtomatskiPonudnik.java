
package com.fleamart.ponudba.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AvtomatskiPonudnik complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvtomatskiPonudnik">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Aktiven" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxCena" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Oglas" type="{http//www.fleamart.com/}Oglas" minOccurs="0"/>
 *         &lt;element name="Uporabnik" type="{http//www.fleamart.com/}Uporabnik" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvtomatskiPonudnik", propOrder = {
    "aktiven",
    "id",
    "maxCena",
    "oglas",
    "uporabnik"
})
public class AvtomatskiPonudnik {

    @XmlElement(name = "Aktiven")
    protected Boolean aktiven;
    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElement(name = "MaxCena")
    protected Double maxCena;
    @XmlElementRef(name = "Oglas", namespace = "http//www.fleamart.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<Oglas> oglas;
    @XmlElementRef(name = "Uporabnik", namespace = "http//www.fleamart.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<Uporabnik> uporabnik;

    /**
     * Gets the value of the aktiven property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAktiven() {
        return aktiven;
    }

    /**
     * Sets the value of the aktiven property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAktiven(Boolean value) {
        this.aktiven = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the maxCena property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxCena() {
        return maxCena;
    }

    /**
     * Sets the value of the maxCena property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxCena(Double value) {
        this.maxCena = value;
    }

    /**
     * Gets the value of the oglas property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Oglas }{@code >}
     *     
     */
    public JAXBElement<Oglas> getOglas() {
        return oglas;
    }

    /**
     * Sets the value of the oglas property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Oglas }{@code >}
     *     
     */
    public void setOglas(JAXBElement<Oglas> value) {
        this.oglas = value;
    }

    /**
     * Gets the value of the uporabnik property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Uporabnik }{@code >}
     *     
     */
    public JAXBElement<Uporabnik> getUporabnik() {
        return uporabnik;
    }

    /**
     * Sets the value of the uporabnik property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Uporabnik }{@code >}
     *     
     */
    public void setUporabnik(JAXBElement<Uporabnik> value) {
        this.uporabnik = value;
    }

}
