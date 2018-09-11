import java.util.*;


public class KMP {

	public static ArrayList<Integer> findOccurrence (String text, String pattern, int[] prefixarr)
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int i = 0, j = 0;
		while(i < text.length())
		{
			if(text.charAt(i) == pattern.charAt(j))
			{
				if(j == pattern.length() - 1)
				{
					arr.add(i - j);
					j = prefixarr[j];
					//i++;
				}
				else
				{
					i++;
					j++;
				}
			}
			else
			{
				if(j != 0)
				{
					j=prefixarr[j-1];
				}
				else
				{
					i++;
				}
			}
		}
		return arr;
	}
	public static int[] findPrefixArray(String pattern)
	{
		int lenPatt = pattern.length();
		int prefixarr[] = new int[lenPatt];
		int i = 1, j = 0;
		prefixarr[0] = 0;
		boolean flag = false;
		while(i<lenPatt)
		{
			if(pattern.charAt(i) == pattern.charAt(j))
			{
				prefixarr[i] = prefixarr[i-1] + 1;
				i++;
				j++;
			}
			else
			{
				if(j == 0)
				{
					prefixarr[i] = 0;
					i++;
				}
				else
				{
					while(j != 0)
					{
						j = prefixarr[j-1];
						if(pattern.charAt(i) == pattern.charAt(j))
						{
							prefixarr[i] = prefixarr[j] + 1;
							i++;
							j++;
							flag = true;
							break;
						}
					}
					if(flag)
					{
						flag = false;
					}
					else
					{
						prefixarr[i] = 0;
					}
				}
			}
		}
		return prefixarr;
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String text = s.next();
		String pattern = s.next();
		int lenText = text.length();
		int lenPatt = pattern.length();
		int prefixarr[] = findPrefixArray(pattern);
		System.out.println("Prefix Array is: \n" + Arrays.toString(prefixarr));
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr = findOccurrence(text, pattern, prefixarr);
		if(arr.size() == 0)
			System.out.println("Not found");
		else
			System.out.println("Found at " + arr);
	}

}
