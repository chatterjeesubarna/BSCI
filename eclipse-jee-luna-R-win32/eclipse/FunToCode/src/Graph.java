import java.util.Scanner;


public class Graph {

	public static int n;
	public static int[][] adjacencyMatrix, weight;
	public static int[] distanceFromSource;
	public static int[] parent;
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("No: of nodes");
		n = s.nextInt();
		adjacencyMatrix = new int[n+1][n+1];
		distanceFromSource = new int[n+1];
		parent = new int[n+1];
		weight = new int[n+1][n+1];
		for(int i = 0;i<n+1;i++)
		{
			distanceFromSource[i] = 100000;
			parent[i] = -1;
			for(int j = 0;j<n+1;j++)
			{
				weight[i][j] = 0;
				adjacencyMatrix[i][j] = 0;
			}
		}
		System.out.println("No: of edges");
		int e = s.nextInt();
		while(e-- != 0)
		{
			int x = s.nextInt();
			int y = s.nextInt();
			weight[x][y] = s.nextInt();
			adjacencyMatrix[x][y] = 1;
			// For undirected graph
			/*weight[y][x] = weight[x][y];
			adjacencyMatrix[y][x] = 1;*/
			//System.out.println("Link created between " + x + " and " + y);
		}
		distanceFromSource[1] = 0;

		// BELLMAN FORD ALGORITHM
		/*BellmanFord b = new BellmanFord();
		BellmanFord.initialize(b);
		BellmanFord.implementBellmanFord();
		BellmanFord.show();*/

		// DIJKSTRA ALGORITHM
		/*Dijkstra.initialize();
		Dijkstra.implementDijkstra();
		Dijkstra.show();*/

		// FORD FULKERSON ALGORITHM
		/*FordFulkerson.initialize();
		FordFulkerson.show();
		FordFulkerson.implementFordFulkerson();*/

		// FLOYD WARSHALL ALGORITHM
		/*FloydWarshall.initialize();
		FloydWarshall.implementFloydWarshall();
		for(int i = 1;i<=n;i++)
		{
			for(int j = 1;j<=n;j++)
			{
				if(i==j) continue;
				System.out.println();
				FloydWarshall.showPath(i, j);
			}
		}*/
		
		// EXISTANCE OF CYCLE - UNION FIND ALGORITHM
		UnionFind.initialize();
		UnionFind.findCycle();

	}

}
