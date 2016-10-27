#pragma once
#include "WithdrawStrategy.h"
class ConcreteWithdraw2 : public WithdrawStrategy
{
public:
	ConcreteWithdraw2();
	~ConcreteWithdraw2();

	int withdraw(Account* acc, int money);
};

