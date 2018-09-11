import java.util.*;
public class Sorts {

	public static int n = 0;
	public static int arr[];
	public static void show(int[] arr)
	{
		for(int i = 0;i<n;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

	public static int partition(int low, int high)
	{
		int i = low, j = low - 1, pivot = arr[high];
		for(i = low;i<high; i++)
		{
			if(arr[i] <= pivot)
			{
				j = j+1;
				int temp = arr[j]; 
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		arr[high] = arr[j+1];
		arr[j+1] = pivot;
		return j+1;

	}
	public static void quicksort(int low, int high)
	{
		if(low < high)
		{
			int p = partition(low, high);
			quicksort(low, p-1);
			quicksort(p+1, high);
		}
	}
	public static void merge(int low, int mid, int high)
	{
		int n1 = mid - low + 1;
		int n2 = high - mid;
		int A[] = new int[n1];
		int B[] = new int[n2];
		for(int i = 0;i<n1;i++)
		{
			A[i] = arr[i+low];
		}
		for(int i = 0;i<n2;i++)
		{
			B[i] = arr[i + mid + 1];
		}

		int i = 0, j = 0, k = low;
		while(i!=n1 && j!=n2)
		{
			if(A[i] <= B[j])
			{
				arr[k] = A[i];
				i++;
			}
			else
			{
				arr[k] = B[j];
				j++;
			}
			k++;	
		}
		while(i != n1)
		{
			arr[k++] = A[i++];
		}
		while(j != n2)
		{
			arr[k++] = B[j++];
		}
	}
	public static void mergesort(int low, int high)
	{
		if(low<high)
		{
			int mid = (low + high)/2;
			mergesort(low, mid);
			mergesort(mid+1, high);
			merge(low, mid, high);
		}

	}
	public static int left(int i)
	{
		return (2*i) + 1;
	}
	public static int right(int i)
	{
		return (2*i) + 2;
	}
	public static int parent(int i)
	{
		return (i-1)/2;
	}
	public static void maxHeapify(int index)
	{
		int l = left(index);
		int r = right(index);
		int largest = index, temp;
		if(l < n && arr[index] < arr[l])
			largest = l;
		if(r < n && arr[largest] < arr[r])
			largest = r;
		if(largest != index)
		{
			temp = arr[largest];
			arr[largest] = arr[index];
			arr[index] = temp;
			maxHeapify(largest);
		}
	}
	public static void deleteHeap()
	{
		arr[0] = arr[n-1];
		n--;
		maxHeapify(0);
	}
	public static void buildHeap()
	{
		for(int i = n/2-1;i>=0;i--)
		{
			maxHeapify(i);
		}
	}
	public static void heapsort(int n)
	{
		if(n > 1)
		{
			buildHeap();
			int temp = arr[0];
			arr[0] = arr[n-1];
			arr[n-1] = temp;
			Sorts.n--;
			maxHeapify(0);
			heapsort(n-1);
		}
	}
	public static void insertionsort()
	{
		for(int i = 1;i<n;i++)
		{
			int flag = 0;
			int val = arr[i];
			int j = i-1;
			while(j>=0 && arr[j] > val)
			{
				flag = 1;
				arr[j+1] = arr[j];
				j--;
			}
			if(flag == 1)
				arr[j+1] = val;
		}
	}
	public static void countingsort(int maxValue)
	{
		int [] C = new int [maxValue + 1];
		int [] B = new int[n];
		for(int i = 0;i<n;i++)
		{
			C[arr[i]] =  C[arr[i]] + 1;
		}
		for(int i = 1;i<=maxValue;i++)
		{
			C[i] = C[i-1] + C[i];
		}
		for(int i = n-1;i>=0;i--)
		{
			B[C[arr[i]] - 1] = arr[i];
			C[arr[i]] = C[arr[i]] - 1;
		}
		for(int i = 0;i<n;i++)
		{
			arr[i] = B[i];
		}
	}
	public static void countingSortForRadixSort(int exp)
	{
		int C[] = new int[10];
		int B[] = new int[n];
		for(int i = 0;i<n;i++)
		{
			int c = (arr[i]/exp)%10;
			C[c] = C[c] + 1;
		}
		for(int i = 1;i<=9;i++)
		{
			C[i] = C[i-1] + C[i];
		}
		for(int i = n-1;i>=0;i--)
		{
			int c = (arr[i]/exp)%10;
			B[C[c] - 1] = arr[i];
			C[c] = C[c] - 1;
		}
		for(int i = 0;i<n;i++)
		{
			arr[i] = B[i];
		}
		
	}
	public static void radixsort()
	{
		int max = -999;
		for(int i = 0;i<n;i++)
		{
			if(arr[i] > max)
				max = arr[i];
		}
		int digit = 1;
		int exp = 1;
		while(max > 0)
		{
			countingSortForRadixSort(exp);
			exp = exp * 10;
			max = max/10;
			digit++;
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


		// ********************** QUICK SORT *****************************************
		/*quicksort(0, arr.length-1);
		System.out.println("\n The result after quick sort is: \n" );
		Sorts.show(arr);*/

		// ********************** MERGE SORT *****************************************
		/*mergesort(0, arr.length-1);
		System.out.println("\n The result after merge sort is: \n" );
		Sorts.show(arr);*/

		// ********************** HEAP BUILD *****************************************
		/*buildHeap();
		System.out.println("\n After building heap, it is like: \n" );
		Sorts.show(arr);*/

		// ********************** HEAP DELETE *****************************************
		/*deleteHeap();
		System.out.println("\n After deleting, it is like: \n"  );
		Sorts.show(arr);*/

		// ********************** HEAP SORT *****************************************
		/*int oldSize = n;
		heapsort(n);
		n = oldSize;
		System.out.println("\n The result after heap sort is: \n" );
		Sorts.show(arr);*/

		// ********************** INSERTION SORT *****************************************
		/*insertionsort();
		System.out.println("\n The result after insertion sort is: \n" );
		Sorts.show(arr);*/

		// ********************** COUNTING SORT *****************************************
		/*int maxValue = 11;
		countingsort(maxValue);
		System.out.println("\n The result after counting sort is: \n" );
		Sorts.show(arr);*/

		// ********************** RADIX SORT *****************************************
		radixsort();
		System.out.println("\n The result after radix sort is: \n" );
		Sorts.show(arr);
	}

}
