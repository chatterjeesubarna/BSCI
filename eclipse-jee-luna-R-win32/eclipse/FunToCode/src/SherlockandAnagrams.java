import java.math.BigInteger;
import java.util.Scanner;


public class SherlockandAnagrams {

	static long fac(int n)
	{
		//System.out.println("\n Fac(" + n + ")");
		if ((n==1) || (n==0))
			return 1;
		else
			return n*fac(n-1);
	}
	public static void main(String[] args) {
		//System.out.println("\n In main Fac(100):" + BigIntFactorial.BigInteger_Factorial(BigInteger.valueOf(50)));
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t--!=0)
		{
			String str = s.next();
			int len = str.length();
			int[] arr = new int[27];
			int i=0;
			long no_of_anagram = 0;
			int consecutive = 0;
			while(i != len)
			{
				int val = (int)str.charAt(i) - 96;
				if(arr[val] != 0)
				{
					no_of_anagram = no_of_anagram + arr[val];
				}
				arr[val] = arr[val] + 1;
				
				if(i != len-1)
				{
					if((int)str.charAt(i) == (int)str.charAt(i+1))
						{
							consecutive++;
							int j1 = i-1, j2 = i+2;
							while((j1 >= 0 && j2 < len) && ((int)str.charAt(j1) == (int)str.charAt(j2)))
							{
								j1--;
								j2++;
								no_of_anagram++;
							}
						}
				}
				i++;
			}
			System.out.println("temp val: "+no_of_anagram);
			for(i=1;i<27;i++)
			{
				if ((arr[i] == 0) || (arr[i] == 1)) continue;
				//System.out.println("Sending for fac(): " + arr[i]);
				BigInteger v1 = BigIntFactorial.BigInteger_Factorial(BigInteger.valueOf(arr[i]));
				//System.out.println("Successful fac(): " + arr[i] + ": " + v1);
				BigInteger v2 = BigIntFactorial.BigInteger_Factorial(BigInteger.valueOf(arr[i] - 2));
				int v3 = arr[i]-2;
				//System.out.println("Successful fac(): " + v3 + ": " + v2);
				BigInteger val = v1.divide((v2.multiply(BigInteger.valueOf(2))));
				//long val = fac(arr[i])/(fac(2)*fac(arr[i]-2));
				no_of_anagram = no_of_anagram + val.longValue();
			}


			no_of_anagram = no_of_anagram - consecutive;
			System.out.println(no_of_anagram);
		}
	}

}
