import java.util.Scanner;


public class AlmostSorted {
	public static class returnStructure {
		
		public static boolean flag;
		public static int start, stop;
	}

	public static void checkStopIndex(long arr[], int index)
	{
		if(index == arr.length - 1)
		{
			returnStructure.stop = index;
			return;
		}
		if(arr[index] > arr[index + 1])
			checkStopIndex(arr, index + 1);
		else
		{
			returnStructure.stop = index;
			return;
		}
	}
	public static void checkIfSorted(long arr[], int index)
	{
		if(index == arr.length - 1)
		{
			returnStructure.flag = true;
			return;
		}
		if(arr[index] <= arr[index + 1])
			checkIfSorted(arr, index+1);
		else
		{
			returnStructure.flag = false;
			returnStructure.start = index;
			checkStopIndex(arr, index);
			return;
		}
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long arr[] = new long[n]; 
		for(int i = 0;i<n ;i++)
		{
			arr[i] = s.nextLong();
		}
		checkIfSorted(arr, 0);
		if(returnStructure.flag == true)
		{
			System.out.println("Yes");
		}
		else
		{
			if(returnStructure.stop - returnStructure.start == 1)
			{
				int index1 = returnStructure.start;
				int index2 = returnStructure.stop;
				long temp = arr[index1];
				arr[index1] = arr[index2];
				arr[index2] = temp;
				checkIfSorted(arr, 0);
				if(returnStructure.flag == true)
				{
					System.out.println("yes");
					System.out.println("swap " + (returnStructure.start+1) + " " + (returnStructure.stop+1));
				}
				else
				{
					System.out.println("no");
				}
			}
			else
			{
				int index1 = returnStructure.start;
				int index2 = returnStructure.stop;
				int i = index1, j = index2;
				while(i < j)
				{
					long temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					i++;
					j--;
				}
				checkIfSorted(arr, 0);
				if(returnStructure.flag == true)
				{
					System.out.println("yes");
					System.out.println("reverse " + (returnStructure.start+1) + " " + (returnStructure.stop+1));
				}
				else
				{
					System.out.println("no");
				}
			}
		}
	}

}
