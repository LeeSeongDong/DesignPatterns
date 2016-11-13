package decorator.beverage_interface;

public class Mocha extends CondimentDecorator
{
	public Mocha(Beverage beverage)
	{
		super(beverage);
	}
	
	public String getDescription()
	{
		return super.getDescription() + ", Mocha";
	}
	
	public double cost()
	{
		return super.cost() + .20;
	}
}
