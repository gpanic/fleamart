
package com.fleamart.pm.ws;

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
@WebServiceClient(name = "PrivatnoSporociloService", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://localhost:1691/PrivatnoSporociloService.svc?singleWsdl")
public class PrivatnoSporociloService
    extends Service
{

    private final static URL PRIVATNOSPOROCILOSERVICE_WSDL_LOCATION;
    private final static WebServiceException PRIVATNOSPOROCILOSERVICE_EXCEPTION;
    private final static QName PRIVATNOSPOROCILOSERVICE_QNAME = new QName("http://tempuri.org/", "PrivatnoSporociloService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:1691/PrivatnoSporociloService.svc?singleWsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PRIVATNOSPOROCILOSERVICE_WSDL_LOCATION = url;
        PRIVATNOSPOROCILOSERVICE_EXCEPTION = e;
    }

    public PrivatnoSporociloService() {
        super(__getWsdlLocation(), PRIVATNOSPOROCILOSERVICE_QNAME);
    }

    public PrivatnoSporociloService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PRIVATNOSPOROCILOSERVICE_QNAME, features);
    }

    public PrivatnoSporociloService(URL wsdlLocation) {
        super(wsdlLocation, PRIVATNOSPOROCILOSERVICE_QNAME);
    }

    public PrivatnoSporociloService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PRIVATNOSPOROCILOSERVICE_QNAME, features);
    }

    public PrivatnoSporociloService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PrivatnoSporociloService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IPrivatnoSporociloService
     */
    @WebEndpoint(name = "BasicHttpBinding_IPrivatnoSporociloService")
    public IPrivatnoSporociloService getBasicHttpBindingIPrivatnoSporociloService() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IPrivatnoSporociloService"), IPrivatnoSporociloService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IPrivatnoSporociloService
     */
    @WebEndpoint(name = "BasicHttpBinding_IPrivatnoSporociloService")
    public IPrivatnoSporociloService getBasicHttpBindingIPrivatnoSporociloService(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IPrivatnoSporociloService"), IPrivatnoSporociloService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PRIVATNOSPOROCILOSERVICE_EXCEPTION!= null) {
            throw PRIVATNOSPOROCILOSERVICE_EXCEPTION;
        }
        return PRIVATNOSPOROCILOSERVICE_WSDL_LOCATION;
    }

}
