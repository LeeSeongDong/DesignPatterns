package bank;

import java.util.Date;

public class Main 
{
	public static void main(String[] args)
	{
		Account normalAccount = new NormalAccount();
		Account minusAccount = new MinusAccount(1000000);
		Account savingAccount = new SavingAccount(new Date(2012-1900, 1, 10), new Date(2016-1900, 2, 25));
		
		BankData bankData = new BankData();
		
		Customer customer = new Customer(bankData);
		
		normalAccount.deposit(100000);
		minusAccount.deposit(100000);
		savingAccount.deposit(100000);
		bankData.setMsg("Deposit!!");
		System.out.println();
		
		normalAccount.withdraw(120000);
		normalAccount.withdraw(50000);
		normalAccount.calculateInterest();
		bankData.setMsg("NormalAccount!!");
		System.out.println();

		minusAccount.withdraw(120000);
		minusAccount.withdraw(1000000);
		minusAccount.calculateInterest();
		bankData.setMsg("MinusAccount!!");
		System.out.println();

		savingAccount.withdraw(120000);
		savingAccount.withdraw(50000);
		savingAccount.calculateInterest();
		bankData.setMsg("SavingAccount!!");
		
	}
}
