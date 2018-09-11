import java.util.*;


public class JaneFlowerShop {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		int n, n1 = 1;
		while(T-- != 0)
		{
			int M = s.nextInt();
			int N = s.nextInt();
			n = N;
			int index = 1;
			Card[] carr = new Card[N+1];
			int Kmax = 0;
			while(N-- != 0)
			{
				int k = s.nextInt();
				int l = s.nextInt();
				if(k > Kmax)
					Kmax = k;
				Card c = new Card(k, l);
				for(int i = 1;i<=k;i++)
				{
					c.A[i] = s.nextInt();
				}
				for(int i = 1;i<k;i++)
				{
					c.C[i] = s.nextInt();
				}

				carr[index] = c;
				index++;
			}
			N = n;
			HashMap <Card, Double> hmap = new HashMap <Card, Double>(); 
			for(int i = 1;i<=N;i++)
			{
				carr[i].cumulateCost();
				carr[i].computeAttackPerCost();
			}
			
			for(int i = 1;i<=N;i++)
			{
				System.out.println("\nCard: " + i);
				System.out.println("\nA: ");
				carr[i].show(carr[i].A);
				System.out.println("\nC: ");
				carr[i].show(carr[i].C);
				System.out.println("\nAttackPerCost: ");
				carr[i].show(carr[i].AttackPerCost);
			}
			
			int offset = 0, power = 0;;

			ArrayList<Double> curAttackPerCost = new ArrayList <Double>();
			for(int i = 1;i<=N;i++)
			{
				curAttackPerCost.add(carr[i].AttackPerCost[offset]);
				hmap.put(carr[i], carr[i].AttackPerCost[offset]);
			}
			index = 0;
			boolean flag = false;
			while(M!=0)
			{
				Collections.sort(curAttackPerCost, Collections.reverseOrder());
				
					for(Card c:hmap.keySet())
					{
						if(hmap.get(c) == curAttackPerCost.get(index))
						{
							if(M >= c.C[offset])
							{
								M = M - c.C[offset];
								power = power + c.A[offset];
								System.out.println("\nTaken:  " + hmap.get(c));
								c.offset--;
								
								curAttackPerCost.add(c.AttackPerCost[offset]);
								hmap.put(c, c.AttackPerCost[offset]);
								flag = true;
								break;
							}
						}
					}
					if(flag == true)
					{
						curAttackPerCost.remove(index);
						Collections.sort(curAttackPerCost, Collections.reverseOrder());
						index = 0;
					}
					else
					{
						curAttackPerCost.remove(index);
						if(curAttackPerCost.size() == 0)
							break;
						
						index=0;
					}
				//}
			}

			System.out.println("\nCase #" + n1 + ": " + power);
			n1++;
		}

	}

}
