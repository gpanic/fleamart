
package com.fleamart.oglas.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Oglas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Oglas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Avkcija" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Avtor" type="{http//www.fleamart.com/}Uporabnik"/>
 *         &lt;element name="CasDo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CasOd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CasSpremenjeno" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Cena" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Kategorija" type="{http//www.fleamart.com/}Kategorija" minOccurs="0"/>
 *         &lt;element name="Komentarji" type="{http//www.fleamart.com/}ArrayOfKomentar" minOccurs="0"/>
 *         &lt;element name="Kupec" type="{http//www.fleamart.com/}Uporabnik" minOccurs="0"/>
 *         &lt;element name="Naslov" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Opis" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Ponudbe" type="{http//www.fleamart.com/}ArrayOfPonudba" minOccurs="0"/>
 *         &lt;element name="Slike" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StatusNakupa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ZadnjaCenaAvkcija" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Oglas", propOrder = {
    "avkcija",
    "avtor",
    "casDo",
    "casOd",
    "casSpremenjeno",
    "cena",
    "id",
    "kategorija",
    "komentarji",
    "kupec",
    "naslov",
    "opis",
    "ponudbe",
    "slike",
    "status",
    "statusNakupa",
    "zadnjaCenaAvkcija"
})
public class Oglas {

    @XmlElement(name = "Avkcija")
    protected Boolean avkcija;
    @XmlElement(name = "Avtor", required = true, nillable = true)
    protected Uporabnik avtor;
    @XmlElement(name = "CasDo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar casDo;
    @XmlElement(name = "CasOd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar casOd;
    @XmlElementRef(name = "CasSpremenjeno", namespace = "http//www.fleamart.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> casSpremenjeno;
    @XmlElement(name = "Cena")
    protected Double cena;
    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElementRef(name = "Kategorija", namespace = "http//www.fleamart.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<Kategorija> kategorija;
    @XmlElementRef(name = "Komentarji", namespace = "http//www.fleamart.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKomentar> komentarji;
    @XmlElementRef(name = "Kupec", namespace = "http//www.fleamart.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<Uporabnik> kupec;
    @XmlElement(name = "Naslov", required = true, nillable = true)
    protected String naslov;
    @XmlElement(name = "Opis", required = true, nillable = true)
    protected String opis;
    @XmlElementRef(name = "Ponudbe", namespace = "http//www.fleamart.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPonudba> ponudbe;
    @XmlElementRef(name = "Slike", namespace = "http//www.fleamart.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> slike;
    @XmlElement(name = "Status")
    protected Integer status;
    @XmlElementRef(name = "StatusNakupa", namespace = "http//www.fleamart.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> statusNakupa;
    @XmlElementRef(name = "ZadnjaCenaAvkcija", namespace = "http//www.fleamart.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> zadnjaCenaAvkcija;

    /**
     * Gets the value of the avkcija property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvkcija() {
        return avkcija;
    }

    /**
     * Sets the value of the avkcija property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvkcija(Boolean value) {
        this.avkcija = value;
    }

    /**
     * Gets the value of the avtor property.
     * 
     * @return
     *     possible object is
     *     {@link Uporabnik }
     *     
     */
    public Uporabnik getAvtor() {
        return avtor;
    }

    /**
     * Sets the value of the avtor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uporabnik }
     *     
     */
    public void setAvtor(Uporabnik value) {
        this.avtor = value;
    }

    /**
     * Gets the value of the casDo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCasDo() {
        return casDo;
    }

    /**
     * Sets the value of the casDo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCasDo(XMLGregorianCalendar value) {
        this.casDo = value;
    }

    /**
     * Gets the value of the casOd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCasOd() {
        return casOd;
    }

    /**
     * Sets the value of the casOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCasOd(XMLGregorianCalendar value) {
        this.casOd = value;
    }

    /**
     * Gets the value of the casSpremenjeno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCasSpremenjeno() {
        return casSpremenjeno;
    }

    /**
     * Sets the value of the casSpremenjeno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCasSpremenjeno(JAXBElement<XMLGregorianCalendar> value) {
        this.casSpremenjeno = value;
    }

    /**
     * Gets the value of the cena property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCena() {
        return cena;
    }

    /**
     * Sets the value of the cena property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCena(Double value) {
        this.cena = value;
    }

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
     * Gets the value of the kategorija property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Kategorija }{@code >}
     *     
     */
    public JAXBElement<Kategorija> getKategorija() {
        return kategorija;
    }

    /**
     * Sets the value of the kategorija property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Kategorija }{@code >}
     *     
     */
    public void setKategorija(JAXBElement<Kategorija> value) {
        this.kategorija = value;
    }

    /**
     * Gets the value of the komentarji property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKomentar }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKomentar> getKomentarji() {
        return komentarji;
    }

    /**
     * Sets the value of the komentarji property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKomentar }{@code >}
     *     
     */
    public void setKomentarji(JAXBElement<ArrayOfKomentar> value) {
        this.komentarji = value;
    }

    /**
     * Gets the value of the kupec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Uporabnik }{@code >}
     *     
     */
    public JAXBElement<Uporabnik> getKupec() {
        return kupec;
    }

    /**
     * Sets the value of the kupec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Uporabnik }{@code >}
     *     
     */
    public void setKupec(JAXBElement<Uporabnik> value) {
        this.kupec = value;
    }

    /**
     * Gets the value of the naslov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaslov() {
        return naslov;
    }

    /**
     * Sets the value of the naslov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaslov(String value) {
        this.naslov = value;
    }

    /**
     * Gets the value of the opis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpis() {
        return opis;
    }

    /**
     * Sets the value of the opis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpis(String value) {
        this.opis = value;
    }

    /**
     * Gets the value of the ponudbe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPonudba }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPonudba> getPonudbe() {
        return ponudbe;
    }

    /**
     * Sets the value of the ponudbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPonudba }{@code >}
     *     
     */
    public void setPonudbe(JAXBElement<ArrayOfPonudba> value) {
        this.ponudbe = value;
    }

    /**
     * Gets the value of the slike property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getSlike() {
        return slike;
    }

    /**
     * Sets the value of the slike property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setSlike(JAXBElement<ArrayOfstring> value) {
        this.slike = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusNakupa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStatusNakupa() {
        return statusNakupa;
    }

    /**
     * Sets the value of the statusNakupa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStatusNakupa(JAXBElement<Integer> value) {
        this.statusNakupa = value;
    }

    /**
     * Gets the value of the zadnjaCenaAvkcija property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getZadnjaCenaAvkcija() {
        return zadnjaCenaAvkcija;
    }

    /**
     * Sets the value of the zadnjaCenaAvkcija property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setZadnjaCenaAvkcija(JAXBElement<Double> value) {
        this.zadnjaCenaAvkcija = value;
    }

}
