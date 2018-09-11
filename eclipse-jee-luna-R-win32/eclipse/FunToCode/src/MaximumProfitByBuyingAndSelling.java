import java.util.Arrays;
import java.util.Scanner;


public class MaximumProfitByBuyingAndSelling {

	static int[] memoTable;
	static int[] arr;
	static int n;
	public static int calProfit(int x, int y)
	{
		return arr[y] - arr[x];
	}
	public static int findMaxProfit(int i, int k)
	{
		if(i < n && memoTable[i] != -1)
			return memoTable[i];
		int index = i+1, totalProfit1 = 0, totalProfit2 = 01, finalProfit = 0;
		if(k == 0)
			return 0;
		if(i >= n)
			return 0;
		while(index < n)
		{
			totalProfit1 = calProfit(i, index) + findMaxProfit(index+1, k-1);
			totalProfit2 = findMaxProfit(index+1, k);
			index++;
			finalProfit = Math.max(finalProfit, Math.max(totalProfit1, totalProfit2));
		}
		memoTable[i] = finalProfit;
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
		int k = s.nextInt();
		
		System.out.println("Max profit: " + findMaxProfit(0, k));
		System.out.println("memo Table: " + Arrays.toString(memoTable));

	}

}
