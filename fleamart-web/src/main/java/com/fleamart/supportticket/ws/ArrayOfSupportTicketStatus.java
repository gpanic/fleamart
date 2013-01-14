
package com.fleamart.supportticket.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSupportTicketStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSupportTicketStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SupportTicketStatus" type="{http//www.fleamart.com/}SupportTicketStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSupportTicketStatus", namespace = "http//www.fleamart.com/", propOrder = {
    "supportTicketStatus"
})
public class ArrayOfSupportTicketStatus {

    @XmlElement(name = "SupportTicketStatus", nillable = true)
    protected List<SupportTicketStatus> supportTicketStatus;

    /**
     * Gets the value of the supportTicketStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportTicketStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportTicketStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupportTicketStatus }
     * 
     * 
     */
    public List<SupportTicketStatus> getSupportTicketStatus() {
        if (supportTicketStatus == null) {
            supportTicketStatus = new ArrayList<SupportTicketStatus>();
        }
        return this.supportTicketStatus;
    }

}
