package day12.demo3;

/**
 * 内部美:
 * 在一个类中定义一个类，在A类内部定义一个B类，B类就称之为内部类
 *
 * class Outer { //外部类
 *     class Inner{ // 内部类
 *
 *     }
 * }
 */

class Outer {
    private int a = 20;
    class Inner {
        int num = 20;
        public void show() {
            System.out.println(a);
        }
    }
    public void method() { //公共访问方法
//        show();
        Inner inner = new Inner();
        inner.show();
        System.out.println(inner.num);
    }

}

public class InnerDemo {
    public static void main(String[] args) {
        //访问Inner的show方法
// x    Inner inner = new Inner();

        //格式： 外部类类.内部类名 对象名 = new 外部类对象().内部类对象()
        Outer.Inner in = new Outer().new Inner();
        in.show();
//        new Outer().new Inner().show();

        Outer outer = new Outer();
        outer.method();
    }
}
