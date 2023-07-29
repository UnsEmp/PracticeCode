package day10.demo4;


/*
    final 修饰变量的初始化时机：
    1。在创建的时候直接给值（显示初始化）
    2.在创建方法执行完毕前初始化常量（非静态常量）
*/

class Demo {
    //显示初始化
    int num = 10;
    final int NUM2;
    final static int NUM3 = 20; //静态常量创建时必须给值

    {//构造代码块
        NUM2 = 30;
    }

}

public class FinalDemo2 {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.num);
        System.out.println(d.NUM2);
    }
}
