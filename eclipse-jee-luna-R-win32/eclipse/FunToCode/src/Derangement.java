import java.util.ArrayList;
import java.util.Scanner;


public class Derangement {

	public static boolean isDerangment(char[] ca)
	{
		for(int i = 0;i<ca.length;i++)
		{
			if(Integer.parseInt(String.valueOf(ca[i])) == i+1)
			{
				return false;
			}
		}
		return true;
	}
	public static boolean isDerangmentRecursive(String str, int index)
	{
		if(index == 0)
			return true;
		int ex = Integer.parseInt(String.valueOf(str.charAt(index-1)));
		if(ex == index)
			return false;
		else
			return isDerangmentRecursive(str, index-1);
	}
	public static ArrayList <String> findDerangement(ArrayList <String> strarr)
	{
		ArrayList <String> derangemnet = new ArrayList <String>();
		for(String word:strarr)
		{
			char[] ca = word.toCharArray();
			//boolean flag = isDerangment(ca);
			boolean flag = isDerangmentRecursive(word, word.length());
			if(flag)
			{
				derangemnet.add(word);
			}
		}
		return derangemnet;
	}
	
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.next();
		ArrayList<String> strarr = new ArrayList<String>();
		strarr = PermutationsOfString.getPerm(str);
		//System.out.println("Permutation: " + strarr);
		strarr = findDerangement(strarr);
		System.out.println(strarr);
	}

}
