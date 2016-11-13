package decorator.airplane;

public class RearAttack extends AttackDecorator 
{
	public RearAttack(Airplane ap)
	{
		super(ap);
	}
	
	public String attack()
	{
		return super.attack() + ", 후방공격";
	}
}
