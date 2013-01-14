
package com.fleamart.supportticket.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSupportTicket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSupportTicket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SupportTicket" type="{http//www.fleamart.com/}SupportTicket" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSupportTicket", namespace = "http//www.fleamart.com/", propOrder = {
    "supportTicket"
})
public class ArrayOfSupportTicket {

    @XmlElement(name = "SupportTicket", nillable = true)
    protected List<SupportTicket> supportTicket;

    /**
     * Gets the value of the supportTicket property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportTicket property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportTicket().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupportTicket }
     * 
     * 
     */
    public List<SupportTicket> getSupportTicket() {
        if (supportTicket == null) {
            supportTicket = new ArrayList<SupportTicket>();
        }
        return this.supportTicket;
    }

}
