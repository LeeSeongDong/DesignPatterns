#include "ConcreteCalculateInterest1.h"
#include "Account.h"


ConcreteCalculateInterest1::ConcreteCalculateInterest1()
{
}


ConcreteCalculateInterest1::~ConcreteCalculateInterest1()
{
}

int ConcreteCalculateInterest1::calculateInterest(Account * acc)
{
	int interest = (acc->getBalance() * 103) / 100;
	return interest;
}
