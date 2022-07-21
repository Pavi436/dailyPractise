package Basics;

import java.util.Scanner;

public class Program002 {
	public static void main(String Args[]) {
		
		Scanner Scan = new Scanner(System.in) ;
		System.out.println("Enter the length");
		double l =Scan.nextDouble();
		
		System.out.println("Enter the breadth");
		double b = Scan.nextDouble();
		
		//Area of square = l*b;
		
		double Area = l*b;
		
		System.out.println("Area of the rectangle is : " + Area);
			
		
	}
}
