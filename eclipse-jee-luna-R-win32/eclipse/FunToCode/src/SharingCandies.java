import java.util.Scanner;


public class SharingCandies {

	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		long minDiff = 0;
		while(T-- != 0)
		{
			long A = s.nextLong();
			long B = s.nextLong();
			long C = s.nextLong();
			long D = s.nextLong();
			if(C%2 != 0 || D%2 != 0)
				minDiff = 0;
			else 
				minDiff = (Math.abs(A - B))%2;
			System.out.println(minDiff);
		}

	}

}
