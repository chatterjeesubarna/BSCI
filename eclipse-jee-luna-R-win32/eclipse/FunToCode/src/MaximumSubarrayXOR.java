import java.util.*;


public class MaximumSubarrayXOR {

	public static void insert(TrieMaximumSubarrayXOR root, int val)
	{
		for(int i = 31;i>=0;i--)
		{
			if ((val & (1 << i)) == 0)
			{
				if(root.left == null)
				{
					root.left = new TrieMaximumSubarrayXOR();
				}
				root = root.left;
			}
			else
			{
				if(root.right == null)
				{
					root.right = new TrieMaximumSubarrayXOR();
				}
				root = root.right;
			}
		}
		root.value = val;
	}

	public static int query(TrieMaximumSubarrayXOR root, int val)
	{
		for(int i = 31;i>=0;i--)
		{
			if ((val & (1 << i)) == 0)
			{
				if(root.right != null)
					root= root.right;
				else
					root = root.left;
			}
			else
			{
				if(root.left != null)
					root= root.left;
				else
					root = root.right;
			}
		}
		return root.value;
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int arr[] = {8, 1, 2, 12};
		TrieMaximumSubarrayXOR root = new TrieMaximumSubarrayXOR();
		int xorTillI = 0, maxXor = -100000;
		insert(root, xorTillI);
		for(int i = 0;i<arr.length;i++)
		{
			xorTillI = xorTillI ^ arr[i];
			insert(root, xorTillI);
			int temp = xorTillI ^ query(root, xorTillI);
			if(temp > maxXor)
			{
				maxXor = temp;
			}
		}
		System.out.println("Maximum XOR: " + maxXor);
	}

}
