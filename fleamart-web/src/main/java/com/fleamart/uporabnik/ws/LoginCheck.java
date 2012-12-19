
package com.fleamart.uporabnik.ws;

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
 *         &lt;element name="upImeV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "upImeV",
    "passV"
})
@XmlRootElement(name = "LoginCheck", namespace = "http://tempuri.org/")
public class LoginCheck {

    @XmlElementRef(name = "upImeV", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> upImeV;
    @XmlElementRef(name = "passV", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passV;

    /**
     * Gets the value of the upImeV property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUpImeV() {
        return upImeV;
    }

    /**
     * Sets the value of the upImeV property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUpImeV(JAXBElement<String> value) {
        this.upImeV = value;
    }

    /**
     * Gets the value of the passV property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassV() {
        return passV;
    }

    /**
     * Sets the value of the passV property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassV(JAXBElement<String> value) {
        this.passV = value;
    }

}
