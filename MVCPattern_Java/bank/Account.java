package mvc.bank;

import java.util.ArrayList;

public class Account 
{
	private int balance;
	private ArrayList<Transaction> transactions;
	private WithdrawStrategy withdrawBehavior;
	
	public Account(WithdrawStrategy ws)
	{
		transactions = new ArrayList<Transaction>();
		withdrawBehavior = ws;
	}
	
	public void setBalance(int balance) 
	{
		this.balance = balance;
	}
	
	public int getBalance() 
	{
		return balance;
	}

	public boolean withdraw(int money)
	{
		return withdrawBehavior.withdraw(this, money);
	}
	
	public void deposit(int money)
	{
		balance += money;
		transactions.add(new Transaction(money, balance));
	}
	
	public ArrayList<Transaction> getTransaction()
	{
		return transactions;
	}
}
