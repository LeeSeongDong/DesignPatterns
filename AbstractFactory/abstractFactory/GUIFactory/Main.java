package abstractFactory.GUIFactory;

public class Main 
{
	public static String randomAppearance()
	{
		String[] appearanceArr = new String[3];
		appearanceArr[0] = "osx";
		appearanceArr[1] = "windows";
		appearanceArr[2] = "err";
		java.util.Random rand = new java.util.Random();
		int randNum = rand.nextInt(2);
		return appearanceArr[randNum];
	}
	
	public static void main(String[] args) 
	{
		GUIFactory f = null;
		String apperance = randomAppearance();
		if(apperance.equals("osx"))
		{
			f = new OSXFactory();
		}
		else if(apperance.equals("windows"))
		{
			f = new WinFactory();
		}
		Button b = f.createButton();
		b.paint();
	}
}

