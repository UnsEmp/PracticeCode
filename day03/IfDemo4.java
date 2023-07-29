package day03;

//键盘录入月份，输出对应月份的季节
/*
    春:3 4 5
    夏:6 7 8
    秋:9 10 11
    冬:12 1 2
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class IfDemo4 {
    public static void main(String[] args) {

//        ArrayList<int, int> Arr = new ArrayList<int, int>();


        /*if(score >= 90 && score <= 100) {
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
        }*/

        Scanner sc = new Scanner(System.in);
        double n;
        n = sc.nextDouble();


        if(n < 1 || n > 12 || n - (int)(n) > 0.0) {
            System.out.println("季节月份输入错误");
        }
        else if(n >= 3 && n <= 5) {
            System.out.println("春天");
        }
        else if(n >= 6 && n <= 8) {
            System.out.println("夏天");
        }
        else if(n >= 9 && n <= 11) {
            System.out.println("秋天");
        }
        else {
            System.out.println("冬天");
        }
    }
}
