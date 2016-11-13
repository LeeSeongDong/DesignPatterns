#pragma once
#include "AttackDecorator.h"

class RightAttack : public AttackDecorator
{
public:
	RightAttack(Airplane* ap) : AttackDecorator(ap) {}
	~RightAttack() {}

	string attack() { return AttackDecorator::attack() + ", 우측공격"; }
};
