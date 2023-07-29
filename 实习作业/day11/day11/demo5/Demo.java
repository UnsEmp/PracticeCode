package day11.demo5;

/**
 *  多态成员访问特点：
 *      构造方法:创建子类对象的时候，访问父类的构造方法，对父类的数据进行初始化
 *      成员变量:编译看左边，运行看左边
 *      成员方法:编译看左边，运行看右边
 *      静态方法:编译看左边，运行看左边
 */

class Fu{
    public int num = 100;
    public Fu(){

    }

    public void show(){
        System.out.println("show Fu");
    }

    public static void function(){
        System.out.println("function Fu");
    }
}

class Zi extends Fu{
    public int num = 200;
    public Zi(){
        super();
    }

    public void show(){
        System.out.println("show Zi");
    }

    public static void function(){
        System.out.println("function Zi");
    }
}

public class Demo {
    public static void main(String[] args) {
        //父类的引用指向子类
        //父 f = new 子();
        Fu f = new Zi();
        System.out.println(f.num);
        f.show();
        f.function();
    }
}
