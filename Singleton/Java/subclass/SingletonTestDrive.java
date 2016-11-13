package singleton.subclass;

public class SingletonTestDrive
{
	public static void main(String[] args)
	{
		ChocolateBoiler foo = CoolerSingleton.getInstance();
		ChocolateBoiler bar = HotterSingleton.getInstance();
		System.out.println(foo);
		System.out.println(bar);
 	}
}
