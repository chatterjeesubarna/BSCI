import java.util.*;
public class BestMaximumProduct {

	public static int partition(long arr[], int low, int high)
	{
		int i = low, j = low - 1;
		long pivot = arr[high];
		for(i = low;i<high;i++)
		{
			if(Math.abs(arr[i]) <= Math.abs(pivot))
			{
				j = j+1;
				long temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}

		}

		arr[high] = arr[j+1];
		arr[j+1] = pivot;
		return j+1;
	}
	public static long[] findTopK(long arr[], int N, int K, int low, int high)
	{
		if(low < high)
		{
			int k = partition(arr, low, high);
			if(N - k > K)
			{
				findTopK(arr, N, K, k+1, high);
			}
			else if(N - k < K)
			{
				findTopK(arr, N, K, low, k-1);
			}
			return arr;
		}
		return arr;
	}
	public static void showArray(long arr[], int N, int K)
	{
		System.out.println("Top " + K + " elements are: ");
		for(int i = N-K; i<N;i++ )
			System.out.print(arr[i] + " ");
	}
	public static long findProduct (long arr[], int K)
	{
		long result = 1;
		int N = arr.length;
		for(int i = N-K; i<N;i++ )
		{
			result = result * arr[i];
		}
		return result;
	}
	public static long computeMaxSubsequence(long arr[], int N, int K)
	{
		long result = findProduct(arr, K);
		if (result > 0)
			return result;
		else
		{
			long minNegative = 10000, nextPositive = -10000;
			for(int i = N-K; i<N;i++ )
			{
				if(arr[i] < 0 && arr[i] > minNegative)
				{
					minNegative = arr[i];
				}
			}
			for(int i = 0; i<N-K;i++ )
			{
				if(arr[i] > nextPositive)
				{
					arr[i] = nextPositive;
				}
			}
			if(nextPositive > 0)
			{
				result = (result/minNegative)*nextPositive;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while(T-- != 0)
		{
			int N =  s.nextInt();
			int K = s.nextInt();
			boolean allNegative = true;
			long arr[] = new long[N];
			long result = 1, min = 10000;
			ArrayList <Long> topK = new ArrayList <Long>();
			for(int i = 0;i<N;i++)
			{
				arr[i] =  s.nextLong();
				if(arr[i] < min)
					min = arr[i];
				if(arr[i] > 0 )
					allNegative = false;
			}
			if(allNegative == true)
			{
				System.out.println(min);
			}
			else
			{
				arr = findTopK(arr, N, K, 0, N-1);
				showArray(arr, N, K);
			}
		}

	}

}
