import java.util.*;
public class KitchenTimetable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		
		while(T-- != 0)
		{
			int N = s.nextInt();
			int A[] = new int[N];
			int B[] = new int[N];
			int count = 0;
			for(int i = 0;i<N;i++)
			{
				A[i] = s.nextInt();
			}
			for(int i = 0;i<N;i++)
			{
				B[i] = s.nextInt();
			}
			if(B[0] <= A[0])
				count = 1;
			for(int i = 1;i<N;i++)
			{
				if(B[i] <= (A[i] - A[i-1]))
				{
					count++;
				}
			}
			System.out.println(count);
		}

	}

}
