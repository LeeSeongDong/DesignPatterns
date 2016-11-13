package decorator.airplane;

public class RightAttack extends AttackDecorator
{
	public RightAttack(Airplane ap)
	{
		super(ap);
	}
	
	public String attack()
	{
		return super.attack() + ", 우측공격";
	}
}
