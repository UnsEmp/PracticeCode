package day04;

import java.util.Scanner;

/**
 *  Switch语句注意事项：
 *          1.Switch后表达式可以是常量，也可以是变量，case后面只能是常量，不能是变量,且多个case后面的值不能相同；
 *          2.default可以省略，但是不建议省略，因为它的作用是对不正确的情况给出提示；
 *          3.break可以省略，但是结果可能不是正确结果；
 *                  省略break可能会出现一个现象：case穿透
 *                      如果代码直行到没有写break的case块，执行完之后将直接进入下一个case执行代码（不进行case匹配），知道遇到break才结束switch语句；
 *                      这就是case穿透现象。（Switch的穿透性）
 *          4.default块可以在任意位置，因为其执行的顺序和位置无关，所有case未匹配成功后才会执行default语句；
 *          5.Switch语句的结束条件
 *              a.遇到break结束；
 *              b.执行到末尾结束；
 */

public class SwitchDemo {
    public static void main(String[] args) {
        System.out.println("请输入周_的行程安排");
        Scanner sc = new Scanner(System.in);
        String weekday = sc.next();//接收到数据类型是字符串(String)
        //String str = "周二";
        switch (weekday){
            case "周一":
                System.out.println("埋头苦干，解决bug");
                break;
                //case str :
            case "周二":
                System.out.println("bug没有解决，请求大牛程序员帮忙");
                break;
            case "周三":
                System.out.println("今晚啤酒、龙虾、小烧烤");
                break;
            case "周四":
                System.out.println("主动帮助新来女程序员解决bug");
                break;
            case "周五":
                System.out.println("王者");
                break;
            case "周六":
                System.out.println("与王婆介绍的小芳相亲");
                break;
            case "周日":
                System.out.println("郁郁寡欢，准备上班");
                break;
            default:
                System.out.println("输入数据有误");
                break;
        }
    }
}
