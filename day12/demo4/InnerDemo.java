package day12.demo4;

class Outer {
    private static int num = 10;
    private static int num2 = 100;

    static class Inner {
        public void show() {
            System.out.println("inner show");
        }

        static public void method() {
            System.out.println("inner method");
            //静态内部类访问外部类数据必须使用静态修饰。
            System.out.println(num);
        }
    }

}

public class InnerDemo {
    public static void main(String[] args) {
//        Outer.Inner oi = new Outer().new Inner();

        //
        Outer.Inner oi = new Outer.Inner();
        oi.show();

        Outer.Inner.method();
    }
}
