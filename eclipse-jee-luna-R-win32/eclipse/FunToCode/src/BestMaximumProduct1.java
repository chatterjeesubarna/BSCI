import java.util.Scanner;


public class BestMaximumProduct1 {

	public static int partition(long arr[], int low, int high)
	{
		int i = low, j = low - 1;
		long pivot = arr[high];
		for(i = low;i<high; i++)
		{
			if(arr[i] <= pivot)
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
	public static void quicksort(long arr[], int low, int high)
	{
		if(low < high)
		{
			int p = partition(arr, low, high);
			quicksort(arr, low, p-1);
			quicksort(arr, p+1, high);
		}
	}
	public static long computeMaxSubsequence(long arr[], int K, int positiveEnd, int negativeBeginning)
	{
		int N = arr.length;
		long result = 1;
		int positiveTracker = -1, negativeTracker = N;
		if(negativeBeginning != N)
		{
			negativeTracker = positiveEnd + 1;
		}
		else
		{
			for(int i = 0;i<K;i++)
			{
				result = result * arr[i];
			}
			return result;
		}
		if(positiveEnd != -1)
		{
			positiveTracker = positiveEnd;
		}
		else
		{
			for(int i = 0;i<K;i++)
			{
				result = result * arr[i];
			}
			return result;
		}
		int i = 0, k = -1; long tempResult1 = 1, tempResult2 = 1;
		boolean isEven = false;
		if((K+1)%2 == 0)
			isEven = true;
		if(isEven == true)
		{
			while(true)
			{
				if (k == K)
					break;
				if(positiveTracker - 1 >= 0 && negativeTracker + 1 < N)
				{
					tempResult1 = arr[positiveTracker]*arr[positiveTracker - 1];
					tempResult2 = arr[negativeTracker]*arr[negativeTracker - 1];

					if(tempResult1 >= tempResult2)
					{
						result = result * tempResult1;
						positiveTracker = positiveTracker - 1;
					}
					else
					{
						result = result * tempResult2;
						negativeTracker = negativeTracker + 2;
					}
					k = k + 2;
				}

				if(positiveTracker >= 0)
				{
					while(k != K)
					{
						k++;
						result = result * arr[positiveTracker];
					}

				}
				else
				{
					if(negativeTracker + 1 < N)
					{
						while(k != K)
						{
							result = result * arr[positiveTracker];
							k = k + 2;
						}

					}
				}
			}
		}
		else
		{

		}

		return result;
	}
	/*public static long computeMaxSubsequence(long arr[], int K, int positiveEnd, int negativeBeginning)
	{
		int N = arr.length;
		long result = 1;
		int positiveTracker, negativeTracker;
		if(negativeBeginning == N)
		{
			for(int i = 0;i<K;i++)
			{
				result = result * arr[i];
			}
		}
		else if(positiveEnd == -1)
		{
			result = arr[negativeBeginning];
		}
		else
		{
			positiveTracker = positiveEnd;
			negativeTracker = N-1;
			for(int i = 0;i<K;i++)
			{
				if(arr[positiveTracker] >= Math.abs(arr[negativeTracker]) && positiveTracker >= 0)
				{
					result = result * arr[positiveTracker];
					positiveTracker--;
				}
				else if(negativeTracker >= negativeBeginning)
				{
					result = result * arr[negativeTracker];
					negativeTracker--;
				}
			}
			if(result < 0)
			{
				while(true)
				{
					if(positiveTracker >= 0)
					{
						result = (result/arr[negativeTracker+1])*arr[positiveTracker];
						positiveTracker--;
					}
					if(result > 0)
						break;
				}
			}
		}
		return result;
	}*/
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while(T-- != 0)
		{
			int N =  s.nextInt();
			int K = s.nextInt();
			long arr[] = new long[N];
			int positiveEnd = -1, negativeBeginning = N;
			boolean zeroPresent = false;
			for(int i = 0;i<N;i++)
			{
				long val =  s.nextLong();
				if(val >= 0)
				{
					positiveEnd++;
					arr[positiveEnd] = val;
					if(val == 0)
						zeroPresent = true;
				}
				else 
				{
					negativeBeginning--;
					arr[negativeBeginning] = val;
				}
			}
			quicksort(arr, 0, positiveEnd);
			quicksort(arr, positiveEnd + 1, negativeBeginning);
		}

	}

}
