
package com.fleamart.pm.ws;

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
 * generated in the com.fleamart.pm.ws package. 
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
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Komentar_QNAME = new QName("http//www.fleamart.com/", "Komentar");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _PrivatnoSporocilo_QNAME = new QName("http//www.fleamart.com/", "PrivatnoSporocilo");
    private final static QName _Kategorija_QNAME = new QName("http//www.fleamart.com/", "Kategorija");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Naslov_QNAME = new QName("http//www.fleamart.com/", "Naslov");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Ponudba_QNAME = new QName("http//www.fleamart.com/", "Ponudba");
    private final static QName _ArrayOfSeznamZelja_QNAME = new QName("http//www.fleamart.com/", "ArrayOfSeznamZelja");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ArrayOfPrivatnoSporocilo_QNAME = new QName("http//www.fleamart.com/", "ArrayOfPrivatnoSporocilo");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Uporabnik_QNAME = new QName("http//www.fleamart.com/", "Uporabnik");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _ArrayOfKomentar_QNAME = new QName("http//www.fleamart.com/", "ArrayOfKomentar");
    private final static QName _SeznamZelja_QNAME = new QName("http//www.fleamart.com/", "SeznamZelja");
    private final static QName _Oglas_QNAME = new QName("http//www.fleamart.com/", "Oglas");
    private final static QName _ArrayOfPonudba_QNAME = new QName("http//www.fleamart.com/", "ArrayOfPonudba");
    private final static QName _PrivatnoSporociloPosiljatelj_QNAME = new QName("http//www.fleamart.com/", "Posiljatelj");
    private final static QName _PrivatnoSporociloSporocilo_QNAME = new QName("http//www.fleamart.com/", "Sporocilo");
    private final static QName _PrivatnoSporociloPrejemnik_QNAME = new QName("http//www.fleamart.com/", "Prejemnik");
    private final static QName _NaslovDrzava_QNAME = new QName("http//www.fleamart.com/", "Drzava");
    private final static QName _NaslovUlica_QNAME = new QName("http//www.fleamart.com/", "Ulica");
    private final static QName _NaslovObcina_QNAME = new QName("http//www.fleamart.com/", "Obcina");
    private final static QName _KategorijaNaziv_QNAME = new QName("http//www.fleamart.com/", "Naziv");
    private final static QName _DodajNovoSporociloPs_QNAME = new QName("http://tempuri.org/", "ps");
    private final static QName _KomentarAvtor_QNAME = new QName("http//www.fleamart.com/", "Avtor");
    private final static QName _OglasKupec_QNAME = new QName("http//www.fleamart.com/", "Kupec");
    private final static QName _OglasCasSpremenjeno_QNAME = new QName("http//www.fleamart.com/", "CasSpremenjeno");
    private final static QName _OglasSlike_QNAME = new QName("http//www.fleamart.com/", "Slike");
    private final static QName _OglasKomentarji_QNAME = new QName("http//www.fleamart.com/", "Komentarji");
    private final static QName _OglasZadnjaCenaAvkcija_QNAME = new QName("http//www.fleamart.com/", "ZadnjaCenaAvkcija");
    private final static QName _OglasStatusNakupa_QNAME = new QName("http//www.fleamart.com/", "StatusNakupa");
    private final static QName _OglasPonudbe_QNAME = new QName("http//www.fleamart.com/", "Ponudbe");
    private final static QName _UporabnikPrivatnaSporocila_QNAME = new QName("http//www.fleamart.com/", "PrivatnaSporocila");
    private final static QName _UporabnikIme_QNAME = new QName("http//www.fleamart.com/", "Ime");
    private final static QName _UporabnikEmail_QNAME = new QName("http//www.fleamart.com/", "Email");
    private final static QName _UporabnikGeslo_QNAME = new QName("http//www.fleamart.com/", "Geslo");
    private final static QName _UporabnikTelefon_QNAME = new QName("http//www.fleamart.com/", "Telefon");
    private final static QName _UporabnikPriimek_QNAME = new QName("http//www.fleamart.com/", "Priimek");
    private final static QName _UporabnikUpime_QNAME = new QName("http//www.fleamart.com/", "Upime");
    private final static QName _VrniPrivatnaSporocilaUporabnikaResponseVrniPrivatnaSporocilaUporabnikaResult_QNAME = new QName("http://tempuri.org/", "VrniPrivatnaSporocilaUporabnikaResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fleamart.pm.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VrniPrivatnaSporocilaUporabnikaResponse }
     * 
     */
    public VrniPrivatnaSporocilaUporabnikaResponse createVrniPrivatnaSporocilaUporabnikaResponse() {
        return new VrniPrivatnaSporocilaUporabnikaResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPrivatnoSporocilo }
     * 
     */
    public ArrayOfPrivatnoSporocilo createArrayOfPrivatnoSporocilo() {
        return new ArrayOfPrivatnoSporocilo();
    }

    /**
     * Create an instance of {@link DodajNovoSporociloResponse }
     * 
     */
    public DodajNovoSporociloResponse createDodajNovoSporociloResponse() {
        return new DodajNovoSporociloResponse();
    }

    /**
     * Create an instance of {@link DodajNovoSporocilo }
     * 
     */
    public DodajNovoSporocilo createDodajNovoSporocilo() {
        return new DodajNovoSporocilo();
    }

    /**
     * Create an instance of {@link PrivatnoSporocilo }
     * 
     */
    public PrivatnoSporocilo createPrivatnoSporocilo() {
        return new PrivatnoSporocilo();
    }

    /**
     * Create an instance of {@link OznaciSporociloKotPrebranoResponse }
     * 
     */
    public OznaciSporociloKotPrebranoResponse createOznaciSporociloKotPrebranoResponse() {
        return new OznaciSporociloKotPrebranoResponse();
    }

    /**
     * Create an instance of {@link OznaciSporociloKotPrebrano }
     * 
     */
    public OznaciSporociloKotPrebrano createOznaciSporociloKotPrebrano() {
        return new OznaciSporociloKotPrebrano();
    }

    /**
     * Create an instance of {@link IzbrisiSporociloResponse }
     * 
     */
    public IzbrisiSporociloResponse createIzbrisiSporociloResponse() {
        return new IzbrisiSporociloResponse();
    }

    /**
     * Create an instance of {@link IzbrisiSporocilo }
     * 
     */
    public IzbrisiSporocilo createIzbrisiSporocilo() {
        return new IzbrisiSporocilo();
    }

    /**
     * Create an instance of {@link VrniPrivatnaSporocilaUporabnika }
     * 
     */
    public VrniPrivatnaSporocilaUporabnika createVrniPrivatnaSporocilaUporabnika() {
        return new VrniPrivatnaSporocilaUporabnika();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link Komentar }
     * 
     */
    public Komentar createKomentar() {
        return new Komentar();
    }

    /**
     * Create an instance of {@link Ponudba }
     * 
     */
    public Ponudba createPonudba() {
        return new Ponudba();
    }

    /**
     * Create an instance of {@link ArrayOfPonudba }
     * 
     */
    public ArrayOfPonudba createArrayOfPonudba() {
        return new ArrayOfPonudba();
    }

    /**
     * Create an instance of {@link Oglas }
     * 
     */
    public Oglas createOglas() {
        return new Oglas();
    }

    /**
     * Create an instance of {@link SeznamZelja }
     * 
     */
    public SeznamZelja createSeznamZelja() {
        return new SeznamZelja();
    }

    /**
     * Create an instance of {@link Naslov }
     * 
     */
    public Naslov createNaslov() {
        return new Naslov();
    }

    /**
     * Create an instance of {@link Uporabnik }
     * 
     */
    public Uporabnik createUporabnik() {
        return new Uporabnik();
    }

    /**
     * Create an instance of {@link ArrayOfKomentar }
     * 
     */
    public ArrayOfKomentar createArrayOfKomentar() {
        return new ArrayOfKomentar();
    }

    /**
     * Create an instance of {@link Kategorija }
     * 
     */
    public Kategorija createKategorija() {
        return new Kategorija();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Komentar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "Komentar")
    public JAXBElement<Komentar> createKomentar(Komentar value) {
        return new JAXBElement<Komentar>(_Komentar_QNAME, Komentar.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PrivatnoSporocilo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "PrivatnoSporocilo")
    public JAXBElement<PrivatnoSporocilo> createPrivatnoSporocilo(PrivatnoSporocilo value) {
        return new JAXBElement<PrivatnoSporocilo>(_PrivatnoSporocilo_QNAME, PrivatnoSporocilo.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Ponudba }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "Ponudba")
    public JAXBElement<Ponudba> createPonudba(Ponudba value) {
        return new JAXBElement<Ponudba>(_Ponudba_QNAME, Ponudba.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSeznamZelja }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "ArrayOfSeznamZelja")
    public JAXBElement<ArrayOfSeznamZelja> createArrayOfSeznamZelja(ArrayOfSeznamZelja value) {
        return new JAXBElement<ArrayOfSeznamZelja>(_ArrayOfSeznamZelja_QNAME, ArrayOfSeznamZelja.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPrivatnoSporocilo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "ArrayOfPrivatnoSporocilo")
    public JAXBElement<ArrayOfPrivatnoSporocilo> createArrayOfPrivatnoSporocilo(ArrayOfPrivatnoSporocilo value) {
        return new JAXBElement<ArrayOfPrivatnoSporocilo>(_ArrayOfPrivatnoSporocilo_QNAME, ArrayOfPrivatnoSporocilo.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfstring")
    public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKomentar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "ArrayOfKomentar")
    public JAXBElement<ArrayOfKomentar> createArrayOfKomentar(ArrayOfKomentar value) {
        return new JAXBElement<ArrayOfKomentar>(_ArrayOfKomentar_QNAME, ArrayOfKomentar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeznamZelja }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "SeznamZelja")
    public JAXBElement<SeznamZelja> createSeznamZelja(SeznamZelja value) {
        return new JAXBElement<SeznamZelja>(_SeznamZelja_QNAME, SeznamZelja.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Oglas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "Oglas")
    public JAXBElement<Oglas> createOglas(Oglas value) {
        return new JAXBElement<Oglas>(_Oglas_QNAME, Oglas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPonudba }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "ArrayOfPonudba")
    public JAXBElement<ArrayOfPonudba> createArrayOfPonudba(ArrayOfPonudba value) {
        return new JAXBElement<ArrayOfPonudba>(_ArrayOfPonudba_QNAME, ArrayOfPonudba.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Uporabnik }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "Posiljatelj", scope = PrivatnoSporocilo.class)
    public JAXBElement<Uporabnik> createPrivatnoSporociloPosiljatelj(Uporabnik value) {
        return new JAXBElement<Uporabnik>(_PrivatnoSporociloPosiljatelj_QNAME, Uporabnik.class, PrivatnoSporocilo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "Sporocilo", scope = PrivatnoSporocilo.class)
    public JAXBElement<String> createPrivatnoSporociloSporocilo(String value) {
        return new JAXBElement<String>(_PrivatnoSporociloSporocilo_QNAME, String.class, PrivatnoSporocilo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Uporabnik }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "Prejemnik", scope = PrivatnoSporocilo.class)
    public JAXBElement<Uporabnik> createPrivatnoSporociloPrejemnik(Uporabnik value) {
        return new JAXBElement<Uporabnik>(_PrivatnoSporociloPrejemnik_QNAME, Uporabnik.class, PrivatnoSporocilo.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Uporabnik }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "Uporabnik", scope = SeznamZelja.class)
    public JAXBElement<Uporabnik> createSeznamZeljaUporabnik(Uporabnik value) {
        return new JAXBElement<Uporabnik>(_Uporabnik_QNAME, Uporabnik.class, SeznamZelja.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Oglas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "Oglas", scope = SeznamZelja.class)
    public JAXBElement<Oglas> createSeznamZeljaOglas(Oglas value) {
        return new JAXBElement<Oglas>(_Oglas_QNAME, Oglas.class, SeznamZelja.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PrivatnoSporocilo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ps", scope = DodajNovoSporocilo.class)
    public JAXBElement<PrivatnoSporocilo> createDodajNovoSporociloPs(PrivatnoSporocilo value) {
        return new JAXBElement<PrivatnoSporocilo>(_DodajNovoSporociloPs_QNAME, PrivatnoSporocilo.class, DodajNovoSporocilo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "Sporocilo", scope = Komentar.class)
    public JAXBElement<String> createKomentarSporocilo(String value) {
        return new JAXBElement<String>(_PrivatnoSporociloSporocilo_QNAME, String.class, Komentar.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Uporabnik }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "Avtor", scope = Komentar.class)
    public JAXBElement<Uporabnik> createKomentarAvtor(Uporabnik value) {
        return new JAXBElement<Uporabnik>(_KomentarAvtor_QNAME, Uporabnik.class, Komentar.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Uporabnik }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "Kupec", scope = Oglas.class)
    public JAXBElement<Uporabnik> createOglasKupec(Uporabnik value) {
        return new JAXBElement<Uporabnik>(_OglasKupec_QNAME, Uporabnik.class, Oglas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "CasSpremenjeno", scope = Oglas.class)
    public JAXBElement<XMLGregorianCalendar> createOglasCasSpremenjeno(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OglasCasSpremenjeno_QNAME, XMLGregorianCalendar.class, Oglas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "Slike", scope = Oglas.class)
    public JAXBElement<ArrayOfstring> createOglasSlike(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_OglasSlike_QNAME, ArrayOfstring.class, Oglas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKomentar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "Komentarji", scope = Oglas.class)
    public JAXBElement<ArrayOfKomentar> createOglasKomentarji(ArrayOfKomentar value) {
        return new JAXBElement<ArrayOfKomentar>(_OglasKomentarji_QNAME, ArrayOfKomentar.class, Oglas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Kategorija }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "Kategorija", scope = Oglas.class)
    public JAXBElement<Kategorija> createOglasKategorija(Kategorija value) {
        return new JAXBElement<Kategorija>(_Kategorija_QNAME, Kategorija.class, Oglas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "ZadnjaCenaAvkcija", scope = Oglas.class)
    public JAXBElement<Double> createOglasZadnjaCenaAvkcija(Double value) {
        return new JAXBElement<Double>(_OglasZadnjaCenaAvkcija_QNAME, Double.class, Oglas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "StatusNakupa", scope = Oglas.class)
    public JAXBElement<Integer> createOglasStatusNakupa(Integer value) {
        return new JAXBElement<Integer>(_OglasStatusNakupa_QNAME, Integer.class, Oglas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPonudba }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "Ponudbe", scope = Oglas.class)
    public JAXBElement<ArrayOfPonudba> createOglasPonudbe(ArrayOfPonudba value) {
        return new JAXBElement<ArrayOfPonudba>(_OglasPonudbe_QNAME, ArrayOfPonudba.class, Oglas.class, value);
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
        return new JAXBElement<ArrayOfSeznamZelja>(_SeznamZelja_QNAME, ArrayOfSeznamZelja.class, Uporabnik.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Uporabnik }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "Uporabnik", scope = Ponudba.class)
    public JAXBElement<Uporabnik> createPonudbaUporabnik(Uporabnik value) {
        return new JAXBElement<Uporabnik>(_Uporabnik_QNAME, Uporabnik.class, Ponudba.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Oglas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http//www.fleamart.com/", name = "Oglas", scope = Ponudba.class)
    public JAXBElement<Oglas> createPonudbaOglas(Oglas value) {
        return new JAXBElement<Oglas>(_Oglas_QNAME, Oglas.class, Ponudba.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPrivatnoSporocilo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "VrniPrivatnaSporocilaUporabnikaResult", scope = VrniPrivatnaSporocilaUporabnikaResponse.class)
    public JAXBElement<ArrayOfPrivatnoSporocilo> createVrniPrivatnaSporocilaUporabnikaResponseVrniPrivatnaSporocilaUporabnikaResult(ArrayOfPrivatnoSporocilo value) {
        return new JAXBElement<ArrayOfPrivatnoSporocilo>(_VrniPrivatnaSporocilaUporabnikaResponseVrniPrivatnaSporocilaUporabnikaResult_QNAME, ArrayOfPrivatnoSporocilo.class, VrniPrivatnaSporocilaUporabnikaResponse.class, value);
    }

}
