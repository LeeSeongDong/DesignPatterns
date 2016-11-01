package mvc.bank;

public interface WithdrawStrategy 
{
	public boolean withdraw(Account account, int money);
}
