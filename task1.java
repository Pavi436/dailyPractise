package practice;

public class task1 {
	public static void main(String args[]) {
		long sequence = 1;
		long n = 64;
		while ( n != 0) {
            sequence *= 2;
			n -= 1;
			System.out.println(sequence);
		}
	}

}
