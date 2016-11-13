package mvc.calculator;

public interface IModel 
{
	public void registerObserver(IObserver o);
	public void removeObserver(IObserver o);
	public void notifyObserver();
	public void setValue(int value);
}
