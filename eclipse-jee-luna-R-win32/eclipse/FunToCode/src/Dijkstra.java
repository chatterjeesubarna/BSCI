import java.util.*;

public class Dijkstra {

	public static int n;
	public static int[][] adjacencyMatrix, weight;
	public static int[] distanceFromSource;
	public static int[] parent;
	public static int current=1;
	public static ArrayList<Integer> temporary;
	
	public static void initialize()
	{
		n = Graph.n;
		distanceFromSource = Graph.distanceFromSource;
		weight = Graph.weight;
		adjacencyMatrix = Graph.adjacencyMatrix;
		parent = Graph.parent;
		temporary = new ArrayList<Integer>();
		for(int i = 2;i<=n;i++)
		{
			temporary.add(i);
		}
	}
	public static void implementDijkstra()
	{
		while(temporary.size() != 0)
		{
			int minimum = 10000, index = 0;
			for(int i = 0;i<temporary.size();i++)
			{
				int vertex = temporary.get(i);
				if(adjacencyMatrix[current][vertex] == 1)
				{
					if(distanceFromSource[vertex] > distanceFromSource[current] + weight[current][vertex])
					{
						distanceFromSource[vertex] = distanceFromSource[current] + weight[current][vertex];
						parent[vertex] = current;
					}
					if(distanceFromSource[vertex] < minimum)
					{
						minimum = distanceFromSource[vertex];
						index = i;
					}
				}
			}
			current = temporary.get(index);
			temporary.remove(index);
		}
	}
	public static void show()
	{
		System.out.println("The distance of the vertices are:");
		for(int i = 1;i<=n;i++)
		{
			System.out.println("Distance from vertex 1 -> " + i + " is " + distanceFromSource[i] + " via vertex " + parent[i]);
		}
	}
}
