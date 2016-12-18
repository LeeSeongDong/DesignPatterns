package proxy.remote;

import java.rmi.Naming;

public class RMIClient
{
	static final String server = "127.0.0.1";
	
	public static void main(String[] args) throws Exception
	{
		String host = "rmi://" + server + "/DateServer";
		RemoteDate ds = (RemoteDate) Naming.lookup(host);
		System.out.println(ds.getDate());
	}
}
