package mvc.bank;

import java.util.ArrayList;

public interface IBankController 
{
	public boolean withdraw(int money);
	public void deposit(int money);
	public ArrayList<Transaction> getTransaction();
}
