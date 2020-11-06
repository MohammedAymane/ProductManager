package aseds.domain;


import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="products")
@XmlAccessorType(XmlAccessType.FIELD)




public class Products {
	@XmlElement(name = "products")
	private List<Product> products;
	// had lconstructeur fchek
	public Products() {
		this.products = new ArrayList<Product>();
	}
	// hada tahowa hhhhhhh
	public Products(List<Product> products) {
		this.products = products;
	}
	
	public Product get(long id) {
		for (Product product : products) {
			if(id == product.getId()) {
				return product;
			}
		}
		return null;
	}

	public boolean remove(long id) {
		for (Product product : products) {
			if(id == product.getId()) {
				products.remove(product);
				return true;
			}
		}
		return false;
		
	}
	public boolean removeAll() {
		products.clear();
		return true;
	}
}
