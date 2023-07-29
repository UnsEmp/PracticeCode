package day02;

/**
 *  三元/三目运算符：
 *  格式：关系表达式 ? 表达式1 : 表达式2;
 *      执行流程：
 *          首先计算关系表达式值（true/false）
 *          若为true，则取表达式1的值；
 *          若为false，则取表达式2的值；
 *
 */

public class OperatorDemo7 {
    public static void main(String[] args) {
        double score = 59;
        String rs = score >= 60 ? "考试合格" : "考试不合格";
        System.out.println(rs);

        System.out.println("=========================");
        int a = 10;
        int b = 88;
        int c = 25;
        int max1 = a > b ? a : b;
        int max = max1 > c ? max1 : c;
        System.out.println(max);

        System.out.println("=========================");
        int a1 = 10;
        int b1 = 88;
        int c1 = 25;
        int max2 = a1 > b1 ? (( a1 > c1 )? a1 : c1 ) : (( b1 > c1 )? b1 : c1);
        System.out.println(max2);
    }
}
