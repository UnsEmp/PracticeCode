package day02;

/**
 *  短路逻辑运算符：&&,||
 *  与 & | 结果是一样的，但是效率更高
 *
 *      &&和&的区别，同理||与|的区别：
 *          1、最终结果是一样的
 *          2、&&具有短路效果，符号左边为false的时候，右边就不执行了。若符号左边为true，同样要继续执行右边结果，此时不具有短路效果；而&，无论左边为真或假，右边都要执行
 *          3、||具有短路效果，符号左边为true的时候，右边就不执行了。若符号左边为false，同样要继续执行右边结果，此时不具有短路效果；而|，无论左边为真或假，右边都要执行
 */

public class OperatorDemo6 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        //&&,||对结果没有影响
        System.out.println((a > b) &  (a < c));//false &  true = false  无论左边结果如何，都要运行右边
        System.out.println((a > b) && (a < c));//false && true = false  左边得到结果，就不再运行右边结果

        System.out.println((a > b) |  (a < c));//fasle |  true = ture
        System.out.println((a > b) || (a < c));//fasle || true = true

        System.out.println("==========================");
        int x1 = 3;
        int y1 = 4;
        boolean b1 = ((++x1 == 3) & (y1++ == 4));
        System.out.println("x:" + x1);//4
        System.out.println("y:" + y1);//5

        System.out.println("==========================");
        int x2 = 3;
        int y2 = 4;
        boolean b2 = ((++x2 == 3) && (y2++ == 4));//false && ???
        System.out.println("x:" + x2);//4
        System.out.println("y:" + y2);//4
    }
}
