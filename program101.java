package Basics;

public class program101 {
	public static void main(String args[])
	{
	    int i, j, n = 9;
	    for (i = 1; i <= n; i++)
	    {
	        int ch = 90;
	            for (j = i; j <= n; j++)
	            {
	                System.out.print((char)(ch -1 + j) + " ");
	            }
	        System.out.print("\n");
	    }
	}
	}
	
	
