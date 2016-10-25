package bank;

public class ConcreteWithdraw1 implements WithdrawStrategy
{
	public void withdraw(Account acc, int money)
	{
		int balance = acc.getBalance();
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
