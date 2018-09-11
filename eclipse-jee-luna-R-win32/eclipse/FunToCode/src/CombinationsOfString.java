import java.util.ArrayList;
import java.util.Scanner;


public class CombinationsOfString {

	public static String insertChar(char first, String rest)
	{
		StringBuilder strb = new StringBuilder(rest);
		strb.append(first);
		return String.valueOf(strb);
	}
	public static ArrayList<String> getCombination(String str)
	{
		System.out.println("Now STring is: " + str);
		ArrayList<String> strarr = new ArrayList<String>();
		if(str == null)
			return null;
		if(str.length()==1)
		{
			strarr.add(str);
			return strarr;
		}
		char first = str.charAt(0);
		String rest = str.substring(1);
		ArrayList<String> words = new ArrayList<String>();
		words = getCombination(rest);
		strarr.add(String.valueOf(first));
		for(String word:words)
		{
			strarr.add(word);
			String obtained = insertChar(first, word);
			strarr.add(obtained);
		}
		return strarr;
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.next();
		ArrayList<String> strarr = new ArrayList<String>();
		strarr = getCombination(str);
		strarr.add(0, "");
		System.out.println(strarr);
	}

}
