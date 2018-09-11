import java.io.*;
import java.net.*;
//import java.util.*;

public class MyClient4
{
	public static void main(String args[])throws Exception
	{
		int portNo=2345;
		String hostName="localhost";
		
		try
		{
			Socket cs = new Socket(hostName, portNo);
			
			System.out.println("Client 1: Connected to "+cs.toString());
			
			PrintWriter out = new PrintWriter(cs.getOutputStream(),true);
			System.out.println("What do you want to send to client?");
			
			BufferedReader in=new BufferedReader(new InputStreamReader(cs.getInputStream()));
			BufferedReader stdIn=new BufferedReader(new InputStreamReader(System.in));
			
			String userInput;
			
			while((userInput=stdIn.readLine())!=null)
			{
				out.println(userInput);
				System.out.println("From server: "+in.readLine());
				System.out.println("Client: Do you want to send something else?");
				//System.out.println("echo: "+in.readLine());
			}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
