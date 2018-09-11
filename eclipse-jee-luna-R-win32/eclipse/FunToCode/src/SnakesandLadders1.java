import java.util.Scanner;


public class SnakesandLadders1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while(T-- != 0)
		{
			int N = s.nextInt();
			int[][] ladder = new int[N][3];
			int[] ladder_flag = new int[101];
			int[] normal_interval = new int[101];
			int no_of_moves = 0;
			for(int i = 0;i < N; i++)
			{
				ladder[i][0] = s.nextInt();
				ladder[i][1] = s.nextInt();
				ladder[i][2] = ladder[i][1] - ladder[i][0] + 1;
			}
			int M = s.nextInt();
			int[][] snake = new int[M][2];
			for(int i = 0;i < M; i++)
			{
				snake[i][0] = s.nextInt();
				snake[i][1] = s.nextInt();
			}
			for(int i = 0;i < N-1; i++)
			{
				int max = i;
				for(int j = i+1;j < N; j++)
				{
					if(ladder[j][2] > ladder[max][2])
					{
						max = j;
					}
				}
				if(max != i)
				{
					int temp0 = ladder[max][0];
					int temp1 = ladder[max][1];
					int temp2 = ladder[max][2];
					ladder[max][0] = ladder[i][0];
					ladder[max][1] = ladder[i][1];
					ladder[max][2] = ladder[i][2];
					ladder[i][0] = temp0;
					ladder[i][1] = temp1;
					ladder[i][2] = temp2;
				}
			}
			System.out.println("Ladder details:");
			for(int i = 0;i < N; i++)
			{
				System.out.println(ladder[i][0] + " " + ladder[i][1] + " " + ladder[i][2]);
			}
			for(int i = 0;i < N; i++)
			{
				int lim1 = ladder[i][0], lim2 = ladder[i][1];
				if(ladder_flag[lim1] == 0 && ladder_flag[lim2] == 0)
				{
					System.out.println("Considered ladder: " + lim1 + " -> " + lim2);
					//no_of_moves++;
					for(int j = lim1;j <= lim2; j++)
					{
						ladder_flag[j] = 1;
					}
				}
				
			}
			int start = 0, stop = 0, index = 0, flag = 0;
			for(int i = 1;i < 101; i++)
			{
				if(ladder_flag[i] == flag) 
				{
					if(flag == 0) 
					{
						//System.out.println("Booundary flag at " + i + " as ladder_flag[" + i + "] = 1");
						if(start == 0)
						{
							normal_interval[index++] = 1;
							start = 1;
						}
						else 
							normal_interval[index++] = i-1;
						flag = 1;
					}
					else
					{
						normal_interval[index++] = i;
						flag = 0;
					}
				}
			}
			normal_interval[index] = 100;
			System.out.println("Nrmal interval:");
			for(int i = 0;i <= index; i++)
				System.out.print(normal_interval[i] + " ");
			for(int i = 0;i <= index; i=i+2)
			{
				int distance = normal_interval[i+1] - normal_interval[i] + 1;
				System.out.println("Distance is " + distance);
				if(distance % 6 == 0)
					no_of_moves = no_of_moves + (distance / 6);
				else if(distance < 6)
				{
					System.out.println("Move incresaed by 1");
					no_of_moves++;
				}
				else
				{
					System.out.println("Move incresaed by " + ((distance / 6) + 1));
					no_of_moves = no_of_moves + (distance / 6) + 1;
				}
			}
			System.out.println("no_of_moves: " + no_of_moves);
		}
		

	}

}
