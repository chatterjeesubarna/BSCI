
public class UnionFind {

	public static int n;
	public static int[][] adjacencyMatrix, weight;
	public static int[] parent, rank;
	
	public static void makeSet()
	{
		for(int i = 1;i<=n;i++)
		{
			parent[i] = i;
			rank[i] = 0;
		}
	}
	public static void initialize()
	{
		n = Graph.n;
		weight = Graph.weight;
		adjacencyMatrix = Graph.adjacencyMatrix;
		parent = new int[n+1];
		rank = new int[n+1];
		makeSet();
	}
	public static int findSet(int x)
	{
		if(parent[x] == x)
			return x;
		return findSet(parent[x]);
	}
	public static boolean union(int x, int y)
	{
		int px = findSet(x);
		int py = findSet(y);
		if(px == py)
			return false;
		if(rank[x] == rank[y])
		{
			parent[y] = parent[x];
			rank[x] = rank[x] + 1;
		}
		else if(rank[x] > rank[y])
		{
			parent[y] = parent[x];
		}
		else if(rank[x] < rank[y])
		{
			parent[x] = parent[y];
		}
		return true;
	}
	
	public static boolean findCycle()
	{
		for(int i = 1;i<=n;i++)
		{
			for(int j = 1;j<=n;j++)
			{
				if(adjacencyMatrix[i][j] == 1)
				{
					if(!union(i, j))
					{
						System.out.println("CYCLE EXISTS");
						return true;
					}
				}
			}
		}
		System.out.println("NO CYCLE EXISTS");
		return false;
	}
}
