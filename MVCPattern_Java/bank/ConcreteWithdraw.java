package mvc.bank;

public class ConcreteWithdraw implements WithdrawStrategy
{
	public boolean withdraw(Account account, int money)
	{
		int balance = account.getBalance();
		if(balance < money)
		{
			return false;
		}
		else
		{
			balance -= money;
			account.setBalance(balance);
			account.getTransaction().add(new Transaction(-money, balance));
			return true;
		}
	}
}
