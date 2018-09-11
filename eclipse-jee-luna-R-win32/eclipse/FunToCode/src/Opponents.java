import java.util.*;


public class Opponents {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n, d;
		n = s.nextInt();
		d = s.nextInt();
		int count = 0, max = 0;
		while(d-- != 0)
		{
			String str = s.next();
			if(str.indexOf("0") != -1)
			{
				count++;
				if(count > max)
					max = count;
			}
			else
				count = 0;
		}
		System.out.println(max);

	}

}
