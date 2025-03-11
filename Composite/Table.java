package Composite;

import java.util.List;


public class Table implements Component{
	
	List<Component> components;
	String name;
	public void add(Component component)
	{
		components.add(component);
	}
	public void remove(Component component)
	{
		components.remove(component);
	}
	@Override
	public float getPrice() {
		float result =0;
		for(Component component : components)
		{
			result+=component.getPrice();
		}
		// TODO Auto-generated method stub
		return result;
	}
	public Table(List<Component> components,String name) {
		super();
		this.components = components;
		this.name = name;
	}
	
}
