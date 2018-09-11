import java.util.Arrays;
import java.util.*;


public class AlbocedeDNA {

	public static int[] memoTable;
	public static int len;
	public static int countChar(String str, char ch)
	{
		int c = 0;
		for(int i = str.indexOf(ch);i<str.length();i++)
		{
			if(str.charAt(i) == ch)
				c++;
			else
				break;
		}
		return c;
	}
	public static boolean ifValidDNA(StringBuffer result)
	{
		boolean flag = false;
		if((countChar(String.valueOf(result), 'a') == countChar(String.valueOf(result), 'c')) && (countChar(String.valueOf(result), 'b') == countChar(String.valueOf(result), 'd'))) 
		{
			int posb = result.indexOf("b");
			int posc = result.indexOf("c");
			int posd = result.indexOf("d");
			if(result.substring(posb).indexOf('a') != -1 || result.substring(posc).indexOf('b') != -1 || result.substring(posd).indexOf('c') != -1)
			{
				return false;
			}
			else
				return true;
		}
		return flag;
	}
	public static int findNoOfWays(String str, char ch, StringBuffer result, int index)
	{
		if(index<len && memoTable[index] != -1)
			return memoTable[index];
		int val1=0, val2=0, val3 = 0, val4 = 0;
		if(ch == 'a')
		{
			int nextPosA = str.substring(1).indexOf('a');
			int nextPosB = str.substring(1).indexOf('b');
			if(nextPosA != -1)
			{
				val1 = findNoOfWays(str.substring(str.substring(1).indexOf('a')), 'a', result, index+nextPosA+1);
				result.append("a");
				val2 = findNoOfWays(str.substring(str.substring(1).indexOf('a')), 'a', result, index+nextPosA+1);
			}
			if(nextPosB != -1)
			{
				val3 = findNoOfWays(str.substring(str.substring(1).indexOf('b')), 'b', result, index+nextPosB+1);
			}
		}
		else if(ch == 'b')
		{
			int nextPosB = str.substring(1).indexOf('b');
			int nextPosC = str.substring(1).indexOf('c');
			if(nextPosB != -1)
			{
				result.append("b");
				val1 = findNoOfWays(str.substring(str.substring(1).indexOf('b')), 'b', result, index+nextPosB+1);
			}
			if(nextPosC != -1)
			{
				val2 = findNoOfWays(str.substring(str.substring(1).indexOf('c')), 'c', result, index+nextPosC+1);
			}
		}
		else if(ch == 'c')
		{
			int nextPosC = str.substring(1).indexOf('c');
			int nextPosD = str.substring(1).indexOf('d');
			if(nextPosC != -1)
			{
				result.append("c");
				val1 = findNoOfWays(str.substring(str.substring(1).indexOf('c')), 'c', result, index+nextPosC+1);
			}
			if(nextPosD != -1)
			{
				val2 = findNoOfWays(str.substring(str.substring(1).indexOf('d')), 'd', result, index+nextPosD+1);
			}
		}
		else if(ch == 'd')
		{
			if(ifValidDNA(result))
				return 1;
			if(countChar(String.valueOf(result), 'b') > countChar(String.valueOf(result), 'd'))
			{
				result.append("d");
				int nextPosD = str.substring(1).indexOf('d');
				if(nextPosD != -1)
				{
					val1 = findNoOfWays(str.substring(str.substring(1).indexOf('d')), 'd', result, index+nextPosD+1);
				}
			}
			else
				return 0;
		}
		memoTable[index] = val1 + val2;
		return memoTable[index];
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		int c = 1;
		while(T-- != 0)
		{
			String str = s.next();
			StringBuffer result = new StringBuffer();
			len = str.length();
			memoTable = new int[str.length()];
			for(int i = 0;i<str.length();i++)
			{
				memoTable[i] = -1;
			}
			System.out.println("Case #" + c++ + ": " + findNoOfWays(str, 'a', result, 0));
		}

	}

}
