package decorator.beverage_revised;

public class HouseBlend extends Beverage 
{
	public HouseBlend()
	{
		setBeverage("HouseBlend");
	}
	
	public double cost()
	{
		return 0.89;
	}
}
