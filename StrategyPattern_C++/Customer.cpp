#include "Customer.h"



Customer::Customer(BankData* bankData)
{
	this->bankData = bankData;
	bankData->registerObserver(this);
}


Customer::~Customer()
{
}

void Customer::update(string msg)
{
	this->msg = msg;
	display();
}

void Customer::display()
{
	cout << "Message : " << msg << endl;
}
