package Composite;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FolderComponent shop =  new FolderComponent(new ArrayList<Component>(), "quan ca phe");
		FolderComponent table1 =  new FolderComponent(new ArrayList<Component>(), "ban1");
		FolderComponent table2 =  new FolderComponent(new ArrayList<Component>(), "ban2");
		FolderComponent table3 =  new FolderComponent(new ArrayList<Component>(), "ban3");
		Leaf traSua = new Leaf("tra sua", 10000);
		Leaf traSua2 = new Leaf("tra sua", 15000);
		Leaf traSua3 = new Leaf("tra sua", 20000);
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
