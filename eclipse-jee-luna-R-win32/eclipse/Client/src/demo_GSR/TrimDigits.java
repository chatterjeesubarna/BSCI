package demo_GSR;
import java.io.*;
import java.util.*;

public class TrimDigits 
{
	public String Func_Trim(String str)throws Exception
	{
		int begin_index_decimal = 0;
		String modified_str = new String("");
		try
		{
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)=='.')	//check for the decimal point
					{
						begin_index_decimal = i;
						break;
					}
			}
			
			if(begin_index_decimal == 0)	//which implies no decimal point
				modified_str = str;
			
			else
				modified_str = str.substring(0, Math.min(begin_index_decimal + 3, str.length()));
			//return modified_str;
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
		return modified_str;
	}
}
