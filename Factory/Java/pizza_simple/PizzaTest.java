package factoryMethod.pizza_simple;

public class PizzaTest 
{
	public static void main(String[] args)
	{
		PizzaFactory pf = new PizzaFactory();
		PizzaStore ps = new PizzaStore(pf);
		
		ps.orderPizza("PizzaA");
		System.out.println();
		
		ps.orderPizza("PizzaB");
		System.out.println();
		
		ps.orderPizza("PizzaC");
	}
}
