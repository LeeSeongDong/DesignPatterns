#include "BankData.h"



BankData::BankData()
{
}


BankData::~BankData()
{
}

void BankData::registerObserver(Observer* o)
{
	observers.push_back(o);
}

void BankData::remove(Observer* o)
{
	observers.clear();
}

void BankData::notifyObserver()
{
	for (Observer* o : observers)
	{
		o->update(msg);
	}
}

void BankData::setMsg(string msg)
{
	this->msg = msg;
	msgChanged();
}

void BankData::msgChanged()
{
	notifyObserver();
}
