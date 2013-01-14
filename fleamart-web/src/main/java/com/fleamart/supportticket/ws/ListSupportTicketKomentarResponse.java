
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
 *         &lt;element name="ListSupportTicketKomentarResult" type="{http//www.fleamart.com/}ArrayOfSupportTicketKomentar" minOccurs="0"/>
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
    "listSupportTicketKomentarResult"
})
@XmlRootElement(name = "ListSupportTicketKomentarResponse")
public class ListSupportTicketKomentarResponse {

    @XmlElementRef(name = "ListSupportTicketKomentarResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSupportTicketKomentar> listSupportTicketKomentarResult;

    /**
     * Gets the value of the listSupportTicketKomentarResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSupportTicketKomentar }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSupportTicketKomentar> getListSupportTicketKomentarResult() {
        return listSupportTicketKomentarResult;
    }

    /**
     * Sets the value of the listSupportTicketKomentarResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSupportTicketKomentar }{@code >}
     *     
     */
    public void setListSupportTicketKomentarResult(JAXBElement<ArrayOfSupportTicketKomentar> value) {
        this.listSupportTicketKomentarResult = value;
    }

}
