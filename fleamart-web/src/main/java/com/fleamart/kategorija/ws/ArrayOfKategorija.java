
package com.fleamart.kategorija.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKategorija complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKategorija">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Kategorija" type="{http://schemas.datacontract.org/2004/07/Fleamart.Contracts.Data}Kategorija" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKategorija", namespace = "http://schemas.datacontract.org/2004/07/Fleamart.Contracts.Data", propOrder = {
    "kategorija"
})
public class ArrayOfKategorija {

    @XmlElement(name = "Kategorija", nillable = true)
    protected List<Kategorija> kategorija;

    /**
     * Gets the value of the kategorija property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kategorija property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKategorija().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Kategorija }
     * 
     * 
     */
    public List<Kategorija> getKategorija() {
        if (kategorija == null) {
            kategorija = new ArrayList<Kategorija>();
        }
        return this.kategorija;
    }

}
