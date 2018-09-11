package TestPackage;

import java.io.*;
import java.net.*;
//import java.util.*;

public class MyServer4 
{
	private static ServerSocket ss;

	public static void main(String args[])throws Exception
	{
		int portNo=2345;
		String serverName="localhost";
		
		try
		{
			ss = new ServerSocket(portNo);
			System.out.println("Server "+serverName+"started at port number "+portNo);
			Socket cs = ss.accept();
			System.out.println("Got connection from "+cs.getInetAddress()+"at port number "+cs.getPort());
			
			PrintWriter out = new PrintWriter(cs.getOutputStream(), true);
			
			BufferedReader in = new BufferedReader(new InputStreamReader(cs.getInputStream()));
			
			String inputLine;
			
			while((inputLine=in.readLine())!=null)
			{
				System.out.println("Got message "+inputLine+"from "+cs.toString());			
				out.println(inputLine);
			}
		
 		}
		
		catch(Exception e)
		{
			System.out.println("Exception caught while trying to listen to server or waiting for a connection!!!");
			System.out.println(e.getMessage());
			
		}
	}
}
