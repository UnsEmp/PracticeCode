package day05;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random ra = new Random();
        int[] arr = {1, 5, 9, 11, 19};
        for(int i = 0;i < 5;++i) {
            int t = ra.nextInt(20) + 1;
            System.out.println("random number is " + t);
            for(int j = 0;j < 5;++j) {
                if(t == arr[j]) {
                    System.out.println("position: " + j + " number" + arr[j]);
                }
            }
            System.out.println("*******");
        }


    }
}
