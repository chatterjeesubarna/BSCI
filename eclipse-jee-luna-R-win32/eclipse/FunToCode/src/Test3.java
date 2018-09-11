import java.util.*;
public class Test3 {

	public static Node head, toBeChecked = null;
	public static boolean flag = false;
	public static int direction = 1;
	public static void menu()
	{
		System.out.println("Enter choice: \n");
		System.out.println("1: Insert at end \n 2. View\n 3. Reverse\n 4: Check if palindrome Using Stack\n 5: Check if palindrome Using Recursion\n");
	}
	public static Node insertAtEnd(int val)
	{
		if(head == null)
		{
			head = new Node(val);
			return head;
		}
		Node temp = head;
		while(temp.right!=null)
		{
			temp = temp.right;
		}
		temp.right = new Node(val);
		return temp.right;
	}
	public static void viewList()
	{
		System.out.println("\nThe list is: \n");
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.value + " ");
			temp = temp.right;
		}
		System.out.println();
	}
	public static void reverseList()
	{
		Node current=head, previous = null, next=null;
		while(current != null)
		{
			next = current.right;
			current.right = previous;
			previous = current;
			current = next;
		}
		head = previous;
	}
	public static int countNoElements()
	{
		int count = 0;
		Node temp = head;
		while(temp!=null)
		{
			count++;
			temp = temp.right;
		}
		return count;
	}
	public static void checkPalindromeUsingRecursion(Node temp, int c, int tot)
	{
		if(direction == 1)
		{
			if (tot%2 == 0 && c== tot/2)
			{
				if(temp.value == temp.right.value)
				{
					toBeChecked = temp.right.right;
					direction = -1;
				}
				else
					return;
			}
			else if(tot%2 != 0 && c == (tot-1)/2)
			{
				if(temp.value == temp.right.right.value)
				{
					toBeChecked = temp.right.right.right;
					direction = -1;
				}
				else return;
			}
			else checkPalindromeUsingRecursion(temp.right, c+1, tot);
		}
		if(temp.value == toBeChecked.value)
		{
			if(c == 1)
			{
				flag = true;
				return;
			}
			toBeChecked = toBeChecked.right;
		}
		else
			return;
		
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
				insertAtEnd(s.nextInt());
				break;

			case 2:
				viewList();
				break;

			case 3:
				reverseList();
				break;

				/*case 4:
					int flag = checkPalindromeUsingStack();
					if(flag == 0)
						System.out.println("Not palindrome!");
					else
						System.out.println("Palindrome!");
					break;*/
			case 5:
				direction = 1;
				flag = false;
				checkPalindromeUsingRecursion(head, 1, countNoElements());
				if(flag == false)
					System.out.println("Not palindrome!");
				else
					System.out.println("Palindrome!");
				break;
			}
		}


	}

}
