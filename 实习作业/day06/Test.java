package day06;

/*
    打印杨辉三角形
*/

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请输入一个1-20范围内的数：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[25];

        if(n == 1) System.out.println("1");
        else if(n == 2) System.out.println("1\n1\t1");
        else {
            System.out.println("1\n1\t1");
            arr[1] = 1;
            arr[2] = 1;
            for(int i = 3;i <= n;++i) {
                for(int j = i;j >= 1;--j) {
                    if(j == 1 || j == i) arr[j] = 1;
                    else arr[j] = arr[j] + arr[j - 1];
                }

                for(int j = 1;j <= i;++j) System.out.print(arr[j] + "\t");

                System.out.println();
            }
        }

    }
}
