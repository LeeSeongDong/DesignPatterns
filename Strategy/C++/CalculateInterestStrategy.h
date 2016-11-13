#pragma once

class Account;

class CalculateInterestStrategy
{
public:
	CalculateInterestStrategy() {}
	virtual ~CalculateInterestStrategy() {}

	virtual int calculateInterest(Account* acc) = 0;
};

