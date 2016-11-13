#pragma once
#include "AttackDecorator.h"

class RearAttack : public AttackDecorator
{
public:
	RearAttack(Airplane* ap) : AttackDecorator(ap) {}
	~RearAttack() {}

	string attack() { return AttackDecorator::attack() + ", 후방공격"; }
};
