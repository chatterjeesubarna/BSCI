import java.util.*;
public class LongestCommonSubsequence {

	public static String findLIS(String str1, String str2, int i, int j, StringBuffer res, int length)
	{
		if(res.length() == length)
			return String.valueOf(res.reverse());
		
		if(str1.charAt(i) ==  str2.charAt(j))
		{
			res.append(String.valueOf(str2.charAt(j)));
			return findLIS(str1, str2, i-1, j-1, res, length);
		}
		else
		{
			if(memoTable[i][j-1] >= memoTable[i-1][j])
			{
				//res.append(String.valueOf(str2.charAt(j)));
				return findLIS(str1, str2, i, j-1, res, length);
			}
			else
			{
				//res.append(String.valueOf(str1.charAt(i)));
				return findLIS(str1, str2, i-1, j, res, length);
			}
		}
		
	}
	public static int[][] memoTable;
	public static int LCS(String str1, String str2, int i, int j)
	{
		if(i < str1.length() && j < str2.length() && memoTable[i][j] != -1)
			return memoTable[i][j];
		
		if(i >= str1.length())
		{
			return 0;
		}
		if(j >= str2.length())
		{
			return 0;
		}
		int val1=0, val2=0, val3=0;
		if(str1.charAt(i) == str2.charAt(j))
		{
			memoTable[i][j] = 1 + LCS(str1, str2, i+1, j+1);
			return memoTable[i][j];
		}
		memoTable[i][j] = Math.max(LCS(str1, str2, i, j+1), LCS(str1, str2, i+1, j));
		return memoTable[i][j];
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = s.next();
		String str2 = s.next();
		int n = str1.length();
		int m = str2.length();
		memoTable = new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				memoTable[i][j] = -1;
			}
		}
		
		int val = LCS(str1, str2, 0, 0);
		System.out.println("Length of LCS: " + val);
		for(int i=0;i<n;i++)
		{
			System.out.println();
			for(int j=0;j<m;j++)
			{
				System.out.print(memoTable[i][j] + " ");
			}
		}
		StringBuffer res = new StringBuffer("");
		//System.out.println("\n The LCS is: " + findLIS(str1, str2, n-1, m-1, res, val));
	}

}
