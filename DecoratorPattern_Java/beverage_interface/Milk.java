package decorator.beverage_interface;

public class Milk extends CondimentDecorator
{
	public Milk(Beverage beverage)
	{
		super(beverage);
	}
	
	public String getDescription()
	{
		return super.getDescription() + ", Milk";
	}
	
	public double cost()
	{
		return super.cost() + .10;
	}
}
