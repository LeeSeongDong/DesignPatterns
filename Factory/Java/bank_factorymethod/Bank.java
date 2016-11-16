package factoryMethod.bank_factorymethod;

public abstract class Bank 
{
	public abstract Account createAccount(String type);
	
	public Account makeAccount(String type)
	{
		Account acc = createAccount(type);
		acc.display();
		return acc;
	}
}
