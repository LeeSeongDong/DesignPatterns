package decorator.beverage_revised;

public abstract class CondimentDecorator extends Beverage
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
