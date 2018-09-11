import java.util.Scanner;


public class Pangrams {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		int len = str.length();
		int flag = 0;
		int[] alphabet_count = new int[27];
		str = str.toLowerCase();
		for(int i=0;i<len;i++)
		{
			//System.out.println("Encountered " + str.charAt(i));
			if(str.charAt(i) != ' ')
			{
				int val = (int)str.charAt(i) - 96;
				alphabet_count[val] = alphabet_count[val] + 1;
				//System.out.println(str.charAt(i) + " entered at " + val);
			}
			
		}
		for(int i=1;i<=26;i++)
		{
			if(alphabet_count[i] == 0)
			{
				//System.out.println("Enetred for: " + (char)(i+96));
				flag = 1;
				break;
			}
		}
		if(flag == 0)
			System.out.println("pangram");
		else
			System.out.println("not pangram");
	}

}
