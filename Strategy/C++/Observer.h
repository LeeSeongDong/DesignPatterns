#pragma once
#include "common.h"
class Observer
{
public :
	Observer() {}
	virtual ~Observer() {}

	virtual void update(string msg) = 0;
};