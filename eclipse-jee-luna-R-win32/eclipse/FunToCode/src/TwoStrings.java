import java.util.*;


public class TwoStrings {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t--!=0)
		{
			String str1 = s.next();
			String str2 = s.next();
			int len1 = str1.length();
			int len2 = str2.length();
			int i = 0, j = 0;
			int flag = 0;
			int[] arr = new int[27];
			str1 = str1.toLowerCase();
			str2 = str2.toLowerCase();
			while(i != len1)
			{
				int ch = (int)str1.charAt(i) - 96;
				arr[ch] = arr[ch] + 1;
				i++;
			}
			
			while(j != len2)
			{
				int ch = (int)str2.charAt(j) - 96;
				if (arr[ch] != 0)
				{
					flag = 1;
					break;
				}
				j++;
			}
			
			if(flag == 0)
				System.out.println("NO");
			else
				System.out.println("YES");
		}

	}

}
