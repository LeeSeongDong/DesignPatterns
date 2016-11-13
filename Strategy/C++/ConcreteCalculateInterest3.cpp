#include "ConcreteCalculateInterest3.h"
#include "SavingAccount.h"


ConcreteCalculateInterest3::ConcreteCalculateInterest3()
{
}

ConcreteCalculateInterest3::~ConcreteCalculateInterest3()
{
}

int ConcreteCalculateInterest3::calculateInterest(Account* acc)
{
	Date currDay;
	currDay.year = 2016;
	currDay.month = 10;
	currDay.date = 10;

	int y = currDay.year - ((SavingAccount*)acc)->getStartDay().year;
	double n = 1 - pow((double)5 / (double)100, y);
	double d = 1 - (double)5 / (double)100;
	int interest = (int)(acc->getBalance() * n / d);

	return interest;
}
