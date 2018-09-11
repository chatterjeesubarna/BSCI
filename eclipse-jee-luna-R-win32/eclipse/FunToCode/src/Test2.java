import java.util.*;


public class Test2 {

	public static int memoTable[][];
	public static int len1, len2, result;
	
	public static int LCS(String str1, String str2, int index1, int index2)
	{
		if(index1<len1 && index2 < len2 && memoTable[index1][index2] != -1)
			return memoTable[index1][index2];
		if(index1 >= len1 || index2 >= len2)
			return 0;

		if(str1.charAt(index1) == str2.charAt(index2))
		{
			int val = (1 + LCS(str1, str2, index1 + 1, index2 + 1));
			memoTable[index1][index2] = val;
		}
		else
		{
			int val1 = LCS(str1, str2, index1 + 1, index2);
			int val2 = LCS(str1, str2, index1, index2 + 1);
			memoTable[index1][index2] = Math.max(val1,  val2);
		}
		return memoTable[index1][index2];
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = s.next();
		String str2 = s.next();
		len1 = str1.length();
		len2 = str2.length();
		memoTable = new int[len1][len2];
		for(int i = 0;i<len1;i++)
		{
			for(int j = 0;j<len2;j++)
			{
				memoTable[i][j] = -1;
			}
		}
		result = LCS(str1, str2, 0, 0);
		System.out.println("Length of LCS: " + result);
		System.out.println("Memotable: \n" );
		for(int i = 0;i<len1;i++)
		{
			for(int j = 0;j<len2;j++)
			{
				System.out.print(memoTable[i][j] + " ");
			}
			System.out.println();
		}

	}

}
