
package com.fleamart.pm.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UporabnikId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "uporabnikId"
})
@XmlRootElement(name = "VrniPrivatnaSporocilaUporabnika", namespace = "http://tempuri.org/")
public class VrniPrivatnaSporocilaUporabnika {

    @XmlElement(name = "UporabnikId", namespace = "http://tempuri.org/")
    protected Integer uporabnikId;

    /**
     * Gets the value of the uporabnikId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUporabnikId() {
        return uporabnikId;
    }

    /**
     * Sets the value of the uporabnikId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUporabnikId(Integer value) {
        this.uporabnikId = value;
    }

}
