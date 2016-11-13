#pragma once
#include "Account.h"
#include "ConcreteWithdraw1.h"
#include "ConcreteCalculateInterest1.h"
class NormalAccount : public Account
{
public:
	NormalAccount();
	~NormalAccount();
};

