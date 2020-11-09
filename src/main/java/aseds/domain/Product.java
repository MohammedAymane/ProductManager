package aseds.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="product")
@XmlAccessorType(XmlAccessType.FIELD)

public class Product {
	private long id;
	private String label;
	private double price;
	
	public Product() {
		this.id=(long) 0;
		this.label="Product X";
		this.price=0;
	}
	public Product(long id,String label, double price) {

		this.id=id;
		this.label=label;
		this.price=price;
	}
	

	public long getId() {
		return this.id;
	}
	public String getLabel() {
		return this.label;
	}
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
