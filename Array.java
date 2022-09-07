package Zsgs;

import java.util.Scanner;

public class Array {
	public int[] startup() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n = sc.nextInt();
		int input[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("enter" + " " + i + " " + "Indexof element");
			input[i] = sc.nextInt();
		}
		sc.close();
		return input;
		

	}

	public static void main(String[] args) {
		
	}
}
