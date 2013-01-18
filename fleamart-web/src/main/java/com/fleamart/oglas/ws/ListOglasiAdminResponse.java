
package com.fleamart.oglas.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="ListOglasiAdminResult" type="{http//www.fleamart.com/}ArrayOfOglas" minOccurs="0"/>
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
    "listOglasiAdminResult"
})
@XmlRootElement(name = "ListOglasiAdminResponse")
public class ListOglasiAdminResponse {

    @XmlElementRef(name = "ListOglasiAdminResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOglas> listOglasiAdminResult;

    /**
     * Gets the value of the listOglasiAdminResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOglas }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOglas> getListOglasiAdminResult() {
        return listOglasiAdminResult;
    }

    /**
     * Sets the value of the listOglasiAdminResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOglas }{@code >}
     *     
     */
    public void setListOglasiAdminResult(JAXBElement<ArrayOfOglas> value) {
        this.listOglasiAdminResult = value;
    }

}
