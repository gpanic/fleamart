
package com.fleamart.supportticket.ws;

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
 *         &lt;element name="k" type="{http//www.fleamart.com/}SupportTicketKomentar" minOccurs="0"/>
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
    "k"
})
@XmlRootElement(name = "CreateSupportTicketKomentar")
public class CreateSupportTicketKomentar {

    @XmlElementRef(name = "k", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<SupportTicketKomentar> k;

    /**
     * Gets the value of the k property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SupportTicketKomentar }{@code >}
     *     
     */
    public JAXBElement<SupportTicketKomentar> getK() {
        return k;
    }

    /**
     * Sets the value of the k property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SupportTicketKomentar }{@code >}
     *     
     */
    public void setK(JAXBElement<SupportTicketKomentar> value) {
        this.k = value;
    }

}
