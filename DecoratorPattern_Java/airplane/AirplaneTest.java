package decorator.airplane;

public class AirplaneTest
{
	public static void main(String[] args)
	{
		Airplane ap = new ConcreteAirplane();
		
		ap = new LeftAttack(ap);
		ap = new RightAttack(ap);
		System.out.println(ap.attack());
	}
}
