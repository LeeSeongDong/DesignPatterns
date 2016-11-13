#include "ConcreteCalculateInterest2.h"
#include "Account.h"


ConcreteCalculateInterest2::ConcreteCalculateInterest2()
{
}


ConcreteCalculateInterest2::~ConcreteCalculateInterest2()
{
}

int ConcreteCalculateInterest2::calculateInterest(Account* acc)
{
	int balance = acc->getBalance();
	int interest;
	if (balance >= 0)
	{
		interest = (balance * 103) / 100;
	}
	else
	{
		interest = (balance * 107) / 100;
	}
	return interest;
}
