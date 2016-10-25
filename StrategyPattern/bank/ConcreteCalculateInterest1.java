package bank;

public class ConcreteCalculateInterest1 implements CalculateInterestStrategy
{
	public int calculateInterest(Account acc)
	{
		int interest = (acc.getBalance() * 103) / 100;
		return interest;
	}
}
