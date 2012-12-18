
package com.fleamart.uporabnik.ws;

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
@WebServiceClient(name = "UporabnikService", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://localhost:1691/UporabnikService.svc?singleWsdl")
public class UporabnikService
    extends Service
{

    private final static URL UPORABNIKSERVICE_WSDL_LOCATION;
    private final static WebServiceException UPORABNIKSERVICE_EXCEPTION;
    private final static QName UPORABNIKSERVICE_QNAME = new QName("http://tempuri.org/", "UporabnikService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:1691/UporabnikService.svc?singleWsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        UPORABNIKSERVICE_WSDL_LOCATION = url;
        UPORABNIKSERVICE_EXCEPTION = e;
    }

    public UporabnikService() {
        super(__getWsdlLocation(), UPORABNIKSERVICE_QNAME);
    }

    public UporabnikService(WebServiceFeature... features) {
        super(__getWsdlLocation(), UPORABNIKSERVICE_QNAME, features);
    }

    public UporabnikService(URL wsdlLocation) {
        super(wsdlLocation, UPORABNIKSERVICE_QNAME);
    }

    public UporabnikService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, UPORABNIKSERVICE_QNAME, features);
    }

    public UporabnikService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UporabnikService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IUporabnikService
     */
    @WebEndpoint(name = "BasicHttpBinding_IUporabnikService")
    public IUporabnikService getBasicHttpBindingIUporabnikService() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IUporabnikService"), IUporabnikService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IUporabnikService
     */
    @WebEndpoint(name = "BasicHttpBinding_IUporabnikService")
    public IUporabnikService getBasicHttpBindingIUporabnikService(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IUporabnikService"), IUporabnikService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (UPORABNIKSERVICE_EXCEPTION!= null) {
            throw UPORABNIKSERVICE_EXCEPTION;
        }
        return UPORABNIKSERVICE_WSDL_LOCATION;
    }

}
