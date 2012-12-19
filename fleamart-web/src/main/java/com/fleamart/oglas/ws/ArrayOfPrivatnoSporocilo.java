
package com.fleamart.oglas.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPrivatnoSporocilo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPrivatnoSporocilo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrivatnoSporocilo" type="{http://schemas.datacontract.org/2004/07/Fleamart.Contracts.Data}PrivatnoSporocilo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPrivatnoSporocilo", namespace = "http://schemas.datacontract.org/2004/07/Fleamart.Contracts.Data", propOrder = {
    "privatnoSporocilo"
})
public class ArrayOfPrivatnoSporocilo {

    @XmlElement(name = "PrivatnoSporocilo", nillable = true)
    protected List<PrivatnoSporocilo> privatnoSporocilo;

    /**
     * Gets the value of the privatnoSporocilo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the privatnoSporocilo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrivatnoSporocilo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrivatnoSporocilo }
     * 
     * 
     */
    public List<PrivatnoSporocilo> getPrivatnoSporocilo() {
        if (privatnoSporocilo == null) {
            privatnoSporocilo = new ArrayList<PrivatnoSporocilo>();
        }
        return this.privatnoSporocilo;
    }

}
