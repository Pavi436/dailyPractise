
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n =sc.nextInt();//12345
        int reverse=0,rem;
        while(n!=0) {//12345!=o(T),
            rem = n%10;//5,4,3,2,1
            reverse = (reverse*10)+rem;//5,54,543,5432,54321
           n = n/10;
        }

        System.out.println("Reversed Number: " + reverse);
    }
}
