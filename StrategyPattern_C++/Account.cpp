#include "Account.h"


Account::Account()
{

}

Account::Account(WithdrawStrategy* ws, CalculateInterestStrategy* cs)
{
	withdrawBehavior = ws;
	calculateInterestBehavior = cs;
}

Account::~Account()
{
}

int Account::getBalance()
{
	return balance;
}

void Account::deposit(int money)
{
	balance += money;
	cout << "Deposit Money : " << money << ", Balance : " << balance << endl;
}

void Account::withdraw(int money)
{
	balance = withdrawBehavior->withdraw(this, money);
}

void Account::calculateInterest()
{
	int interest = calculateInterestBehavior->calculateInterest(this);
	cout << "Interest : " << interest << endl;
}
