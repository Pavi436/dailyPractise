package Zsgs;

public class Pattern56 {
	public void printPattern() {
		int input = 10, row = input / 2, n = 1;

		for (int i = 0; i < row; i++) {
			for (int j = row; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(n + " ");
				n++;
			}

			System.out.println();
		}

	}

	public static void main(String[] args) {
		new Pattern56().printPattern();
	}
}
