
package com.fleamart.oceni.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPonudba complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPonudba">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ponudba" type="{http//www.fleamart.com/}Ponudba" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPonudba", propOrder = {
    "ponudba"
})
public class ArrayOfPonudba {

    @XmlElement(name = "Ponudba", nillable = true)
    protected List<Ponudba> ponudba;

    /**
     * Gets the value of the ponudba property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ponudba property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPonudba().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ponudba }
     * 
     * 
     */
    public List<Ponudba> getPonudba() {
        if (ponudba == null) {
            ponudba = new ArrayList<Ponudba>();
        }
        return this.ponudba;
    }

}
