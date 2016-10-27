#include "NormalAccount.h"



NormalAccount::NormalAccount() : Account(new ConcreteWithdraw1(), new ConcreteCalculateInterest1())
{
	
}


NormalAccount::~NormalAccount()
{
}
