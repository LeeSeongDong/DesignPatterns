package singleton.threadsafe;
 
public class ChocolateBoiler 
{
	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler uniqueInstance;
  
	private ChocolateBoiler() 
	{
		empty = true;
		boiled = false;
	}
  
	public static synchronized ChocolateBoiler getInstance() 
	{
		if (uniqueInstance == null) 
		{
			System.out.println("Creating unique instance of Chocolate Boiler");
			uniqueInstance = new ChocolateBoiler();
		}
		System.out.println("Returning instance of Chocolate Boiler");
		return uniqueInstance;
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
