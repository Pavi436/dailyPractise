package Basics;

public class program60{
		
	static double calculateArea(int x, int y)
	{
	    // Declare value of pi
	    double pi = 3.1415926536;
	 
	    // Calculate area of outer circle
	    double arx = pi * x * x;
	 
	    // Calculate area of inner circle
	    double ary = pi * y * y;
	 
	    // Difference in areas
	    return arx - ary;
	}
	 
	// Driver code
	public static void main (String[] args)
	{
	    int x = 2;
	    int y = 1;
	    System.out.println (calculateArea(x, y));
	}
}
	 
