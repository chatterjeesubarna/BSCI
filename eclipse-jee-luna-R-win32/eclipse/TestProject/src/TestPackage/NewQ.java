package TestPackage;

import java.io.*;
import java.util.Enumeration;
import java.util.*;
import java.text.*;

import javax.comm.*;

public class NewQ {

	static int max_queue_length = 50;
	static int max_queue_length1 = 5000;
	static int [] queue = new int[max_queue_length];
	static long [] timestamp = new long[max_queue_length];
	static String [] queue1 = new String[NewQ.max_queue_length1];
    static long [] timestamp1 = new long[NewQ.max_queue_length];
	static int n=0;
	static int write_index = 0;
	public static int write_index1 = 0;
	static boolean status;
	static String intermediate_string = new String(" ");
	static String newline = System.getProperty("line.separator");
	
	static CommPortIdentifier portId;
	static Enumeration portList;

	InputStream inputStream;
	SerialPort serialPort;
	Thread readThread;
	byte[] readBuffer;
	
	
	static synchronized int read(int last_read, int userid, String folder_name, int sensor_id[])
	{
		//System.out.println("Inside NewQ.read");
		int to_read = (last_read + 1)%max_queue_length1;
		boolean of_interest = false;
		if (last_read == -1)
		{
			last_read = to_read = 0;
		}
		else
		{
			if (timestamp1[to_read] > timestamp1[last_read])			
			{
				try
					{
						System.out.println("input sensor id: " + queue1[to_read].substring(4, 6));
						int input_source_sensor = Integer.parseInt((queue1[to_read].substring(4, 6)));
						for(int j =0;j<sensor_id.length;j++)
						{
							if(sensor_id[j] == input_source_sensor)
							{
								of_interest = true;
								break;
							}
								
						}
						
						/*if(of_interest == false)
						{
							String path = folder_name + File.separator + userid + ".txt";
							File file = new File(path);
							System.out.println("File deletd: " + file.delete());
						}/*/
						
						System.out.println("of_interest: " + of_interest);
						if(of_interest==true)
						{
							DateFormat dateFormat = new SimpleDateFormat("HH");
							Date date = new Date();
							Calendar cal = Calendar.getInstance();
							
							String content =  dateFormat.format(cal.getTime()) + " Value:" + queue1[to_read];
							String path = folder_name + File.separator + userid + ".txt";
							//String path1 = folder_name + File.separator + userid + "_draft.txt";
							File file = new File(path);
							file.delete();
							if (file.createNewFile()){
						        System.out.println("File is created!");
						      }else{
						        System.out.println("File already exists.");
						      }
							
						    FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
							BufferedWriter bw = new BufferedWriter(fw);
							fw.append(content+"\n");
							bw.newLine();
							
							//PrintWriter out = new PrintWriter(bw1);
							//out.println(content);
							//out.close();
							
							
							//bw1.write(content);
							bw.close();
							//bw1.close();
							fw.close();
							
							System.out.println("Read Entry No: " + to_read + " Value: " + queue1[to_read] + " by thread: " + Thread.currentThread().getId() + " at " + dateFormat.format(cal.getTime()));
							return to_read;
						}
						else return last_read;						
					}
					catch (IOException e)
					{
						System.out.println("\n Child thread Interrupted: "+e.getLocalizedMessage());
					}
			}
			else
			{
				//System.out.println("Nothing to read: Last read at " + timestamp[last_read] + ". Next value written at " + timestamp[to_read]);
			}
		}
		return last_read;
	}
	
	synchronized void write()
	{		
		timestamp[write_index] = System.currentTimeMillis();
		queue[write_index] = n++;
		System.out.println("Write: "+queue[write_index]);
		write_index = (write_index + 1)%max_queue_length;
	}
	
	static synchronized void write(String value)
	{
		intermediate_string = intermediate_string.concat(value);
		if(intermediate_string.length() == 25)
		{
			timestamp1[write_index1] = System.currentTimeMillis();
			queue1[write_index1] = intermediate_string;
			System.out.println("Write entry no: "+ write_index1 + " Value: " + queue1[write_index1]);
			write_index1 = (write_index1 + 1)%max_queue_length1;
			intermediate_string = new String(" ");
		}
		
	}
}
