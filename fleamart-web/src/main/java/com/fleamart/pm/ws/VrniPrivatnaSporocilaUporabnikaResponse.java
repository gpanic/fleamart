
package com.fleamart.pm.ws;

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
 *         &lt;element name="VrniPrivatnaSporocilaUporabnikaResult" type="{http//www.fleamart.com/}ArrayOfPrivatnoSporocilo" minOccurs="0"/>
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
    "vrniPrivatnaSporocilaUporabnikaResult"
})
@XmlRootElement(name = "VrniPrivatnaSporocilaUporabnikaResponse", namespace = "http://tempuri.org/")
public class VrniPrivatnaSporocilaUporabnikaResponse {

    @XmlElementRef(name = "VrniPrivatnaSporocilaUporabnikaResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPrivatnoSporocilo> vrniPrivatnaSporocilaUporabnikaResult;

    /**
     * Gets the value of the vrniPrivatnaSporocilaUporabnikaResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPrivatnoSporocilo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPrivatnoSporocilo> getVrniPrivatnaSporocilaUporabnikaResult() {
        return vrniPrivatnaSporocilaUporabnikaResult;
    }

    /**
     * Sets the value of the vrniPrivatnaSporocilaUporabnikaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPrivatnoSporocilo }{@code >}
     *     
     */
    public void setVrniPrivatnaSporocilaUporabnikaResult(JAXBElement<ArrayOfPrivatnoSporocilo> value) {
        this.vrniPrivatnaSporocilaUporabnikaResult = value;
    }

}
