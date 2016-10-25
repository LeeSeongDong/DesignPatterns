package duck;

public class RubberDuck extends Duck
{
	public RubberDuck()
	{
		super(new ConcreteFly2(), new ConcreteQuack2());
	}
	
	public void display()
	{
		System.out.println("I am Rubber Duck!");
	}
}