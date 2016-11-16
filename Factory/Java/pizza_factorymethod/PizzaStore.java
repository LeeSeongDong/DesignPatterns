package factoryMethod.pizza_factorymethod;

public abstract class PizzaStore 
{
	public abstract Pizza createPizza(String type); 
	public Pizza orderPizza(String type)
	{
		Pizza pz = createPizza(type);
		pz.prepare();
		pz.bake();
		pz.cut();
		pz.box();
		return pz;
	}
}