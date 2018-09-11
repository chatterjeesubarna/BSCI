import java.util.*;


public class SparseArrays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		HashMap <String, Integer> hmap = new HashMap <String, Integer>(); 

		while(N-- != 0)
		{
			String str = s.next();
			if(hmap.containsKey(str))
			{
				int val = hmap.get(str);
				hmap.put(str, val + 1);
			}
			else
			{
				hmap.put(str,  1);
			}
				
		}
		int Q = s.nextInt();
		while(Q-- != 0)
		{
			String str = s.next();
			if(hmap.containsKey(str))
				System.out.println(hmap.get(str));
			else
				System.out.println("0");
		}

	}

}
