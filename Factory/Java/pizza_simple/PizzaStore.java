package factoryMethod.pizza_simple;

public class PizzaStore 
{
	private PizzaFactory pf;
	
	public PizzaStore(PizzaFactory pf)
	{
		this.pf = pf;
	}
	
	public Pizza orderPizza(String type)
	{
		Pizza pz = pf.createPizza(type);
		pz.prepare();
		pz.bake();
		pz.cut();
		pz.box();
		return pz;
	}
}
