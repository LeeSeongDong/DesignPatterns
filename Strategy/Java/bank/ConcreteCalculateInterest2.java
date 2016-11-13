package bank;

public class ConcreteCalculateInterest2 implements CalculateInterestStrategy
{	
	public int calculateInterest(Account acc)
	{
		int balance = acc.getBalance();
		if(balance >= 0)
		{
			int interest = (balance * 103) / 100;
			return interest;
		}
		else
		{
			int interest = (balance * 107) / 100;
			return interest;
		}
	}
}
