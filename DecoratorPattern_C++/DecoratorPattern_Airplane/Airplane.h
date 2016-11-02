#pragma once
#include <string>
using namespace std;

class Airplane
{
public :
	Airplane() {}
	virtual ~Airplane() {}

	virtual string attack() = 0;
};