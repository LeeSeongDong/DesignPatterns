package bank;

import java.util.Date;

public class SavingAccount extends Account
{
	private Date startDay;
	private Date endDay;
	
	public SavingAccount(Date startDay, Date endDay)
	{
		super(new ConcreteWithdraw3(), new ConcreteCalculateInterest3());
		this.startDay = startDay;
		this.endDay = endDay;
	}
	
	public Date getStartDay() 
	{
		return startDay;
	}

	public void setStartDay(Date startDay) 
	{
		this.startDay = startDay;
	}

	public Date getEndDay() 
	{
		return endDay;
	}

	public void setEndDay(Date endDay) 
	{
		this.endDay = endDay;
	}
}
