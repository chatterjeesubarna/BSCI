import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class TestC {

	public static void main(String[] args) {

		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		try {
			int T = Integer.parseInt(stdin.readLine());
			int n = 1;
			while(T-- != 0)
			{
				int N = Integer.parseInt(stdin.readLine());
				int count = 0, max =0;
				ArrayList <String> arr = new ArrayList <String>(); 
				int index = 0;
				HashMap <String, Integer> hmap = new HashMap <String, Integer>(); 
				while(N-- != 0)
				{
					count = 0;
					String str = stdin.readLine();
					//System.out.println("String: " + str);
					int[] charr = new int[27];
					for(int i = 0;i<=26;i++)
						charr[i] = 0;
					//System.out.println("\nFor  " + str);
					for(int i = 0;i<str.length();i++)
					{
						if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
						{
							index = str.charAt(i) - 'A' + 1;
							//System.out.println("Char is:" + index);
							if (charr[index] == 0)
							{
								charr[index] = 1;
								count++;
							}
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

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
