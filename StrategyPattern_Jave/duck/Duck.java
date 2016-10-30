package duck;

public abstract class Duck 
{
	private FlyStrategy flyBehavior;
	private QuackStrategy quackBehavior;
	
	public Duck(FlyStrategy fs, QuackStrategy qs)
	{
		flyBehavior = fs;
		quackBehavior = qs;
	}
	
	public void swim()
	{
		System.out.println("Swim!");
	}
	
	public void fly()
	{
		flyBehavior.fly();
	}
	
	public void quack()
	{
		quackBehavior.quack();
	}
	
	public abstract void display();
}
