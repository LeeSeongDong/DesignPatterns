package factoryMethod.pizza_factorymethod;

public class PizzaStoreA extends PizzaStore
{
	public Pizza createPizza(String type)
	{
		Pizza pz = null;
		System.out.println("PizzaStoreA : ");
		if(type.equals("PizzaA"))
		{
			pz = new PizzaA();
		}
		else if(type.equals("PizzaB"))
		{
			pz = new PizzaB();
		}
		else if(type.equals("PizzaC"))
		{
			pz = new PizzaC();
		}
		
		return pz;
	}
}
