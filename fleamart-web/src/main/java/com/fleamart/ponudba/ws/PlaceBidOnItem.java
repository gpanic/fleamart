
package com.fleamart.ponudba.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="znesek" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="idUporabnika" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idOglas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "znesek",
    "idUporabnika",
    "idOglas"
})
@XmlRootElement(name = "placeBidOnItem")
public class PlaceBidOnItem {

    protected Double znesek;
    protected Integer idUporabnika;
    protected Integer idOglas;

    /**
     * Gets the value of the znesek property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getZnesek() {
        return znesek;
    }

    /**
     * Sets the value of the znesek property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setZnesek(Double value) {
        this.znesek = value;
    }

    /**
     * Gets the value of the idUporabnika property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdUporabnika() {
        return idUporabnika;
    }

    /**
     * Sets the value of the idUporabnika property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdUporabnika(Integer value) {
        this.idUporabnika = value;
    }

    /**
     * Gets the value of the idOglas property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdOglas() {
        return idOglas;
    }

    /**
     * Sets the value of the idOglas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdOglas(Integer value) {
        this.idOglas = value;
    }

}
