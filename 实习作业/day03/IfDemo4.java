package day03;

import java.util.Scanner;

/**
 *  if语句格式3：
 *      if(关系表达式){
 *          语句体1；
 *      }else if(关系表达式){
 *          语句体2；
 *      }else if(关系表达式){
 *          语句体3；
 *      }...
 *      else{
 *          语句体n + 1；
 *      }
 */

public class IfDemo4 {
    public static void main(String[] args) {
        /*
            判断成绩等级并输出
            90-100  优秀
            80-90   良好
            70-80   中等
            60-70   及格
            0-60    不及格
        */
        //创建键盘录入对象
//        System.out.println("请输入你的的考试成绩：");
//        Scanner sc = new Scanner(System.in);
//        //录入数据
//        int score = sc.nextInt();
//
//        if (score >= 0 && score <= 100){
//            if (score >= 90 && score <= 100){
//                System.out.println("优秀");
//            }else if(score >= 80 && score <= 89){
//                System.out.println("良好");
//            }else if (score >= 70 && score <=79){
//                System.out.println("中等");
//            }else if (score >= 60 && score <= 69){
//                System.out.println("及格");
//            }else if (score >= 0 && score <= 59){
//                System.out.println("不及格");
//            }/* 一种方法
//            else if (score < 0 || score > 100){
//            System.out.println("输入成绩有误，请重新输入...");
//            }//为了提高效率，应当首先判断是否为非法数据
//            */
//        }else{//非法数据
//            System.out.println("输入数据有误，请重新输入");
//        }

        //键盘录入月份，输出对应月份季节
        /*
            春：3,4,5
            夏：6,7,8
            秋：9,10,11
            东：12，1,2
        */
        System.out.println("==================");
        System.out.println("请输入月份");
        Scanner sc1 = new Scanner(System.in);
//        double jiJie = sc1.nextDouble();
//        if (jiJie > 12 || jiJie <= 0){
//            System.out.println("输入的季节有误，请重新输入");
//        }else if (jiJie >= 3 && jiJie < 6){
//            System.out.println(jiJie + "月份是春季");
//        }else if (jiJie >= 6 && jiJie < 9){
//            System.out.println(jiJie + "月份是夏季");
//        }else if (jiJie >= 9 && jiJie < 11){
//            System.out.println(jiJie + "月份是秋季");
//        }else if ((jiJie >= 11 && jiJie <= 12) || (jiJie > 0 && jiJie <3)){
//            System.out.println(jiJie + "月份是冬季");
//        }
        int month = sc1.nextInt();
        if (month < 1 || month > 12){
            System.out.println("输入的月份有误");
        }else if (month == 1 || month == 2 || month == 3){
            System.out.println(month + "月份是春季");
        }else if (month == 4 || month == 5 || month == 6){
            System.out.println(month + "月份是夏季");
        }else if (month == 7 || month == 8 || month == 9){
            System.out.println(month + "月份是秋季");
        }else if (month == 10 || month == 11 || month ==12){
            System.out.println(month + "月份是冬季");
        }
    }
}
