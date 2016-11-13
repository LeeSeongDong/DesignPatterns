package bank;

public abstract class Account
{
	private int balance;
	
	private WithdrawStrategy withdrawBehavior;
	private CalculateInterestStrategy calculateInterestBehavior;
	
	public Account(WithdrawStrategy ws, CalculateInterestStrategy cs)
	{
		balance = 0;
		withdrawBehavior = ws;
		calculateInterestBehavior = cs;
	}
	
	public void setBalance(int balance)
	{
		this.balance = balance;
	}
	
	public int getBalance()
	{
		return balance;
	}

	public void deposit(int money)
	{
		balance += money;
		System.out.println("Deposit Money : " + money + ", Balance : " + balance);
	}
	
	public void withdraw(int money)
	{
		withdrawBehavior.withdraw(this, money);
	}
	
	public void calculateInterest()
	{
		int interest = calculateInterestBehavior.calculateInterest(this);
		System.out.println("Interest : " + interest);
	}
}
