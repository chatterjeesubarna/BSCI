import java.util.*;


public class SumofTwoNumbers {

	static long solveMeFirst(long num1, long num2)
	{
		return (num1 + num2);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		long num1 = keyboard.nextLong();
		long num2 = keyboard.nextLong();
		long sum = solveMeFirst(num1, num2);
		System.out.println(sum);
	}

}
