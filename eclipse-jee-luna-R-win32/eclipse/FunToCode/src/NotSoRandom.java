import java.util.*;


public class NotSoRandom {

	public static HashMap <Integer, Double> RNG(HashMap <Integer, Double> hmapi, int K, double a, double b, double c)
	{
		
		HashMap <Integer, Double> hmap = new HashMap <Integer, Double>();
		
		for(int i:hmapi.keySet())
		{
			int X = i;
			double prob = hmapi.get(i);
			int val1 = X & K;
			
			if(hmap.containsKey(val1))
			{
				double existingProb = hmap.get(val1);
				hmap.put(val1, existingProb+(a*prob));
			}
			else
			{
				hmap.put(val1, a*prob);
			}
			
			//hmap.put(val1, a*prob);
			
			int val2 = X | K;
			if(hmap.containsKey(val2))
			{
				double existingProb = hmap.get(val2);
				hmap.put(val2, existingProb+(b*prob));
			}
			else
			{
				hmap.put(val2, b*prob);
			}
			int val3 = X ^ K;
			if(hmap.containsKey(val3))
			{
				double existingProb = hmap.get(val3);
				hmap.put(val3, existingProb+(c*prob));
			}
			else
			{
				hmap.put(val3, c*prob);
			}
		}
		
		return hmap;
		
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		int c1 = 1;
		while(T-- != 0)
		{
			int N = s.nextInt();
			int X = s.nextInt();
			int K = s.nextInt();
			int A = s.nextInt();
			int B = s.nextInt();
			int C = s.nextInt();

			double a = ((double)A)/100;
			double b = ((double)B)/100;
			double c = ((double)C)/100;

			HashMap <Integer, Double> hmapi = new HashMap <Integer, Double> ();
			hmapi.put(X, 1.00);
			while(N-- != 0)
			{
				hmapi = RNG(hmapi, K, a, b, c);
				/*System.out.println("Hash Map at N = " + (N+1));
				for(int i: hmapi.keySet())
				{
					System.out.println(i + " " + hmapi.get(i));
				}*/
			}
			
			double result = 0;
			
			for(int i: hmapi.keySet())
			{
				result = result + (i*hmapi.get(i));
			}
			
			System.out.println("Case #" + c1 + ": " + result);
			c1++;
		}
	}

}
