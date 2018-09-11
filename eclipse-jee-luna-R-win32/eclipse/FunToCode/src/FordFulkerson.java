import java.util.*;


public class FordFulkerson {

	public static int n, source = 1, destination = n, maxFlow = 0, count = -1;
	public static int[] parent;
	public static ArrayList<Integer> queue = new ArrayList<Integer>();
	public static boolean[] visited;
	public static int[][] adjacencyMatrix, capacity, flow;

	
	public static void show()
	{
		System.out.println("Flow Matrix");
		for(int i = 1;i<=n;i++)
		{
			System.out.println();
			for(int j = 1;j<=n;j++)
			{
				System.out.print(flow[i][j] + " ");
			}
		}
		
		System.out.println("Adjacency Matrix");
		for(int i = 1;i<=n;i++)
		{
			System.out.println();
			for(int j = 1;j<=n;j++)
			{
				System.out.print(adjacencyMatrix[i][j] + " ");
			}
		}
	}
	public static void initialize()
	{
		n = Graph.n;
		destination = n;
		adjacencyMatrix = Graph.adjacencyMatrix;
		capacity = Graph.weight;
		visited = new boolean[n+1];
		parent = new int[n+1];
		flow = new int[n+1][n+1];
		for(int i = 1;i<=n;i++)
		{
			visited[i] = false;
			parent[i] = -1;
			for(int j = 1;j<=n;j++)
			{
				if(adjacencyMatrix[i][j] == 1)
				{
					flow[i][j] = capacity[i][j];
					flow[j][i] = 0;
					adjacencyMatrix[j][i] = -1;
				}
			}
		}
	}

	public static void push(int node)
	{
		queue.add(node);
		System.out.println("Added node: " + node);
	}

	public static int pop()
	{
		return queue.remove(0);
	}

	public static boolean performBFS()
	{
		push(source);
		visited[source] = true;
		parent[source] = -1;
		while(!queue.isEmpty())
		{
			int vertex = pop();
			for(int i = 1;i<=n;i++)
			{
				if(adjacencyMatrix[vertex][i] != 0 && !visited[i] && flow[vertex][i] != 0)
				{
					if(i == destination)
					{
						parent[i] = vertex;
						return true;
					}
					else
					{
						visited[i] = true;
						push(i);
						parent[i] = vertex;
					}
				}
			}
		}
		return false;
	}
	public static void implementFordFulkerson()
	{
		while(performBFS())
		{
			int vertex = destination, bottleneck = 100000;
			System.out.println("Parent array: " + Arrays.toString(parent));
			while(vertex != source)
			{
				int par = parent[vertex];
				if(flow[par][vertex] < bottleneck)
				{
					bottleneck = flow[par][vertex];
				}
				vertex = par;
			}
			maxFlow = maxFlow + bottleneck;
			System.out.println("Added flow " + bottleneck);
			vertex = destination;
			while(vertex != source)
			{
				int par = parent[vertex];
				flow[par][vertex] = flow[par][vertex] - bottleneck;
				flow[vertex][par] = flow[vertex][par] + bottleneck;
				vertex = par;
			}
			queue.clear();
			for(int i = 1;i<=n;i++)
			{
				parent[i] = 0;
				visited[i] = false;
			}
		}
		System.out.println("Max Flow is: " + maxFlow);
	}


}
