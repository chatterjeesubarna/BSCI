import java.util.Scanner;


public class CopySetBitsInRange {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		int l = s.nextInt();
		int r = s.nextInt();
		int res = 0;
		for(int i = l;i<=r;i++)
		{
			if ((y & (1 << i)) != 0)
			{
				res = res | (1 << i);
			}
		}
		x = x | res;
		System.out.println("res = " + res);
		System.out.println("x = " + x);

	}

}
