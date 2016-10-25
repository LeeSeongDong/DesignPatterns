package bank;

public class ConcreteWithdraw2 implements WithdrawStrategy
{
	public void withdraw(Account acc, int money)
	{
		int balance = acc.getBalance();
		int bound = ((MinusAccount)acc).getBound();
		
		if(balance + bound >= money)
		{
			balance -= money;
			acc.setBalance(balance);
			System.out.println("Withdraw Money : " + money + ", Balance : " + balance);
		}
		else
		{
			System.out.println("Exceeding of Limit!");
		}

	}
}
