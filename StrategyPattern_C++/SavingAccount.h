#pragma once
#include "Account.h"
#include "ConcreteWithdraw3.h"
#include "ConcreteCalculateInterest3.h"
class SavingAccount : public Account
{
private :
	Date startDay;
	Date endDay;
public:
	SavingAccount(Date startDay, Date endDay);
	~SavingAccount();

	void setStartDay(Date startDay);
	Date getStartDay();
	void setEndDay(Date endDay);
	Date getEndDay();
};

