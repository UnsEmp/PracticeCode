package day02;


/*
    面试题:
    byte b1 = 3,b2 = 4,b;
    b = b1 + b2;//int --> byte
    b=3+4;
    哪一行代码编译错误，原因是什?
    常量相加和变量相加的区别?
    变量相加:会首先看美型问题，最终把结果赋值的时候也会考虑类型问题
    常量相加: 首先做运算，然后看结果是否在赋值的数据类型范围内，如果不在，才会报错
*/

public class Test {
    public static void main(String[] args) {
        byte b1 = 3,b2 = 4,b;
        b =(byte)(b1 + b2);//int --> byte
        b = 3 + 4;//先把结果结算出来，然后看是否在bute 的范围内，如果在就编译通过
    }
}
