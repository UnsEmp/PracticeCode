package day10.demo4;

/*
    final : 修饰类，方法，变量
    final修饰类：该类不能被继承
    final修饰方法，该方法不能被重写
    final修饰变量：该变量不能被重新赋值，因为此变量是一个常量
*/

class Fu {
    public final int NUM = 20;
}

class Zi extends Fu {
    public void show() {

        System.out.println();
    }
}

public class FinalDemo {

}
