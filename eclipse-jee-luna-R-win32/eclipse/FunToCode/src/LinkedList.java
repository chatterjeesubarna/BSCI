import java.util.*;


public class LinkedList {

	public static Node head;
	public static void append(int val)
	{
		Node n = new Node(val);
		if(head == null)
		{
			head = n;
			return;
		}
		Node i = head;
		while(i.right != null)
		{
			i = i.right;
		}
		i.right = n;
	}
	public static void view()
	{
		Node i = head;
		System.out.println();
		while(i != null)
		{
			System.out.print(i.value + " ");
			i = i.right;
		}
		System.out.println();
	}
	public static void reverse()
	{
		Node current = head, prev = null, next;
		while(current != null)
		{
			next = current.right;
			current.right = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}
	public static void menu()
	{
		System.out.println("Enter choice: \n");
		System.out.println("1: Append 2. View 3. Reverse 4: Check if palindrome Using Stack 5: Check if palindrome Using Recursion");
	}
	public static int countElements()
	{
		Node i = head;
		int count = 0;
		while(i != null)
		{
			count++;
			i = i.right;
		}
		return count;
	}
	public static int checkPalindromeUsingStack()
	{
		int count = countElements();
		int flag = 1;
		int i = 0;
		Node j = head;
		while( i++ !=  count/2)
		{
			StackUsingObjects.push(j.value);
			j = j.right;
		}
		if(count%2 != 0)
		{
			j = j.right;
		}
		while(j != null)
		{
			if(j.value != StackUsingObjects.pop())
			{
				flag = 0;
				break;
			}
			j = j.right;
		}
		return flag;
	}
	public static void checkPalindromeUsingRecursion(Node root, int index)
	{
		int count = countElements();
		int flag;
		if(index < count/2)
			checkPalindromeUsingRecursion(root.right, index+1);
		if (TestStructure.midCheck == false)
		{
			if(count%2 != 0)
			{
				TestStructure.next = root.right;
			}
			else
			{
				TestStructure.next = root.right;
				if(root.value != TestStructure.next.value)
				{
					TestStructure.flag = false;
				}
				else
				{
					TestStructure.next = TestStructure.next.right;
				}
			}
			TestStructure.midCheck = true;
		}
		else
		{
			if(root.value != TestStructure.next.value)
			{
				TestStructure.flag = false;
			}
			else
			{
				TestStructure.next = TestStructure.next.right;
			}
		}
		
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		while(true)
		{
			menu();
			int c = s.nextInt();
			switch(c)
			{
				case 1:
					System.out.println("Value? ");
					append(s.nextInt());
					break;
				
				case 2:
					view();
					break;
					
				case 3:
					reverse();
					break;
					
				case 4:
					int flag = checkPalindromeUsingStack();
					if(flag == 0)
						System.out.println("Not palindrome!");
					else
						System.out.println("Palindrome!");
					break;
				case 5:
					checkPalindromeUsingRecursion(head, 1);
					if(TestStructure.flag == true)
						System.out.println("Palindrome!");
					else
						System.out.println("Not palindrome!");
					break;
			}
		}

	}

}
