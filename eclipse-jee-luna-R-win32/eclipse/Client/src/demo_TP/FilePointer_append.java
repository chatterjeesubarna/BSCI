package demo_TP;
//package demo_TP;
import java.io.*;

public class FilePointer_append
{
	public void appendPointer(long pointerPos)throws Exception
	{
		String file = "C:/Users/Jc misra/file_pointerPos" + FileMainTP.SensorTypeID + FileMainTP.SensorID + ".txt";
		
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
            
        } 

        catch (Exception e) 
        {
            System.out.println(e.toString());
        }
        
    }
}
