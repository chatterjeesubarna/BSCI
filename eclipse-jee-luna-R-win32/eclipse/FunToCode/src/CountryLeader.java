import java.util.*;
import java.io.*;

public class CountryLeader {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		int n = 1;
		while(T-- != 0)
		{
			int N = s.nextInt();
			int count = 0, max =0;
			ArrayList <String> arr = new ArrayList <String>(); 
			int index = 0;
			HashMap <String, Integer> hmap = new HashMap <String, Integer>(); 
			BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
			while(N-- != 0)
			//while(s.hasNextLine())
			{
				
				count = 0;
				//s.hasNextLine();
				String str = s.nextLine();
				System.out.println("String: " + str);
				int[] charr = new int[27];
				for(int i = 0;i<=26;i++)
					charr[i] = 0;
				//System.out.println("\nFor  " + str);
				for(int i = 0;i<str.length();i++)
				{
					index = str.charAt(i) - 'A' + 1;
					//System.out.println("Char is:" + index);
					if (charr[index] == 0)
					{
						charr[index] = 1;
						count++;
					}
				}
				//System.out.println("\nFor  " + str + " , we have: " + count);
				if(count > max)
					max = count;
				hmap.put(str, count);
			}
			index = 0;
			for(String i: hmap.keySet())
			{
				if(hmap.get(i) == max)
					arr.add(i);
				index++;
			}
			/*System.out.println("Arr is: \n");
			for(int i =0;i<arr.size();i++)
				System.out.println(arr[i]);*/
			//System.out.println("ARR is " + arr.toString());
			Collections.sort(arr);
			System.out.println("Case #" + n + ": " + arr.get(0));
			n++;
		}

	}

}
