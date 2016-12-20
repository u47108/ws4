
package cl.clarochile.webservices.userpermission;

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
@WebServiceClient(name = "UserPermission", targetNamespace = "http://www.clarochile.cl/webservices/UserPermission/", wsdlLocation = "file:/home/luis/Descargas/v1/UserPermission.wsdl")
public class UserPermission_Service
    extends Service
{

    private final static URL USERPERMISSION_WSDL_LOCATION;
    private final static WebServiceException USERPERMISSION_EXCEPTION;
    private final static QName USERPERMISSION_QNAME = new QName("http://www.clarochile.cl/webservices/UserPermission/", "UserPermission");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/home/luis/Descargas/v1/UserPermission.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        USERPERMISSION_WSDL_LOCATION = url;
        USERPERMISSION_EXCEPTION = e;
    }

    public UserPermission_Service() {
        super(__getWsdlLocation(), USERPERMISSION_QNAME);
    }

    public UserPermission_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), USERPERMISSION_QNAME, features);
    }

    public UserPermission_Service(URL wsdlLocation) {
        super(wsdlLocation, USERPERMISSION_QNAME);
    }

    public UserPermission_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, USERPERMISSION_QNAME, features);
    }

    public UserPermission_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserPermission_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UserPermission
     */
    @WebEndpoint(name = "UserPermissionSOAP")
    public UserPermission getUserPermissionSOAP() {
        return super.getPort(new QName("http://www.clarochile.cl/webservices/UserPermission/", "UserPermissionSOAP"), UserPermission.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserPermission
     */
    @WebEndpoint(name = "UserPermissionSOAP")
    public UserPermission getUserPermissionSOAP(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.clarochile.cl/webservices/UserPermission/", "UserPermissionSOAP"), UserPermission.class, features);
    }

    private static URL __getWsdlLocation() {
        if (USERPERMISSION_EXCEPTION!= null) {
            throw USERPERMISSION_EXCEPTION;
        }
        return USERPERMISSION_WSDL_LOCATION;
    }

}
