import java.util.Scanner;


public class MaximumLengthSnakeSequence {

	public static int[][] memoTable;
	static int n, m;
	public static int findLengthSnakeSequence(int[][] arr, int i, int j)
	{
		if(i < n && j < m && memoTable[i][j] != -1)
			return memoTable[i][j];
		if(i >= n || j >= m)
			return 0;
		int val1 = 1, val2 = 1;
		if(j+1 < m && Math.abs(arr[i][j+1] - arr[i][j]) == 1)
		{
			val1 = 1 + findLengthSnakeSequence(arr, i, j+1);
		}
		if(i+1 < n && Math.abs(arr[i][j] - arr[i+1][j]) == 1)
		{
			val2 = 1 + findLengthSnakeSequence(arr, i+1, j);
		}
		memoTable[i][j] = Math.max(val1,  val2);
		return memoTable[i][j];
		
	}
	public static String findSnakeSequence(StringBuffer res, int[][] arr, int i, int j)
	{
		res.append(arr[i][j]).append(" ");
		if(memoTable[i][j] == 1)
			return String.valueOf(res);
		if(j+1 < m && memoTable[i][j] - memoTable[i][j+1] == 1)
			return findSnakeSequence(res, arr, i, j+1);
		else if(i+1 < n && memoTable[i][j] - memoTable[i+1][j] == 1)
			return findSnakeSequence(res, arr, i+1, j);
		return "";
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		m = s.nextInt();
		int[][] arr = new int[n][m];
		memoTable = new int[n][m];
		for(int i = 0;i<n;i++)
		{
			for(int j = 0;j<m;j++)
			{
				arr[i][j] = s.nextInt();
				memoTable[i][j] = -1;
			}
		}
		System.out.println("Max length is: " + findLengthSnakeSequence(arr, 0, 0));
		for(int i=0;i<n;i++)
		{
			System.out.println();
			for(int j=0;j<m;j++)
			{
				System.out.print(memoTable[i][j] + " ");
			}
		}
		StringBuffer res = new StringBuffer("");
		System.out.println("\nMax Snake Sequence is: " + findSnakeSequence(res, arr, 0, 0));

	}

}
