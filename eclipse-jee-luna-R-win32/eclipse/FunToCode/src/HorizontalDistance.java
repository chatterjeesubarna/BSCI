import java.util.*;
public class HorizontalDistance {

	Node root;
	public void search(Node root, int value)
	{
		if(root == null)
		{
			System.out.println("\n Not Found: " + value);
		}
		else
		{
			if (root.value == value)
			{
				System.out.println("\n Found: " + value);
				return;
			}
			else if (root.value < value)
			{
				search(root.right, value);
			}
			else if (root.value > value)
			{
				search(root.left, value);
			}
		}

	}
	public void insert(Node root, int value)
	{
		if(root != null)
		{
			if (root.value < value)
			{
				if(root.right != null)
				{
					insert(root.right, value);
				}
				else
				{
					Node n = new Node(value);
					root.right = n;
				}
			}
			else if (root.value > value)
			{
				if(root.left != null)
				{
					insert(root.left, value);
				}
				else
				{
					Node n = new Node(value);
					root.left = n;
				}
			}
		}
		else
		{
			root = new Node(value);
			this.root = root;
		}
	}
	public void inorderTraversal(Node root)
	{
		if(root != null)
		{
			inorderTraversal(root.left);
			System.out.print(root.value + " ");
			inorderTraversal(root.right);
		}
	}

	public int checkSubtree(Node root)
	{
		if (root==null)
			return 0;
		int lh = 0, rh = 0;
		if(root.right != null)
		{
			rh = checkSubtree(root.right) + 1;
		}
		if(root.left != null)
		{
			lh = checkSubtree(root.left) + 1;
		}
		if(Math.abs(rh - lh) > 2)
			return -1;
		else
		{
			return Math.max(rh, lh) + 1;
		}


	}
	public void checkIfBalanced(Node root)
	{
		int result = checkSubtree(root);
		if(result == -1)
			System.out.println("Unbalanced");
		else
			System.out.println("Balanced");
	}
	public static void menu()
	{
		System.out.println("Enter choice: \n");
		System.out.println("1: Insert 2. Search 3. Inorder traverse 4. Topological Sort 5. Check if balanced");
	}
	public void topologicalSort(Node root)
	{
		HashMap <Integer, ArrayList<Integer>> hmap = new HashMap <Integer, ArrayList<Integer>>();
		traverseTree(root, hmap, 0);
		for(int i: hmap.keySet())
		{
			System.out.println(hmap.get(i));
		}
	}
	public void traverseTree(Node root, HashMap <Integer, ArrayList<Integer>> hmap, int level)
	{
		if(root != null)
		{
			if (hmap.containsKey(level))
			{
				hmap.get(level).add(root.value);
			}
			else
			{
				ArrayList<Integer> a = new ArrayList<Integer>();
				a.add(root.value);
				hmap.put(level,  a);
			}
			traverseTree(root.left, hmap, level+1);
			traverseTree(root.right, hmap, level+1);
		}
	}
	public static void main(String[] args) {

		HorizontalDistance obj = new HorizontalDistance();
		Scanner s = new Scanner(System.in);
		System.out.println("Now:");
		while(true)
		{
			menu();
			int a = s.nextInt();
			if(a == 1)
			{
				System.out.println("\nEnter the value: ");
				int val = s.nextInt();
				obj.insert(obj.root, val);
			}
			else if (a==2)
			{
				System.out.println("\nEnter the value: ");
				int val = s.nextInt();
				obj.search(obj.root, val);
			}
			else if (a==3)
			{
				obj.inorderTraversal(obj.root);
			}
			else if (a==4)
			{
				obj.topologicalSort(obj.root);
			}
			else if(a==5)
			{
				obj.checkIfBalanced(obj.root);
			}
		}

	}

}
