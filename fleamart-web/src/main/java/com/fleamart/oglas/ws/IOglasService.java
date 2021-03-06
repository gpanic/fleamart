
package com.fleamart.oglas.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IOglasService", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IOglasService {


    /**
     * 
     * @param o
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "CreateOglas", action = "http://tempuri.org/IOglasService/CreateOglas")
    @WebResult(name = "CreateOglasResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CreateOglas", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.CreateOglas")
    @ResponseWrapper(localName = "CreateOglasResponse", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.CreateOglasResponse")
    public Boolean createOglas(
        @WebParam(name = "o", targetNamespace = "http://tempuri.org/")
        Oglas o);

    /**
     * 
     * @param id
     * @return
     *     returns com.fleamart.oglas.ws.Oglas
     */
    @WebMethod(operationName = "ReadOglas", action = "http://tempuri.org/IOglasService/ReadOglas")
    @WebResult(name = "ReadOglasResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ReadOglas", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.ReadOglas")
    @ResponseWrapper(localName = "ReadOglasResponse", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.ReadOglasResponse")
    public Oglas readOglas(
        @WebParam(name = "id", targetNamespace = "http://tempuri.org/")
        Integer id);

    /**
     * 
     * @param idAvtor
     * @return
     *     returns com.fleamart.oglas.ws.Oglas
     */
    @WebMethod(operationName = "ReadOglasLast", action = "http://tempuri.org/IOglasService/ReadOglasLast")
    @WebResult(name = "ReadOglasLastResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ReadOglasLast", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.ReadOglasLast")
    @ResponseWrapper(localName = "ReadOglasLastResponse", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.ReadOglasLastResponse")
    public Oglas readOglasLast(
        @WebParam(name = "idAvtor", targetNamespace = "http://tempuri.org/")
        Integer idAvtor);

    /**
     * 
     * @param o
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "UpdateOglas", action = "http://tempuri.org/IOglasService/UpdateOglas")
    @WebResult(name = "UpdateOglasResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "UpdateOglas", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.UpdateOglas")
    @ResponseWrapper(localName = "UpdateOglasResponse", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.UpdateOglasResponse")
    public Boolean updateOglas(
        @WebParam(name = "o", targetNamespace = "http://tempuri.org/")
        Oglas o);

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "DeleteOglas", action = "http://tempuri.org/IOglasService/DeleteOglas")
    @WebResult(name = "DeleteOglasResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "DeleteOglas", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.DeleteOglas")
    @ResponseWrapper(localName = "DeleteOglasResponse", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.DeleteOglasResponse")
    public Boolean deleteOglas(
        @WebParam(name = "id", targetNamespace = "http://tempuri.org/")
        Integer id);

    /**
     * 
     * @return
     *     returns com.fleamart.oglas.ws.ArrayOfOglas
     */
    @WebMethod(operationName = "GetOglasi", action = "http://tempuri.org/IOglasService/GetOglasi")
    @WebResult(name = "GetOglasiResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetOglasi", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.GetOglasi")
    @ResponseWrapper(localName = "GetOglasiResponse", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.GetOglasiResponse")
    public ArrayOfOglas getOglasi();

    /**
     * 
     * @param status
     * @param statusNakupa
     * @param idAvtor
     * @return
     *     returns com.fleamart.oglas.ws.ArrayOfOglas
     */
    @WebMethod(operationName = "ListOglasiAvtor", action = "http://tempuri.org/IOglasService/ListOglasiAvtor")
    @WebResult(name = "ListOglasiAvtorResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ListOglasiAvtor", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.ListOglasiAvtor")
    @ResponseWrapper(localName = "ListOglasiAvtorResponse", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.ListOglasiAvtorResponse")
    public ArrayOfOglas listOglasiAvtor(
        @WebParam(name = "idAvtor", targetNamespace = "http://tempuri.org/")
        Integer idAvtor,
        @WebParam(name = "status", targetNamespace = "http://tempuri.org/")
        Integer status,
        @WebParam(name = "statusNakupa", targetNamespace = "http://tempuri.org/")
        Integer statusNakupa);

    /**
     * 
     * @param idKupec
     * @param statusNakupa
     * @return
     *     returns com.fleamart.oglas.ws.ArrayOfOglas
     */
    @WebMethod(operationName = "ListOglasiKupec", action = "http://tempuri.org/IOglasService/ListOglasiKupec")
    @WebResult(name = "ListOglasiKupecResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ListOglasiKupec", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.ListOglasiKupec")
    @ResponseWrapper(localName = "ListOglasiKupecResponse", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.ListOglasiKupecResponse")
    public ArrayOfOglas listOglasiKupec(
        @WebParam(name = "idKupec", targetNamespace = "http://tempuri.org/")
        Integer idKupec,
        @WebParam(name = "statusNakupa", targetNamespace = "http://tempuri.org/")
        Integer statusNakupa);

    /**
     * 
     * @param status
     * @param statusNakupa
     * @return
     *     returns com.fleamart.oglas.ws.ArrayOfOglas
     */
    @WebMethod(operationName = "ListOglasiAdmin", action = "http://tempuri.org/IOglasService/ListOglasiAdmin")
    @WebResult(name = "ListOglasiAdminResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ListOglasiAdmin", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.ListOglasiAdmin")
    @ResponseWrapper(localName = "ListOglasiAdminResponse", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.ListOglasiAdminResponse")
    public ArrayOfOglas listOglasiAdmin(
        @WebParam(name = "status", targetNamespace = "http://tempuri.org/")
        Integer status,
        @WebParam(name = "statusNakupa", targetNamespace = "http://tempuri.org/")
        Integer statusNakupa);

    /**
     * 
     * @param param
     * @param kategorija
     * @return
     *     returns com.fleamart.oglas.ws.ArrayOfOglas
     */
    @WebMethod(operationName = "SearchOglasi", action = "http://tempuri.org/IOglasService/SearchOglasi")
    @WebResult(name = "SearchOglasiResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "SearchOglasi", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.SearchOglasi")
    @ResponseWrapper(localName = "SearchOglasiResponse", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.SearchOglasiResponse")
    public ArrayOfOglas searchOglasi(
        @WebParam(name = "kategorija", targetNamespace = "http://tempuri.org/")
        String kategorija,
        @WebParam(name = "param", targetNamespace = "http://tempuri.org/")
        String param);

    /**
     * 
     * @param u
     * @param s
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(action = "http://tempuri.org/IOglasService/dodajZeljo")
    @WebResult(name = "dodajZeljoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "dodajZeljo", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.DodajZeljo")
    @ResponseWrapper(localName = "dodajZeljoResponse", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.DodajZeljoResponse")
    public Boolean dodajZeljo(
        @WebParam(name = "s", targetNamespace = "http://tempuri.org/")
        Oglas s,
        @WebParam(name = "u", targetNamespace = "http://tempuri.org/")
        Uporabnik u);

    /**
     * 
     * @param idOglasa
     * @param idUporabnika
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(action = "http://tempuri.org/IOglasService/izbrisiZeljo")
    @WebResult(name = "izbrisiZeljoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "izbrisiZeljo", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.IzbrisiZeljo")
    @ResponseWrapper(localName = "izbrisiZeljoResponse", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.IzbrisiZeljoResponse")
    public Boolean izbrisiZeljo(
        @WebParam(name = "idOglasa", targetNamespace = "http://tempuri.org/")
        Integer idOglasa,
        @WebParam(name = "idUporabnika", targetNamespace = "http://tempuri.org/")
        Integer idUporabnika);

    /**
     * 
     * @param uporabnikId
     * @return
     *     returns com.fleamart.oglas.ws.ArrayOfOglas
     */
    @WebMethod(action = "http://tempuri.org/IOglasService/pridobiSeznamZelja")
    @WebResult(name = "pridobiSeznamZeljaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "pridobiSeznamZelja", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.PridobiSeznamZelja")
    @ResponseWrapper(localName = "pridobiSeznamZeljaResponse", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.PridobiSeznamZeljaResponse")
    public ArrayOfOglas pridobiSeznamZelja(
        @WebParam(name = "uporabnikId", targetNamespace = "http://tempuri.org/")
        Integer uporabnikId);

    /**
     * 
     * @param prodajalecId
     * @return
     *     returns com.fleamart.oglas.ws.ArrayOfOglas
     */
    @WebMethod(action = "http://tempuri.org/IOglasService/pridobiOglaseProdajalca")
    @WebResult(name = "pridobiOglaseProdajalcaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "pridobiOglaseProdajalca", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.PridobiOglaseProdajalca")
    @ResponseWrapper(localName = "pridobiOglaseProdajalcaResponse", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.PridobiOglaseProdajalcaResponse")
    public ArrayOfOglas pridobiOglaseProdajalca(
        @WebParam(name = "prodajalecId", targetNamespace = "http://tempuri.org/")
        Integer prodajalecId);

    /**
     * 
     * @param uporabnikId
     * @return
     *     returns java.lang.Double
     */
    @WebMethod(action = "http://tempuri.org/IOglasService/izracunajPovprecje")
    @WebResult(name = "izracunajPovprecjeResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "izracunajPovprecje", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.IzracunajPovprecje")
    @ResponseWrapper(localName = "izracunajPovprecjeResponse", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.IzracunajPovprecjeResponse")
    public Double izracunajPovprecje(
        @WebParam(name = "uporabnikId", targetNamespace = "http://tempuri.org/")
        Integer uporabnikId);

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "DeleteKomentar", action = "http://tempuri.org/IOglasService/DeleteKomentar")
    @WebResult(name = "DeleteKomentarResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "DeleteKomentar", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.DeleteKomentar")
    @ResponseWrapper(localName = "DeleteKomentarResponse", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.DeleteKomentarResponse")
    public Boolean deleteKomentar(
        @WebParam(name = "id", targetNamespace = "http://tempuri.org/")
        Integer id);

    /**
     * 
     * @param idOglasa
     * @return
     *     returns com.fleamart.oglas.ws.Oglas
     */
    @WebMethod(operationName = "OznaciKotKupljeno", action = "http://tempuri.org/IOglasService/OznaciKotKupljeno")
    @WebResult(name = "OznaciKotKupljenoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "OznaciKotKupljeno", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.OznaciKotKupljeno")
    @ResponseWrapper(localName = "OznaciKotKupljenoResponse", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.OznaciKotKupljenoResponse")
    public Oglas oznaciKotKupljeno(
        @WebParam(name = "idOglasa", targetNamespace = "http://tempuri.org/")
        Integer idOglasa);

    /**
     * 
     * @return
     *     returns com.fleamart.oglas.ws.ArrayOfOglas
     */
    @WebMethod(action = "http://tempuri.org/IOglasService/zadnjihPet")
    @WebResult(name = "zadnjihPetResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "zadnjihPet", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.ZadnjihPet")
    @ResponseWrapper(localName = "zadnjihPetResponse", targetNamespace = "http://tempuri.org/", className = "com.fleamart.oglas.ws.ZadnjihPetResponse")
    public ArrayOfOglas zadnjihPet();

}
