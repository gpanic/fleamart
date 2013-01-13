
package com.fleamart.oglas.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Uporabnik complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Uporabnik">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Geslo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Ime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Naslov" type="{http//www.fleamart.com/}Naslov" minOccurs="0"/>
 *         &lt;element name="Priimek" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrivatnaSporocila" type="{http//www.fleamart.com/}ArrayOfPrivatnoSporocilo" minOccurs="0"/>
 *         &lt;element name="SeznamZelja" type="{http//www.fleamart.com/}ArrayOfSeznamZelja" minOccurs="0"/>
 *         &lt;element name="Telefon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Upime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vloga" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Uporabnik", namespace = "http//www.fleamart.com/", propOrder = {
    "email",
    "geslo",
    "id",
    "ime",
    "naslov",
    "priimek",
    "privatnaSporocila",
    "seznamZelja",
    "telefon",
    "upime",
    "vloga"
})
public class Uporabnik {

    @XmlElementRef(name = "Email", namespace = "http//www.fleamart.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "Geslo", namespace = "http//www.fleamart.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> geslo;
    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElementRef(name = "Ime", namespace = "http//www.fleamart.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ime;
    @XmlElementRef(name = "Naslov", namespace = "http//www.fleamart.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<Naslov> naslov;
    @XmlElementRef(name = "Priimek", namespace = "http//www.fleamart.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> priimek;
    @XmlElementRef(name = "PrivatnaSporocila", namespace = "http//www.fleamart.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPrivatnoSporocilo> privatnaSporocila;
    @XmlElementRef(name = "SeznamZelja", namespace = "http//www.fleamart.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSeznamZelja> seznamZelja;
    @XmlElementRef(name = "Telefon", namespace = "http//www.fleamart.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefon;
    @XmlElementRef(name = "Upime", namespace = "http//www.fleamart.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> upime;
    @XmlElement(name = "Vloga")
    protected Integer vloga;

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = value;
    }

    /**
     * Gets the value of the geslo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGeslo() {
        return geslo;
    }

    /**
     * Sets the value of the geslo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGeslo(JAXBElement<String> value) {
        this.geslo = value;
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
     * Gets the value of the ime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIme() {
        return ime;
    }

    /**
     * Sets the value of the ime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIme(JAXBElement<String> value) {
        this.ime = value;
    }

    /**
     * Gets the value of the naslov property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Naslov }{@code >}
     *     
     */
    public JAXBElement<Naslov> getNaslov() {
        return naslov;
    }

    /**
     * Sets the value of the naslov property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Naslov }{@code >}
     *     
     */
    public void setNaslov(JAXBElement<Naslov> value) {
        this.naslov = value;
    }

    /**
     * Gets the value of the priimek property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPriimek() {
        return priimek;
    }

    /**
     * Sets the value of the priimek property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPriimek(JAXBElement<String> value) {
        this.priimek = value;
    }

    /**
     * Gets the value of the privatnaSporocila property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPrivatnoSporocilo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPrivatnoSporocilo> getPrivatnaSporocila() {
        return privatnaSporocila;
    }

    /**
     * Sets the value of the privatnaSporocila property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPrivatnoSporocilo }{@code >}
     *     
     */
    public void setPrivatnaSporocila(JAXBElement<ArrayOfPrivatnoSporocilo> value) {
        this.privatnaSporocila = value;
    }

    /**
     * Gets the value of the seznamZelja property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSeznamZelja }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSeznamZelja> getSeznamZelja() {
        return seznamZelja;
    }

    /**
     * Sets the value of the seznamZelja property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSeznamZelja }{@code >}
     *     
     */
    public void setSeznamZelja(JAXBElement<ArrayOfSeznamZelja> value) {
        this.seznamZelja = value;
    }

    /**
     * Gets the value of the telefon property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelefon() {
        return telefon;
    }

    /**
     * Sets the value of the telefon property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelefon(JAXBElement<String> value) {
        this.telefon = value;
    }

    /**
     * Gets the value of the upime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUpime() {
        return upime;
    }

    /**
     * Sets the value of the upime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUpime(JAXBElement<String> value) {
        this.upime = value;
    }

    /**
     * Gets the value of the vloga property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVloga() {
        return vloga;
    }

    /**
     * Sets the value of the vloga property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVloga(Integer value) {
        this.vloga = value;
    }

}
