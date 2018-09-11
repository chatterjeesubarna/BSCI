import java.util.*;


public class ShortestCommonSubsequence {

	public static int[][] memoTable;
	public static char[][] memoCharTable;
	public static int count = 0;
	/*public static String findShortestCommonSupersequence(String str1, String str2, int i, int j)
	{
		
	}*/
	public static int findShortestCommonSupersequenceLength(String str1, String str2, int i, int j)
	{
		if(i < str1.length() && j < str2.length() && memoTable[i][j] != -1)
			return memoTable[i][j];
		
		System.out.println(++count + " Into: findShortestCommonSupersequenceLength(" + str1 + " " +  str2 + " " + i + " " + j + ")");
		if(i >= str1.length() && j >= str2.length())
			return 0;
		if(i>=str1.length())
			return (str2.length() - j);
		if(j>=str2.length())
			return (str1.length() - i);
		
		int val1=100000, val2=100000, val3=100000;
		if(str1.charAt(i) ==  str2.charAt(j))
		{
			val1 = 1 + findShortestCommonSupersequenceLength(str1, str2, i+1, j+1);
		}
		else
		{
			val2 = 1 + findShortestCommonSupersequenceLength(str1, str2, i+1, j);
			val3 = 1 + findShortestCommonSupersequenceLength(str1, str2, i, j+1);
		}
		//return Math.min(val1, Math.min(val2, val3));
		memoTable[i][j] = Math.min(val1, Math.min(val2, val3));
				
		return memoTable[i][j];
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str1 = s.next();
		String str2 = s.next();
		int a = str1.length();
		int b = str2.length(); 
		memoTable = new int[a][b];
		memoCharTable = new char[a][b];
		for(int i = 0;i<a;i++)
		{
			for(int j = 0;j<b;j++)
			{
				memoTable[i][j] = -1;
			}
		}
		int val = findShortestCommonSupersequenceLength(str1, str2, 0, 0);
		System.out.println("Length of Shortest Common Supersequence: " + val);
		for(int i = 0;i<a;i++)
		{
			System.out.println();
			for(int j = 0;j<b;j++)
			{
				System.out.print(memoTable[i][j] + " ");
			}
		}
	}

}
