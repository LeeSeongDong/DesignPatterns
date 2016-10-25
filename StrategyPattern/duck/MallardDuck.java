package duck;

public class MallardDuck extends Duck
{
	public MallardDuck()
	{
		super(new ConcreteFly1(), new ConcreteQuack1());
	}
	
	public void display()
	{
		System.out.println("I am Mallard Duck!");
	}
}