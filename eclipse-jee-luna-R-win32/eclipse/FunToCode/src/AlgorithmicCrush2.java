import java.util.Scanner;


public class AlgorithmicCrush2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		long[] arr = new long[N+1];
		while(M-- != 0)
		{
			int a = s.nextInt();
			int b = s.nextInt();
			long k = s.nextLong();
			
			arr[a] = arr[a] + k;
			if(b+1 <= N)
				arr[b+1] = arr[b+1] - k;
		}
		long max = 0, sum = 0;
		for(int i =1;i<=N ;i++)
		{
			sum = sum + arr[i];
			if(sum > max)
				max = sum;
		}
		System.out.println(max);

	}

}
