package mvc.bank;

import java.util.Date;

public class Transaction 
{
	private Date date;
	private int transactionMoney;
	private int balance;
	
	public Transaction(int money, int balance)
	{
		date = new Date();
		transactionMoney = money;
		this.balance = balance;
	}
	
	public Date getDate()
	{
		return date;
	}
	
	public int getTransactionMoney()
	{
		return transactionMoney;
	}
	
	public int getBalance()
	{
		return balance;
	}
}
