
package com.fleamart.kategorija.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUporabnik complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUporabnik">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Uporabnik" type="{http//www.fleamart.com/}Uporabnik" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUporabnik", namespace = "http//www.fleamart.com/", propOrder = {
    "uporabnik"
})
public class ArrayOfUporabnik {

    @XmlElement(name = "Uporabnik", nillable = true)
    protected List<Uporabnik> uporabnik;

    /**
     * Gets the value of the uporabnik property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uporabnik property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUporabnik().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Uporabnik }
     * 
     * 
     */
    public List<Uporabnik> getUporabnik() {
        if (uporabnik == null) {
            uporabnik = new ArrayList<Uporabnik>();
        }
        return this.uporabnik;
    }

}
