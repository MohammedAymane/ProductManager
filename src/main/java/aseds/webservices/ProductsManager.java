package aseds.webservices;
import aseds.domain.Product;
import aseds.domain.Products;
import aseds.exceptions.*;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


@WebService
@SOAPBinding(style = Style.RPC)
public interface ProductsManager {
	@WebMethod
	@WebResult(name = "productId")
	public long addProduct(@WebParam(name = "product")Product product)  ;
	
	@WebMethod
	@WebResult(name = "product")
	public Product getProduct(@WebParam(name = "productId")long id) throws NoSuchProductException ;
	
	@WebMethod
	@WebResult(name = "price")
	public double getProductPrice(@WebParam(name = "productId")long id) throws NoSuchProductException ;
	
	@WebMethod
	@WebResult(name = "products")
	public Products getProducts() ;
	
	@WebMethod
	@WebResult(name = "product")
	public Product updateProduct(@WebParam(name = "product") Product product)throws NoSuchProductException ;
	
	@WebMethod
	public boolean deleteProduct(@WebParam(name = "productId")long id) throws NoSuchProductException ;
	
	@WebMethod
	public boolean deleteAllProducts();
	
	
	
}
