


import aseds.webservices.NoSuchProductException_Exception;
import aseds.webservices.Product;
import aseds.webservices.ProductsManager;
import aseds.webservices.ProductsManagerImplService;

public class ClientProductsManager {

	public static void main(String[] args) throws NoSuchProductException_Exception {
		ProductsManagerImplService service = new ProductsManagerImplService();
		ProductsManager var1 = service.getProductsManagerImplPort();
		long id = 10;
		String label = "Ordinateur";
		double price = 180.0;
		Product produit = new Product();
		// kancreer un produit khawi w kan3mro bles setters
		produit.setId(id);
		produit.setLabel(label);
		produit.setPrice(price);
		var1.addProduct(produit);
		System.out.println(var1.getProduct(1).getLabel());
	}

}
