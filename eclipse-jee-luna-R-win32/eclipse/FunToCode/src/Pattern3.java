import java.util.*;
import java.io.*;


public class Pattern3 {

	public static void main(String[] args) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String str1 = br.readLine();
		String str = new String(str1 + " ");
		StringBuffer sb = new StringBuffer(str);
		int cur = 0, max = -1;
		String result = " ";
		int final_length = str.length();
		while (cur < final_length)
		{
			int ch = sb.indexOf(" ");
			int len = (str.substring(cur, ch+cur)).length();
			System.out.println("Extracted: " + str.substring(cur, ch+cur));
			if(len > max)
			{
				max = len;
				result = new String(str.substring(cur, ch+cur));
			}
			if((cur + ++len) < final_length)
			{
				while(str.charAt(cur + len) ==  ' ')
					len++;
			}
			
			cur = cur + len;
			sb = new StringBuffer(str.substring(cur));
		}
		System.out.println("Winner string is " + result + " of length " + max);
	}

}
