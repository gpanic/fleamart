
package com.fleamart.supportticket.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PrivatnoSporocilo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrivatnoSporocilo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cas" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Posiljatelj" type="{http//www.fleamart.com/}Uporabnik" minOccurs="0"/>
 *         &lt;element name="PosiljateljId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Prebrano" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Prejemnik" type="{http//www.fleamart.com/}Uporabnik" minOccurs="0"/>
 *         &lt;element name="PrejemnikId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PrivatnoSporociloId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Sporocilo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://schemas.microsoft.com/2003/10/Serialization/}Id"/>
 *       &lt;attribute ref="{http://schemas.microsoft.com/2003/10/Serialization/}Ref"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrivatnoSporocilo", namespace = "http//www.fleamart.com/", propOrder = {
    "cas",
    "posiljatelj",
    "posiljateljId",
    "prebrano",
    "prejemnik",
    "prejemnikId",
    "privatnoSporociloId",
    "sporocilo"
})
public class PrivatnoSporocilo {

    @XmlElement(name = "Cas")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cas;
    @XmlElementRef(name = "Posiljatelj", namespace = "http//www.fleamart.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<Uporabnik> posiljatelj;
    @XmlElement(name = "PosiljateljId")
    protected Integer posiljateljId;
    @XmlElement(name = "Prebrano")
    protected Boolean prebrano;
    @XmlElementRef(name = "Prejemnik", namespace = "http//www.fleamart.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<Uporabnik> prejemnik;
    @XmlElement(name = "PrejemnikId")
    protected Integer prejemnikId;
    @XmlElement(name = "PrivatnoSporociloId")
    protected Integer privatnoSporociloId;
    @XmlElementRef(name = "Sporocilo", namespace = "http//www.fleamart.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sporocilo;
    @XmlAttribute(name = "Id", namespace = "http://schemas.microsoft.com/2003/10/Serialization/")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "Ref", namespace = "http://schemas.microsoft.com/2003/10/Serialization/")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object ref;

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
     * Gets the value of the posiljatelj property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Uporabnik }{@code >}
     *     
     */
    public JAXBElement<Uporabnik> getPosiljatelj() {
        return posiljatelj;
    }

    /**
     * Sets the value of the posiljatelj property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Uporabnik }{@code >}
     *     
     */
    public void setPosiljatelj(JAXBElement<Uporabnik> value) {
        this.posiljatelj = value;
    }

    /**
     * Gets the value of the posiljateljId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPosiljateljId() {
        return posiljateljId;
    }

    /**
     * Sets the value of the posiljateljId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPosiljateljId(Integer value) {
        this.posiljateljId = value;
    }

    /**
     * Gets the value of the prebrano property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrebrano() {
        return prebrano;
    }

    /**
     * Sets the value of the prebrano property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrebrano(Boolean value) {
        this.prebrano = value;
    }

    /**
     * Gets the value of the prejemnik property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Uporabnik }{@code >}
     *     
     */
    public JAXBElement<Uporabnik> getPrejemnik() {
        return prejemnik;
    }

    /**
     * Sets the value of the prejemnik property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Uporabnik }{@code >}
     *     
     */
    public void setPrejemnik(JAXBElement<Uporabnik> value) {
        this.prejemnik = value;
    }

    /**
     * Gets the value of the prejemnikId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrejemnikId() {
        return prejemnikId;
    }

    /**
     * Sets the value of the prejemnikId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrejemnikId(Integer value) {
        this.prejemnikId = value;
    }

    /**
     * Gets the value of the privatnoSporociloId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrivatnoSporociloId() {
        return privatnoSporociloId;
    }

    /**
     * Sets the value of the privatnoSporociloId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrivatnoSporociloId(Integer value) {
        this.privatnoSporociloId = value;
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

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRef(Object value) {
        this.ref = value;
    }

}
