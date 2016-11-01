package mvc.calculator;

import java.util.ArrayList;

public class CalculatorModel implements IModel
{
	private int value;
	private ArrayList<IObserver> calculatorObservers;

	public CalculatorModel()
	{
		calculatorObservers = new ArrayList<IObserver>();
	}
	
	public void registerObserver(IObserver o) 
	{
		calculatorObservers.add(o);
	}

	public void removeObserver(IObserver o) 
	{
		calculatorObservers.remove(o);
	}

	public void notifyObserver() 
	{
		for(IObserver o : calculatorObservers)
		{
			o.update(value);
		}
	}
	
	public void setValue(int value)
	{
		this.value = value;
		notifyObserver();
	}
}
