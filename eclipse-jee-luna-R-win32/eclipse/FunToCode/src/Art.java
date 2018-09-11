import java.util.Scanner;


public class Art {

	public static boolean check3Consecutive(int[] C)
	{
		for(int i = 0;i< C.length-2;i++)
		{
			if((C[i] == C[i+1]) && (C[i] == C[i+2]))
			return true;
		}
		return false;
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while(T-- != 0)
		{
			int N = s.nextInt();
			int [] C = new int[N];
			for(int i = 0;i<N;i++)
			{
				C[i] = s.nextInt();
			}
		boolean result = check3Consecutive(C);
		if(result == true)
			System.out.println("Yes");
		else
			System.out.println("No");
		}

	}

}
