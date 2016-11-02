package decorator.beverage_interface;

public class Whip extends CondimentDecorator
{
	public Whip(Beverage beverage)
	{
		super(beverage);
	}
	
	public String getDescription()
	{
		return super.getDescription() + ", Whip";
	}
	
	public double cost()
	{
		return super.cost() + .10;
	}
}
