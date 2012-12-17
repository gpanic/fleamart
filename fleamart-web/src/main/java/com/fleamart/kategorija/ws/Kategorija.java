
package com.fleamart.kategorija.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Kategorija complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Kategorija">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Nadkategorija" type="{http://schemas.datacontract.org/2004/07/Fleamart.Contracts.Data}Kategorija" minOccurs="0"/>
 *         &lt;element name="NadkategorijaId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Naziv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kategorija", namespace = "http://schemas.datacontract.org/2004/07/Fleamart.Contracts.Data", propOrder = {
    "id",
    "nadkategorija",
    "nadkategorijaId",
    "naziv"
})
public class Kategorija {

    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElementRef(name = "Nadkategorija", namespace = "http://schemas.datacontract.org/2004/07/Fleamart.Contracts.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<Kategorija> nadkategorija;
    @XmlElementRef(name = "NadkategorijaId", namespace = "http://schemas.datacontract.org/2004/07/Fleamart.Contracts.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nadkategorijaId;
    @XmlElementRef(name = "Naziv", namespace = "http://schemas.datacontract.org/2004/07/Fleamart.Contracts.Data", type = JAXBElement.class, required = false)
    protected JAXBElement<String> naziv;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the nadkategorija property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Kategorija }{@code >}
     *     
     */
    public JAXBElement<Kategorija> getNadkategorija() {
        return nadkategorija;
    }

    /**
     * Sets the value of the nadkategorija property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Kategorija }{@code >}
     *     
     */
    public void setNadkategorija(JAXBElement<Kategorija> value) {
        this.nadkategorija = value;
    }

    /**
     * Gets the value of the nadkategorijaId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNadkategorijaId() {
        return nadkategorijaId;
    }

    /**
     * Sets the value of the nadkategorijaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNadkategorijaId(JAXBElement<Integer> value) {
        this.nadkategorijaId = value;
    }

    /**
     * Gets the value of the naziv property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNaziv() {
        return naziv;
    }

    /**
     * Sets the value of the naziv property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNaziv(JAXBElement<String> value) {
        this.naziv = value;
    }

}
