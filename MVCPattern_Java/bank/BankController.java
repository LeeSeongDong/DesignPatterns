package mvc.bank;

import java.util.ArrayList;

public class BankController implements IBankController
{
	private IBankModel bankModel;
	private BankView bankView;
	
	public BankController(IBankModel bankModel)
	{
		this.bankModel = bankModel;
		bankView = new BankView(this, bankModel);
	}

	public boolean withdraw(int money) 
	{
		return bankModel.withdraw(money);
	}

	public void deposit(int money)
	{
		bankModel.deposit(money);
	}

	public ArrayList<Transaction> getTransaction()
	{
		return bankModel.getTransaction();
	}

}
