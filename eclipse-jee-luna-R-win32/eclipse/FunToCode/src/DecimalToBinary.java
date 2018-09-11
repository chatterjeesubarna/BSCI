import java.io.IOException;
import java.util.*;
public class DecimalToBinary {

	public static String convertToBinary(float f, int k)
	{
		StringBuffer str = new StringBuffer("");
		if(f == 0)
			return "";
		while(k-- != 0 || f > 0.0)
		{
			System.out.println("Float: " + f);
			
			f = f*2;
			if(f >= 1)
			{	
				str.append("1");
				f = f - 1;
			}
			else
			{
				str.append("0");
			}
		}
		return String.valueOf(str);
	}
	public static String convertToBinary(int d)
	{
		StringBuffer str = new StringBuffer("");
		if (d==0) 
			str.append("0");
		while(d != 0)
		{
			int val = d%2;
			str.append(val);
			d = d/2;
		}
		return String.valueOf(str.reverse());
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		//int d = s.nextInt();
		//System.out.println("\n" + convertToBinary(d));
		float d = s.nextFloat();
		int integralPart = (int) d;
		float pointPart = d - integralPart;
		StringBuffer str = new StringBuffer(convertToBinary(integralPart));
		if(pointPart != 0)
			str.append(".").append(convertToBinary(pointPart, 7));
		System.out.println("\n" + String.valueOf(str));
	}

}
