package demo_GSR;

import java.io.BufferedReader;
import java.io.FileReader;

import demo_TP.FileMainTP;

public class FilePointer_retrieve
{
	public static long pointerPos = -1;
	
	public long retrievePointer()throws Exception
	{
		String file = "C:/Users/Jc misra/file_pointerPos" + FileMainGSR.SensorTypeID + FileMainGSR.SensorID + ".txt";
		
		BufferedReader bR = null;
        
        try
        {
        	bR = new BufferedReader(new FileReader(file));
            pointerPos = Long.parseLong(bR.readLine());
            
        } 

        catch (Exception e) 
        {
            System.out.println(e.toString());
        }
        System.out.println("In retrievePointer(); Done retrieving file pointer position as: " + pointerPos);
        return pointerPos;
    }
}
