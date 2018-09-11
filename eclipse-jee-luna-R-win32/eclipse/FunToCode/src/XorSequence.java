import java.util.Scanner;


public class XorSequence {

	static int findNumber(int index)
	{
		int val = 0;
		if(index%4 == 0)
			val = index;
		else if (index%4 == 1)
			val = 1;
		else if (index%4 == 2)
			val = index+1;
		
		return val;
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int Q = s.nextInt();
		while(Q-- != 0)
		{
			int L = s.nextInt();
			int R = s.nextInt();
			int xor = (int)(findNumber(L) ^ findNumber(L+1));
			for(int i = L+2;i<=R;i++)
			{
				xor = (int)(xor^findNumber(i));
			}
			System.out.println(xor);
		}

	}

}
