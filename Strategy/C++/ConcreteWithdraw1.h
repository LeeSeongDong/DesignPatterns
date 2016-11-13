#pragma once
#include "WithdrawStrategy.h"
class ConcreteWithdraw1 : public WithdrawStrategy
{
public:
	ConcreteWithdraw1();
	~ConcreteWithdraw1();

	int withdraw(Account* acc, int money);
};

