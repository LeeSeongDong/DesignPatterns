package bank;

import java.util.Date;

public class ConcreteWithdraw3 implements WithdrawStrategy
{
	public void withdraw(Account acc, int money)
	{
		int balance = acc.getBalance();
		Date endDay = ((SavingAccount)acc).getEndDay();
		Date currDay = new Date();
		
		if(currDay.before(endDay))
		{
			System.out.println("Can't withdraw before Maturity date !");
		}
		else
		{
			if(balance >= money)
			{
				balance -= money;
				acc.setBalance(balance);
				System.out.println("Withdraw Money : " + money + ", Balance : " + balance);
			}
			else
			{
				System.out.println("Withdraw Money is more than balance!");
			}
		}
	}
}
