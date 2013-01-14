
package com.fleamart.supportticket.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="DeleteSupportTicketKomentarResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "deleteSupportTicketKomentarResult"
})
@XmlRootElement(name = "DeleteSupportTicketKomentarResponse")
public class DeleteSupportTicketKomentarResponse {

    @XmlElement(name = "DeleteSupportTicketKomentarResult")
    protected Boolean deleteSupportTicketKomentarResult;

    /**
     * Gets the value of the deleteSupportTicketKomentarResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleteSupportTicketKomentarResult() {
        return deleteSupportTicketKomentarResult;
    }

    /**
     * Sets the value of the deleteSupportTicketKomentarResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleteSupportTicketKomentarResult(Boolean value) {
        this.deleteSupportTicketKomentarResult = value;
    }

}
