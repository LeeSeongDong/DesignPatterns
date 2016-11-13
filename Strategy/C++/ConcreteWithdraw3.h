#pragma once
#include "WithdrawStrategy.h"
class ConcreteWithdraw3 : public WithdrawStrategy
{
public:
	ConcreteWithdraw3();
	~ConcreteWithdraw3();

	int withdraw(Account* acc, int money);
};

