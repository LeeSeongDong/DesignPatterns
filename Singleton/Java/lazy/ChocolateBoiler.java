package singleton.lazy;

public class ChocolateBoiler 
{
	private boolean empty;
	private boolean boiled;
	private static class SingletonHolder 
	{
		public static final ChocolateBoiler uniqueInstance = new ChocolateBoiler();
	}
  
	private ChocolateBoiler() 
	{
		empty = true;
		boiled = false;
	}
  
	public static ChocolateBoiler getInstance() 
	{
		System.out.println("Returning instance of Chocolate Boiler");
		return SingletonHolder.uniqueInstance;
	}

	public void fill() 
	{
		if (isEmpty()) 
		{
			empty = false;
			boiled = false;
			System.out.println("fill the boiler with a milk and chocolate mixture");
		}
		else
		{
			System.out.println("boiler is already full");
		}
	}
 
	public void drain() 
	{
		if (!isEmpty() && isBoiled()) 
		{
			System.out.println("drain the boiled milk and chocolate");
			empty = true;
		}
		else if(isEmpty())
		{
			System.out.println("boiler is empty");
		}
		else
		{
			System.out.println("milk and chocolate are not boiled");
		}
	}
 
	public void boil()
	{
		if (!isEmpty() && !isBoiled()) 
		{
			System.out.println("boil the milk and chocolate");
			boiled = true;
		}
		else if(isEmpty())
		{
			System.out.println("boiler is empty");
		}
		else
		{
			System.out.println("boiler is already boiled");
		}
	}
  
	public boolean isEmpty()
	{
		return empty;
	}
 
	public boolean isBoiled()
	{
		return boiled;
	}
}
