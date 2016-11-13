#pragma once

class DisplayElement
{
public :
	DisplayElement() {}
	virtual ~DisplayElement() {}

	virtual void display() = 0;
};