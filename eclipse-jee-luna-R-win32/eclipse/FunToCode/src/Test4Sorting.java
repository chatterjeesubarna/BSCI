import java.util.Scanner;


public class Test4Sorting {

	public static int n;
	public static int[] arr;
	public static int partition(int low, int high)
	{
		int pivot = arr[high];
		int i = low-1, j=low;
		for(j = low;j<high; j++)
		{
			if(arr[j] < pivot)
			{
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		arr[high] = arr[i+1];
		arr[i+1] = pivot;
		return i+1;
	}
	public static void quicksort(int low, int high)
	{
		if(low < high)
		{
			int q = partition(low, high);
			quicksort(low, q-1);
			quicksort(q+1, high);
		}
	}
	
	public static void show()
	{
		for(int i = 0;i<n;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void insertionsort()
	{
		for(int i = 1;i<n;i++)
		{
			int key = arr[i], j = i-1;
			while(j >= 0 && arr[j] > key)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		n = s.nextInt();	
		arr = new int[n];
		for(int i = 0;i<n;i++)
		{
			arr[i] = s.nextInt();
		}
		quicksort(0, n-1);
		System.out.println("\nAfter quick Sort: ");
		show();
		insertionsort();
		System.out.println("\nAfter insertion Sort: ");
		show();
	}

}
