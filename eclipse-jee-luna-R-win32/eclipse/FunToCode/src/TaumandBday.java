import java.util.Scanner;


public class TaumandBday {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t--!=0)
		{
			long x, y, z, b, w;
			b = s.nextLong();
			w = s.nextLong();
			x = s.nextLong();
			y = s.nextLong();
			z = s.nextLong();
			
			long black_unit = x, white_unit = y;
			if(black_unit > (white_unit + z))
			{
				black_unit = white_unit + z;
			}
			if(white_unit > (black_unit + z))
			{
				white_unit = black_unit + z;
			}
			
			long val = black_unit*b + white_unit*w;
			System.out.println(val);
		}

	}

}
