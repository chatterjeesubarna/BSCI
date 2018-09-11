import java.util.*;


public class PermutationsOfString {

	public static String insertChar(char first, String rest, int j)
	{
		StringBuilder strb = new StringBuilder("");
		if(j < rest.length())
		{
			strb.append(rest.substring(0, j)).append(first);
			strb.append(rest.substring(j));
		}
		else
		{
			strb.append(rest).append(first);
		}
		return String.valueOf(strb);
	}
	public static ArrayList<String> getPerm(String str)
	{
		if(str == null)
		{
			return null;
		}
		ArrayList<String> strarr = new ArrayList<String>();
		ArrayList<String> words = new ArrayList<String>();
		if(str.length() == 0)
		{ 
			strarr.add("");
			return strarr;
		}
		char first = str.charAt(0);
		String rest = str.substring(1);
		words = getPerm(rest);
		for(String word:words)
		{
			for(int j = 0;j<=word.length();j++)
			{
				String obtained = insertChar(first, word, j);
				strarr.add(obtained);
			}
		}
		return strarr;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.next();
		ArrayList<String> strarr = new ArrayList<String>();
		strarr = getPerm(str);
		System.out.println(strarr);
	}

}
