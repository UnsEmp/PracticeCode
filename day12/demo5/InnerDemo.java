package day12.demo5;

/*
    局部内部类：在方法中定义的类
    特点：
        1.该类中可以直接访问外部类的成员，也可以访问方法内的局部变量
        2.局部内部类外界无法直接使用
*/

class Outer {
    private int num = 20;
    void method() {
        int num2 = 10; // 局部变量

        class Inner {
            public void show() {
                System.out.println("Inner show");
                System.out.println(num);
                System.out.println(num2);
            }
        }
        Inner i = new Inner();
        i.show();
    }
}

public class InnerDemo {
    public static void main(String[] args) {
        Outer ou = new Outer();
        ou.method();

    }
}
