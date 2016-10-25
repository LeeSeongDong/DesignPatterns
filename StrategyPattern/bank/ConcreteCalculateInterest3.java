package bank;

import java.util.Date;

public class ConcreteCalculateInterest3 implements CalculateInterestStrategy
{	
	public int calculateInterest(Account acc)
	{
		int balance = acc.getBalance();
		Date startDay = ((SavingAccount)acc).getStartDay();
		Date currDay = new Date();
		
		int y = (currDay.getYear()) - startDay.getYear();
		double n = 1 - Math.pow((double)5/(double)100, y);
		double d = 1 - (double)5/(double)100;
		int interest = (int)(balance * n / d);

		return interest;
	}
}
