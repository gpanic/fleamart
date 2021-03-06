
package com.fleamart.oceni.ws;

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
@WebServiceClient(name = "OceneService", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://localhost:1691/OceneService.svc?wsdl")
public class OceneService
    extends Service
{

    private final static URL OCENESERVICE_WSDL_LOCATION;
    private final static WebServiceException OCENESERVICE_EXCEPTION;
    private final static QName OCENESERVICE_QNAME = new QName("http://tempuri.org/", "OceneService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:1691/OceneService.svc?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        OCENESERVICE_WSDL_LOCATION = url;
        OCENESERVICE_EXCEPTION = e;
    }

    public OceneService() {
        super(__getWsdlLocation(), OCENESERVICE_QNAME);
    }

    public OceneService(WebServiceFeature... features) {
        super(__getWsdlLocation(), OCENESERVICE_QNAME, features);
    }

    public OceneService(URL wsdlLocation) {
        super(wsdlLocation, OCENESERVICE_QNAME);
    }

    public OceneService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, OCENESERVICE_QNAME, features);
    }

    public OceneService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OceneService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IOcenaService
     */
    @WebEndpoint(name = "BasicHttpBinding_IOcenaService")
    public IOcenaService getBasicHttpBindingIOcenaService() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IOcenaService"), IOcenaService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IOcenaService
     */
    @WebEndpoint(name = "BasicHttpBinding_IOcenaService")
    public IOcenaService getBasicHttpBindingIOcenaService(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IOcenaService"), IOcenaService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (OCENESERVICE_EXCEPTION!= null) {
            throw OCENESERVICE_EXCEPTION;
        }
        return OCENESERVICE_WSDL_LOCATION;
    }

}
