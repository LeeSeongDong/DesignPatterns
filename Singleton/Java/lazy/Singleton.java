package singleton.lazy;

public class Singleton 
{
	private static class SingletonHolder 
	{
		public static final Singleton uniqueInstance = new Singleton();
	}
 
	private Singleton() {}
 
	public static Singleton getInstance() 
	{
		return SingletonHolder.uniqueInstance;
	}
}
