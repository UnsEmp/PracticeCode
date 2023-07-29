package day02;

/*
*       数据类型:Java是一种强类型的语言，针对每一种数都定义了明确的数据类型
*       数据类型分类:
            A.基本数摇类型(四类八种)
            B.引用数据类型(类，接口，数组...)
*       基本数类型(四类八种):
*       整数      占用的字节数      范围      65 --》 01000001
*       byte        1       -128-127        byte
*       short       2       -32768-32767    short age = 65;==>00000000 01000001
*       int         4       -21亿-21亿
*       long        8       无限大(19位)
*
*   B. 浮点数
*       float       4       1.4e-45~3.4e+38 e-45:乘以10负的45次方 e+38:乘以10的38次方
*       double(默认) 8       4.9e-324~1.7e+308
*   C. 字符
*       char        2       0-65535a'-->97-->01100010
*   D. 布尔
*       boolean     1       true,false
*
* */

public class DataTypeDemo {
    public static void main(String[] args) {
        //定义字节变量
        byte b = 10;
        System.out.println(b);//byte 类型的变量System.out.println(10);//int 类型的常量
//定义短整型变量
        short s = 20;
        System.out.println(s);

        //定义整型变量
        int i = 10;
        System.out.println(1);
        //定义长整型变量
        long l = 10000;
        System.out.println();
        /*注意:随便写一个整数字面位默认的int 类型的，10000000000虽然没有超过long的范围，但是它超过了本身int类型表示的范围
        如果希望随便写一个整数字面量是Long美型，需要在其后加L/l*/
//int j = 10000000000:
        Long j = 10000000000L;//1.右边声明一个值10000000000L 2.将右边的值赋值给左边变量


        //定义浮点数变量
        /*
        随便写一个小数字面量是默认是double美型，如果希望其是fLoat类型，需要在其后加F/f
        */
        float f = 12.345F;//double ==> float 8-->4System.out.printin(f);
        //定义字符变量
        char ch = 97;//'a'==>97System.out.println(ch) :
        //定义布尔美型变量
        boolean flag = true;
        System.out.println(flag);
        flag = (100 == 101);
        System.out.println(flag);
    }
}
