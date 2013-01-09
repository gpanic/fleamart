
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
 *         &lt;element name="VrniNaroceneKategorijeResult" type="{http//www.fleamart.com/}ArrayOfKategorija" minOccurs="0"/>
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
    "vrniNaroceneKategorijeResult"
})
@XmlRootElement(name = "VrniNaroceneKategorijeResponse")
public class VrniNaroceneKategorijeResponse {

    @XmlElementRef(name = "VrniNaroceneKategorijeResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKategorija> vrniNaroceneKategorijeResult;

    /**
     * Gets the value of the vrniNaroceneKategorijeResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKategorija }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKategorija> getVrniNaroceneKategorijeResult() {
        return vrniNaroceneKategorijeResult;
    }

    /**
     * Sets the value of the vrniNaroceneKategorijeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKategorija }{@code >}
     *     
     */
    public void setVrniNaroceneKategorijeResult(JAXBElement<ArrayOfKategorija> value) {
        this.vrniNaroceneKategorijeResult = value;
    }

}
