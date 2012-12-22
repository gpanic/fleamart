
package com.fleamart.oglas.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOglas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOglas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Oglas" type="{http//www.fleamart.com/}Oglas" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOglas", namespace = "http//www.fleamart.com/", propOrder = {
    "oglas"
})
public class ArrayOfOglas {

    @XmlElement(name = "Oglas", nillable = true)
    protected List<Oglas> oglas;

    /**
     * Gets the value of the oglas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oglas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOglas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Oglas }
     * 
     * 
     */
    public List<Oglas> getOglas() {
        if (oglas == null) {
            oglas = new ArrayList<Oglas>();
        }
        return this.oglas;
    }

}
