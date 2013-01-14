
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
 *         &lt;element name="ListSupportTicketStatusResult" type="{http//www.fleamart.com/}ArrayOfSupportTicketStatus" minOccurs="0"/>
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
    "listSupportTicketStatusResult"
})
@XmlRootElement(name = "ListSupportTicketStatusResponse")
public class ListSupportTicketStatusResponse {

    @XmlElementRef(name = "ListSupportTicketStatusResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSupportTicketStatus> listSupportTicketStatusResult;

    /**
     * Gets the value of the listSupportTicketStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSupportTicketStatus }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSupportTicketStatus> getListSupportTicketStatusResult() {
        return listSupportTicketStatusResult;
    }

    /**
     * Sets the value of the listSupportTicketStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSupportTicketStatus }{@code >}
     *     
     */
    public void setListSupportTicketStatusResult(JAXBElement<ArrayOfSupportTicketStatus> value) {
        this.listSupportTicketStatusResult = value;
    }

}
