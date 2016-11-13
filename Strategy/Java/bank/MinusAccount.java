package bank;

public class MinusAccount extends Account
{
	private int bound;
	
	public MinusAccount(int bound)
	{
		super(new ConcreteWithdraw2(), new ConcreteCalculateInterest2());
		this.bound = bound;
	}
	
	public void setBound(int bound)
	{
		this.bound = bound;
	}
	
	public int getBound()
	{
		return bound;
	}
}
