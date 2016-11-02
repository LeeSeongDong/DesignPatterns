#include "LeftAttack.h"
#include "RearAttack.h"
#include "RightAttack.h"
#include "ConcreteAirplane.h"

int main()
{
	Airplane* ap = new ConcreteAirplane();

	ap = new LeftAttack(ap);
	ap = new RightAttack(ap);
	ap = new RearAttack(ap);

	printf_s("%s", ap->attack().c_str());

	return 0;
}