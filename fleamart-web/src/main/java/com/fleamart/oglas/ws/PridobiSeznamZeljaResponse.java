
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
 *         &lt;element name="pridobiSeznamZeljaResult" type="{http//www.fleamart.com/}ArrayOfOglas" minOccurs="0"/>
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
    "pridobiSeznamZeljaResult"
})
@XmlRootElement(name = "pridobiSeznamZeljaResponse")
public class PridobiSeznamZeljaResponse {

    @XmlElementRef(name = "pridobiSeznamZeljaResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOglas> pridobiSeznamZeljaResult;

    /**
     * Gets the value of the pridobiSeznamZeljaResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOglas }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOglas> getPridobiSeznamZeljaResult() {
        return pridobiSeznamZeljaResult;
    }

    /**
     * Sets the value of the pridobiSeznamZeljaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOglas }{@code >}
     *     
     */
    public void setPridobiSeznamZeljaResult(JAXBElement<ArrayOfOglas> value) {
        this.pridobiSeznamZeljaResult = value;
    }

}
