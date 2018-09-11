import java.util.*;


public class StackUsingObjects {

	public static StackElement topOfStack;
	public static void push(int val)
	{	
		StackElement n = new StackElement(val);
		n.below = topOfStack;
		topOfStack = n;
	}
	public static int pop()
	{
		if (topOfStack == null)
		{
			System.out.println("Stack empty");
			return -1;
		}
		int val = topOfStack.value;
		topOfStack = topOfStack.below;
		return val;
	}
	public static void view()
	{
		StackElement n = topOfStack;
		while(n != null)
		{
			System.out.println(n.value);
			n = n.below;
		}
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		while (true)
		{
			System.out.println("1. Push 2. Pop 3. View");
			int c = s.nextInt();
			switch(c)
			{
				case 1: System.out.println("Value: ");
				push(s.nextInt());
				break;
				
				case 2: System.out.println("Value popped: " + pop());
				break;
				
				case 3: view();
			}
		}

	}

}
