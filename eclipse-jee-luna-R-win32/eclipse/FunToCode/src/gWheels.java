import java.io.*;
import java.util.*;


public class gWheels {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		int c = 1;

		while(T-- != 0)
		{
			int n1 = s.nextInt();
			int n2 = s.nextInt();
			int n3 = s.nextInt();
			int[] t1 = new int[n1];
			int[] t2 = new int[n2];
			int[] t3 = new int[n3];
			double[][] c1 = new double[n1][n2]; 
			double[][] c2 = new double[n2][n3]; 
			for(int i = 0;i<n1;i++)
			{
				t1[i] = s.nextInt();
			}
			for(int i = 0;i<n2;i++)
			{
				t2[i] = s.nextInt();
			}
			for(int i = 0;i<n3;i++)
			{
				t3[i] = s.nextInt();
			}
			int M = s.nextInt();
			HashMap <Double, Integer> hmap1 = new HashMap <Double, Integer>();
			HashMap <Double, Integer> hmap2 = new HashMap <Double, Integer>();
			//System.out.println("Hamap1");
			for(int i = 0;i<n1;i++)
			{
				for(int j = 0;j<n2;j++)
				{
					double val = ((double)t1[i])/((double)t2[j]);
					hmap1.put(val, j);
					//System.out.println(val + " ");
				}
			}
			//System.out.println("Hamap2");
			for(int i = 0;i<n2;i++)
			{
				for(int j = 0;j<n3;j++)
				{
					double val = ((double)t2[i])/((double)t3[j]);
					hmap2.put(val, i);
					//System.out.println(val + " ");
				}
			}
			boolean flag = false;
			System.out.println("Case #" + c + ":");


			while(M-- != 0)
			{
				int p = s.nextInt();
				int q = s.nextInt();
				double ratio = (double)p/(double)q;
				for(double d:hmap1.keySet())
				{
					double expected = ratio/d;
					if(hmap2.containsKey(expected))
					{
						if(hmap2.get(expected) != hmap1.get(d))
						{
							System.out.println("Yes");
							//System.out.println(d + " * " + expected + "= " + ratio);
							flag = true;
							break;
						}
					}
				}
				if(!flag)
				{
					System.out.println("No");
				}
				else
				{
					flag = false;
				}
				//System.out.println("Completed: " + p + " " + q);
			}
			c++;

		}


	}

}


