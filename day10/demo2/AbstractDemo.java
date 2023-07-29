package day10.demo2;

/*
    abstract不能和哪些关键字共存?
    private,冲突(抽象为了重写，私有无法继承，则无法重写)
    final 冲突(修饰方法，方法不允许被重写的)
    static 无意义(静态方法可以直接通过类名调用，调用一个没有方法体的方法是无意义的)
*/

abstract class Fu {
    public abstract void show();
}

class Zi extends Fu {
    @Override
    public void show() {

    }
}

public class AbstractDemo {
    public static void main(String[] args) {

    }
}

