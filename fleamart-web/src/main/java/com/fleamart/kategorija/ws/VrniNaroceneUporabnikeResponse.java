
package com.fleamart.kategorija.ws;

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
 *         &lt;element name="VrniNaroceneUporabnikeResult" type="{http//www.fleamart.com/}ArrayOfUporabnik" minOccurs="0"/>
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
    "vrniNaroceneUporabnikeResult"
})
@XmlRootElement(name = "VrniNaroceneUporabnikeResponse")
public class VrniNaroceneUporabnikeResponse {

    @XmlElementRef(name = "VrniNaroceneUporabnikeResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUporabnik> vrniNaroceneUporabnikeResult;

    /**
     * Gets the value of the vrniNaroceneUporabnikeResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUporabnik }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUporabnik> getVrniNaroceneUporabnikeResult() {
        return vrniNaroceneUporabnikeResult;
    }

    /**
     * Sets the value of the vrniNaroceneUporabnikeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUporabnik }{@code >}
     *     
     */
    public void setVrniNaroceneUporabnikeResult(JAXBElement<ArrayOfUporabnik> value) {
        this.vrniNaroceneUporabnikeResult = value;
    }

}
