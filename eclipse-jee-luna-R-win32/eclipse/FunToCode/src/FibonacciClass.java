import java.util.*;
public class FibonacciClass {

	static int a = 1, b = 1;
	public static void fibonacciGenerator(int n1, int n2)
	{
		if(n1 == 1)
		{
			System.out.print("1 ");
			n1++;
		}
		else if(n1 == 2)
		{
			System.out.print("1 ");
			n1++;
		}
		else
		{
			int c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
			n1++;
		}
		if (n1 > n2)
			return;
		else
			fibonacciGenerator(n1, n2);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		fibonacciGenerator(1, n);

	}

}
