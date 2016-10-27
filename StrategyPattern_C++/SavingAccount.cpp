#include "SavingAccount.h"



SavingAccount::SavingAccount(Date startDay, Date endDay) : Account(new ConcreteWithdraw3(), new ConcreteCalculateInterest3())
{
	setStartDay(startDay);
	setEndDay(endDay);
}


SavingAccount::~SavingAccount()
{
}

void SavingAccount::setStartDay(Date startDay)
{
	this->startDay = startDay;
}

Date SavingAccount::getStartDay()
{
	return startDay;
}

void SavingAccount::setEndDay(Date endDay)
{
	this->endDay = endDay;
}

Date SavingAccount::getEndDay()
{
	return endDay;
}
