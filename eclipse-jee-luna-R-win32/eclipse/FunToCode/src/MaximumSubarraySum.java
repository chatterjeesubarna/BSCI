import java.util.*;


public class MaximumSubarraySum {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int Q = s.nextInt();
		while(Q-- != 0)
		{
			int N = s.nextInt();
			long M = s.nextInt();
			long[] arr = new long[N];
			long max = -9999, temp = 0;
			for(int i = 0;i<N;i++)
			{
				arr[i] = s.nextLong();
				if(arr[i]%M > max)
					max = arr[i]%M;
			}

			int start = 0;
			for(int j = 0;j<N-1;j++)
			{
				temp = 0;
				for(int i = j;i<N;i++)
				{
					temp = temp + arr[i];
					if(temp%M > max)
						max = temp%M;
				}
			}
			System.out.println((max));
		}
	}

}
