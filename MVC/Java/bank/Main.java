package mvc.bank;

public class Main 
{
	public static void main(String[] args)
	{
		IBankModel bankModel = new BankModel();
		IBankController bankController = new BankController(bankModel);
	}
}
