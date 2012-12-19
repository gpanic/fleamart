
package com.fleamart.oglas.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSeznamZelja complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSeznamZelja">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SeznamZelja" type="{http://schemas.datacontract.org/2004/07/Fleamart.Contracts.Data}SeznamZelja" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSeznamZelja", namespace = "http://schemas.datacontract.org/2004/07/Fleamart.Contracts.Data", propOrder = {
    "seznamZelja"
})
public class ArrayOfSeznamZelja {

    @XmlElement(name = "SeznamZelja", nillable = true)
    protected List<SeznamZelja> seznamZelja;

    /**
     * Gets the value of the seznamZelja property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seznamZelja property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeznamZelja().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeznamZelja }
     * 
     * 
     */
    public List<SeznamZelja> getSeznamZelja() {
        if (seznamZelja == null) {
            seznamZelja = new ArrayList<SeznamZelja>();
        }
        return this.seznamZelja;
    }

}
