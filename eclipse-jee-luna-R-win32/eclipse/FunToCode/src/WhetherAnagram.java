import java.util.*;
public class WhetherAnagram {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str1 = s.next();
		String str2 = s.next();
		int arr[] = new int [27];
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		int flag = 1;

		for(int i=0;i<ch1.length;i++)
		{
			int index = ch1[i] - 'a';
			arr[index] = arr[index] + 1;
		}

		for(int i=0;i<ch2.length;i++)
		{
			int index = ch2[i] - 'a';
			arr[index] = arr[index] - 1;
			if(arr[index] < 0)
			{
				flag = 0;
				break;
			}
		}

		if(flag == 0)
		System.out.println("Not Permutation");
		else
		System.out.println("Permutation");

	}

}
