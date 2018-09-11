import java.util.*;
public class Test1 {

	public static int[] memoTable, arr;
	public static ArrayList<Integer> arrlist = new ArrayList<Integer>();
	public static String str;
	public static int DPLIS(int index, int last, boolean taken)
	{
		System.out.println("Into DPLIS(" + index + " " + last + " " +  taken + ")");
		if(index < 0)
			return 0;
		if(index>=0 && memoTable[index] != -1)
			return memoTable[index];
		System.out.println("Calling DPLIS(" + index + " " + last + " " +  taken + ")");
		if(taken == false)
		{
			last = arr[index];
			int val1 = 1 + DPLIS(index-1, last, true);
			int val2 = DPLIS(index-1, 0, false);
			if(val1 > val2)
			{
				arrlist.add(last);
			}
			memoTable[index] = Math.max(val1, val2);
		}
		else
		{
			if(arr[index] < last)
			{
				int val1 = 1 + DPLIS(index-1, arr[index], true);
				int val2 = DPLIS(index-1, last, true);
				if(val1 > val2)
				{
					arrlist.add(arr[index]);
				}
				memoTable[index] = Math.max(val1, val2);
			}
			else
			{
				memoTable[index] = DPLIS(index-1, last, true);
			}
		}

		return memoTable[index];
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in); 
		int len = s.nextInt();
		arr = new int[len];
		int i = 0;
		memoTable = new int[len];
		for(int j = 0;j<len;j++)
		{
			memoTable[j] = -1;
		}
		while(len-- != 0)
		{
			arr[i] = s.nextInt();
			i++;
		}
		
		int result = DPLIS(arr.length-1, 0, false);
		System.out.println("Memotable: ");
		for(int j = 0;j<arr.length;j++)
		{
			System.out.print(memoTable[j] + " ");
		}
		System.out.println("\nResult: " + result);
		System.out.println("\nLIS: " + arrlist);

	}

}
