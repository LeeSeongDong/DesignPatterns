package decorator.beverage_interface;

public class CondimentDecorator implements Beverage
{
	private Beverage beverage;
	
	public CondimentDecorator(Beverage beverage)
	{
		this.beverage = beverage;
	}
	
	public String getDescription()
	{
		return beverage.getDescription();
	}
	
	public double cost()
	{
		return beverage.cost();
	}
}
