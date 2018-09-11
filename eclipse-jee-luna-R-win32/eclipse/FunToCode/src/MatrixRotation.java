import java.util.*;
public class MatrixRotation {

	static void disp(long[][] arr, int m, int n)
	{
		System.out.println("\n\nThe intremediate array is: ");
        for(int i =0;i<m;i++)
        {
            for(int j = 0;j<n;j++)
            {
            	System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
	}
	static long[][] rotateOnce1(long[][] arr, int m, int n)        
    {
		//System.out.println("\njhfjnhis: ");
        long count = n/2;
        if (m<n)
        	count = m/2;
        int limit_row1 = 0, limit_row2=m-1, limit_col1 = 0, limit_col2 = n-1;
        while(count--!=0)
        {
        	
        	long left_top = arr[limit_row1][limit_col1], right_top = arr[limit_row1][limit_col2];
        	long left_bottom = arr[limit_row2][limit_col1], right_bottom = arr[limit_row2][limit_col2];
        	
        	
        	int times = limit_col2 - limit_col1;
        	int i = 1; int col = limit_col1;
        	while(i<=times)
        	{
        		arr[limit_row1][col] = arr[limit_row1][col+1];
        		col++;
        		i++;
        	}
        	disp(arr, m, n);
        	
        	times = limit_row2 - limit_row1;
        	i = 1; int row = limit_row1;
        	while(i<=times)
        	{
        		arr[row][limit_col2] = arr[++row][limit_col2];
        		i++;
        	}
        	disp(arr, m, n);
        	
        	times = limit_col2 - limit_col1;
        	i = 1; col = limit_col2;
        	while(i<=times)
        	{
        		arr[limit_row2][col] = arr[limit_row2][--col];
        		i++;
        	}
        	disp(arr, m, n);
        	
        		times = limit_row2 - limit_row1-1;
            	i = 1; row = limit_row2;
            	while(i<=times)
            	{
            		arr[row][limit_col1] = arr[--row][limit_col1];
            		i++;
            	}
            	disp(arr, m, n);
            	
        	
        	arr[limit_row1+1][limit_col1] = left_top;
        	
        	limit_row1++;
        	limit_row2--;
        	limit_col1++;
        	limit_col2--;
        	
        }
        
        return arr;
    }
	
	static long[][] rotateOnce2(long[][] arr, int m, int n)        
	{
		long count = n/2;
        if (m<n)
        	count = m/2;
        
        int row_count = m, col_count = n, start_val1 = 0, start_val2 = 0; 
        while(count--!=0)
        {
        	int linear_arr_length = 2*col_count + 2*row_count - 4;
        	long[] temp_arr = new long[linear_arr_length];
        	int index = 0, i = start_val1, j = start_val2;
        	
        	while(index<linear_arr_length)
        	{
        		temp_arr[index++] = arr[i][j];
        		if(j==col_count-1)
        		{
        			if(i!=row_count-1)
        				i++;
        			else
        				j--;
        		}
        		else if(i==row_count-1)
        		{
        			if(j>=start_val2)
        				j--;
        			else
        				i--;
        		}
        		else if(i>=start_val1)
        			i--;
        		else
        			j++;
        	}
        	
        }
		return arr;		
	}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        long r = s.nextLong();
        long[][] arr = new long[m][n];
        for(int i =0;i<m;i++)
        {
            for(int j = 0;j<n;j++)
            {
                arr[i][j] = s.nextLong();
            }
        }
        
        /*for(int i=1;i<=r;i++)
        {
        	arr = rotateOnce1(arr, m, n);
        	
        }*/
        
        System.out.println("\nThe final array is: ");
        for(int i =0;i<m;i++)
        {
            for(int j = 0;j<n;j++)
            {
            	System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
