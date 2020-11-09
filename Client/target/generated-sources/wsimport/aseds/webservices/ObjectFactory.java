
package aseds.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the aseds.webservices package. 
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

    private final static QName _NoSuchProductException_QNAME = new QName("http://webservices.aseds/", "NoSuchProductException");
    private final static QName _Product_QNAME = new QName("http://webservices.aseds/", "product");
    private final static QName _Products_QNAME = new QName("http://webservices.aseds/", "products");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: aseds.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NoSuchProductException }
     * 
     */
    public NoSuchProductException createNoSuchProductException() {
        return new NoSuchProductException();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link Products }
     * 
     */
    public Products createProducts() {
        return new Products();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoSuchProductException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NoSuchProductException }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservices.aseds/", name = "NoSuchProductException")
    public JAXBElement<NoSuchProductException> createNoSuchProductException(NoSuchProductException value) {
        return new JAXBElement<NoSuchProductException>(_NoSuchProductException_QNAME, NoSuchProductException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Product }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservices.aseds/", name = "product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Products }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Products }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservices.aseds/", name = "products")
    public JAXBElement<Products> createProducts(Products value) {
        return new JAXBElement<Products>(_Products_QNAME, Products.class, null, value);
    }

}
