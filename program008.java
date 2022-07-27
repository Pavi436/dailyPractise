package Basics;

import java.util.Scanner;

public class program008
{
public static void main(String[]args){	
	
	Scanner sc=new Scanner(System.in);
	
	int x,y,t;
	System.out.println("Enter the value of x and y");
	
	int x1=sc.nextInt();
	int y2=sc.nextInt();
	System.out.println("before swapping numbers:"+x1  +" "+y2);
	  
	t=x1;
	x1=y2;
	y=t;
	
	System.out.println("after swapping number:"+x1+" "+y);
    
   }
	
	
}
