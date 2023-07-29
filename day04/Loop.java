package day04;

import java.util.Scanner;

/**
 *  死循环：
 *      一直执行下去，如果没有干预就不会停止下来
 *
 *  for:
 *      for(;;){
 *
 *      }
 *  while:
 *      while(true){
 *
 *      }
 *  do..while:
 *      do{
 *
 *      }while(true);
 */
public class Loop {
    public static void main(String[] args) {
//        for (;;){
//            System.out.println("根本停不下来~");
//        }

//        while (true){
//            System.out.println("根本停不下来~");
//        }

//        do {
//            System.out.println("根本停不下来~");
//        }while (true);

        //需求：可以无限次输入密码，直至输入成功结束
        int okPassword = 520;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入正确的密码：");
            int password = sc.nextInt();
            if(password == okPassword){
                System.out.println("密码正确");
                break;//结束死循环，break可以理解为结束当前所在的循环
            }else {
                System.out.println("密码错误，请重新输出");
            }
        }
    }
}
