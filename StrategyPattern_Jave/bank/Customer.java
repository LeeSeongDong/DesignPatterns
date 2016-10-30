package bank;

public class Customer implements Observer, DisplayElement
{
	private BankData bankData;
	private String msg;
	
	public Customer(BankData bankData)
	{
		this.bankData = bankData;
		bankData.register(this);
	}
	
	public void update(String msg) 
	{
		this.msg = msg;
		display();
	}

	public void display() 
	{
		System.out.println("Message : " + msg);
	}
}
