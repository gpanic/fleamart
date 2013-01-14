
package com.fleamart.supportticket.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSupportTicketKomentar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSupportTicketKomentar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SupportTicketKomentar" type="{http//www.fleamart.com/}SupportTicketKomentar" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSupportTicketKomentar", namespace = "http//www.fleamart.com/", propOrder = {
    "supportTicketKomentar"
})
public class ArrayOfSupportTicketKomentar {

    @XmlElement(name = "SupportTicketKomentar", nillable = true)
    protected List<SupportTicketKomentar> supportTicketKomentar;

    /**
     * Gets the value of the supportTicketKomentar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportTicketKomentar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportTicketKomentar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupportTicketKomentar }
     * 
     * 
     */
    public List<SupportTicketKomentar> getSupportTicketKomentar() {
        if (supportTicketKomentar == null) {
            supportTicketKomentar = new ArrayList<SupportTicketKomentar>();
        }
        return this.supportTicketKomentar;
    }

}
