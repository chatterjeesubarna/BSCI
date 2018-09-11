import java.util.*;


public class LovelyPalindromes {

	public static char[] formPalindrome(int length, int n)
	{
		char ch[] = new char[length];
		for(int i = 0;i<ch.length;i++)
		{
			ch[i] = '0';
		}
		
		for(int i = 0;i<=(length/2)-1;i++)
		{
			int pair = i+1;
			int remPair = (length/2) - pair;
			int span = (int)Math.pow(10, remPair);
			if(n < span)
			{
				if(i == 0)
				{
					ch[0] = '1';
					ch[length - 1] = '1';
				}
				else
				{
					ch[i] = '0';
					ch[length - i - 1] = '0';
				}
			}
			else
			{
				int quotient = n/span;
				ch[i] = (char)('0' + quotient);
				ch[length - i - 1] = (char)('0' + quotient);
				n = n - span;
			}
		}
		
		return ch;
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int length =0 , divisor = 9, prevDivisor = 0;
		int m = n;
		
		while(m != 0)
		{
			m = m/divisor;
			prevDivisor = divisor;
			divisor = divisor*10;
			length = length + 2;
		}
		
		char ch[] = new char[length];
		divisor = divisor/10;
		prevDivisor = prevDivisor/10;
		int remainder = n - prevDivisor;
		int index1 = 0, index2 = length - 1, noOfPairs = (length/2) - 1;
		ch = formPalindrome(length, remainder);
		for(int i = 0;i<ch.length;i++)
			System.out.print(ch[i]);
	}

}
