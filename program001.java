package Basics;

public class program001 {
		  public static void main(String[] args) {
		    
		    int num = 1234, reversed = 0;

		    for(;num != 0; num /= 5) {
		      int digit = num % 5;
		      reversed = reversed * 5 + digit;
		    }

		    System.out.println("Reversed Number: " + reversed);
		  }
		}
	
	
