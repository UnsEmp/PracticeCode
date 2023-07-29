package day03;

import java.util.Scanner;

/**
 *  格式：
 *      switch（表达式）{
 *          case 1:
 *              语句体1；
 *              break；
 *          case 2：
 *              语句体2；
 *              break；
 *          ....
 *          default:
 *              语句体n+1；
 *              break；
 *      }
 *
 *      表达式：将要匹配的值，取值是byte，short，int，char，这四种所有JDK版本都支持，JDK5之后可以枚举，JDK7以后可以是字符串
 *      case：后面跟的是要和表达式进行比较的值（被匹配的值）
 *      break：表示中断，结束的意思，可以控制switch语句的结束
 *      default：当所有的值都和表达式不匹配的时候，就执行default中的语句体。相当于if语句中的else
 */

public class SwitchDemo {
    public static void main(String[] args) {
        /*
            本周安排：
                周一：埋头苦干，解决bug
                周二：bug没有解决，请求大牛程序员帮忙
                周三：今晚啤酒、龙虾、小烧烤
                周四：主动帮助新来女程序员解决bug
                周五：王者
                周六：与王婆介绍的小芳相亲
                周日：郁郁寡欢，准备上班
         */
        System.out.println("请输入周_的行程安排");
        Scanner sc = new Scanner(System.in);
        String weekday = sc.next();//接收到数据类型是字符串
        switch (weekday){
            case "周一":
                System.out.println("埋头苦干，解决bug");
                break;
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
