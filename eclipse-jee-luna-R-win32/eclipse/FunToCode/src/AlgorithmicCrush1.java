import java.util.Scanner;


public class AlgorithmicCrush1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		long[] arr = new long[N+1];
		int[] arr_indication = new int[N+1];
		long val = 0, max = 0;
		while(M-- != 0)
		{
			int a = s.nextInt();
			int b = s.nextInt();
			long k = s.nextLong();
			
			if(a != b)
			{
				if(arr_indication[a] == 0)
				{
					arr_indication[a] = 1;
					arr[a] = k;
				}
				else if(arr_indication[a] == 1)
				{
					arr[a] = arr[a] + k;
				}
				else if(arr_indication[a] == -1)
				{
					arr[a] = arr[a] - k;
					int j = a+1;
					while(arr_indication[j] != 0)
						j++;
				}
			}
			
			for(int i = a; i<=b; i++)
			{
				arr[i] = arr[i] + k;
			}
		}
		for(int i = 1; i<=N; i++)
		{
			if(max < arr[i])
				max = arr[i];
		}
		System.out.println(max);

	}

}
