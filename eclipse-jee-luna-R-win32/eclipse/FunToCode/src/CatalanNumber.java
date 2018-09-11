import java.util.Scanner;


public class CatalanNumber {

	static int n, count = 0;
	static int[] memoTable;
	static int generateCatalanNumber(int n)
	{
		if(memoTable[n] != -1)
			return memoTable[n];
		System.out.println("Number: " + ++count);
		if(n==0 || n==1)
			return 1;
		int ways = 0;
		for(int i = 0;i<n;i++)
		{
			ways = ways + generateCatalanNumber(i)*generateCatalanNumber(n-i-1);
		}
		memoTable[n] = ways;
		return ways;
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		memoTable = new int[n+1];
		for(int i = 0;i<=n ;i++)
		{
			memoTable[i] = -1;
		}
		memoTable[0] = 1;
		memoTable[1] = 1;
		System.out.println("nth catalan Numbre: " + generateCatalanNumber(n));
	}

}
