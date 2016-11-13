#pragma once

class Account;

class WithdrawStrategy
{
public:
	WithdrawStrategy() {}
	virtual ~WithdrawStrategy() {}

	virtual int withdraw(Account* acc, int money) = 0;
};

