import java.util.Scanner;


public class SherlockandWatsonGymSecrets {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		int c = 1;
		long m = (long)Math.pow(10, 9) + 7;
		while(T-- != 0)
		{
			long A = s.nextLong();
			long B = s.nextLong();
			long N = s.nextLong();
			long K = s.nextLong();
			long count = 0;
			for(long i = 1;i<=N;i++)
			{
				for(long j = 1;j<=N;j++)
				{
					if(i==j)
						continue;
					double val = Math.pow(i, A) + Math.pow(j, B);
					//System.out.println("Entered for i = " + i + " j = " + j + " val = " + val);
					if(val % K == 0)
					{
						//System.out.println("(" + i + "," + j + ")");
						count++;
					}
				}
			}
			System.out.println("Case #" + c++ + ": " + (count%m));
		}

	}

}
