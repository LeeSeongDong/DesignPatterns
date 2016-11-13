#pragma once
#include "Airplane.h"

class ConcreteAirplane : public Airplane
{
public :
	ConcreteAirplane() {}
	~ConcreteAirplane() {}

	string attack() { return "전방공격"; }
};