#include "MinusAccount.h"



MinusAccount::MinusAccount(int bound) : Account(new ConcreteWithdraw2(), new ConcreteCalculateInterest2())
{
	setBound(bound);
}

MinusAccount::~MinusAccount()
{
}

void MinusAccount::setBound(int bound)
{
	this->bound = bound;
}

int MinusAccount::getBound()
{
	return bound;
}
