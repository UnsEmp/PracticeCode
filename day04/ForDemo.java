package day04;

/**
 *  循环：重复做某件事，有明确的开始和停止     0-10    5-10
 *
 *  格式：
 *      for(初始化语句；条件判断语句；条件控制语句){//循环三要素
 *          循环体语句；
 *      }
 *
 *      初始化语句：用于表示循环开始时的起始状态，int i = 0；int i = 5；
 *      条件判断语句：用于表示循环反复执行的条件，简单说就是判断循环是否一直执行下去；
 *      条件控制语句：用于表示循环执行中每一次变化的内容，简单说就是控制循环是否能一直执行下去；
 *      循环体语句：用于表示循环反复执行的内容，简单说就是循环反复执行的事情；
 */

public class ForDemo {
    public static void main(String[] args) {
        for (int i = 1;i <= 5;i++) {
            System.out.println("HelloWorld");
            //System.out.println("HelloWorld");
            //System.out.println("HelloWorld");
            //System.out.println("HelloWorld");
            //System.out.println("HelloWorld");代码冗余
        }
        System.out.println("====================");
        //需求：在控制台输出1-5和5-1
        for (int i = 1;i <= 5;i++){
            System.out.println(i);
        }
        System.out.println("====================");
        for (int i = 5;i >= 1;i--){
            System.out.println(i);
        }
        //求和：1-5的和
        int sum = 0;//求和变量
        for (int i = 1;i <= 5;i++){
            sum += i;
        }
        System.out.println("sum = " + sum);
        //总结：如果今后的需求中，看到xx求和的字样，就需要先定义一个求和变量

        System.out.println("====================");

        //需求：求1-100之间的偶数和，输出结果
        int num = 0;
        for (int i = 1;i <= 100;i++){
            if (i % 2 ==0){
                num += i;
            }
        }
        System.out.println("1-100偶数和为：" + num);

        System.out.println("====================");

        int num1 = 0;
        for (int i = 0;i <= 100;i += 2){
            num1 += i;
        }
        System.out.println("1-100偶数和为：" + num1);
    }
}
