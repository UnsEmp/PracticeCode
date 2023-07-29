package day02;

/**
 *  关系运算符：
 *      ==,!=,>,>=,<,<=
 */

public class OperatorDemo4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //关系运算符的结果肯定是boolean类型，所以可以将结果赋值给boolean类型的变量
        System.out.println(a == b);//false
        System.out.println(a != b);//true
        System.out.println(a > b);
        boolean flag = a < b;
        System.out.println(flag);
        System.out.println(a >= b);
        System.out.println(a <= b);
    }
}
