package day05;

import java.util.Random;
import java.util.Scanner;

/**
 * 需求：
 *      后台随机生成1-20之间的5个数(允许重复)，猜数字
 *      未猜中，提示"未命中"，并继续猜测
 *      猜中了，"猜中了"，输出该数据在数组中的第一次出现的位置，且输出全部5个数据，最终结束程序
 */
public class Test1 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Random r = new Random();
        for (int i = 0;i < arr.length;i++){
            arr[i] = r.nextInt(20) + 1;
        }
        System.out.println("1-20内随机数已生成，请输入猜测的数据：");
        OUT:
        for (;;){
            System.out.println("请输入一个1-20之间的随机整数进行猜测");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();//猜测的数据
            for (int i = 0;i < arr.length;i++){
                if (a == arr[i]){
                    System.out.println("恭喜你猜中了！");
                    System.out.println("该数字在数组中第一次出现的位置为：" + (i + 1));
                    break OUT;//猜对了结束整个循环，表示结束
                }
            }
            System.out.println("对不起猜错了，请重新猜测");
        }
        System.out.print("生成的五个随机数为：" );
        for (int i =0;i < arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
