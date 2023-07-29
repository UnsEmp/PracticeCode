package day02;

/*
     自自减运算符(重要):
     ++:交量自增1
     --:交量自减1

     ++ 和 -- 既可以放在变量的前面也可以放在变量的后面
      注意:
        单独使用(一句代码中只做了++和-，没有其他操作):++或者-- 无论放在变量的前面还是后面，结果都是一样的
    参与操作:
        ++/-- 在前面:先对该变量做自减或者
        ++/-- 在后面:先将该变量原本的值，取出来参与作，作完毕之后再进行自增或者自减

*/

public class OperatorDemo2 {
    public static void main(String[] args) {
        // 单独使用
        int a = 10;
        //Sytem.out.println(++a)
        ++a;
        //a--;
        System.out.println(a);
        System.out.println("-------------------------------------");

        //参与操作
        int a1 = 10;
        int b1 = a1 ++;
        System.out.println(a1); // 11 11
        System.out.println(b1); // 11 10

        //++和-- 只能操作变量不能操作常量
        // System.out.printIn(10++):
    }
}
