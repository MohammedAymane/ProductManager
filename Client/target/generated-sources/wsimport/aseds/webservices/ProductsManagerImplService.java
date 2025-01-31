
package aseds.webservices;

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
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ProductsManagerImplService", targetNamespace = "http://webservices.aseds/", wsdlLocation = "http://localhost:3000/webservices/ProductsManager?wsdl")
public class ProductsManagerImplService
    extends Service
{

    private final static URL PRODUCTSMANAGERIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException PRODUCTSMANAGERIMPLSERVICE_EXCEPTION;
    private final static QName PRODUCTSMANAGERIMPLSERVICE_QNAME = new QName("http://webservices.aseds/", "ProductsManagerImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:3000/webservices/ProductsManager?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PRODUCTSMANAGERIMPLSERVICE_WSDL_LOCATION = url;
        PRODUCTSMANAGERIMPLSERVICE_EXCEPTION = e;
    }

    public ProductsManagerImplService() {
        super(__getWsdlLocation(), PRODUCTSMANAGERIMPLSERVICE_QNAME);
    }

    public ProductsManagerImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PRODUCTSMANAGERIMPLSERVICE_QNAME, features);
    }

    public ProductsManagerImplService(URL wsdlLocation) {
        super(wsdlLocation, PRODUCTSMANAGERIMPLSERVICE_QNAME);
    }

    public ProductsManagerImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PRODUCTSMANAGERIMPLSERVICE_QNAME, features);
    }

    public ProductsManagerImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProductsManagerImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ProductsManager
     */
    @WebEndpoint(name = "ProductsManagerImplPort")
    public ProductsManager getProductsManagerImplPort() {
        return super.getPort(new QName("http://webservices.aseds/", "ProductsManagerImplPort"), ProductsManager.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProductsManager
     */
    @WebEndpoint(name = "ProductsManagerImplPort")
    public ProductsManager getProductsManagerImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices.aseds/", "ProductsManagerImplPort"), ProductsManager.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PRODUCTSMANAGERIMPLSERVICE_EXCEPTION!= null) {
            throw PRODUCTSMANAGERIMPLSERVICE_EXCEPTION;
        }
        return PRODUCTSMANAGERIMPLSERVICE_WSDL_LOCATION;
    }

}
