//test code to read from a csv file
package demo_GSR;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;
import java.util.*;
import java.util.Date;


import demo_TP.FileMainTP;

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
			System.out.println("Iteration count "+ FileMainGSR.iteration);
		//	System.in.read();
			
			if(FileMainGSR.iteration == 2)
			{
				System.out.println("To be read from "+ rcvcount);
			//	System.in.read();
			}
			System.out.println("Inside Read4mCSV"+FileMainGSR.in+"*******"+FileMainGSR.out);

			if(FileMainGSR.in.ready())
			{
				//System.out.println("Inside ready");
				FileMainGSR.cs.close();
				FileMainGSR.flag = 2;
				return;
			}

			//System.out.println("User logged in!!!");

			String csvFile = "C:/Users/Jc misra/" + FileMainGSR.fileName + ".csv";

			BufferedReader br = new BufferedReader(new FileReader(csvFile));

			String line = new String("");
			StringTokenizer st = null;

			FileMainGSR.lineNumber = 0;

			String packet = new String("");

			//read comma separated file line by line
			while ((line = br.readLine()) != null )
			{
				//Creating empty array lists with each new line read from file

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
					if((FileMainGSR.lineNumber + rcvcount) == 1 )
						FileMainGSR.list_head.add(str);

					//stores the list units
					if((FileMainGSR.lineNumber + rcvcount) == 3 )
					{
						FileMainGSR.list_units.add(str);
						max_tokens = tokenNumber;
						System.out.println("Line: " + FileMainGSR.lineNumber + "Max : " + (int)(max_tokens+1));

					}

					//stores the data values
					if((FileMainGSR.lineNumber + rcvcount)> 3)
						list_values.add(str);

					tokenNumber++;

				} // end of inner while

				for(int i = 0; i<FileMainGSR.list_head.size(); i++)
					System.out.print(FileMainGSR.list_head.get(i) + " ");
				System.out.println();

				for(int i = 0; i<FileMainGSR.list_units.size(); i++)
					System.out.print(FileMainGSR.list_units.get(i) + " ");
				System.out.println();

				for(int i = 0; i<list_values.size(); i++)
					System.out.print(list_values.get(i) + " ");
				System.out.println();

				//System.in.read();
				//Thread.sleep(5000);

				if((FileMainGSR.lineNumber + rcvcount) == 3 )
				{
					//traverse the list_units array and select the tokens whose units are specified and store them in an another array list
					for (int i = 0; i < FileMainGSR.list_units.size(); i++) 
					{
						if(FileMainGSR.list_units.size() == (max_tokens + 1))
						{
							if(!(((FileMainGSR.list_units.get(i)).compareTo("no units"))==0))		//if not equal to "no units"
							{
								if(FileMainGSR.list_head.get(i).compareTo("Timestamp")==0||FileMainGSR.list_head.get(i).compareTo("VSenseBatt")==0||FileMainGSR.list_head.get(i).compareTo("Internal ADC A13")==0||FileMainGSR.list_head.get(i).compareTo("GSR")==0||FileMainGSR.list_head.get(i).compareTo("Heart Rate PPG")==0)
								{
									FileMainGSR.list_index.add(i);
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

/*				if((FileMainGSR.lineNumber + rcvcount) > 3 )
				{
					//traverse the list_units array and select the tokens whose units are specified and store them in an another array list
					for (int i = 0; i < list_values.size(); i++) 
					{
						if(list_values.size() != (max_tokens + 1))
						{
							System.out.println(list_values.size() + " " + max_tokens);
							System.in.read();
							flag = 1;
							break;
						}
						else
						{
							flag = 0;
						}

					}

				}
*/
				if(flag==0)
				{
					System.out.println(flag);
					//form data packets 
					for(int i = 0; i < FileMainGSR.list_index.size(); i++)
					{
						if((FileMainGSR.lineNumber + rcvcount) == 1)
							packet = packet + "*" + FileMainGSR.list_head.get(FileMainGSR.list_index.get(i));

						if((FileMainGSR.lineNumber + rcvcount) == 3)
							packet = packet + "*" + FileMainGSR.list_units.get(FileMainGSR.list_index.get(i));

						//form data packets of the values after trimming digits
						if((FileMainGSR.lineNumber + rcvcount) > 3)
						{
							String rcv_str = obTD.Func_Trim(list_values.get(FileMainGSR.list_index.get(i)));
							packet = packet + "*" + rcv_str;
						}
					}


					System.out.println("\n\nThe packet formed is: " + packet + "\n\n");
					//obFWrOWr.Write2File_OvrWr(packet,1);			//1 for appending the data packet to the file


					//writes the data packets to file only once, skips lines already written
					if(FileMainGSR.counter > rcvcount)
					{
						if(FileMainGSR.lineNumber >= 3 || FileMainGSR.lineNumber == 1)
						{
							System.out.println("\n\nThe packet formed is: " + packet + "\n\n");
							obFWrOWr.Write2File_OvrWr(packet,1);			//1 for appending the data packet to the file
							FileMainGSR.out.println(packet);		//send data packets for analysis
							lineWritten++;

						}

					}


					else
						System.out.println("Skipping line: " + FileMainGSR.lineNumber);
				}

				else
				{
					System.out.println("\n\nIncomplete packet!!");
					flag = 0;
				}


				//increments the counters
				FileMainGSR.counter++;
				FileMainGSR.lineNumber++;

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