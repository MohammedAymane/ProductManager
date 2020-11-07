package aseds.webservices;

import java.util.ArrayList;

import javax.jws.WebService;

import aseds.domain.Product;
import aseds.domain.Products;
import aseds.exceptions.NoSuchProductException;

@WebService(endpointInterface = "aseds.webservices.ProductsManager")

public class ProductsManagerImpl implements ProductsManager {
	private static  Products products = new Products(new ArrayList<Product>());

	@Override
	public long addProduct(Product product)  {
		long k = products.add(product);
		return k;
	}

	@Override
	public Product getProduct(long id) throws NoSuchProductException {
		Product pr = products.get(id);
		return pr;
	}

	@Override
	public double getProductPrice(long id) throws NoSuchProductException {
		double px = products.get(id).getPrice();
		return px;
	}

	@Override
	public Products getProducts() {
		
		return products;
	}

	@Override
	public Product updateProduct(Product product) throws NoSuchProductException{
		products.remove(product.getId());
		products.add(product);
		
		return product;
	}

	@Override
	public boolean deleteProduct(long id) throws NoSuchProductException {
		boolean isDeleted  = products.remove(id);
		return isDeleted;
	}

	@Override
	public boolean deleteAllProducts() {
		boolean isAllDeleted = products.removeAll();
		return isAllDeleted;
	}

	

}
