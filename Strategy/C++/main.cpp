#include "NormalAccount.h"
#include "MinusAccount.h"
#include "SavingAccount.h"
#include "Customer.h"

int main()
{
	Date startDay;
	startDay.year = 2012;
	startDay.month = 1;
	startDay.date = 10;
	Date endDay;
	endDay.year = 2016;
	endDay.month = 2;
	endDay.date = 25;

	Account *normalAccount = new NormalAccount();
	Account *minusAccount = new MinusAccount(1000000);
	Account *savingAccount = new SavingAccount(startDay, endDay);

	BankData* bankData = new BankData();

	Customer* customer = new Customer(bankData);

	normalAccount->deposit(100000);
	minusAccount->deposit(100000);
	savingAccount->deposit(100000);
	bankData->setMsg("Deposit!!");
	cout << endl;

	normalAccount->withdraw(120000);
	normalAccount->withdraw(50000);
	normalAccount->calculateInterest();
	bankData->setMsg("NormalAccount!!");
	cout << endl;

	minusAccount->withdraw(120000);
	minusAccount->withdraw(1000000);
	minusAccount->calculateInterest();
	
	bankData->setMsg("MinusAccount!!");
	cout << endl;

	savingAccount->withdraw(120000);
	savingAccount->withdraw(50000);
	savingAccount->calculateInterest();
	bankData->setMsg("SavingAccount!!");

	return 0;
}