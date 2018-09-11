import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;


public class SecretMessageGroups2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		HashMap<String, ArrayList<String>> h1 = new HashMap<String, ArrayList<String>>();
		int maxGroupLength = 0, curGroupLength = 0, noOfGroups = 0;
		StringBuilder maxgroup = new StringBuilder("");
		ArrayList<String> keys = new ArrayList<String>();
		while(n-- != 0)
		{
			int[] arr = new int[10];
			String str = s.next();
			int len = str.length();
			for(int i = 0;i<len;i++)
			{
				int index = Integer.parseInt(String.valueOf(str.charAt(i)));
				arr[index] = arr[index] + 1;
			}
			
			// FORM STRING THATS THE HASH MAP KEY
			StringBuilder strb = new StringBuilder(String.valueOf(arr[0]));
			for(int i = 1;i<10;i++)
			{
				strb.append(String.valueOf(arr[i]));
			}
			
			
			// INSERT INTO HASH MAP
			String temp = new String(strb);
			if(h1.get(temp) != null)
			{
				// FIND DUPLICATES
				if (h1.get(temp).contains(str) == false)
				{
					curGroupLength = Integer.parseInt((h1.get(temp)).get(0));
					curGroupLength = curGroupLength + 1;
					int counter = 1;
					while(counter < curGroupLength)
					{
						int existingValue = Integer.parseInt(h1.get(temp).get(counter));
						if(existingValue < Integer.parseInt(str))
						{
							(h1.get(temp)).add(counter, str);
						}
						counter++;
					}
					if(counter == curGroupLength)
						(h1.get(temp)).add(curGroupLength, str);
					h1.get(temp).set(0, String.valueOf(curGroupLength));
				}
			}
			else
			{
				noOfGroups++;
				//keys.add(temp);
				ArrayList<String> a1 = new ArrayList<String>();
				a1.add(0, "1");
				a1.add(1, str);
				h1.put(temp, a1);
				curGroupLength = 1;
			}
			if(curGroupLength > maxGroupLength)
			{
				maxGroupLength = curGroupLength;
				maxgroup = strb;
			}
			
		}
		for (String i:h1.keySet())
		{
			System.out.println(i + ", " + h1.get(i));
		}
		System.out.println(noOfGroups);
		
		// SORT KEYS
		HashMap<String, ArrayList<String>> h2 = new HashMap<String, ArrayList<String>>();
		int maxGroupCount = 0;
		for (String i:h1.keySet())
		{
			int limit = Integer.parseInt(h1.get(i).get(0));
			if(limit == maxGroupLength)
			{
				h2.put(i, h1.get(i));
				maxGroupCount++;
			}
		}
		
		HashMap<String, String> h3 = new HashMap<String, String>();
		
		//Collections.sort(keys);
		
		//System.out.println("Order of keys " + keys);
		// PRINT MAX GROUP ELEMENTS
		
		for (String i:h2.keySet())
		{
			for(int j = 1;j<=maxGroupLength;j++)
			{
				System.out.print(h2.get(i).get(j) + " ");
			}
			System.out.println();
		}
		
		/*for(int i = 0;i<maxGroupCount;i++)
		{
			String key = keys.get(i);
			for(int j = 1;j<=maxGroupLength;j++)
			{
				System.out.println(h2.get(key).get(j) + " ");
			}
		}*/
		
		
		/*for (String i:h1.keySet())
		{
			int limit = Integer.parseInt(h1.get(i).get(0));
			if(limit == maxGroupLength)
			{
				System.out.println();
				for(int j = 1;j<=limit;j++)
					System.out.print(String.valueOf(h1.get(i).get(j)) + " ");
			}
		}*/

	}

}
