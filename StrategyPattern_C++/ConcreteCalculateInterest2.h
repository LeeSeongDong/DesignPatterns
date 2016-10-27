#pragma once
#include "CalculateInterestStrategy.h"
class ConcreteCalculateInterest2 : public CalculateInterestStrategy
{
public:
	ConcreteCalculateInterest2();
	~ConcreteCalculateInterest2();

	int calculateInterest(Account* acc);
};

