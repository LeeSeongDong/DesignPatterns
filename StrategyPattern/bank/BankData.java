package bank;

import java.util.ArrayList;

public class BankData implements Subject
{
	private ArrayList<Observer> observers;
	private String msg;
	
	public BankData()
	{
		observers = new ArrayList<Observer>();
	}
	
	public void register(Observer o)
	{
		observers.add(o);
	}

	public void remove(Observer o) 
	{
		observers.remove(o);
	}

	public void notifyObserver() 
	{
		for (Observer o : observers)
		{
			o.update(msg);
		}
	}
	
	public void setMsg(String msg)
	{
		this.msg = msg;
		msgChanged();
	}
	
	public void msgChanged()
	{
		notifyObserver();
	}
}
