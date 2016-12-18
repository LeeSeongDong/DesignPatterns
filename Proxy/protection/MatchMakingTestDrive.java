package proxy.protection;

import java.lang.reflect.Proxy;

public class MatchMakingTestDrive 
{
	public static PersonBean getOwnerProxy(PersonBean person)
	{
		return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), 
				person.getClass().getInterfaces(), 
				new OwnerInvocationHandler(person));
	}
	
	public static PersonBean getNonOwnerProxy(PersonBean person)
	{
		return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), 
				person.getClass().getInterfaces(), 
				new NonOwnerInvocationHandler(person));
	}
	
	public static void main(String[] args)
	{
		PersonBean joe = new PersonBeanImpl();
		joe.setName("Joe Javabean");
		
		// 본인용 프록시
		PersonBean ownerProxy = getOwnerProxy(joe);
		System.out.println("Name is " + ownerProxy.getName());
		ownerProxy.setInterests("bowling, Go");
		System.out.println("Interests set from owner proxy");
		try
		{
			ownerProxy.setHotOrNotRating(10);
		}
		catch(Exception e)
		{
			System.out.println("Can't set rating from owner proxy");
		}
		System.out.println("Rating is " + ownerProxy.getHotOrNotRating() + "\n");
		
		// 타인용 프록시
		PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
		System.out.println("Name is " + nonOwnerProxy.getName());
		try
		{
			nonOwnerProxy.setInterests("bowling, Go");
		}
		catch(Exception e)
		{
			System.out.println("Can't set interests from non owner proxy");
		}
		nonOwnerProxy.setHotOrNotRating(3);
		System.out.println("Rating set from non owner proxy");
		System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
	}
}
