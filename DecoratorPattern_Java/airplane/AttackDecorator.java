package decorator.airplane;

public class AttackDecorator implements Airplane
{
	Airplane ap;
	
	public AttackDecorator(Airplane ap)
	{
		this.ap = ap;
	}
	
	public String attack()
	{
		return ap.attack();
	}
}
