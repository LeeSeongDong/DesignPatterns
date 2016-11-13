package decorator.beverage_abstract;

public class Espresso extends Beverage
{
	public Espresso()
	{
		setBeverage("Espresso");
	}
	
	public double cost()
	{
		return 1.99;
	}
}
