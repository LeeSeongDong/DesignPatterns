#pragma once
#include "CalculateInterestStrategy.h"
class ConcreteCalculateInterest3 : public CalculateInterestStrategy
{
public:
	ConcreteCalculateInterest3();
	~ConcreteCalculateInterest3();

	int calculateInterest(Account* acc);
};

