package day05;

import java.util.Scanner;

/**
 *  带参数的方法的定义
 *      格式：
 *          public static void 方法名(参数类型 参数名1，参数类型 参数名。。。。){
 *              方法体;
 *          }
 *      注意事项：
 *          1.方法定义的时候，多个参数之间是可以用，隔开的
 *          2.参数的数量与数据类型必须和方法中定义的设置要匹配，否则报错
 *
 *  形参和实参：
 *      形参：形式参数，方法定义中的参数
 *
 *      实参：实际参数，实际参与运行的数据
 *
 *      关系：形式参数就是用于接受实际参数值的
 *
 *  打印n~m之间的所有技术    n和m作为形参     100-200
 *
 *  带有返回值的方法的声明：经常会根据一个产出的结果，来组织另外一段逻辑，为了拿到这个方法产生的结果
 *  就要定义带有返回值的方法
 *
 *  定义：
 *  public static 数据类型 方法名(数据类型 参数名){
 *      方法体;
 *      return 数据;
 *  }
 */
public class MethodDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("请输入两个数，判断两数之间的奇数");
        int a = sc.nextInt();
        int b = sc.nextInt();
        //jiShu(a,b);
        //对当前范围的奇数做进一步处理    1.获取奇数  2.进一步处理

        int max = getMax(a,b);
        System.out.println("获取到最大值为" + max);
    }

    //判断是否是偶数
    public static void method(int number,double d){
        int num = number;
        if(num % 2 == 0){
            System.out.println("偶数");
        }else {
            System.out.println("奇数");
        }
    }

    //输出n~m之间的奇数
    public static void jiShu(int a,int b){
        int c = 0;//换行，每五十个换一行
        System.out.println(a + "到" + b + "之间的奇数为：");
        if(a > b) {
            System.out.println("传入的数据有误");
            return;
        }
            for (int i = a; i <= b; i++) {
                if (i % 2 == 1) {
                    System.out.print(i + "\t");
                }
                c++;
                if (c % 50 == 0) {
                    System.out.println();
                }
            }

    }

    /**
     * 两个明确：
     *      返回值类型：int
     *      参数列表：2个，都是int
     */
    public static int getMax(int a,int b){
        int max = a > b ? a : b;
        return max;
    }
}
