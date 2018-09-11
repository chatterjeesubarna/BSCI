import java.util.*;


public class LongestIncreasingSubsequence {

	public static int LISstart(int[] arr, int index)
	{
		if(index >= arr.length)
			return 0;
		int last = arr[index], count = 1;
		for(int i = index+1;i<arr.length;i++)
		{
			if(arr[i] > last)
			{
				last = arr[i];
				count++;
			}
		}
		return count;
	}

	public static int LIS(int[] arr)
	{
		int val = LISstart(arr, 0), i = 1;
		//System.out.println("Length of LIS [0]: " + val);
		while(i < arr.length)
		{
			val = Math.max(val, LISstart(arr, i));
			i++;
		}
		return val;
	}
	public static int LISMemoTable[];
	public static int LIS(int[] arr, int index)
	{
		int val1=0, val2=0, res=0;
		if(LISMemoTable[index] != -1)
			return LISMemoTable[index];
		if(index == 0)
			return 1;
		for(int i = index-1; i>=0;i--)
		{
			if(arr[i] < arr[index])
			{
				val1 = 1 + LIS(arr, i);
			}
			else
			{
				val2 = LIS(arr, i);
			}
			res = Math.max(Math.max(val1, val2), res);
		}
		LISMemoTable[index] = res;
		return res;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = 9;
		int [] arr = new int[n];
		LISMemoTable = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = s.nextInt();
			LISMemoTable[i] = -1;
		}
		//System.out.println("Maximum length of LIS: " + LIS(arr));
		System.out.println("Maximum length of LIS: " + LIS(arr, arr.length-1));
		System.out.println("Memo Table: " + Arrays.toString(LISMemoTable));
	}

}
