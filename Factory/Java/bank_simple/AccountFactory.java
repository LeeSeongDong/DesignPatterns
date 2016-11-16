package factoryMethod.bank_simple;

public class AccountFactory 
{
	public Account createAccount(String type)
	{
		Account acc = null;
		if(type.equals("Normal"))
		{
			acc = new NormalAccount();
		}
		else if(type.equals("Minus"))
		{
			acc = new MinusAccount();
		}
		else if(type.equals("Stock"))
		{
			acc = new StockAccount();
		}
		
		return acc;
	}
}
