import java.util.*;


public class GoogolString {

	public static String reverseString(String str)
	{
		char charr[] = str.toCharArray();
		int i=0, j=charr.length-1;
		char temp;
		while(i<j)
		{
			temp = charr[i];
			charr[i] = charr[j];
			charr[j] = temp;
			i++; 
			j--;
		}
		StringBuilder strb = new StringBuilder("");
		i=0;
		j=charr.length-1;
		for(i=0;i<=j;i++)
		{
			strb.append(String.valueOf(charr[i]));
		}

		return String.valueOf(strb);
	}
	public static String switchString(String str)
	{
		char charr[] = str.toCharArray();
		int i=0, j=charr.length-1;
		StringBuilder strb = new StringBuilder("");
		for(i =0;i<=j;i++)
		{
			if(charr[i] == '0')
			{
				charr[i] = '1';
				strb.append("1");
			}
			else
			{
				charr[i] = '0';
				strb.append("0");
			}
		}

		return String.valueOf(strb);
	}
	public static char mainFunc(String str, int K)
	{
		if(str.length()-1 >= K)
			return str.charAt(K);
		StringBuilder strb = new StringBuilder("");
		strb.append(str).append("0").append(switchString(reverseString(str)));
		//System.out.println("Input: " + str + " Output: " + String.valueOf(strb));
		return mainFunc(String.valueOf(strb), K);
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		int c = 1;

		while(T-- != 0)
		{
			int K = s.nextInt();
			char ch = mainFunc("", K);
			System.out.println("Case #" + c + ": " + ch);
			c++;
		}


	}

}
