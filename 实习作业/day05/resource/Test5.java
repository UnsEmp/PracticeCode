package day05;

import java.util.Random;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] brr = new int[9];

        int l = 0, r = arr.length - 1;
        for(int i = 0;i < arr.length;++i) {
            if(arr[i] % 2 == 1) brr[l++] = arr[i];
            else brr[r--] = arr[i];
        }

        for(int i = 0;i < brr.length;++i) System.out.print(brr[i] + " ");

    }
}
