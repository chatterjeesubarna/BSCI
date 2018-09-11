
 class FirstOne {

	public int a = 1;
	static int b = 1;
	
	
	
	public static void main(String a22[]) {
		System.out.println("Inside main() " + Xyz.a);
		
	}
	
	static void next()
	{
		final int c= 100;
		FirstOne f = new FirstOne();
		f.a++;
		System.out.println("Inside next() " + f.a);
	}
	
	
}
 

