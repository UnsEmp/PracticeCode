package day01;

/*
变量：在程序的运行过程中，其值可以在一定范围内发生改变的量称之为变量。
格式：数据类型，变量名称 = 初始化值；
*/



public class VariableDemo {
    public static void main(String[] args) {
        int age = 25;
        System.out.println(age);
        //step1:数据类型 变量名称； 先声明
        //step2:变量名称 = 初始化值；后赋值
        int num;
        //System.out.println(num);在使用变量之前必须赋值，否则会报错；
        num = 30;
        System.out.println(num);
    }
}
