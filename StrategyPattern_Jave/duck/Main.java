package duck;

public class Main 
{
	public static void main(String[] args)
	{
		Duck nomalDuck = new NormalDuck();
		Duck mallardDuck = new MallardDuck();
		Duck rubberDuck = new RubberDuck();
		
		nomalDuck.display();
		nomalDuck.fly();
		nomalDuck.swim();
		nomalDuck.quack();
		System.out.println();
		
		mallardDuck.display();
		mallardDuck.fly();
		mallardDuck.swim();
		mallardDuck.quack();
		System.out.println();
		
		rubberDuck.display();
		rubberDuck.fly();
		rubberDuck.swim();
		rubberDuck.quack();
	}
}
