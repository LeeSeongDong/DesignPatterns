package decorator.beverage_revised;

public abstract class Beverage 
{
	public String description;
	
	public void setBeverage(String description)
	{
		this.description = description;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public abstract double cost();
}
