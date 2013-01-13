
package com.fleamart.ponudba.ws;

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
 *         &lt;element name="placeAutoBidOnItemResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "placeAutoBidOnItemResult"
})
@XmlRootElement(name = "placeAutoBidOnItemResponse", namespace = "http://tempuri.org/")
public class PlaceAutoBidOnItemResponse {

    @XmlElement(namespace = "http://tempuri.org/")
    protected Boolean placeAutoBidOnItemResult;

    /**
     * Gets the value of the placeAutoBidOnItemResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlaceAutoBidOnItemResult() {
        return placeAutoBidOnItemResult;
    }

    /**
     * Sets the value of the placeAutoBidOnItemResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlaceAutoBidOnItemResult(Boolean value) {
        this.placeAutoBidOnItemResult = value;
    }

}
