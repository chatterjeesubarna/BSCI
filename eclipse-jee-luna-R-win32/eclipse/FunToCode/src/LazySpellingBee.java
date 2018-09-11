import java.util.Scanner;


public class LazySpellingBee {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		
		while(T-- != 0)
		{
			int count = 1;
			String str = s.next();
			int len = str.length();
			count = count + 2 + ((len-2)*2);
			while(true)
			{
				char[] charr = str.toCharArray();
				
			}
		}

	}

}
