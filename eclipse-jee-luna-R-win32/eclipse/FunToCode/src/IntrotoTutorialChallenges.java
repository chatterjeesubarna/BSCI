import java.util.Scanner;


public class IntrotoTutorialChallenges {

	static int findV(long[] arr, int start, int stop, int V)
	{
		int mid = (start + stop)/2;
		if(V < arr[mid])
			return findV(arr, start, mid-1, V);
		else if(V > arr[mid])
			return findV(arr, mid+1, stop, V);
		
		return mid;
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int n = s.nextInt();
		long[] arr = new long[n];
		for(int i = 0;i<n;i++)
		{
			arr[i] = s.nextLong();
		}
		
		System.out.println(findV(arr, 0, n-1, V));

	}

}
