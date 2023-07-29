package day04;

import java.util.Random;
import java.util.Scanner;

/**
 *  程序自动生成一个1-100之间的随机整数，让用户猜
 *
 *  当猜错的数据根据不同的情况做出相应的提示：
 *      1.猜大了，提示用户猜的数据大了
 *      2.猜小了，提示用户猜的数据小了
 *      3.猜对了，提示用户猜中了
 */
public class Test4 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100) + 1;//随机生成的数据
        System.out.println("系统将随机生成一个1-100内的随机数，你有无限次机会猜数据，请输入您猜的数据：");

        while (true){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();//用户猜的数据
            if (a > num){
                System.out.println("你猜的数据大了,请重新输入数据");
            }else if (a < num){
                System.out.println("你猜的数据小了,请重新输入数据");
            }else {
                System.out.println("恭喜你猜中了");
                break ;
            }
        }
    }
}
