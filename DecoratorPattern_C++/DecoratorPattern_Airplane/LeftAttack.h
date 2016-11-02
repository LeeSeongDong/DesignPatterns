#pragma once
#include "AttackDecorator.h"

class LeftAttack : public AttackDecorator
{
public :
	LeftAttack(Airplane* ap) : AttackDecorator(ap) {}
	~LeftAttack() {}
	
	string attack() { return AttackDecorator::attack() + ", ÁÂÃø°ø°İ"; }
};