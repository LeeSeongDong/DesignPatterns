#include "ConcreteWithdraw1.h"
#include "Account.h"


ConcreteWithdraw1::ConcreteWithdraw1()
{
}


ConcreteWithdraw1::~ConcreteWithdraw1()
{
}

int ConcreteWithdraw1::withdraw(Account* acc, int money)
{
	int balance = acc->getBalance();

	if (balance >= money)
	{
		balance -= money;
		cout << "Withdraw Money : " << money << ", Balance : " << balance << endl;
	}
	else
	{
		cout << "Withdraw Money is more than balance!" << endl;
	}

	return balance;
}
