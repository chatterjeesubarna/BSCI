package demo_TP;
//Reading Shimmer3 Pressure & Temperature unit for pulse detection
//The attached RadioID should be Shimmer3 GSR+ Unit (BT Radio ID: 3A36) with the optical pulse sensing probe and GSR finger electrodes attached to the patient
//The ideal format of the generated CSV must be *Timestamp*Timestamp*Internal ADC A12*Internal ADC A12*GSR*GSR*Heart Rate PPG /// *no units*mSecs*no units*mVolts*no units*kOhms*Beats/min
//The format of the data packet should be *Timestamp*Internal ADC A12*GSR*Heart Rate PPG /// *mSecs*mVolts*kOhms*Beats/min /// i.e., a minimum of 5 tokens

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
public class FileMainTP 
{
	public static String SensorTypeID = new String("");
	public static String SensorID = new String("");
	
	//variables initialization
	public static int clouding_check = 0;
	public static int counter_stop_limit = 5;				//no. of times it will check the file before it stops

	public static long flag = 1;
	public static long lineNumber = 0; 

	public static long counter;					
	public static long stop_chk = 0;  
	public static int counter_stop = 0;
	public static int k = 0;

	// Creating empty array lists, these need to be created only once as they serve as the headers
	public static ArrayList<String> list_head = new ArrayList<String>();
	public static ArrayList<String> list_units = new ArrayList<String>();
	public static ArrayList<Integer> list_index = new ArrayList<Integer>();

	//port no. and hostname of web server
	final static int portNo=4567;
	final static String hostName="10.14.89.182";
	
	public static String userName = new String("");
	public static String fileName = new String("");
	public static String DiagnosisID = new String("");
	
	public static Socket cs;
	public static BufferedReader in;
	public static PrintWriter out;
	public static String filename = new String("");
	public static int iteration = 0;

	
	//main function
	public void startsensing(String userName1, String SensorTypeID1, String SensorID1, String DiagnosisID1, String filename1)throws Exception
	{
		//establishing connection
		try
		{
			SensorTypeID = SensorTypeID1;
			SensorID = SensorID1;
			userName = userName1;
			fileName = filename1;
			DiagnosisID = DiagnosisID1;
		cs = new Socket(hostName, portNo);			//Establishing ClientSocket
		System.out.println("Client 1: Connected to " + cs.toString());
		System.out.println("Client 1: InetAddress: " + cs.getInetAddress());

		in=new BufferedReader(new InputStreamReader(cs.getInputStream()));
		out = new PrintWriter(cs.getOutputStream(),true);
		
		/*Scanner sc = new Scanner(System.in);
				
		//accept username from console
		System.out.println("Enter login username: ");
		userName = sc.next();
		out.println(userName);			//send data to web-server
		
		//accept sensortype from user in console
		System.out.println("Enter SensorTypeID: ");
		SensorTypeID = sc.next();
		out.println(SensorTypeID);
		
		//accept sensor ID from user in console
		System.out.println("Enter SensorID:");
		SensorID = sc.next();
		out.println(SensorID);
		
		System.out.println("Enter DiagnosisID:");
		DiagnosisID = sc.next();
		out.println(DiagnosisID);
		
		//accepting filename from console
		System.out.println("Enter filename:");
		fileName = sc.next();*/
		System.out.println("username: "+ userName);
		System.out.println("sensortype: "+ SensorTypeID);
		System.out.println("sensorid: "+ SensorID);
		System.out.println("diagnosisid: "+ DiagnosisID);
		System.out.println("filename: "+ fileName);
		
		
		out.println(userName);			//send data to web-server
		out.println(SensorTypeID);
		out.println(SensorID);
		out.println(DiagnosisID);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.toString());
		}
	
			try
			{
				Read4mCSV obRCSV = new Read4mCSV();
				FilePointer_append obFP_apnd = new FilePointer_append();
				FilePointer_retrieve obFP_rtrv = new FilePointer_retrieve();

				FileWriteOverwriteOpr obFWrOvr = new FileWriteOverwriteOpr();
				obFWrOvr.Write2File_OvrWr("",0);		//for deleting and overwriting data onto the packets file

				String file = "C:/Users/Jc misra/file_pointerPos" + SensorTypeID + SensorID + ".txt";
				File filepath = new File(file);

				// if file doesn't exists, then create it and append the filepointer position as 0
				if (!filepath.exists())
				{
					filepath.createNewFile();
					obFP_apnd.appendPointer(0);
				}

				if(filepath.exists())    		//if file exists, delete the pointer position as 0 so that the file gets readed from the very first line, each time the program is executed
					obFP_apnd.appendPointer(0);

				
					do
					{
						counter = 1;
						iteration++;

						//retrieve position of the file pointer
						long rtrvPos = obFP_rtrv.retrievePointer();
						System.out.println("In main; Position of the pointer retrieved: " + rtrvPos);

						//call file reading function to read the file from rtrvPos of the pointer
						obRCSV.ReadFromCSVFile(rtrvPos);

						System.out.println("In main, ready for next chunk of file to be read!!!");

						System.out.println("Position of previous filePointer: " + stop_chk + "\tPosition of current filePointer: " + rtrvPos);

						//lineNumber = 0;
						if(rtrvPos==stop_chk && rtrvPos > 0)			//stop_chk has the previous file position whereas rtrvPos has the current file pointer position. If both are same, then quit the process as since sampling rate is 10.2Hz; it means at-least some lines of data should be generated because of a gap of 3 seconds
							counter_stop++;

						stop_chk = rtrvPos;

						if(counter_stop >= counter_stop_limit)
							flag=0;

						Thread.sleep(1000);
					}while(flag == 1);

					if(flag == 0)
					{
						System.out.println("Value of counter_stop: " + counter_stop + " Shimmer stopped and so is data clouding!!!");
						return;
					}
					if(flag==2)
					{
						System.out.println("Socket closed!!!!Program terminated!!!!");

					}

				}

			catch(Exception e)
			{
				System.out.println(e.toString());
			}
			
	}
}
