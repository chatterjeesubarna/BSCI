import java.util.Scanner;


public class SnakesandLadders {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while(T-- != 0)
		{
			int N = s.nextInt();
			int[][] ladder = new int[N][2];
			
			int[] ladder_details = new int[101];
			
			int no_of_moves = 0;
			for(int i = 0;i < N; i++)
			{
				ladder[i][0] = s.nextInt();
				ladder[i][1] = s.nextInt();
				ladder_details[ladder[i][0]] = i;
			}
			
			/*System.out.println("Ladder details");
			for(int i = 0;i < 101; i++)
				System.out.println(ladder_details[i]);*/
			
			int M = s.nextInt();
			int[][] snake = new int[M][2];
			int[] snake_details = new int[101];
			for(int i = 0;i < M; i++)
			{
				snake[i][0] = s.nextInt();
				snake[i][1] = s.nextInt();
				snake_details[snake[i][0]] = i;
			}
			int current = 1;
			while(current <= 94)
			{
				int ladder_flag = 0, dice_limit = 6;
				for(int i = 1;i<=dice_limit; i++)
				{	
					System.out.println("ladder_details at " + (current+i) + ": " + ladder_details[current+i]);
					if(ladder_details[current+i] != 0)
					{
						System.out.println("Entered to ladder at " + (current+i));
						System.out.println("Reached " + ladder[ladder_details[current+i]][1]);
						current = ladder[ladder_details[current+i]][1];
						ladder_flag = 1;
						break;
					}
				}
				if(ladder_flag == 1) 
				{
					no_of_moves++;
					continue;
				}
				int temp_current = current + dice_limit;
				int snake_flag = 0;
				while(snake_details[temp_current] != 0)
				{
					System.out.println("Snake details");
					snake_flag = 1;
					temp_current--;
					/*if(temp_current == current)
					{
						
					}*/
				}
				if(snake_flag == 1)
				{
					System.out.println("Snaked");
					current = temp_current;
				}
				else 
				{
					current = current + 6;
					System.out.println("Moved to " + current);
				}
					
				no_of_moves++;
				
			}
			if(current == 100)
			{
				System.out.println(no_of_moves);
				
			}
			else
				System.out.println((no_of_moves + 1));
		}

	}

}
