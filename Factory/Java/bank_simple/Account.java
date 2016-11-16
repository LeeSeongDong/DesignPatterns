package factoryMethod.bank_simple;

public class Account 
{
	private String description;
	
	public Account(String description)
	{
		this.description = description;
	}
	
	public void display()
	{
		System.out.println(description);
	}
}
