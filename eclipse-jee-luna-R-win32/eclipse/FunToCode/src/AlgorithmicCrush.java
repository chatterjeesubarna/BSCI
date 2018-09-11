import java.util.Scanner;


public class AlgorithmicCrush {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		long[] arr = new long[N+1];
		long[][] same_index = new long[M][2];
		int same_index_index = 0;
		while(M-- != 0)
		{
			int a = s.nextInt();
			int b = s.nextInt();
			long k = s.nextLong();
			
			if(a==b)
				{
					same_index[same_index_index][0] = a;
					same_index[same_index_index][1] = k;
					same_index_index++;
				}
			else
			{
				arr[a] = arr[a] + k;
				arr[b] = (arr[b] + k)*(-1);
			}
		}
		long val = 0, temp = 0, max = 0;;
		for(int i =0; i <= N; i++)
		{
			if(arr[i] < 0)
			{
				temp = (-1)*arr[i];
				arr[i] = val;
				val = val - temp;
				if(max < arr[i])
					max = arr[i];
				continue;
			}
			if(arr[i] == 0)
			{
				arr[i] = arr[i] + val;
			}
			else if(val > arr[i])
			{
				arr[i] = arr[i] + val;
				val = arr[i];
			}
			else
			{
				val = val + arr[i];
				arr[i] = val;
			}
			if(max < arr[i])
				max = arr[i];
		}
		for(int i =0; i < same_index_index; i++)
		{
			int index = (int)same_index[i][0];
			arr[index] = arr[index] + same_index[i][1];
			if(max < arr[index])
				max = arr[index];
		}
		System.out.println(max);
	}

}
