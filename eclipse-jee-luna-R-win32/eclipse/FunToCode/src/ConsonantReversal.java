import java.util.Scanner;


public class ConsonantReversal {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while(n--!=0)
		{
			String str = s.next();
			int len = str.length();
			char[] arr = new char[len];
			for(int i = 0;i<len;i++)
			{
				arr[i] = str.charAt(i);
			}
			
			int start = 0, stop = len-1;
			while(start < stop)
			{
				if(arr[start] == 'a' || arr[start] == 'e' || arr[start] == 'i' || arr[start] == 'o' || arr[start] == 'u')
				{
					start++;
				}
				else if(arr[stop] == 'a' || arr[stop] == 'e' || arr[stop] == 'i' || arr[stop] == 'o' || arr[stop] == 'u')
				{
					stop--;
				}
				else
				{
					char temp = arr[stop];
					arr[stop] = arr[start];
					arr[start] = temp;
					start++;
					stop--;
				}
			}
			for(int i = 0;i<len;i++)
			{
				System.out.print(arr[i]);
			}
			System.out.println();
		}
	}

}
