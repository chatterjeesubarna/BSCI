import java.util.*;


public class gNumbers {

	public static int memoTable[][];
	public static boolean isAgNumber(double val)
	{
		if(val == 1 || val == 2 || val == 3)
			return true;
		for(int i = 2;i<=(int)Math.sqrt(val);i++)
		{
			if(val%i == 0)
				return false;
		}
		return true;
	}
	public static int sumOfDigits(int N)
	{
		int s = 0;
		while(N != 0)
		{
			int r = N%10;
			s = s+r;
			N = N / 10;
		}
		return s;
	}
	public static ArrayList<Integer> findPrimeFactor(int N)
	{
		ArrayList<Integer> pfactor = new ArrayList<Integer>();
		for(int i = 2;i<=(int)N/2;i++)
		{
			if(N%i == 0 && isAgNumber(i))
			{
				pfactor.add(i);
			}
		}
		return pfactor;
	}
	public static int findRemNumber(int N, int p)
	{
		while(N%p == 0)
		{
			N = N/p;
		}
		return N;
	}

	public static int playGame(int N, int player)
	{
		//if(memoTable[player][N] != -1)
		//return memoTable[player][N];
		//System.out.println("Player " + player + " got " + N);
		if(isAgNumber(sumOfDigits(N)))
			return (player+1)%2;
		if(isAgNumber(N))
			return (player);
		ArrayList<Integer> pfactor = new ArrayList<Integer>();
		pfactor = findPrimeFactor(N);
		//System.out.println("prime factor: " + pfactor);
		int val1 = 0;
		if(player == 0)
			val1 = 1;
		int nextPlayer = (player+1)%2;
		for(int i = 0;i<pfactor.size();i++)
		{
			int nextN = findRemNumber(N, pfactor.get(i));
			//System.out.println("CAlling next palyer with " + nextN);
			if(player == 0)
			{
				val1 = Math.min(val1, playGame(nextN, nextPlayer));
			}
			else
			{
				val1 = Math.max(val1, playGame(nextN, nextPlayer));
			}
		}
		memoTable[player][N] = val1;
		//System.out.println("Result of " + player + " (" + N + "): " + val1);
		return val1;
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		int c = 1;
		//System.out.println(findRemNumber(36, 2));
		while(T-- != 0)
		{
			int N = s.nextInt();
			memoTable = new int[2][N+1];
			for(int i = 0;i<2;i++)
			{
				for(int j = 0;j<=N;j++)
				{
					memoTable[i][j] = -1;
				}
			}
			System.out.print("Case #" + c++ + ": ");
			int winner = playGame(N, 0);
			if(winner == 0)
				System.out.println("Laurence");
			else
				System.out.println("Seymour");
		}

	}

}
