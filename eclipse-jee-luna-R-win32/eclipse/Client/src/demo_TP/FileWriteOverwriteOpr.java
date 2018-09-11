package demo_TP;
//file writing operation testing_overwriting as well as appending data

//package demo_TP; 
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//import demo_EXG.FileMainEXG;
 
public class FileWriteOverwriteOpr 
{
	
	
	public void Write2File_OvrWr(String val,long rcvCount)
	{
		try 
		{
			File filepath = new File("C:/Users/Jc misra/ShimmerData_Packets" + FileMainTP.SensorTypeID + FileMainTP.SensorID +".txt");
			//System.out.println("In Function: " + val);
			
			// if file doesnt exists, then create it
			if (!filepath.exists())
				filepath.createNewFile();
						
			if(rcvCount==0)
			{
				FileWriter fw = new FileWriter(filepath,false);	//true to append, false to overwrite
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);
				pw.println(val);
				pw.close();
			}
			else
			{
				FileWriter fw = new FileWriter(filepath,true);	//true to append, false to overwrite
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);
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