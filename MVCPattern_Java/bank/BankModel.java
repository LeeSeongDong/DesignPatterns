package mvc.bank;

import java.util.ArrayList;

public class BankModel implements IBankModel
{
	private Account account;
	private ArrayList<IObserver> bankObservers;
	
	public BankModel()
	{
		account = new Account(new ConcreteWithdraw());
		bankObservers = new ArrayList<IObserver>();
	}

	public void registerObserver(IObserver o) 
	{
		bankObservers.add(o);
	}

	public void removeObserver(IObserver o) 
	{
		bankObservers.remove(o);
	}

	public void notifyObserver() 
	{
		for(IObserver o : bankObservers)
		{
			o.update();
		}
	}
	
	public Account getAccount()
	{
		return account;
	}

	public boolean withdraw(int money) 
	{
		if(account.withdraw(money))
		{
			notifyObserver();
			return true;
		}
		else
		{
			return false;
		}
	}

	public void deposit(int money) 
	{
		account.deposit(money);
		notifyObserver();
	}

	public ArrayList<Transaction> getTransaction() 
	{
		return account.getTransaction();
	}
	
}
