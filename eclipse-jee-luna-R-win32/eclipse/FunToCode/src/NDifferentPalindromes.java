import java.util.Scanner;


public class NDifferentPalindromes {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while(T-- != 0)
		{
			int N = s.nextInt();
			StringBuilder str = new StringBuilder("");
			for(int i = 1;i<=N/3;i++)
			{
				str.append("abc");
			}
			if(N%3 == 1)
				str.append("a");
			else if(N%3 == 2)
				str.append("ab");
			System.out.println(str);
		}

	}

}
