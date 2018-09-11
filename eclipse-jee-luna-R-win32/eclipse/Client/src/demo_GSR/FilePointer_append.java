package demo_GSR;

import java.io.*;

import demo_TP.FileMainTP;

public class FilePointer_append
{
	public void appendPointer(long pointerPos)throws Exception
	{
		String file = "C:/Users/Jc misra/file_pointerPos" + FileMainGSR.SensorTypeID + FileMainGSR.SensorID + ".txt";
		
		BufferedWriter bw = null;
		int pos;
        
        try
        {
            //data gets deleted and overwritten
        	Writer fw = new FileWriter(file);
        	String str = new String(String.valueOf(pointerPos));
            fw.write(str);  
            fw.close();
            System.out.println("In appendPointer(); Done appending file pointer position as: " + str);
            //Thread.sleep(000);
            
        } 

        catch (Exception e) 
        {
            System.out.println(e.toString());
        }
        
    }
}
