import java.util.*;
public class EvenTraining {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int totalTrained = 0;
		for(int i = 1;i<=n;i++)
		{
			int a = s.nextInt();
			totalTrained = totalTrained + a;
		}
		if(totalTrained%2 == 0)
		{
			System.out.println("Yes " + totalTrained);
		}
		else
			System.out.println("No " + totalTrained);

	}

}
