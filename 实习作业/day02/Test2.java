package day02;


/*
    需求
    键盘录入一个三位数，将其拆分为个位，十位，百位，打印在控制台
    运行效果:
    请输入一个三位数:
    123
    整数123的个位为:3
    整数123的十位为:2
    整数123的百位为:1
*/


import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 读入三位数

        System.out.println("整数 " + num + " 的个位数为: " + num % 10);
        System.out.println("整数 " + num + " 的十位数为: " + num / 10 % 10);
        System.out.println("整数 " + num + " 的百位数为: " + num / 10 / 10);

    }
}
