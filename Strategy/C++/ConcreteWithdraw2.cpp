#include "ConcreteWithdraw2.h"
#include "MinusAccount.h"


ConcreteWithdraw2::ConcreteWithdraw2()
{
}

ConcreteWithdraw2::~ConcreteWithdraw2()
{
}

int ConcreteWithdraw2::withdraw(Account* acc, int money)
{
	int balance = acc->getBalance();

	if (balance + ((MinusAccount*)acc)->getBound() >= money)
	{
		balance -= money;
		cout << "Withdraw Money : " << money << ", Balance : " << balance << endl;
	}
	else
	{
		cout << "Exceeding of Limit!" << endl;
	}

	return balance;
}
