package factoryMethod.bank_factorymethod;

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
