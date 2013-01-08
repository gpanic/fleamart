
package com.fleamart.oceni.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="kupecId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ocena" type="{http//www.fleamart.com/}ArrayOfOcenaDTO" minOccurs="0"/>
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
    "kupecId",
    "ocena"
})
@XmlRootElement(name = "oceniOglas", namespace = "http://tempuri.org/")
public class OceniOglas {

    @XmlElement(namespace = "http://tempuri.org/")
    protected Integer kupecId;
    @XmlElementRef(name = "ocena", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOcenaDTO> ocena;

    /**
     * Gets the value of the kupecId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKupecId() {
        return kupecId;
    }

    /**
     * Sets the value of the kupecId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKupecId(Integer value) {
        this.kupecId = value;
    }

    /**
     * Gets the value of the ocena property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOcenaDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOcenaDTO> getOcena() {
        return ocena;
    }

    /**
     * Sets the value of the ocena property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOcenaDTO }{@code >}
     *     
     */
    public void setOcena(JAXBElement<ArrayOfOcenaDTO> value) {
        this.ocena = value;
    }

}
