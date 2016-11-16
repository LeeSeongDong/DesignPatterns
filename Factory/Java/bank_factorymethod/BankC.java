package factoryMethod.bank_factorymethod;

public class BankC extends Bank
{
	public Account createAccount(String type)
	{
		Account acc = null;
		System.out.print("BankC : ");
		if(type.equals("Normal"))
		{
			acc = new NormalAccount();
		}
		else if(type.equals("Minus"))
		{
			acc = new MinusAccount();
		}
		
		return acc;
	}
}
