import java.util.Scanner;


public class KPalindrome {

	public static boolean isKPalindrome(String str, int k, int i, int j)
	{
		System.out.println("Into: isKPalindrome(" + str + " " + k + " " + i + " -> " + j + " )");
		if(i >= str.length() || j<0)
			return true;
		if(i >= j)
			return true;
		if(k < 0)
			return false;
		
		if(str.charAt(i) == str.charAt(j))
		{
			return isKPalindrome(str, k, i+1, j-1);
		}
		else
		{
			if(k <= 0)
				return false;
			return isKPalindrome(str, k-1, i+1, j) || isKPalindrome(str, k-1, i, j-1);
		}
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.next();
		int k = s.nextInt();
		System.out.println(isKPalindrome(str, k, 0, str.length()-1));
		
	}

}
