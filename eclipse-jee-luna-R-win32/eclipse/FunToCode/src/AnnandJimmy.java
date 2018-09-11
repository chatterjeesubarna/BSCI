import java.util.Scanner;


public class AnnandJimmy {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		long max = 0;
		
		for(int i = 1;i<=N;i++)
		{
			for(int j = 1;j<=N;j++)
			{
				long prod = 1;
				for(int k = 1;k<=N; k++)
				{
					if(i + j + k == N)
					{
						prod = i*j*k;
						if(prod > max)
							max = prod;
					}
				}
			}
		}
		System.out.println(max);

	}

}
