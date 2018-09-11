import java.util.Scanner;


public class SherlockandValidString {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int len = str.length();
		int[] alphabet_count = new int[27];
		str = str.toLowerCase();
		int min = 99999, max = 0;
		int flag1 = 1, flag2 = 1;
		int count_changes = 0;
		for(int i=0;i<len;i++)
		{
			int val = (int)str.charAt(i) - 96;
			alphabet_count[val] = alphabet_count[val] + 1;
			
			if(max < alphabet_count[val])
				max = alphabet_count[val];
		}
		
		for(int i = 1;i<=26;i++)
		{
			if(alphabet_count[i] == 0) 
				continue;
			if(min > alphabet_count[i] )
				min = alphabet_count[i];
		}
		
		//System.out.println("Min: " +  min + " Max: " + max);
		for(int i = 1;i<=26;i++)
		{
			if(alphabet_count[i] == 0 || alphabet_count[i] == min)
				continue;
			if(alphabet_count[i] > min)
				count_changes = count_changes + alphabet_count[i] - min;
			if(count_changes > 1)
			{
				flag1 = 0;
				break;
			}
		}
		
		count_changes = 0; int val = 0;
		for(int i = 1;i<=26;i++)
		{
			if(alphabet_count[i] == 0 || alphabet_count[i] == max)
				continue;
			if(alphabet_count[i] < max)
			{
				if(max - alphabet_count[i] < alphabet_count[i] )
					val = max - alphabet_count[i];
				else
					val = alphabet_count[i];
				count_changes = count_changes + val;
			}
				
			if(count_changes > 1)
			{
				flag2 = 0;
				break;
			}
		}
		
				
		/*for(int i = 1;i<=26;i++)
		{
			System.out.println((char)(i + 96) + ": " + alphabet_count[i]);
		}*/
		
		if(flag1 == 0 && flag2 == 0)
			System.out.println("NO");
		else
			System.out.println("YES");

	}

}
