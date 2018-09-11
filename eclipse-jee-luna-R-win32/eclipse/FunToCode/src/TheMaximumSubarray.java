import java.util.Scanner;


public class TheMaximumSubarray {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while(T-- != 0)
		{
			int N = s.nextInt();
			long[] arr = new long[N]; 
			long temp_sum = 0, max_sum = 0, non_contiguous_sum = 0, max = -99999;
			for(int i = 0;i<N;i++)
			{
				arr[i] = s.nextLong();
				if(arr[i] > 0)
					non_contiguous_sum = non_contiguous_sum + arr[i];
				if(max < arr[i])
					max = arr[i];
			}
			if(non_contiguous_sum == 0)
			{
				non_contiguous_sum = max;
				max_sum = max;
			}
			else
			{
				for(int i = 0;i<N;i++)
				{
					temp_sum = temp_sum + arr[i];
					if(temp_sum < 0)
						temp_sum = 0;
					if (temp_sum > max_sum)
					    max_sum = temp_sum;
				}
			}
			
			
			System.out.println(max_sum + " " + non_contiguous_sum);
		}

	}

}
