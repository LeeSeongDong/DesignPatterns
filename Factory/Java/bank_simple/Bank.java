package factoryMethod.bank_simple;

public class Bank 
{
	private AccountFactory af;
	
	public Bank(AccountFactory af)
	{
		this.af = af;
	}
	
	public Account makeAccount(String type)
	{
		Account acc = af.createAccount(type);
		acc.display();
		return acc;
	}
}
