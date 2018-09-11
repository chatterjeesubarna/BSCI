import java.util.*;
public class BellmanFord {

	public class Edge
	{
		int v1, v2;
	}
	public static int n;
	public static int[][] adjacencyMatrix, weight;
	public static int[] distanceFromSource, parent;
	public static ArrayList<Edge> Edges;
	public static void initialize(BellmanFord b)
	{
		n = Graph.n;
		distanceFromSource = Graph.distanceFromSource;
		weight = Graph.weight;
		adjacencyMatrix = Graph.adjacencyMatrix;
		parent = Graph.parent;
		Edges = new ArrayList<Edge>();
		for(int i = 1;i<=n;i++)
		{
			for(int j = 1;j<=n;j++)
			{
				if(adjacencyMatrix[i][j] == 1)
				{
					Edge e = b.new Edge();
					e.v1 = i;
					e.v2 = j;
					Edges.add(e);
				}
			}
		}
		for(int j = 0;j<Edges.size();j++)
		{
			Edge e = Edges.get(j);
			//System.out.println(j + ": " + e.v1 + " -> " + e.v2);
		}
	}
	public static void implementBellmanFord()
	{
		for(int i = 1;i<n;i++)
		{
			//System.out.println("Distance Array: " + Arrays.toString(distanceFromSource));
			for(int j = 0;j<Edges.size();j++)
			{
				Edge obtained = Edges.get(j);
				if(distanceFromSource[obtained.v2] > distanceFromSource[obtained.v1] + weight[obtained.v1][obtained.v2])
				{
					distanceFromSource[obtained.v2] = distanceFromSource[obtained.v1] + weight[obtained.v1][obtained.v2];
					parent[obtained.v2] = obtained.v1;
				}
			}
		}
		
		// Detect negative weight cycle
		for(int j = 0;j<Edges.size();j++)
		{
			Edge obtained = Edges.get(j);
			if(distanceFromSource[obtained.v2] > distanceFromSource[obtained.v1] + weight[obtained.v1][obtained.v2])
			{
				System.out.println("Negative Weight Cycle DETECTED !!");
				break;
			}
		}
	}
	public static void show()
	{
		System.out.println("The distance and parent are:");
		for(int i = 1;i<=n;i++)
		{
			System.out.println("Distance from vertex 1 -> " + i + " is " + distanceFromSource[i] + " via vertex " + parent[i]);
		}
	}
}
