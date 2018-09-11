package demo_TP;
//test code to read from a csv file
//package demo_TP;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.*;
import java.util.*;
import java.net.*;

import demo_GSR.FileMainGSR;

public class Read4mCSV
{
	public void ReadFromCSVFile(long rcvcount)throws Exception
	{
		try 
		{ 
			int flag = 0;
			long lineWritten = 0;
			int tokenNumber = 0;
			int max_tokens = 0;
			//long present_time = 0;

			FileWriteOverwriteOpr obFWrOWr = new FileWriteOverwriteOpr();
			TrimDigits obTD = new TrimDigits();
			FilePointer_append obFP_apnd = new FilePointer_append();
			System.out.println("Iteration count "+ FileMainTP.iteration);
			
			if(FileMainGSR.iteration == 2)
			{
				System.out.println("To be read from "+ rcvcount);
			//	System.in.read();
			}
			System.out.println("Inside Read4mCSV"+FileMainTP.in+"*******"+FileMainTP.out);
			
			if(FileMainTP.in.ready())
			{
				FileMainTP.cs.close();
				FileMainTP.flag = 2;
				return;
			}
			
			//accepting the filename from the paramedic, the same filename as the one written in ShimmerCapture application
			String csvFile = "C:/Users/Jc misra/" + FileMainTP.fileName + ".csv";

			BufferedReader br = new BufferedReader(new FileReader(csvFile));

			String line = new String("");
			StringTokenizer st = null;
			FileMainTP.lineNumber = 0;
			String packet = new String("");

			//read comma separated file line by line
			while ((line = br.readLine()) != null )
			{
				ArrayList<String> list_values = new ArrayList<String>();
				//use comma as token separator
				st = new StringTokenizer(line, ",");
				//extract tokens and store them onto specific array lists
				while (st.hasMoreTokens()) 
				{
					String str = st.nextToken();
					//display csv values
					System.out.print(str + "\t");

					//stores the list head
					if((FileMainTP.lineNumber + rcvcount) == 1 )
						FileMainTP.list_head.add(str);

					//stores the list units
					if((FileMainTP.lineNumber + rcvcount) == 3 )
					{
						FileMainTP.list_units.add(str);
						max_tokens = tokenNumber;
						System.out.println("Line: " + FileMainTP.lineNumber + "Max : " + (int)(max_tokens + 1));

					}

					//stores the data values
					if((FileMainTP.lineNumber + rcvcount)> 3)
						list_values.add(str);

					tokenNumber++;

				} // end of inner while

				System.out.println();

				if((FileMainTP.lineNumber + rcvcount) == 3 )
				{
					//traverse the list_units array and select the tokens whose units are specified and store them in an another array list
					for (int i = 0; i < FileMainTP.list_units.size(); i++) 
					{
						if(FileMainTP.list_units.size() == max_tokens + 1)
						{
							if(!(((FileMainTP.list_units.get(i)).compareTo("no units"))==0))		//if not equal to "no units"
							{
								if(FileMainTP.list_head.get(i).compareTo("Timestamp")==0||FileMainTP.list_head.get(i).compareTo("VSenseBatt")==0||FileMainTP.list_head.get(i).compareTo("Pressure")==0||FileMainTP.list_head.get(i).compareTo("Temperature")==0)
								{
									FileMainTP.list_index.add(i);
								}
								
							}
						}
						else
						{
							flag = 1;
							break;
						}
					}

				}


				if(flag==0)
				{
					//form data packets 
					for(int i = 0; i < FileMainTP.list_index.size(); i++)
					{
						if((FileMainTP.lineNumber + rcvcount) == 1)
							packet = packet + "*" + FileMainTP.list_head.get(FileMainTP.list_index.get(i));

						if((FileMainTP.lineNumber + rcvcount) == 3)
							packet = packet + "*" + FileMainTP.list_units.get(FileMainTP.list_index.get(i));

						//form data packets of the values after trimming digits
						if((FileMainTP.lineNumber + rcvcount) > 3)
						{
							String rcv_str = obTD.Func_Trim(list_values.get(FileMainTP.list_index.get(i)));
							packet = packet + "*" + rcv_str;
						}
					}
					System.out.println("\n\nThe packet formed is: " + packet + "\n\n");

					//writes the data packets to file only once, skips lines already written
					if(FileMainTP.counter > rcvcount)
					{
						if(FileMainTP.lineNumber >= 3 || FileMainTP.lineNumber == 1)
						{
							System.out.println("\n\nThe packet formed is: " + packet + "\n\n");
							obFWrOWr.Write2File_OvrWr(packet,1);			//1 for appending the data packet to the file
							FileMainTP.out.println(packet);		//send data packets for analysis
							lineWritten++;

						}

					}

					else
						System.out.println("Skipping line: " + FileMainTP.lineNumber);
				}
				
				else
				{
					System.out.println("\n\nIncomplete packet!!");
					flag = 0;
				}


				//increments the counters
				FileMainTP.counter++;
				FileMainTP.lineNumber++;

				//appends the file pointer position to the file where the pointer is being saved for further reference, THE MOST IMPORTANT STEP
				obFP_apnd.appendPointer(rcvcount + lineWritten);

				//reset token number and packet
				tokenNumber = 0;
				packet = "";

				System.out.println("In ReadCSV ");

				//Thread.sleep(3000);
			}//end of outer while

		}//end of try
		catch (Exception e) 
		{
			System.out.println(e.toString());
		}

	}//end of function
}//end of class