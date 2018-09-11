import java.util.Arrays;
import java.util.Scanner;


public class MinimumTimeToFinishTasks {

	public static int n;
	static int[] arr;
	static int[] memoTable;

	public static int findMinimumTime(int i)
	{
		if(i < n && memoTable[i] != -1)
			return memoTable[i];
		System.out.println("Into: findMinimumTime(" + i + ")");
		int val1 = 9999, val2 = 99999, val3 = 99999;
		if(i == n)
			return 0;

		val1 = arr[i] + findMinimumTime(i+1);
		if(i+2 < n) val2 = arr[i] + arr[i+2] + findMinimumTime(i+3);
		if(i+1 < n) val3 = arr[i+1] + findMinimumTime(i+2);


		memoTable[i] = Math.min(val1, Math.min(val2, val3));
		return memoTable[i];
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		arr = new int[n];
		memoTable = new int[n];
		for(int i = 0;i<n;i++)
		{
			arr[i] = s.nextInt();
			memoTable[i] = -1;
		}
		
		memoTable[n-1] = 0;
		if (n >= 2) memoTable[n-2] = Math.min(arr[n-2], arr[n-1]);
		System.out.println("Minimum Time is: " + findMinimumTime(0));
		System.out.println("mmeo Table is: " + Arrays.toString(memoTable));
	}

}
