package singleton.dcl2;

//
// Danger!  This implementation of Singleton not
// guaranteed to work prior to Java 5
//

public class Singleton 
{
	private volatile static Singleton uniqueInstance;
 
	private Singleton() {}
 
	public static Singleton getInstance() 
	{
		Singleton so = uniqueInstance;
		if (so == null)
		{
			synchronized (Singleton.class) 
			{
				if (so == null)
				{
					so = new Singleton();
					uniqueInstance = so;
				}
			}
		}
		return so;
	}
}
