import java.util.*;
public class SignOfInteger {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int v = s.nextInt();
		//System.out.println("Using Math.signum: " + Math.signum(v));
		if(v == 0)
			System.out.println("zero");
		else
		{
			int result = v >> (Integer.SIZE -1);
			if(result != 0)
			{
				System.out.println("Negative");
			}
			else
				System.out.println("Positive");
		}

	}

}
