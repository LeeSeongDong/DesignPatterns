package mvc.bank;

import java.util.ArrayList;

public interface IBankModel
{
	public void registerObserver(IObserver o);
	public void removeObserver(IObserver o);
	public void notifyObserver();
	public Account getAccount();
	public boolean withdraw(int money);
	public void deposit(int money);
	public ArrayList<Transaction> getTransaction();
}
