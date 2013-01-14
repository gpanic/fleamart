
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
 *         &lt;element name="ListSupportTicketResult" type="{http//www.fleamart.com/}ArrayOfSupportTicket" minOccurs="0"/>
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
    "listSupportTicketResult"
})
@XmlRootElement(name = "ListSupportTicketResponse")
public class ListSupportTicketResponse {

    @XmlElementRef(name = "ListSupportTicketResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSupportTicket> listSupportTicketResult;

    /**
     * Gets the value of the listSupportTicketResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSupportTicket }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSupportTicket> getListSupportTicketResult() {
        return listSupportTicketResult;
    }

    /**
     * Sets the value of the listSupportTicketResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSupportTicket }{@code >}
     *     
     */
    public void setListSupportTicketResult(JAXBElement<ArrayOfSupportTicket> value) {
        this.listSupportTicketResult = value;
    }

}
