package day04;

/**
 *  格式：
 *      初始化语句；
 *      do{
 *          循环体语句；
 *          条件控制语句；
 *      }while(条件判断语句)；
 */
public class DoWhileDemo {
    public static void main(String[] args) {
        int x = 0;
        do {
            System.out.println("HelloWorld");
            x++;
        }while (x < 10);

        System.out.println("===========================");

        //求1-100之间的和
        int sum = 0;
        int a = 0;
        do {
            sum += a;
            a++;
        }while (a <= 100);
        System.out.println(sum);
    }
}
