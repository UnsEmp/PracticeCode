package day04;

import java.util.Scanner;

/**
 *  循环嵌套
 *
 *      *****
 *      *****
 *      *****
 *      *****
 *      *****
 *
 *      *
 *      **
 *      ***
 *      ****
 *      *****
 *
 *      转义符：\t    tab
 *            \r    回车
 *            \n    换行
 */
public class ForForDemo {
    public static void main(String[] args) {
        for (int i = 1;i <= 4;i++){//控制行
            for (int j = 1;j <= 5;j++){//控制列
                System.out.print(" * ");
            }
            System.out.println();
        }


        System.out.println("=========================");

        for (int j = 1;j <= 5;j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("=========================");

        //输出九九乘法表
        int num = 0;
        for (int i = 1;i <= 9;i++){
            for (int j = 1;j <= i;j++){
                num = i * j;
                System.out.print(i + "*" + j + "=" + num + "  ");
            }
            System.out.println();
        }

//        System.out.println("=========================");
//
//        System.out.println("请输出金字塔层数：");
//        Scanner sc = new Scanner(System.in);
//        int d = sc.nextInt();
//        for (int i = 1;i <= d;i++) {
//            for (int k = 1;k <= d - i;k++){
//                System.out.print("   ");
//            }
//            for (int j = 1;j <= i * 2 - 1;j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
    }
}
