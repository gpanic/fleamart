
package com.fleamart.oceni.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OcenaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OcenaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Ocena" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Oglas" type="{http//www.fleamart.com/}Oglas" minOccurs="0"/>
 *         &lt;element name="OglasId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Tip" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OcenaDTO", propOrder = {
    "id",
    "ocena",
    "oglas",
    "oglasId",
    "tip"
})
public class OcenaDTO {

    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElement(name = "Ocena")
    protected Integer ocena;
    @XmlElementRef(name = "Oglas", namespace = "http//www.fleamart.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<Oglas> oglas;
    @XmlElement(name = "OglasId")
    protected Integer oglasId;
    @XmlElement(name = "Tip")
    protected Integer tip;

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
     * Gets the value of the ocena property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOcena() {
        return ocena;
    }

    /**
     * Sets the value of the ocena property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOcena(Integer value) {
        this.ocena = value;
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
     * Gets the value of the oglasId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOglasId() {
        return oglasId;
    }

    /**
     * Sets the value of the oglasId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOglasId(Integer value) {
        this.oglasId = value;
    }

    /**
     * Gets the value of the tip property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTip() {
        return tip;
    }

    /**
     * Sets the value of the tip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTip(Integer value) {
        this.tip = value;
    }

}
