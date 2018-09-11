
public class BreadthFirstSearch {

	public static int vertex = 100;
	public static int adj_matrix[][] = new int[vertex+1][vertex+1];
	public static int color[] = new int[vertex+1];
	public static int parent[] = new int[vertex+1];
	public static int distance[] = new int[vertex+1];
	
	public static int queue[] = new int[1000];
	public static int rear = -1;
	public static int front = -1;
	public static int source = -1;
	
	public static void enqueue(int val)
	{
		if (rear == -1)
		{
			rear = 0;
			front = 0;
			queue[rear] = val;
		}
		else
		{
			queue[++rear] = val;
		}
	}
	
	public static int dequeue()
	{
		int val = 0;
		if (front == 0)
		{
			val = queue[0];
			rear = -1;
			front = -1;
		}
		else
		{
			val = queue[front--];
		}
		return val;
	}
	
	public static void bfsFunction()
	{
		color[source] = 1;
		enqueue(source);
		
		while(front != -1)
		{
			int next = dequeue();
			for(int i = 1;i<=100;i++)
			{
				if ((adj_matrix[next][i] == 1) && (color[i] == 0))
				{
					color[i] = 1;
					enqueue(i);
					parent[i] = next;
					distance[i] = distance[next] + 1;
				}
			}
			color[next] = 2;
		}

	}

}
