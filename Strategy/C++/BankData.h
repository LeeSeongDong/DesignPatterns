#include "Subject.h"
#include "common.h"
class BankData : public Subject
{
private :
	vector<Observer*> observers;
	string msg;

public:
	BankData();
	~BankData();

	void registerObserver(Observer* o);
	void remove(Observer* o);
	void notifyObserver();
	void setMsg(string msg);
	void msgChanged();
};
