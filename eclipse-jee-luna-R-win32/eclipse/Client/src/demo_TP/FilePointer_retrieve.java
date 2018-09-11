package demo_TP;
//package demo_TP;
import java.io.BufferedReader;
import java.io.FileReader;


public class FilePointer_retrieve
{
	public static long pointerPos = -1;
	
	public long retrievePointer()throws Exception
	{
		String file = "C:/Users/Jc misra/file_pointerPos" + FileMainTP.SensorTypeID + FileMainTP.SensorID + ".txt";
		
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
