package decorator.beverage_abstract;

public abstract class Beverage 
{
	private String description;
	
	public Beverage()
	{
		description = "Unknown";
	}
	
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
