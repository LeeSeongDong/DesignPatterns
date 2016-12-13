package iterator.compositeIterator;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator
{
	Stack stack = new Stack(); // 재귀적 호출을 위한 스택
	
	public CompositeIterator(Iterator iterator) // 최상위 복합객체의 반복자
	{
		stack.push(iterator);
	}
	
	public boolean hasNext() 
	{
		if(stack.empty()) // 스택이 비어있으면  다음원소가 없음
		{
			return false;
		}
		else
		{ // 스택이 비어있지 않으면 다음 반복자를 꺼내 재귀적으로 hasNext()를 호출
			Iterator iterator = (Iterator)stack.peek();
			if(!iterator.hasNext())
			{
				stack.pop();
				return hasNext();
			}
			else
			{
				return true;
			}
		}
	}

	public Object next() 
	{
		if(hasNext())
		{ 
			// 다음원소가 있으면 해당 원소를 꺼낸 다음 그다음 원소를 구해서 스택에 넣고, 반환함
			Iterator iterator = (Iterator) stack.peek();
			MenuComponent component = (MenuComponent) iterator.next();
			if(component instanceof Menu)
			{
				stack.push(component.createIterator());
			}
			return component;
		}
		else
		{
			return null;
		}
	}
}
