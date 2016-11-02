package decorator.beverage_interface;

public class StarbuzzCoffe 
{
	public static void main(String[] args)
	{
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		beverage = new Milk(beverage);
		beverage = new Mocha(beverage);
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		beverage = new Whip(beverage);
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
	}
}
