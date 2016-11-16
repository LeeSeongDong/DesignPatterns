package factoryMethod.pizza_simple;

public class PizzaFactory 
{
	public Pizza createPizza(String type)
	{
		Pizza pz = null;
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
