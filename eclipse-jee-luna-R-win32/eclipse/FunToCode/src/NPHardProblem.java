import java.util.*;


public class NPHardProblem {

	public static HashMap <Integer, ArrayList<Integer>> hmap = new HashMap <Integer, ArrayList<Integer>>();
	public static int n=0, m=0;
	public static boolean[] visited;
	public static boolean[] redBlue;

	public static boolean colorGraph(int s, boolean color)
	{
		if(visited[s]) 
		{
			if(redBlue[s] == color)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			visited[s] = true;
			redBlue[s] = color;
			ArrayList<Integer> arlst = new ArrayList<Integer>();
			arlst = hmap.get(s);
			boolean newColor = true;
			if(color == true)
				newColor = false;
			if(arlst != null)
			{
				for(int i = 0;i<arlst.size();i++)
				{
					if(!colorGraph(arlst.get(i), newColor))
					{
						return false;
					}
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		m = s.nextInt();
		visited = new boolean[n+1];
		redBlue = new boolean[n+1];
		StringBuilder str1 = new StringBuilder("");
		StringBuilder str2 = new StringBuilder("");
		int count1 = 0, count2 = 0;

		for(int i = 1;i<=n;i++)
		{
			ArrayList<Integer> arrlst = new ArrayList<Integer>();
			hmap.put(i, arrlst);
			visited[i] = false;
		}

		for(int i = 1;i<=m;i++)
		{
			int u = s.nextInt();
			int v = s.nextInt();
			hmap.get(u).add(v);
			hmap.get(v).add(u);
		}
		boolean possibilty = colorGraph(1, true);
		if(possibilty)
		{
			for(int i = 1;i<=n;i++)
			{
				if(redBlue[i] == true)
				{
					if(hmap.get(i).size() < 1)
						continue;
					str1.append(i).append(" ");
					count1++;
				}
				else
				{
					if(hmap.get(i).size() < 1)
						continue;
					str2.append(i).append(" ");
					count2++;
				}
			}
			System.out.println(count1);
			System.out.println(str1);
			System.out.println(count2);
			System.out.println(str2);
		}
		else
			System.out.println("-1");

	}

}
