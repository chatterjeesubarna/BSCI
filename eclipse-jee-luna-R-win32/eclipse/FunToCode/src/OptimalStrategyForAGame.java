import java.util.Arrays;
import java.util.Scanner;


public class OptimalStrategyForAGame {

	static int n;
	static int[] arr;
	static int[][] memoTable;

	public static int maxPoint(int i, int j)
	{
		if(i<n && j<n && memoTable[i][j] != -1)
			return memoTable[i][j];
		if(i >= n || j<0)
			return 0;
		if(i >= j)
			return 0;
		int val1, val2, start, stop;
		if(i+1 < n && arr[i+1] >= arr[j])
		{
			start = i+2;
			stop = j;
		}
		else
		{
			start = i+1;
			stop = j-1;
		}
		val1 = arr[i] + maxPoint(start, stop);
		if(j-1 >=0 && arr[i] >= arr[j-1])
		{
			start = i+1;
			stop = j-1;
		}
		else
		{
			start = i;
			stop = j-2;
		}
		val2 = arr[j] + maxPoint(start, stop);
		memoTable[i][j] = Math.max(val1,  val2);
		return memoTable[i][j];
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		arr = new int[n];
		memoTable = new int[n][n];
		for(int i = 0;i<n;i++)
		{
			arr[i] = s.nextInt();
		}
		for(int i = 0;i<n;i++)
		{
			for(int j = 0;j<n;j++)
			{
				memoTable[i][j] = -1;
			}
		}
		System.out.println("The max point collected by player 1: " + maxPoint(0, n-1));
		/*System.out.println("mmeo Table is: ");
		for(int i = 0;i<n;i++)
		{
			System.out.println();
			for(int j = 0;j<n;j++)
			{
				System.out.print(memoTable[i][j] + " ");
			}
		}*/
	}

}
