import java.util.Scanner;


public class SherlockandParentheses {

	public static int eL, eR, rL, rR; 
	public static void setValues(int L, int R)
	{
		if(L == R)
		{
			eL = L;
			eR = R;
			rL = 0;
			rR = 0;
		}
		else if (L > R)
		{
			eL = R;
			eR = R;
			rL = L - R;
			rR = 0;
		}
		else
		{
			eL = L;
			eR = L;
			rL = 0;
			rR = R - L;
		}
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		int c = 1;
		while(T-- != 0)
		{
			int L = s.nextInt();
			int R = s.nextInt();
			rL = 0;
			rR = 0;
			setValues(L, R);
			if(eR == 0 || eL == 0)
				System.out.println("Case #" + c++ + ": 0");
			else
			{
				int val = (eR*(eR + 1))/2;
				System.out.println("Case #" + c++ + ": " + val);
			}
		}

	}

}
