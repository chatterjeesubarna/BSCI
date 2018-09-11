import java.util.*;
public class SwapBitsOddEven {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int val = s.nextInt();
		
		int odd = (val & 0xAAAA) >> 1;
		int even = (val & 0x5555) << 1 ;
		int answer = odd | even;
		
		System.out.println("\n" +  answer);
	}

}
