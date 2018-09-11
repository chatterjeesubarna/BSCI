import java.util.*;
import java.math.*;

public class BigIntFactorial {

	static BigInteger BigInteger_Factorial(BigInteger bi1)
	{
		if ((bi1 == BigInteger.valueOf(1)) || (bi1 == BigInteger.valueOf(0)))
			return BigInteger.valueOf(1);
		BigInteger next_arg = bi1.subtract(BigInteger.valueOf(1));
		return bi1.multiply(BigInteger_Factorial(next_arg));
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n = s.nextInt();
		BigInteger bi1 = BigInteger.valueOf(n);
		BigInteger answer = BigInteger_Factorial(bi1);
		System.out.println(answer);
		
	}

}
