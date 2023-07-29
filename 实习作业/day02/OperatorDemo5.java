package day02;

/**
 * 逻辑运算符：
 *      一个数据x，大于5，小于15  表示： 5 < x < 15,但在java中不支持此种写法
 *      在java中，需要把上面的式子进行拆解，在进行合并表达
 *          5 < x < 15
 *          拆解： x > 5 并且 x < 15
 *          合并： x > 5  &  x < 15
 *
 *  &,|,^,!
 *  &&,||   //效率高
 *
 *      特点：
 *          1.连接多个关系表达式
 *          2.连接true或者false
 *
 */

public class OperatorDemo5 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x > 5 & x < 15);//true & true = true

        System.out.println("===================================");
        int i = 10;
        int j = 20;
        int k = 30;
        //&：并且关系    f & f = f;f & t = f; t & t =t
        System.out.println((i > j) & (i > k));//false & false = false
        System.out.println((i < j) & (i > k));//false & false = false
        System.out.println((i > j) & (i < k));//false & true  = false
        System.out.println((i < j) & (i < k));//true  & true  = true

        //|:或者关系    f | f = f;f | t = t;t | t = t
        System.out.println("===================================");
        System.out.println((i > j) | (i > k));//false | false = false
        System.out.println((i < j) | (i > k));//false | false = true
        System.out.println((i > j) | (i < k));//false | true  = true
        System.out.println((i < j) | (i < k));//true  | true  = true

        //^:逻辑异或    相同为false，不同为true
        System.out.println("===================================");
        System.out.println((i > j) ^ (i > k));//false ^ false = false
        System.out.println((i < j) ^ (i > k));//false ^ false = true
        System.out.println((i > j) ^ (i < k));//false ^ true  = ture
        System.out.println((i < j) ^ (i < k));//true  ^ true  = false

        //!:取反  偶数个不改变本身结果
        System.out.println("===================================");
        System.out.println(i > j);//false
        System.out.println(!(i > j));//!false = true
        System.out.println(!!(i > j));//!!false = false
        System.out.println(!!!(i > j));//!!!false = true
        System.out.println(!!!!(i > j));//!!!!false = false


    }
}
