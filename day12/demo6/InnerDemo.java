package day12.demo6;

/**
 * 匿名内部类：其实是一个特殊的局部内部类（定义在方法内部）
 * 前提条件：存在一个类或则接口，这里的类可以是具体的类也可以是抽象的类
 */

interface Inter{
    void show();
}

interface Inter2{
    void show1();
    void show2();
}

class InterImpl implements Inter{
    @Override
    public void show() {
        System.out.println("InterImpl 重写的show");
    }
}


public class InnerDemo {
    public static void main(String[] args) {
//        Inter in = new InterImpl();
//        in.show();

        new Inter(){
            @Override
            public void show() {
                System.out.println("InterImpl 重写的show");
            }
        }.show();

        //调用show1和show2
        new Inter2(){
            @Override
            public void show1() {
                System.out.println("show1");
            }

            @Override
            public void show2() {
                System.out.println("show2");
            }
        }.show1();


    }
}
