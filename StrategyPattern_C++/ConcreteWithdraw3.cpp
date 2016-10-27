#include "ConcreteWithdraw3.h"
#include "SavingAccount.h"


ConcreteWithdraw3::ConcreteWithdraw3()
{
}

ConcreteWithdraw3::~ConcreteWithdraw3()
{
}

int ConcreteWithdraw3::withdraw(Account* acc, int money)
{
	int balance = acc->getBalance();
	Date currDay;
	currDay.year = 2016;
	currDay.month = 10;
	currDay.date = 10;

	if (currDay.year < ((SavingAccount*)acc)->getEndDay().year)
	{
		cout << "Can't withdraw before Maturity date !" << endl;
	}
	else
	{
		if (balance >= money)
		{
			balance -= money;
			cout << "Withdraw Money : " << money << ", Balance : " << balance << endl;
		}
		else
		{
			cout << "Withdraw Money is more than balance!" << endl;
		}
	}

	return balance;
}
