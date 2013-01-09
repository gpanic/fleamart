
package com.fleamart.kategorija.ws;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.fleamart.kategorija.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _ArrayOfKategorija_QNAME = new QName("http//www.fleamart.com/", "ArrayOfKategorija");
    private final static QName _ArrayOfUporabnik_QNAME = new QName("http//www.fleamart.com/", "ArrayOfUporabnik");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _Kategorija_QNAME = new QName("http//www.fleamart.com/", "Kategorija");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _SeznamZelja_QNAME = new QName("http://schemas.datacontract.org/2004/07/Fleamart.Contracts.Data", "SeznamZelja");
    private final static QName _Naslov_QNAME = new QName("http//www.fleamart.com/", "Naslov");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _ArrayOfPrivatnoSporocilo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Fleamart.Contracts.Data", "ArrayOfPrivatnoSporocilo");
    private final static QName _NarocenaKategorija_QNAME = new QName("http//www.fleamart.com/", "NarocenaKategorija");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Uporabnik_QNAME = new QName("http//www.fleamart.com/", "Uporabnik");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _ArrayOfSeznamZelja_QNAME = new QName("http://schemas.datacontract.org/2004/07/Fleamart.Contracts.Data", "ArrayOfSeznamZelja");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _PrivatnoSporocilo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Fleamart.Contracts.Data", "PrivatnoSporocilo");
    private final static QName _UporabnikPrivatnaSporocila_QNAME = new QName("http//www.fleamart.com/", "PrivatnaSporocila");
    private final static QName _UporabnikIme_QNAME = new QName("http//www.fleamart.com/", "Ime");
    private final static QName _UporabnikEmail_QNAME = new QName("http//www.fleamart.com/", "Email");
    private final static QName _UporabnikGeslo_QNAME = new QName("http//www.fleamart.com/", "Geslo");
    private final static QName _UporabnikTelefon_QNAME = new QName("http//www.fleamart.com/", "Telefon");
    private final static QName _UporabnikPriimek_QNAME = new QName("http//www.fleamart.com/", "Priimek");
    private final static QName _UporabnikUpime_QNAME = new QName("http//www.fleamart.com/", "Upime");
    private final static QName _UporabnikSeznamZelja_QNAME = new QName("http//www.fleamart.com/", "SeznamZelja");
    private final static QName _VrniNaroceneKategorijeU_QNAME = new QName("http://tempuri.org/", "u");
    private final static QName _IzbrisiNarocenoKategorijoK_QNAME = new QName("http://tempuri.org/", "k");
    private final static QName _NaslovDrzava_QNAME = new QName("http//www.fleamart.com/", "Drzava");
    private final static QName _NaslovUlica_QNAME = new QName("http//www.fleamart.com/", "Ulica");
    private final static QName _NaslovObcina_QNAME = new QName("http//www.fleamart.com/", "Obcina");
    private final static QName _DodajNarocenoKategorijoNk_QNAME = new QName("http://tempuri.org/", "nk");
    private final static QName _KategorijaNaziv_QNAME = new QName("http//www.fleamart.com/", "Naziv");
    private final static QName _VrniNaroceneKategorijeResponseVrniNaroceneKategorijeResult_QNAME = new QName("http://tempuri.org/", "VrniNaroceneKategorijeResult");
    private final static QName _VrniNaroceneUporabnikeResponseVrniNaroceneUporabnikeResult_QNAME = new QName("http://tempuri.org/", "VrniNaroceneUporabnikeResult");
    private final static QName _VrniKategorijeResponseVrniKategorijeResult_QNAME = new QName("http://tempuri.org/", "VrniKategorijeResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fleamart.kategorija.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DodajNarocenoKategorijo }
     * 
     */
    public DodajNarocenoKategorijo createDodajNarocenoKategorijo() {
        return new DodajNarocenoKategorijo();
    }

    /**
     * Create an instance of {@link NarocenaKategorija }
     * 
     */
    public NarocenaKategorija createNarocenaKategorija() {
        return new NarocenaKategorija();
    }

    /**
     * Create an instance of {@link VrniNaroceneUporabnike }
     * 
     */
    public VrniNaroceneUporabnike createVrniNaroceneUporabnike() {
        return new VrniNaroceneUporabnike();
    }

    /**
     * Create an instance of {@link Kategorija }
     * 
     */
    public Kategorija createKategorija() {
        return new Kategorija();
    }

    /**
     * Create an instance of {@link DodajNarocenoKategorijoResponse }
     * 
     */
    public DodajNarocenoKategorijoResponse createDodajNarocenoKategorijoResponse() {
        return new DodajNarocenoKategorijoResponse();
    }

    /**
     * Create an instance of {@link VrniKategorijeResponse }
     * 
     */
    public VrniKategorijeResponse createVrniKategorijeResponse() {
        return new VrniKategorijeResponse();
    }

    /**
     * Create an instance of {@link ArrayOfKategorija }
     * 
     */
    public ArrayOfKategorija createArrayOfKategorija() {
        return new ArrayOfKategorija();
    }

    /**
     * Create an instance of {@link DodajKategorijo }
     * 
     */
    public DodajKategorijo createDodajKategorijo() {
        return new DodajKategorijo();
    }

    /**
     * Create an instance of {@link VrniKategorije }
     * 
     */
    public VrniKategorije createVrniKategorije() {
        return new VrniKategorije();
    }

    /**
     * Create an instance of {@link VrniNaroceneUporabnikeResponse }
     * 
     */
    public VrniNaroceneUporabnikeResponse createVrniNaroceneUporabnikeResponse() {
        return new VrniNaroceneUporabnikeResponse();
    }

    /**
     * Create an instance of {@link ArrayOfUporabnik }
     * 
     */
    public ArrayOfUporabnik createArrayOfUporabnik() {
        return new ArrayOfUporabnik();
    }

    /**
     * Create an instance of {@link DodajKategorijoResponse }
     * 
     */
    public DodajKategorijoResponse createDodajKategorijoResponse() {
        return new DodajKategorijoResponse();
    }

    /**
     * Create an instance of {@link VrniNaroceneKategorije }
     * 
     */
    public VrniNaroceneKategorije createVrniNaroceneKategorije() {
        return new VrniNaroceneKategorije();
    }

    /**
     * Create an instance of {@link Uporabnik }
     * 
     */
    public Uporabnik createUporabnik() {
        return new Uporabnik();
    }

    /**
     * Create an instance of {@link IzbrisiKategorijo }
     * 
     */
    public IzbrisiKategorijo createIzbrisiKategorijo() {
        return new IzbrisiKategorijo();
    }

    /**
     * Create an instance of {@link IzbrisiNarocenoKategorijoResponse }
     * 
     */
    public IzbrisiNarocenoKategorijoResponse createIzbrisiNarocenoKategorijoResponse() {
        return new IzbrisiNarocenoKategorijoResponse();
    }

    /**
     * Create an instance of {@link IzbrisiKategorijoResponse }
     * 
     */
    public IzbrisiKategorijoResponse createIzbrisiKategorijoResponse() {
        return new IzbrisiKategorijoResponse();
    }

    /**
     * Create an instance of {@link IzbrisiNarocenoKategorijo }
     * 
     */
    public IzbrisiNarocenoKategorijo createIzbrisiNarocenoKategorijo() {
        return new IzbrisiNarocenoKategorijo();
    }

    /**
     * Create an instance of {@link VrniNaroceneKategorijeResponse }
     * 
     */
    public VrniNaroceneKategorijeResponse createVrniNaroceneKategorijeResponse() {
        return new VrniNaroceneKategorijeResponse();
    }

    /**
     * Create an instance of {@link Naslov }
     * 
     */
    public Naslov createNaslov() {
        return new Naslov();
    }

    /**
     * Create an instance of {@link ArrayOfPrivatnoSporocilo }
     * 
     */
    public ArrayOfPrivatnoSporocilo createArrayOfPrivatnoSporocilo() {
        return new ArrayOfPrivatnoSporocilo();
    }

    /**
     * Create an instance of {@link SeznamZelja }
     * 
     */
    public SeznamZelja createSeznamZelja() {
        return new SeznamZelja();
    }

    /**
     * Create an instance of {@link PrivatnoSporocilo }
     * 
     */
    public PrivatnoSporocilo createPrivatnoSporocilo() {
        return new PrivatnoSporocilo();
    }

    /**
     * Create an instance of {@link ArrayOfSeznamZelja }
     * 
     */
    public ArrayOfSeznamZelja createArrayOfSeznamZelja() {
        return new ArrayOfSeznamZelja();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKategorija }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "ArrayOfKategorija")
    public JAXBElement<ArrayOfKategorija> createArrayOfKategorija(ArrayOfKategorija value) {
        return new JAXBElement<ArrayOfKategorija>(_ArrayOfKategorija_QNAME, ArrayOfKategorija.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUporabnik }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "ArrayOfUporabnik")
    public JAXBElement<ArrayOfUporabnik> createArrayOfUporabnik(ArrayOfUporabnik value) {
        return new JAXBElement<ArrayOfUporabnik>(_ArrayOfUporabnik_QNAME, ArrayOfUporabnik.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Kategorija }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "Kategorija")
    public JAXBElement<Kategorija> createKategorija(Kategorija value) {
        return new JAXBElement<Kategorija>(_Kategorija_QNAME, Kategorija.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeznamZelja }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Fleamart.Contracts.Data", name = "SeznamZelja")
    public JAXBElement<SeznamZelja> createSeznamZelja(SeznamZelja value) {
        return new JAXBElement<SeznamZelja>(_SeznamZelja_QNAME, SeznamZelja.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Naslov }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "Naslov")
    public JAXBElement<Naslov> createNaslov(Naslov value) {
        return new JAXBElement<Naslov>(_Naslov_QNAME, Naslov.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPrivatnoSporocilo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Fleamart.Contracts.Data", name = "ArrayOfPrivatnoSporocilo")
    public JAXBElement<ArrayOfPrivatnoSporocilo> createArrayOfPrivatnoSporocilo(ArrayOfPrivatnoSporocilo value) {
        return new JAXBElement<ArrayOfPrivatnoSporocilo>(_ArrayOfPrivatnoSporocilo_QNAME, ArrayOfPrivatnoSporocilo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NarocenaKategorija }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "NarocenaKategorija")
    public JAXBElement<NarocenaKategorija> createNarocenaKategorija(NarocenaKategorija value) {
        return new JAXBElement<NarocenaKategorija>(_NarocenaKategorija_QNAME, NarocenaKategorija.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Uporabnik }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "Uporabnik")
    public JAXBElement<Uporabnik> createUporabnik(Uporabnik value) {
        return new JAXBElement<Uporabnik>(_Uporabnik_QNAME, Uporabnik.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSeznamZelja }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Fleamart.Contracts.Data", name = "ArrayOfSeznamZelja")
    public JAXBElement<ArrayOfSeznamZelja> createArrayOfSeznamZelja(ArrayOfSeznamZelja value) {
        return new JAXBElement<ArrayOfSeznamZelja>(_ArrayOfSeznamZelja_QNAME, ArrayOfSeznamZelja.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrivatnoSporocilo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Fleamart.Contracts.Data", name = "PrivatnoSporocilo")
    public JAXBElement<PrivatnoSporocilo> createPrivatnoSporocilo(PrivatnoSporocilo value) {
        return new JAXBElement<PrivatnoSporocilo>(_PrivatnoSporocilo_QNAME, PrivatnoSporocilo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPrivatnoSporocilo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "PrivatnaSporocila", scope = Uporabnik.class)
    public JAXBElement<ArrayOfPrivatnoSporocilo> createUporabnikPrivatnaSporocila(ArrayOfPrivatnoSporocilo value) {
        return new JAXBElement<ArrayOfPrivatnoSporocilo>(_UporabnikPrivatnaSporocila_QNAME, ArrayOfPrivatnoSporocilo.class, Uporabnik.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "Ime", scope = Uporabnik.class)
    public JAXBElement<String> createUporabnikIme(String value) {
        return new JAXBElement<String>(_UporabnikIme_QNAME, String.class, Uporabnik.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "Email", scope = Uporabnik.class)
    public JAXBElement<String> createUporabnikEmail(String value) {
        return new JAXBElement<String>(_UporabnikEmail_QNAME, String.class, Uporabnik.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "Geslo", scope = Uporabnik.class)
    public JAXBElement<String> createUporabnikGeslo(String value) {
        return new JAXBElement<String>(_UporabnikGeslo_QNAME, String.class, Uporabnik.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "Telefon", scope = Uporabnik.class)
    public JAXBElement<String> createUporabnikTelefon(String value) {
        return new JAXBElement<String>(_UporabnikTelefon_QNAME, String.class, Uporabnik.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "Priimek", scope = Uporabnik.class)
    public JAXBElement<String> createUporabnikPriimek(String value) {
        return new JAXBElement<String>(_UporabnikPriimek_QNAME, String.class, Uporabnik.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Naslov }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "Naslov", scope = Uporabnik.class)
    public JAXBElement<Naslov> createUporabnikNaslov(Naslov value) {
        return new JAXBElement<Naslov>(_Naslov_QNAME, Naslov.class, Uporabnik.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "Upime", scope = Uporabnik.class)
    public JAXBElement<String> createUporabnikUpime(String value) {
        return new JAXBElement<String>(_UporabnikUpime_QNAME, String.class, Uporabnik.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSeznamZelja }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "SeznamZelja", scope = Uporabnik.class)
    public JAXBElement<ArrayOfSeznamZelja> createUporabnikSeznamZelja(ArrayOfSeznamZelja value) {
        return new JAXBElement<ArrayOfSeznamZelja>(_UporabnikSeznamZelja_QNAME, ArrayOfSeznamZelja.class, Uporabnik.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Uporabnik }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "u", scope = VrniNaroceneKategorije.class)
    public JAXBElement<Uporabnik> createVrniNaroceneKategorijeU(Uporabnik value) {
        return new JAXBElement<Uporabnik>(_VrniNaroceneKategorijeU_QNAME, Uporabnik.class, VrniNaroceneKategorije.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Uporabnik }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "u", scope = IzbrisiNarocenoKategorijo.class)
    public JAXBElement<Uporabnik> createIzbrisiNarocenoKategorijoU(Uporabnik value) {
        return new JAXBElement<Uporabnik>(_VrniNaroceneKategorijeU_QNAME, Uporabnik.class, IzbrisiNarocenoKategorijo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Kategorija }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "k", scope = IzbrisiNarocenoKategorijo.class)
    public JAXBElement<Kategorija> createIzbrisiNarocenoKategorijoK(Kategorija value) {
        return new JAXBElement<Kategorija>(_IzbrisiNarocenoKategorijoK_QNAME, Kategorija.class, IzbrisiNarocenoKategorijo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Kategorija }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "k", scope = VrniNaroceneUporabnike.class)
    public JAXBElement<Kategorija> createVrniNaroceneUporabnikeK(Kategorija value) {
        return new JAXBElement<Kategorija>(_IzbrisiNarocenoKategorijoK_QNAME, Kategorija.class, VrniNaroceneUporabnike.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "Drzava", scope = Naslov.class)
    public JAXBElement<String> createNaslovDrzava(String value) {
        return new JAXBElement<String>(_NaslovDrzava_QNAME, String.class, Naslov.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "Ulica", scope = Naslov.class)
    public JAXBElement<String> createNaslovUlica(String value) {
        return new JAXBElement<String>(_NaslovUlica_QNAME, String.class, Naslov.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "Obcina", scope = Naslov.class)
    public JAXBElement<String> createNaslovObcina(String value) {
        return new JAXBElement<String>(_NaslovObcina_QNAME, String.class, Naslov.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Kategorija }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "k", scope = DodajKategorijo.class)
    public JAXBElement<Kategorija> createDodajKategorijoK(Kategorija value) {
        return new JAXBElement<Kategorija>(_IzbrisiNarocenoKategorijoK_QNAME, Kategorija.class, DodajKategorijo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NarocenaKategorija }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "nk", scope = DodajNarocenoKategorijo.class)
    public JAXBElement<NarocenaKategorija> createDodajNarocenoKategorijoNk(NarocenaKategorija value) {
        return new JAXBElement<NarocenaKategorija>(_DodajNarocenoKategorijoNk_QNAME, NarocenaKategorija.class, DodajNarocenoKategorijo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "Naziv", scope = Kategorija.class)
    public JAXBElement<String> createKategorijaNaziv(String value) {
        return new JAXBElement<String>(_KategorijaNaziv_QNAME, String.class, Kategorija.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKategorija }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "VrniNaroceneKategorijeResult", scope = VrniNaroceneKategorijeResponse.class)
    public JAXBElement<ArrayOfKategorija> createVrniNaroceneKategorijeResponseVrniNaroceneKategorijeResult(ArrayOfKategorija value) {
        return new JAXBElement<ArrayOfKategorija>(_VrniNaroceneKategorijeResponseVrniNaroceneKategorijeResult_QNAME, ArrayOfKategorija.class, VrniNaroceneKategorijeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUporabnik }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "VrniNaroceneUporabnikeResult", scope = VrniNaroceneUporabnikeResponse.class)
    public JAXBElement<ArrayOfUporabnik> createVrniNaroceneUporabnikeResponseVrniNaroceneUporabnikeResult(ArrayOfUporabnik value) {
        return new JAXBElement<ArrayOfUporabnik>(_VrniNaroceneUporabnikeResponseVrniNaroceneUporabnikeResult_QNAME, ArrayOfUporabnik.class, VrniNaroceneUporabnikeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKategorija }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "VrniKategorijeResult", scope = VrniKategorijeResponse.class)
    public JAXBElement<ArrayOfKategorija> createVrniKategorijeResponseVrniKategorijeResult(ArrayOfKategorija value) {
        return new JAXBElement<ArrayOfKategorija>(_VrniKategorijeResponseVrniKategorijeResult_QNAME, ArrayOfKategorija.class, VrniKategorijeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Uporabnik }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "Uporabnik", scope = NarocenaKategorija.class)
    public JAXBElement<Uporabnik> createNarocenaKategorijaUporabnik(Uporabnik value) {
        return new JAXBElement<Uporabnik>(_Uporabnik_QNAME, Uporabnik.class, NarocenaKategorija.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Kategorija }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "Kategorija", scope = NarocenaKategorija.class)
    public JAXBElement<Kategorija> createNarocenaKategorijaKategorija(Kategorija value) {
        return new JAXBElement<Kategorija>(_Kategorija_QNAME, Kategorija.class, NarocenaKategorija.class, value);
    }

}
