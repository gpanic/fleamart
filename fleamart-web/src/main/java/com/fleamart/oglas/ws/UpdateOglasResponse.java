
package com.fleamart.oglas.ws;

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
 *         &lt;element name="UpdateOglasResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "updateOglasResult"
})
@XmlRootElement(name = "UpdateOglasResponse", namespace = "http://tempuri.org/")
public class UpdateOglasResponse {

    @XmlElement(name = "UpdateOglasResult", namespace = "http://tempuri.org/")
    protected Boolean updateOglasResult;

    /**
     * Gets the value of the updateOglasResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdateOglasResult() {
        return updateOglasResult;
    }

    /**
     * Sets the value of the updateOglasResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateOglasResult(Boolean value) {
        this.updateOglasResult = value;
    }

}
