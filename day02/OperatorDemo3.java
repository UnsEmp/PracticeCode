package day02;

/*
    赋值运算符:
            基本赋值运算符:=
            把右边的值赋值给左边
            扩展赋值运算符:+=，-=，*=， /=，%=
            +=: 把左边和右边做加法，然后赋值给左边
*/

public class OperatorDemo3 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        // +=: 把左边和右边做加法
        y += 10;//y = y + 10
        System.out.println(y);
    }
}
