import java.util.*;

public class FloydWarshall {

	public static int n;
	public static int[][] distanceMatrix;
	public static int[][] path;
	
	public static void initialize()
	{
		n = Graph.n;
		path = new int[n+1][n+1];
		distanceMatrix = Graph.weight;
		for(int i = 1;i<=n;i++)
		{
			for(int j = 1;j<=n;j++)
			{
				//System.out.println("i = " + i + " j = " + j);
				if(distanceMatrix[i][j] != 0)
				{
					path[i][j] = i;
				}
				else
				{
					distanceMatrix[i][j] = 100000;
					path[i][j] = 0;
				}
			}
		}
	}

	public static void implementFloydWarshall()
	{
		for(int k = 1;k<=n;k++)
		{
			for(int i = 1;i<=n;i++)
			{
				for(int j = 1;j<=n;j++)
				{
					if(distanceMatrix[i][j] > distanceMatrix[i][k] + distanceMatrix[k][j])
					{
						distanceMatrix[i][j] = distanceMatrix[i][k] + distanceMatrix[k][j];
						path[i][j] = path[k][j];
					}
				}
			}
		}
	}
	
	public static void showPath(int source, int destination)
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int intermediate = path[source][destination];
		while(intermediate != source)
		{
			arr.add(intermediate);
			intermediate = path[source][intermediate];
		}
		Collections.reverse(arr);
		System.out.print(source + " -> ");
		for(int i = 0;i<arr.size();i++)
		{
			System.out.print(arr.get(i) + " -> ");
		}
		System.out.print(destination);
	}


}
