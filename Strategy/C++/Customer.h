#pragma once
#include "BankData.h"
#include "DisplayElement.h"
class Customer : public Observer, DisplayElement
{
private :
	BankData* bankData;
	string msg;
public:
	Customer(BankData* bankData);
	~Customer();

	void update(string msg);
	void display();
};

