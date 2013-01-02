
package com.fleamart.ponudba.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Komentar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Komentar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Avtor" type="{http//www.fleamart.com/}Uporabnik" minOccurs="0"/>
 *         &lt;element name="Cas" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Sporocilo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Komentar", propOrder = {
    "avtor",
    "cas",
    "id",
    "sporocilo"
})
public class Komentar {

    @XmlElementRef(name = "Avtor", namespace = "http//www.fleamart.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<Uporabnik> avtor;
    @XmlElement(name = "Cas")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cas;
    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElementRef(name = "Sporocilo", namespace = "http//www.fleamart.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sporocilo;

    /**
     * Gets the value of the avtor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Uporabnik }{@code >}
     *     
     */
    public JAXBElement<Uporabnik> getAvtor() {
        return avtor;
    }

    /**
     * Sets the value of the avtor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Uporabnik }{@code >}
     *     
     */
    public void setAvtor(JAXBElement<Uporabnik> value) {
        this.avtor = value;
    }

    /**
     * Gets the value of the cas property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCas() {
        return cas;
    }

    /**
     * Sets the value of the cas property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCas(XMLGregorianCalendar value) {
        this.cas = value;
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
     * Gets the value of the sporocilo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSporocilo() {
        return sporocilo;
    }

    /**
     * Sets the value of the sporocilo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSporocilo(JAXBElement<String> value) {
        this.sporocilo = value;
    }

}
