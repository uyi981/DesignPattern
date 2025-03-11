package Composite;

public class Product  implements Component{

	String name;
	float price;
	
	public Product(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

}
