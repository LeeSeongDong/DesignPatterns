package factoryMethod.bank_simple;

public class BankTest
{
	public static void main(String[] args)
	{
		AccountFactory af = new AccountFactory();
		Bank bank = new Bank(af);
		bank.makeAccount("Normal");
		bank.makeAccount("Minus");
		bank.makeAccount("Stock");
	}
}
