//file writing operation testing_overwriting as well as appending data
package demo_EXG;

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
			File filepath = new File("C:/Users/Jc misra/ShimmerData_Packets" + FileMainEXG.SensorTypeID + FileMainEXG.SensorID +".txt");
			
			// if file doesnt exists, then create it
			if (!filepath.exists())
				filepath.createNewFile();
			
			if(rcvCount==0)
			{
				FileWriter fw = new FileWriter(filepath,false);	//true to append, false to overwrite
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);
				for(int z=0; z<5; z++) // new addition on 03-06-2016 specially for ECG
				pw.println(val);
				pw.close();
			}
			else
			{
				FileWriter fw = new FileWriter(filepath,true);	//true to append, false to overwrite
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);
				for(int z=0; z<5; z++) // new addition on 03-06-2016 specially for ECG
				pw.println(val);
				pw.close();
			}

		} 
		catch (IOException e) 
		{
			System.out.println(e.toString());
		}
	}
}