package exercise;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Scanner;;

public class exercise {

	private static int row;

	public static void main(String[] args) {

// ouestion1
            //		
            //		int a = 7;
				
           //		for (int i = 1; i <=10; i++) {
          //System.out.println(a*i);
       //System.out.println(a-i);
		

		
		
		//question no:3
		
		

//question23

     //int x = 5;
     //int x1 = ++x - x++ + --x;
     //System.out.println(x1);


		// question18
		// 1)
		 //int a = 5;
		 //int b = 5;

		// int x=69>>>2;

		// System.out.println(++a-b--);
		// System.out.println(a%b++);
		// System.out.println(a*=b+5);
		// System.out.println(x);
		
		
		
// question 19
		 //int a = 28;
//
		// System.out.println(a+= a++ + ++a + --a + a--);

		// question20
		//int x = 5;
		//System.out.println(x=x++ * 2+3 * --x);
		//System.out.println(69>>>2);

		// question21
		//int y =10;
		//int z = (++y* (y++ + 5));
		//System.out.println(z);

		
//24) Program to Find ASCII Value of a Character
//		 char c = 'z';
//		int ascii = c;
//		System.out.println("the ascii value of " + c + "is" + ascii);

		// question 25

//		int dividend = 60; int divisor = 6;
//		int quotient = dividend / divisor;
//		int remainder = dividend % divisor;
//		System.out.println("the quotient is = " + quotient);
//		System.out.println("the remainder is = " + remainder);

//	question 26
//        		long num1 = 10l;
//        		long num2 = -10l;
//        		System.out.println("num1="+ num1);
//       		System.out.println("num2="+ num2);
       //		
		// question 27
//        		int x,y,t;
//      		Scanner sc = new Scanner(System.in);
//      		       		System.out.println("enter the value of x and y" );
//       		x = sc.nextInt();
//      		y = sc.nextInt();
//        		System.out.println("before swapping numbers: "+x +"  "+ y);  
//           		t = x ;
//          		x = y ; 
//            		y = t ;
//          		System.out.println("after swapping number:  "+x+"  "+y);

//question 28
          //		Scanner reader = new Scanner(System.in);
          //		System.out.print("enter the number:");
         //		int num = reader.nextInt();
        //		if(num % 2 == 0){
      		
          //		System.out.println(num + " is even");
          //		}
         //		 else  {
     			
        //			System.out.println(num + " is odd");}

// question 29

//                 		char al = 'k';
//                		if (al == 'a' || al == 'e' || al == 'i' || al == 'o' || al == 'u')
//               			System.out.println(al+"is vowel");
//              		else
//             			System.out.println(al  +   "  is consonant");

// question no:30

//                    		int a,b,c,largest,med;
//                   		
//                  		Scanner sc = new Scanner(System.in);
//                 		System.out.println("enter the first number:");
//                		a = sc.nextInt();
//               		System.out.println("enter the second number:");
//              		b = sc.nextInt();
//             		System.out.println("enter the third number");
//            		c = sc.nextInt();
//           		
//          		//comparing a and b and storing the largest number in a temp variable  
//          		med = a>b?a:b;
//           		//comparing the temp variable with c and storing the result in the variable  
//           		largest = c>med?c:med;
//           		System.out.println("the largest value is " + largest);
		
// question 31

//               		double firstRoot = 0;double secondRoot = 0;
//               		Scanner reader = new Scanner(System.in);
//              		System.out.println("enter the value a");
//              		double a = reader.nextDouble();
//              		System.out.println("enter the value of b");
//             		double b = reader.nextDouble();
//             		System.out.println("enter the value of c");
//              		double c = reader.nextDouble();
//             		
//             		double determinant = (b*b - 4*a*c); 
//             		
//             		double sqrt = Math.sqrt(determinant);
//             	
//             		
//             		
//               		
//                		if(determinant>0) {
//               			firstRoot = (-b +(sqrt) / 2*a);
//              		secondRoot = (-b -(sqrt)/ 2*a);
//              		System.out.println(" roots are ::" + firstRoot + "and" + secondRoot);}
//             		else if 
//           			(determinant ==0) {
//           			System.out.println("root is :: " + (-b + sqrt/ 2*a));}

// question no : 32
        //		 int num;
       //		Scanner sc = new Scanner(System.in);
      //		System.out.println("enter the  number:");
     //		num = sc.nextInt();
    //		if(num> 0)
   //		System.out.println("it is positive" );
   //		else if(num<0)
     //		System.out.println("it is negative");
      //		else 
      //			System.out.println("neither positive nor negative");

// question no : 33

        //		Scanner sc = new Scanner(System.in);
       //		char ch;
       //		System.out.println("enter the  number or letter:");
      //		ch = sc.next().charAt(0);
//		
         //		if((ch >= 'A' && ch <= 'Z') || ch>= 'a' && ch <= 'z')
          //		
        //			{System.out.println(ch + "is aplhabet" );}
         //		else {
       //			System.out.println(ch+ "is not alphabet");
        //		
// question no 34

        //		Scanner sc = new Scanner(System.in);
       //		System.out.println("enter the number");
      //		int num = sc.nextInt();
     //		int i =1, fact =1;
    //        while(i<=num) {
    //        
      //            fact=fact*i;
     //            i++;}
    //		System.out.println("factorial of the number: "+ fact);
     //		

// question no: 35
       //int i;
      //		int [] arr = new int[] {0,1,5,7,4};
     //		System.out.println("elements of a given array present on even position ");
    //		for( i=0; i<arr.length;i=i+2 )
    //		{	
    //	System.out.println(arr[i]);
    //	
    //		}

// questio no : 36
           //		int i;
          //		int [] arr = new int[] {1,2,3,4,5};
         //		System.out.println("elements of a given array present on odd position ");
         //		for( i=1; i<arr.length;i=i+2
        //				)
       //		{	
      //	System.out.println(arr[i]);}
 		
		
		
// question no:37
             //		int i;
             //		int [] arr = new int[] {1,2,3,4,5};
            //		System.out.println("elements of a given array present on odd position ");
             //		for( i=1; i<arr.length;i=i+2
             //				)
            //		{	
             //	System.out.println(arr[i]);}

		// qestion no:38

		// Java Program to print the largest element in an array
            //		
                 //		int [] arr = new int [] {67,89};
//		 
                //		int max = arr[0];
               //		 int i;
//		 
               //		for( i=0; i<arr.length;i++){
                   //		if(arr[i]> max)
                //		max = arr[i];}
               //		{System.out.println("largest number present in given array:" + max);}
              //		

// question no: 39
		// Java Program to print the smallest element in an array
               //     int [] arr = new int [] {67,89,403,538};
//		 
//		int min = arr[0];
//		int i;
//		
//		for( i=0; i>arr.length;i++){
//    	if(arr[0]> min)
//		min = arr[0];}
//		{System.out.println("smalest number present in given array:" + min);}

		// question no: 40
//		
//		int arr[] = new int[] {1,2,3,4,5,6,7,8,9};
//		System.out.println("elements in array:"+ arr.length);

		// question no: 41

//		
//		int arr1[] = new int[] {1,2,3};
//		int arr2[] = new int [arr1.length];
//		int i;
//		
//		for ( i = 0;i<arr1.length;i++)
//		arr2[i] = arr1[i];
//		
//		System.out.println("elements of original array");
//		for ( i = 0;i<arr1.length;i++) {
//			System.out.println(arr1[i] + "");
//			
//		}
//		System.out.println();
//		System.out.println("elements of new array");
//		for ( i = 0;i<arr2.length;i++) {
//			System.out.println(arr2[i] + "");}

		// question no :42

		//
		int rowNum = 9;
		  
		for (int row = 1; row <= rowNum; row++){
			
			
    for(int space = rowNum; space > row;space--){
				
			System.out.print("  ");
			}
//			
//			
//		int i = 1;
//		for(; i < row; i++) {
//			System.out.print(i +" ");
//		}
//		for(;i > 0;i--) {
//			System.out.print(i +" ");
//		}
//				System.out.println();}
		
		
		//question no: 13
		
		
//		
//		int a = 5;
//		int areaSquare = a*a;
//
//		System.out.println("square is " + areaSquare );
		
		
			//question no: 14
		
//		int lenght = 10;
//		int width = 10;
//		int area = lenght*width;
//		System.out.println("area of rectamgle is " + area);

		
		//quetion no: 15
		
		
//		Scanner cylinder = new Scanner(System.in);
//		
//		System.out.println("enter radius");
//		
//		int radius = cylinder.nextInt();
//		
//		System.out.println("enter height");
//		
//		int height = cylinder.nextInt();
//		
//		double pi = Math.PI;
//		
//		
//	double area = 2*3.14*radius*radius*height;
//	System.out.println("area of cylinder is " + area);
		
		//question no: 16
		
		//int x = 5;
		//int x1 = ++x-x++ + --x;
		
		
		//QUESTION NO : 60
		 
		//	Scanner cs=new Scanner(System.in);
	 //int n;
	
//	 
//    System.out.println("Enter the range of number:");
//    n=cs.nextInt();
//    int sum=0;
//	 int i;
//    int p=1;
//    for(i=1;i<=n;i++)
//    {
//            sum+=p;
//            p=(p*10)+1;
//    }
//    System.out.println("The sum of the series = "+sum);
		
		
		
//		
//		static double calculateArea(int x, int y)
//		{
//		    // Declare value of pi
//		    //double pi = 3.1415926536;
//		 
//		    // Calculate area of outer circle
//		    double arx = Math.PI * x * x;
//		 
//		    // Calculate area of inner circle
//		    double ary = Math.PI * y * y;
//		 
//		    // Difference in areas
//		    return arx - ary;
//		}
//		 
//		// Driver code
//		public static void main (String[] args)
//		{
//			
//			
//		    int x = 2;
//		    int y = 1;
//		    System.out.println (calculateArea(x, y));
    
		    
	
		 }

	
	
	
	
		
		
	
