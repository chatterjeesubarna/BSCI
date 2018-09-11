import java.util.*;


public class WildcardPatternMatching {

	public static int count = 1;
	public static int memoTable[][];
	
	public static boolean convert(int b)
	{
		if(b==1)
			return true;
		return false;
	}
	public static boolean whetherPatternMatches(String text, String pattern, int i, int j)
	{
		if(i<text.length() && j<pattern.length() && memoTable[i][j] != -1)
			return convert(memoTable[i][j]);
		//System.out.println(count++);
		if(j >= pattern.length())
			return true;
		if(i >= text.length())
		{
			if(j >= pattern.length())
				return true;
			else
				return false;
		}
		boolean b=false;
		if(pattern.charAt(j) == '*')
		{
			b = whetherPatternMatches(text, pattern, i+1, j) || whetherPatternMatches(text, pattern, i, j+1) || whetherPatternMatches(text, pattern, i+1, j+1);
		}
		else if(pattern.charAt(j) == '?')
		{
			b = whetherPatternMatches(text, pattern, i+1, j+1);
		}
		else if(text.charAt(i) == pattern.charAt(j))
		{
			b = whetherPatternMatches(text, pattern, i+1, j+1);
		}
		else
		{
			b = false;
		}
		if(b == false)
			memoTable[i][j] = 0;
		else 
			memoTable[i][j] = 1;
		return b;
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String text = s.next();
		String pattern = s.next();
		int a = text.length();
		int b = pattern.length();
		memoTable = new int[a][b];
		for(int i = 0;i<a;i++)
		{
			for(int j = 0;j<b;j++)
			{
				memoTable[i][j] = -1;
			}
		}
		System.out.println(whetherPatternMatches(text, pattern, 0, 0));
	}

}
