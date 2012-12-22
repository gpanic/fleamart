
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
 *         &lt;element name="getOglasiResult" type="{http//www.fleamart.com/}ArrayOfOglas" minOccurs="0"/>
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
    "getOglasiResult"
})
@XmlRootElement(name = "getOglasiResponse")
public class GetOglasiResponse {

    @XmlElementRef(name = "getOglasiResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOglas> getOglasiResult;

    /**
     * Gets the value of the getOglasiResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOglas }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOglas> getGetOglasiResult() {
        return getOglasiResult;
    }

    /**
     * Sets the value of the getOglasiResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOglas }{@code >}
     *     
     */
    public void setGetOglasiResult(JAXBElement<ArrayOfOglas> value) {
        this.getOglasiResult = value;
    }

}
