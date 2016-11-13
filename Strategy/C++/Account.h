#pragma once

#include "WithdrawStrategy.h"
#include "CalculateInterestStrategy.h"
#include "Common.h"
#include "Date.h"

class Account
{
private :
	int balance;
	WithdrawStrategy* withdrawBehavior;
	CalculateInterestStrategy* calculateInterestBehavior;

public:
	Account();
	Account(WithdrawStrategy* ws, CalculateInterestStrategy* cs);
	~Account();

	int getBalance();
	void deposit(int money);
	void withdraw(int money);
	void calculateInterest();
};

