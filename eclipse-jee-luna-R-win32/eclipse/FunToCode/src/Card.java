
public class Card {

	int K, L;
	int[] A;
	int[] C;
	double[] AttackPerCost;
	double maxAttackPerCost;
	int offset;
	
	public void show(int[] arr)
	{
		for(int i = 1;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	public void show(double[] arr)
	{
		for(int i = 1;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	public Card(int k, int l)
	{	
		K = k;
		L = l;
		A = new int[K+1];
		C = new int[K+1];
		C[K] = 0;
		AttackPerCost = new double[K+1];
		offset = K;
	}
	
	public void cumulateCost()
	{
		for(int i = 2;i<C.length;i++)
		{
			C[i] = C[i] + C[i-1]; 
		}
		for(int i = K;i>=2;i--)
		{
			C[i] = C[i-1];
		}
	}
	public void computeAttackPerCost()
	{
		AttackPerCost[0] = 0.00;
		AttackPerCost[1] = 0.00;
		for(int i = 2;i<AttackPerCost.length;i++)
		{
			AttackPerCost[i] = ((double)A[i])/((double)C[i]);
		}
		maxAttackPerCost = AttackPerCost[K];
	}
}
