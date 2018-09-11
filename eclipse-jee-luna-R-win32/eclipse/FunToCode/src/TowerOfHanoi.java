
public class TowerOfHanoi {

	static int count = 1;
	static int TOH(int noOfDisk, char source, char destination, char auxilliary)
	{
		if(noOfDisk == 0)
			return -1;
		TOH(noOfDisk-1, source, auxilliary, destination);
		System.out.println("Step " + count++ + ": Move disk " + noOfDisk + " from " + source +" to " + destination);
		TOH(noOfDisk-1, auxilliary, destination, source);
		
		return 1;
	}
	public static void main(String[] args) {

		TOH(5, 'A', 'C', 'B');

	}

}
