package day01;

/**
 * 变量的注意事项：
 * 1.没有初始化的变量不能直接使用
 * 2.先声明 后赋值
 * 3.作用域：
 *      变量定义在哪个括号内，他就在这个打括号里面有效，并且在同一个大括号中不能出现重复变量
 * 4.定义多个变量
 *
 * 预习:
 * 1.java的基本数据类型（4类8种）
 * 2.数据类型的转换（默认 and 强制）
 * 3.键盘录入（Scanner）
 *
 *
 * 要求：
 *      作业的提交：
 *          压缩文件命名：day01-朱鑫宇
 *          内容：
 *          当天的代码（课堂） + 作业
 *          提交时间：
 *          八点之前
 *
 */

public class VariableDemo2 {
    public static void main(String[] args) {
        //static int number = 90;

        //代码块
        {
            int number = 90;
            System.out.println(number);
        }
        final byte b1 = 2, b2 = 3, b6;
        byte b3 = 4, b4 = 5, b5;
////        b6 = b3 + b4;
////        b6 = b1 + b2;
////        b1 = b3 + b4;
        b5 = (byte)(b3 + b4);
    }
}
