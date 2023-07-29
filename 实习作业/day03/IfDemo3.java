package day03;

/*
    格式2
        if(关系表达式) {
            语句体1
        } else {
            语句体2
        }
*/

import java.util.Scanner;

public class IfDemo3 {
    public static void main(String[] args) {
        /*
            判断成绩并且输出
            90-100 优秀
            80-90 良好
            70-80 中等
            60-70 及格
            0-60 不及格
        */
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        // 录入数据



        int score = sc.nextInt(); //90

        if(score >= 0 && score <= 100) {
            if(score >= 90 && score <= 100) {
                System.out.println("优秀");
            }
            else if(score >= 80 && score <= 90) {
                System.out.println("良好");
            }
            else if(score >= 70 && score <= 80) {
                System.out.println("中等");
            }
            else if(score >= 60 && score <= 70) {
                System.out.println("及格");
            }
            else {
                System.out.println("不及格");
            }
        }
        else {
            System.out.println("当前成绩");
        }

        //键盘录入月份，输出对应月份的季节
        /*
            春:3 4 5
            夏:6 7 8
            秋:9 10 11
            冬:12 1 2
         */


    }
}
