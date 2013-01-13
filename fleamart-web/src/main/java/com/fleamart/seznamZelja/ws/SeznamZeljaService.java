
package com.fleamart.seznamZelja.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SeznamZeljaService", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://localhost:1691/SeznamZeljaService.svc?WSDL")
public class SeznamZeljaService
    extends Service
{

    private final static URL SEZNAMZELJASERVICE_WSDL_LOCATION;
    private final static WebServiceException SEZNAMZELJASERVICE_EXCEPTION;
    private final static QName SEZNAMZELJASERVICE_QNAME = new QName("http://tempuri.org/", "SeznamZeljaService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:1691/SeznamZeljaService.svc?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SEZNAMZELJASERVICE_WSDL_LOCATION = url;
        SEZNAMZELJASERVICE_EXCEPTION = e;
    }

    public SeznamZeljaService() {
        super(__getWsdlLocation(), SEZNAMZELJASERVICE_QNAME);
    }

    public SeznamZeljaService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SEZNAMZELJASERVICE_QNAME, features);
    }

    public SeznamZeljaService(URL wsdlLocation) {
        super(wsdlLocation, SEZNAMZELJASERVICE_QNAME);
    }

    public SeznamZeljaService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SEZNAMZELJASERVICE_QNAME, features);
    }

    public SeznamZeljaService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SeznamZeljaService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ISeznamZeljaService
     */
    @WebEndpoint(name = "BasicHttpBinding_ISeznamZeljaService")
    public ISeznamZeljaService getBasicHttpBindingISeznamZeljaService() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_ISeznamZeljaService"), ISeznamZeljaService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ISeznamZeljaService
     */
    @WebEndpoint(name = "BasicHttpBinding_ISeznamZeljaService")
    public ISeznamZeljaService getBasicHttpBindingISeznamZeljaService(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_ISeznamZeljaService"), ISeznamZeljaService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SEZNAMZELJASERVICE_EXCEPTION!= null) {
            throw SEZNAMZELJASERVICE_EXCEPTION;
        }
        return SEZNAMZELJASERVICE_WSDL_LOCATION;
    }

}
