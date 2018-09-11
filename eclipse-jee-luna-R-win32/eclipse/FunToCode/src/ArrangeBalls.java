import java.util.Scanner;


public class ArrangeBalls {

	static int tot = 0;
	public static int waysToArrange(int p, int q, int r, int type, int c)
	{
		if(p==0 && q==0 && r==0)
			return 0;
		int val1 =0, val2 = 0;

		if(type == 0)
		{
			if(p < 0)
				return 0;
			if(p == 0)
			{
				if(c == tot)
					return 1;
				else
					return 0;
			}
			if(p == 1 && q==0 & r==0 && c == tot-1)
				return 1;
			
			val1 = waysToArrange(p-1, q, r, 1, c+1);
			val2 = waysToArrange(p-1, q, r, 2, c+1);
		}
		else if(type == 1)
		{
			if(q < 0)
				return 0;
			if(q == 0)
			{
				if(c == tot)
					return 1;
				else
					return 0;
			}
			if(q == 1 && p==0 & r==0 && c == tot-1)
				return 1;
			
			val1 = waysToArrange(p, q-1, r, 0, c+1);
			val2 = waysToArrange(p, q-1, r, 2, c+1);
		}
		else if(type == 2)
		{
			if(r < 0)
				return 0;
			if(r == 0)
			{
				if(c == tot)
					return 1;
				else
					return 0;
			}
			if(r == 1 && p==0 & q==0 && c == tot-1)
				return 1;
			val1 = waysToArrange(p, q, r-1, 0, c+1);
			val2 = waysToArrange(p, q, r-1, 1, c+1);
		}
		return val1 + val2;

	}
	public static int findTotalWays(int p, int q, int r)
	{
		int val1 = waysToArrange(p, q, r, 0, 0);
		int val2 = waysToArrange(p, q, r, 1, 0);
		int val3 = waysToArrange(p, q, r, 2, 0);
		System.out.println("Strat with p: " + val1);
		System.out.println("Strat with q: " + val2);
		System.out.println("Strat with r: " + val3);
		return val1 + val2 + val3;
	}


	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int p = s.nextInt();
		int q = s.nextInt();
		int r = s.nextInt();
		tot = p + q + r;
		System.out.println("Total ways: " + findTotalWays(p, q, r));

	}

}
