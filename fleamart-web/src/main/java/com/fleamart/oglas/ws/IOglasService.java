
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

}
