package factoryMethod.pizza_factorymethod;

public class PizzaTest {

	public static void main(String[] args) 
	{
		PizzaStore ps = new PizzaStoreA();
		ps.orderPizza("PizzaA");
		System.out.println();
		ps.orderPizza("PizzaB");
		System.out.println();
		ps.orderPizza("PizzaC");
		System.out.println();
		
		ps = new PizzaStoreB();
		ps.orderPizza("PizzaA");
		System.out.println();
		ps.orderPizza("PizzaB");
		System.out.println();
		ps.orderPizza("PizzaC");
		System.out.println();
		
		ps = new PizzaStoreC();
		ps.orderPizza("PizzaA");
		System.out.println();
		ps.orderPizza("PizzaB");
		System.out.println();
		ps.orderPizza("PizzaC");
	}

}
