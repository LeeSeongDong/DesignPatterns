package proxy.remote;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;


@SuppressWarnings("serial")
public class RemoteDateImpl extends UnicastRemoteObject implements RemoteDate
{
	public RemoteDateImpl() throws RemoteException {}
	
	public Date getDate() throws RemoteException
	{
		return new Date();
	}
	
	public static void main(String[] args)
	{
		try
		{
			RemoteDate ds = new RemoteDateImpl();
			Naming.bind("DateServer", ds);
		}
		catch(Exception e){e.printStackTrace();}
	}
}
