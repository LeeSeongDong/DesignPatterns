#pragma once
#include "Airplane.h"

class AttackDecorator : public Airplane
{
private :
	Airplane* ap;

public :
	AttackDecorator(Airplane* ap) { this->ap = ap; }
	virtual ~AttackDecorator() {}

	string attack() { return ap->attack(); }
};