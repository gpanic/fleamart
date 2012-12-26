
package com.fleamart.oglas.ws;

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
 *         &lt;element name="ReadOglasLastResult" type="{http//www.fleamart.com/}Oglas" minOccurs="0"/>
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
    "readOglasLastResult"
})
@XmlRootElement(name = "ReadOglasLastResponse")
public class ReadOglasLastResponse {

    @XmlElementRef(name = "ReadOglasLastResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Oglas> readOglasLastResult;

    /**
     * Gets the value of the readOglasLastResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Oglas }{@code >}
     *     
     */
    public JAXBElement<Oglas> getReadOglasLastResult() {
        return readOglasLastResult;
    }

    /**
     * Sets the value of the readOglasLastResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Oglas }{@code >}
     *     
     */
    public void setReadOglasLastResult(JAXBElement<Oglas> value) {
        this.readOglasLastResult = value;
    }

}
