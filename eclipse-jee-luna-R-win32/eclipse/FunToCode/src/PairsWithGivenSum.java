import java.util.*;
public class PairsWithGivenSum {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		HashMap <Integer, Integer> hmap = new HashMap <Integer, Integer>();
		HashMap<Integer, ArrayList<Integer>> a=new HashMap<Integer,ArrayList<Integer>>();
		
		int flag = 0;
		for(int i = 0;i<n;i++)
		{
			arr[i] = s.nextInt();
		if (!hmap.containsKey(arr[i]))
		{
			hmap.put(arr[i], arr[i]);
		}
			
		}
		int val = s.nextInt();
		Set set = hmap.entrySet();
		Iterator it = set.iterator();
		for (int i:hmap.keySet())
		{
			System.out.println("<" + i + ", " + hmap.get(i) + ">");
		}
		
		/*for (int i:hmap.keySet())
		{
			
		}*/
		
		it = set.iterator();
		for (int i:hmap.keySet())
		{
			int lookingfor = val - (Integer)hmap.get(i);
			if(hmap.get(lookingfor) != null)
			{
				flag = 1;
				System.out.println(i + ", " + lookingfor);
			}
		}
		if(flag == 0)
			System.out.println("Not Possible");
		
	}

}
