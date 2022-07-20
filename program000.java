package Basics;

import java.util.Scanner;

public class program000 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Table Number");
		int t = s.nextInt();

		for (int i = 0; i <= 5; i++) {

			System.out.println(t + "*" + i + "=" + i * t);

		}
		int i=0;
		
		for ( i = 0; i <= 5; i++) {
			System.out.println(t + "-" + i + "=" + (t - i));
		}
	}

}
