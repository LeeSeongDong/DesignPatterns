package factoryMethod.bank_factorymethod;

public class BankB extends Bank
{
	public Account createAccount(String type)
	{
		Account acc = null;
		System.out.print("BankB : ");
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
