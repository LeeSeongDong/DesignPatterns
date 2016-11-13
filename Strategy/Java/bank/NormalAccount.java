package bank;

public class NormalAccount extends Account
{
	public NormalAccount()
	{
		super(new ConcreteWithdraw1(), new ConcreteCalculateInterest1());
	}
}
