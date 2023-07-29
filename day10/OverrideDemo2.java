package day10;

/*
    重号注意事项:
        1.私有方法不能被重写( 父类私有成员子类是不能继的
        2.子类方法访问权限必须大于等于父类的方法访问权限
            public > protected > 默以 > private

        3.静态方法不能被重写
        如果子类也有相同的方法，并不是重写父类的方法，可以理解子类将父类同名的方法隐藏起来了，并非方法的重写

        4.父类中非静态方法，子类也必须通过非静态方法进行重写
*/

class Fu {
    public void show() {
        System.out.println("Fu中的show被调用");
    }

    public void method() {
        System.out.println("Fu中的method被调用");
    }

    public static void method2() {
        System.out.println("Fu中method2被调用");
    }
}

class Zi extends Fu {
    @Override
    public void show() {
        super.show();

    }

    public static void method2() {
        System.out.println("Zi中method2被调用");
    }
}

public class OverrideDemo2 {
    public static void main(String[] args) {
        Fu.method2();
        Zi.method2();
    }
}
