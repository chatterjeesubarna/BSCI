import java.util.Scanner;


public class NewGridSearch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int flag = 0;
		while(t!=0)
		{
			t--;
			flag = 0;
			int R = s.nextInt();
			int C = s.nextInt();
			String[] str_arr = new String[R];
			
			
			for(int i =0;i<R;i++)
			{
				str_arr[i] = s.next();
			}
			
			int r = s.nextInt();
			int c = s.nextInt();
			String[] str_sub_arr = new String[r];
			for(int i =0;i<r;i++)
			{
				str_sub_arr[i] = s.next();
				str_sub_arr[i].replace(" ", "");
			}
			
			for(int i = 0;i<R;i++)
			{
				int pos = 0;				
				if(str_arr[i].contains(str_sub_arr[0]))
				{
					int no_occur = 0;
					String temp = str_arr[i];
					int[] occ = new int[C];
					int pos1 = -1;
					
					while(temp.contains(str_sub_arr[0]))
					{
						//System.out.print("Current string :" + temp);
						int ind = temp.indexOf(str_sub_arr[0]);
						pos1 = pos1 + ind + 1;
						temp = temp.substring(ind+1);
						occ[no_occur] = pos1;
						no_occur++;
						//System.out.println("Next string to be worked: " + temp);
					}
					
					
					/*System.out.println("\nThe number of occurences is: " + no_occur);
					for(int h = 0;h<no_occur;h++)
						System.out.print(" " + (occ[h]));*/
					
					
					for(int k=0;k<no_occur;k++)
					{
						//System.out.println(" k: "+k);
						if(flag==1) break;
						//System.out.println("Checkd " + str_arr[i] + " and " + str_sub_arr[0] + " entered at index: "+occ[k]);
						//pos = str_arr[i].indexOf(str_sub_arr[0]);
						pos = occ[k];
						int j = i+1, index = 1;
						while(index<r)
						{
							if(str_arr[j].substring(pos, pos+c).equals(str_sub_arr[index]))
							{
								
								//System.out.println("Checkd " + str_arr[j] + " and " + str_sub_arr[index] + " entered");
								j++;
								index++;
							}
							else 
								{
									
								    //System.out.println("False: Checkd " + str_arr[j] + " and " + str_sub_arr[index] + " entered and substring: " + str_arr[j].substring(pos, pos+c+1));
								    j++;
								    break;
								}
						}
							if (index==r)
								{
									System.out.println("YES");
									flag = 1;
									break;
								}
					}
				}
				
			}
			if(flag==0)
				System.out.println("NO");
			
		}

	}

}
