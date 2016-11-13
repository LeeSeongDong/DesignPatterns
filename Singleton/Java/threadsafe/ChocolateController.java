package singleton.threadsafe;
 
public class ChocolateController
{
	public static void main(String args[]) 
	{
		for(int i = 0; i < 10; ++i)
		{
			Boiler b = new Boiler();
			b.start();
		}
	}
}

class Boiler extends Thread
{
	public void run()
	{
		ChocolateBoiler choco = ChocolateBoiler.getInstance();
	}
}