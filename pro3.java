package Basics;

import java.util.Scanner;

public class pro3
{
public static void main(String[]args) {	
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter the unit");
	
	int units;
	units=s.nextInt();

	double billpay=0;

        	if(units<100)
	 {
	      billpay=units*1.50;
	  }
	else if(units<200)
	 {
	   billpay=units*3.00;
	 }
	else if(units<300)
	{
	    billpay=units*5.00;
	}
       
	System.out.println("Bill to pay : " + billpay); 
      } 
   }
	
