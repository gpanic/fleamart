
package com.fleamart.seznamZelja.ws;

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
 *         &lt;element name="izbrisiZeljoResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "izbrisiZeljoResult"
})
@XmlRootElement(name = "izbrisiZeljoResponse", namespace = "http://tempuri.org/")
public class IzbrisiZeljoResponse {

    @XmlElement(namespace = "http://tempuri.org/")
    protected Boolean izbrisiZeljoResult;

    /**
     * Gets the value of the izbrisiZeljoResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIzbrisiZeljoResult() {
        return izbrisiZeljoResult;
    }

    /**
     * Sets the value of the izbrisiZeljoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIzbrisiZeljoResult(Boolean value) {
        this.izbrisiZeljoResult = value;
    }

}
