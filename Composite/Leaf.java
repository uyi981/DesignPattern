package Composite;

public class Leaf  implements Component{

	String name;
	float price;
	
	public Leaf(String name, float price) {
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
