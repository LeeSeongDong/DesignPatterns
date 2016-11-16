package factoryMethod.bank_factorymethod;

public class BankTest 
{
	public static void main(String[] args)
	{
		Bank b = new BankA();
		b.makeAccount("Normal");
		b.makeAccount("Minus");
		b.makeAccount("Stock");
		System.out.println();
		
		b = new BankB();
		b.makeAccount("Normal");
		b.makeAccount("Minus");
		b.makeAccount("Stock");
		System.out.println();
		
		b = new BankC();
		b.makeAccount("Normal");
		b.makeAccount("Minus");
		

		
	}
}
