package Composite;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoffeeShop shop =  new CoffeeShop(new ArrayList<Component>(), "quan ca phe");
		Table table1 =  new Table(new ArrayList<Component>(), "ban1");
		Table table2 =  new Table(new ArrayList<Component>(), "ban2");
		Table table3 =  new Table(new ArrayList<Component>(), "ban3");
		Product traSua = new Product("tra sua", 10000);
		Product traSua2 = new Product("tra sua", 15000);
		Product traSua3 = new Product("tra sua", 20000);
		shop.add(table1);
		shop.add(table2);
		shop.add(table3);
		table1.add(traSua3);
		table1.add(traSua);
		table2.add(traSua3);
		table3.add(traSua2);
		System.out.print("total: "+shop.getPrice());
	}

}
