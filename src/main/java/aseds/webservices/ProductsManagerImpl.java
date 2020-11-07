package aseds.webservices;

import java.util.ArrayList;

import javax.jws.WebService;

import aseds.domain.Product;
import aseds.domain.Products;
import aseds.exceptions.NoSuchProductException;

@WebService(endpointInterface = "aseds.webservices.ProductsManager")

public class ProductsManagerImpl implements ProductsManager {
	private static  Products products = new Products(new ArrayList<Product>());

	
	public long addProduct(Product product)  {
		long k = products.add(product);
		return k;
	}

	
	public Product getProduct(long id) throws NoSuchProductException {
	
		Product pr = products.get(id);
		if (pr !=null) {
			return pr;
		}
		else {
			throw new NoSuchProductException("No such product");
		}
		
	}

	
	public double getProductPrice(long id) throws NoSuchProductException {
		Product pr = products.get(id);
		if (pr !=null) {
			return pr.getPrice();
		}
		else {
			throw new NoSuchProductException("No such product");
		}
		
	}

	
	public Products getProducts() {
		
		return products;
	}

	
	public Product updateProduct(Product product) throws NoSuchProductException{
		products.remove(product.getId());
		products.add(product);
		
		return product;
	}

	
	public boolean deleteProduct(long id) throws NoSuchProductException {
		boolean isDeleted  = products.remove(id);
		return isDeleted;
	}

	
	public boolean deleteAllProducts() {
		boolean isAllDeleted = products.removeAll();
		return isAllDeleted;
	}

	

}
