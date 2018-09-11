import java.util.*;


public class UniqueCharactersInString {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.next();
		int len = str.length();
		int original = 0;
		int flag = 1;
		for(int i = 0;i<len;i++)
		{
			int index = str.charAt(i) - 'a';
			int testVal = 1 << index;
			if((original & testVal) == 0)
			{
				original = original | testVal;
			}
			else
			{
				flag = 0;
				break;
			}
		}
		if(flag == 0)
			System.out.println("Not all characters unique");
		else
			System.out.println("All characters unique");
	}

}
