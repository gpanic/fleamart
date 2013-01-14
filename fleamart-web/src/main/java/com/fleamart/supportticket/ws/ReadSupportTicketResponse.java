
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
 *         &lt;element name="ReadSupportTicketResult" type="{http//www.fleamart.com/}SupportTicket" minOccurs="0"/>
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
    "readSupportTicketResult"
})
@XmlRootElement(name = "ReadSupportTicketResponse")
public class ReadSupportTicketResponse {

    @XmlElementRef(name = "ReadSupportTicketResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<SupportTicket> readSupportTicketResult;

    /**
     * Gets the value of the readSupportTicketResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SupportTicket }{@code >}
     *     
     */
    public JAXBElement<SupportTicket> getReadSupportTicketResult() {
        return readSupportTicketResult;
    }

    /**
     * Sets the value of the readSupportTicketResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SupportTicket }{@code >}
     *     
     */
    public void setReadSupportTicketResult(JAXBElement<SupportTicket> value) {
        this.readSupportTicketResult = value;
    }

}
