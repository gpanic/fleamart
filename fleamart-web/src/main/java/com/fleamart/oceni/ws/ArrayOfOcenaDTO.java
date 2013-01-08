
package com.fleamart.oceni.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOcenaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOcenaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OcenaDTO" type="{http//www.fleamart.com/}OcenaDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOcenaDTO", propOrder = {
    "ocenaDTO"
})
public class ArrayOfOcenaDTO {

    @XmlElement(name = "OcenaDTO", nillable = true)
    protected List<OcenaDTO> ocenaDTO;

    /**
     * Gets the value of the ocenaDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ocenaDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOcenaDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OcenaDTO }
     * 
     * 
     */
    public List<OcenaDTO> getOcenaDTO() {
        if (ocenaDTO == null) {
            ocenaDTO = new ArrayList<OcenaDTO>();
        }
        return this.ocenaDTO;
    }

}
