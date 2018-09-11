import java.util.Scanner;


public class SherlockandAnagrams1 {

	static boolean checkAnagram(String sub1, String sub2)
	{
		int[] f = new int[27];
		int[] s = new int[27];
		int i=0, j=0, l1 = sub1.length(), l2 = sub2.length();
		while(i<l1)
		{
			int val = (int)sub1.charAt(i++) - 96;
			f[val] = f[val] + 1;
		}
		while(j<l2)
		{
			int val = (int)sub2.charAt(j++) - 96;
			s[val] = s[val] + 1;
		}
		for(i = 1;i<=26;i++)
			if(f[i] != s[i])
				return false;
		
		return true;
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		long no_of_anagram = 0;
		while(t--!=0)
		{
			no_of_anagram = 0;
			String str = s.next();
			int len = str.length();
			str = str + " ";
			for(int length = 1; length<=len; length++)
			{
				for(int i=0; i<len-length;i++)
				{
					String sub1 = str.substring(i, i+length);
					//System.out.println("Furst: " + sub1);
					for(int j=i+1; j<len;j++)
					{
						if(j+length <= len)
						{
							String sub2 = str.substring(j, j+length);
							//System.out.println("Second: " + sub2);
							if(checkAnagram(sub1, sub2) == true)
								no_of_anagram++;
						}
					}
				}
			}
			System.out.println(no_of_anagram);
		}


	}

}

