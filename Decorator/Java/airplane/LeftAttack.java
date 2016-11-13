package decorator.airplane;

public class LeftAttack extends AttackDecorator
{
	public LeftAttack(Airplane ap)
	{
		super(ap);
	}
	
	public String attack()
	{
		return super.attack() + ", 좌측공격";
	}
}
