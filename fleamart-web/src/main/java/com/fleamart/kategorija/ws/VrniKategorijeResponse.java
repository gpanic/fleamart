
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
 *         &lt;element name="VrniKategorijeResult" type="{http//www.fleamart.com/}ArrayOfKategorija" minOccurs="0"/>
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
    "vrniKategorijeResult"
})
@XmlRootElement(name = "VrniKategorijeResponse")
public class VrniKategorijeResponse {

    @XmlElementRef(name = "VrniKategorijeResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKategorija> vrniKategorijeResult;

    /**
     * Gets the value of the vrniKategorijeResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKategorija }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKategorija> getVrniKategorijeResult() {
        return vrniKategorijeResult;
    }

    /**
     * Sets the value of the vrniKategorijeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKategorija }{@code >}
     *     
     */
    public void setVrniKategorijeResult(JAXBElement<ArrayOfKategorija> value) {
        this.vrniKategorijeResult = value;
    }

}
