#pragma once
#include "Observer.h"
class Subject
{
public :
	Subject() {}
	virtual ~Subject() {}

	virtual void registerObserver(Observer* o) = 0;
	virtual void remove(Observer* o) = 0;
	virtual void notifyObserver() = 0;
};