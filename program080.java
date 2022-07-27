package Basics;

import java.util.Scanner;

public class program080
{
public static void main(String[]args) {	
	
Scanner r = new Scanner (System.in);	
	
System.out.println("Enter the Nymber");	
	
  int num = r.nextInt();
  if(num%2==0){
	
  System.out.println(num+"is even");
  }
  else { 
  System.out.println(num+"is odd");
  
       }
  
   }
  
  
}
