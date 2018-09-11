import java.util.*;


public class Travel {

	static int N, M, K, D, S;
	static int[][] roadConn; 
	static int[][] time;
	static int memoTable[][];
	static int c = 1;

	public static int findMinTime(int source, int S, int D)
	{
		//System.out.println("From city " + source + " to " + D + " at " + S + " o clock");
		int val1 = 100000;
		int val2 = 0;
		if(S >= 24)
			return val1;
		for(int i = 0;i<=N;i++)
		{
			if(roadConn[source][i] != -1)
			{
				int cost = time[roadConn[source][i]][S];
				if(i == D)
				{
					val2 = cost;
				}
				else
				{
					val2 = cost + findMinTime(i, S+cost, D);
				}

				val1 = Math.min(val1, val2);
			}
		}
		//System.out.println("From city " + source + " to " + D + " at " + S + " o clock, Returned " +  val1);
		return val1;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		int c = 1;
		while(T-- != 0)
		{
			N = s.nextInt();
			M = s.nextInt();
			K = s.nextInt();
			roadConn = new int[N+1][N+1];
			memoTable = new int[N+1][N+1];
			time = new int[M][24];
			int m = 0;

			for(int i = 0;i<=N;i++)
			{
				for(int j = 0;j<=N;j++)
				{
					roadConn[i][j] = -1;
				}
			}
			while(M-- != 0)
			{
				int x = s.nextInt();
				int y = s.nextInt();
				roadConn[x][y] = m;
				roadConn[y][x] = m;
				for(int i = 0;i<24;i++)
				{
					time[m][i] = s.nextInt();
				}
				m++;
			}
			
			/*System.out.println("roadConn:");
			for(int i = 1;i<=N;i++)
			{
				System.out.println();
				for(int j = 1;j<=N;j++)
				{
					System.out.print(roadConn[i][j] + " ");
				}
			}*/
			System.out.print("Case #" + c + ": ");
			while(K-- != 0)
			{
				D = s.nextInt();
				S = s.nextInt();
				int res = findMinTime(1, S, D);
				if (res == 100000)
					System.out.print("-1 ");
				else
					System.out.print(res + " ");
			}
			System.out.println();
			c++;
		}
		

	}

}
