
package com.fleamart.supportticket.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SupportTicket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupportTicket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Avtor" type="{http//www.fleamart.com/}Uporabnik" minOccurs="0"/>
 *         &lt;element name="CasUstvarjen" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CasZaprt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Komentarji" type="{http//www.fleamart.com/}ArrayOfSupportTicketKomentar" minOccurs="0"/>
 *         &lt;element name="Naslov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupportTicketKategorija" type="{http//www.fleamart.com/}SupportTicketKategorija" minOccurs="0"/>
 *         &lt;element name="SupportTicketStatus" type="{http//www.fleamart.com/}SupportTicketStatus" minOccurs="0"/>
 *         &lt;element name="Tehnik" type="{http//www.fleamart.com/}Uporabnik" minOccurs="0"/>
 *         &lt;element name="Vsebina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupportTicket", namespace = "http//www.fleamart.com/", propOrder = {
    "avtor",
    "casUstvarjen",
    "casZaprt",
    "id",
    "komentarji",
    "naslov",
    "supportTicketKategorija",
    "supportTicketStatus",
    "tehnik",
    "vsebina"
})
public class SupportTicket {

    @XmlElementRef(name = "Avtor", namespace = "http//www.fleamart.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<Uporabnik> avtor;
    @XmlElementRef(name = "CasUstvarjen", namespace = "http//www.fleamart.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> casUstvarjen;
    @XmlElementRef(name = "CasZaprt", namespace = "http//www.fleamart.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> casZaprt;
    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElementRef(name = "Komentarji", namespace = "http//www.fleamart.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSupportTicketKomentar> komentarji;
    @XmlElementRef(name = "Naslov", namespace = "http//www.fleamart.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> naslov;
    @XmlElementRef(name = "SupportTicketKategorija", namespace = "http//www.fleamart.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<SupportTicketKategorija> supportTicketKategorija;
    @XmlElementRef(name = "SupportTicketStatus", namespace = "http//www.fleamart.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<SupportTicketStatus> supportTicketStatus;
    @XmlElementRef(name = "Tehnik", namespace = "http//www.fleamart.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<Uporabnik> tehnik;
    @XmlElementRef(name = "Vsebina", namespace = "http//www.fleamart.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vsebina;

    /**
     * Gets the value of the avtor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Uporabnik }{@code >}
     *     
     */
    public JAXBElement<Uporabnik> getAvtor() {
        return avtor;
    }

    /**
     * Sets the value of the avtor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Uporabnik }{@code >}
     *     
     */
    public void setAvtor(JAXBElement<Uporabnik> value) {
        this.avtor = value;
    }

    /**
     * Gets the value of the casUstvarjen property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCasUstvarjen() {
        return casUstvarjen;
    }

    /**
     * Sets the value of the casUstvarjen property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCasUstvarjen(JAXBElement<XMLGregorianCalendar> value) {
        this.casUstvarjen = value;
    }

    /**
     * Gets the value of the casZaprt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCasZaprt() {
        return casZaprt;
    }

    /**
     * Sets the value of the casZaprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCasZaprt(JAXBElement<XMLGregorianCalendar> value) {
        this.casZaprt = value;
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
     * Gets the value of the komentarji property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSupportTicketKomentar }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSupportTicketKomentar> getKomentarji() {
        return komentarji;
    }

    /**
     * Sets the value of the komentarji property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSupportTicketKomentar }{@code >}
     *     
     */
    public void setKomentarji(JAXBElement<ArrayOfSupportTicketKomentar> value) {
        this.komentarji = value;
    }

    /**
     * Gets the value of the naslov property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNaslov() {
        return naslov;
    }

    /**
     * Sets the value of the naslov property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNaslov(JAXBElement<String> value) {
        this.naslov = value;
    }

    /**
     * Gets the value of the supportTicketKategorija property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SupportTicketKategorija }{@code >}
     *     
     */
    public JAXBElement<SupportTicketKategorija> getSupportTicketKategorija() {
        return supportTicketKategorija;
    }

    /**
     * Sets the value of the supportTicketKategorija property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SupportTicketKategorija }{@code >}
     *     
     */
    public void setSupportTicketKategorija(JAXBElement<SupportTicketKategorija> value) {
        this.supportTicketKategorija = value;
    }

    /**
     * Gets the value of the supportTicketStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SupportTicketStatus }{@code >}
     *     
     */
    public JAXBElement<SupportTicketStatus> getSupportTicketStatus() {
        return supportTicketStatus;
    }

    /**
     * Sets the value of the supportTicketStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SupportTicketStatus }{@code >}
     *     
     */
    public void setSupportTicketStatus(JAXBElement<SupportTicketStatus> value) {
        this.supportTicketStatus = value;
    }

    /**
     * Gets the value of the tehnik property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Uporabnik }{@code >}
     *     
     */
    public JAXBElement<Uporabnik> getTehnik() {
        return tehnik;
    }

    /**
     * Sets the value of the tehnik property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Uporabnik }{@code >}
     *     
     */
    public void setTehnik(JAXBElement<Uporabnik> value) {
        this.tehnik = value;
    }

    /**
     * Gets the value of the vsebina property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVsebina() {
        return vsebina;
    }

    /**
     * Sets the value of the vsebina property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVsebina(JAXBElement<String> value) {
        this.vsebina = value;
    }

}
