package duck;

public class NormalDuck extends Duck
{
	public NormalDuck()
	{
		super(new ConcreteFly1(), new ConcreteQuack1());
	}
	
	public void display()
	{
		System.out.println("I am Nomal Duck!");
	}
}
