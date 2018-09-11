import java.util.Scanner;


public class Pattern2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		
		int len = str.length();
		StringBuffer newstr = new StringBuffer(str);
		newstr.reverse();
		String temp = new String(newstr);
		for(int i = 1;i<=len;i++)
		{
			for(int j = 1;j<i;j++)
			{
				System.out.print(" ");
			}
			System.out.println(temp.substring(i-1));
		}

	}

}
