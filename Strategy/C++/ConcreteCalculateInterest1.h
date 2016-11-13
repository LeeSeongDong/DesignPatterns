#pragma once
#include "CalculateInterestStrategy.h"
class ConcreteCalculateInterest1 : public CalculateInterestStrategy
{
public:
	ConcreteCalculateInterest1();
	~ConcreteCalculateInterest1();

	int calculateInterest(Account* acc);
};

