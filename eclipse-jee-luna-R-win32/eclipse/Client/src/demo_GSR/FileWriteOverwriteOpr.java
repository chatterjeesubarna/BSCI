//file writing operation testing_overwriting as well as appending data
package demo_GSR;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteOverwriteOpr 
{
	
	public void Write2File_OvrWr(String val,long rcvCount)
	{
		try 
		{
			File filepath = new File("C:/Users/Jc misra/ShimmerData_Packets" + FileMainGSR.SensorTypeID + FileMainGSR.SensorID +".txt");
			
			// if file doesnt exists, then create it
			if (!filepath.exists())
				filepath.createNewFile();
			
			if(rcvCount==0)
			{
				FileWriter fw = new FileWriter(filepath,false);	//true to append, false to overwrite
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);
				
				long currentDateTime = System.currentTimeMillis();
				String str = Long.toString(currentDateTime);
				pw.println(val +"\t@\t"+ str);
				pw.close();
			}
			else
			{
				FileWriter fw = new FileWriter(filepath,true);	//true to append, false to overwrite
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);
				long currentDateTime = System.currentTimeMillis();
				String str = Long.toString(currentDateTime);
				pw.println(val +"\t@\t"+ str);
				pw.close();
			}

		} 
		catch (IOException e) 
		{
			System.out.println(e.toString());
		}
	}
}