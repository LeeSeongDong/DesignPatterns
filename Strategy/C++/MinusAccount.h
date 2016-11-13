#pragma once
#include "Account.h"
#include "ConcreteWithdraw2.h"
#include "ConcreteCalculateInterest2.h"
class MinusAccount : public Account
{
private :
	int bound;
public:
	MinusAccount(int bound);
	~MinusAccount();

	void setBound(int bound);
	int getBound();
};

