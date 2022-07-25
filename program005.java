package Basics;

import java.util.Arrays;

public class program005 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int temp;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                temp = arr[arr.length - 1];
                for (int j = arr.length - 2; j >= i; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    
    }
    
    
 }