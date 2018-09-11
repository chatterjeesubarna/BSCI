import java.util.*;


public class JavaStringCompare {

	public static boolean findWhoIsSmall(String str1, String str2)
	{
		boolean flag = false;
		int i = 0;
		int k = str1.length();
		while(str1.charAt(i) == str2.charAt(i) && i<k)
		{
			i++;
		}
		if(str1.charAt(i) < str2.charAt(i))
			flag = true;
		return flag;
	}
	public static boolean findWhoIsBig(String str1, String str2)
	{
		boolean flag = false;
		int i = 0;
		int k = str1.length();
		while(str1.charAt(i) == str2.charAt(i) && i<k)
		{
			i++;
		}
		if(str1.charAt(i) > str2.charAt(i))
			flag = true;
		return flag;
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str1 = s.next();
		int k = s.nextInt();
		int pos;
		int len = str1.length();
		int start = 0, end = k;
		boolean flag = true;

		String sub1 = str1.substring(start, end);
		String minString = sub1, maxString = sub1;
		while(end < len)
		{
			start++;
			end++;
			String sub2 = str1.substring(start, end);
			flag = findWhoIsSmall(minString, sub2);
			if(flag == false)
			{
				minString = sub2;
			}
			if(maxString.compareTo(sub2) < 0)
			{
				maxString = sub2;
			}
		}
		System.out.println(minString);
		System.out.print(maxString);

	}

}
