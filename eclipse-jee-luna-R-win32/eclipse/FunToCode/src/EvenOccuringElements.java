import java.util.*;


public class EvenOccuringElements {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(9, 12, 23, 10, 12, 12, 15, 23, 14, 12, 15));
		
		int res = 0;
		for(int i =0;i<arr.size();i++)
		{
			res = res ^ (1 << arr.get(i));
		}
		
		for(int i =0;i<=31;i++)
		{
			if((res & (1 << i)) == 0)
			{
				if(arr.contains(i))
				{
					System.out.print(i + " ");
				}
			}
		}
	}

}
