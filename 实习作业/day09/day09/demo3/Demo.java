package day09.demo3;

class Father{
    public int num = 10;

    public void method(){
        System.out.println("method方法");
    }

    public Father(){

    }

    public Father(int num){
        this.num = num;
    }

}

/**
 *  this和super的区别：
 *      this：代表本类对应的引用（对象）
 *      super：代表父类对应的引用（对象）
 *
 *      注意：子类的每一个构造方法的第一条语句默认都是super()
 *      因为子类会继承父类中的数据，可能还会使用父类的数据，
 *      所以子类在初始化之前，一定会先完成父类的初始化。
 *
 *   super (参数列表)执行的操作父类初始化，为了保证初始化的顺序，
 *   其需要放在构造方法的第一行 当第一行没有写super ()语句时，
 *   编译器会自动在构造方法的第一行加上无参super ()语句。
 */
class Son extends Father{
    public int num = 20;

    public Son(){
        super();//声明无参构造会默认使用父类的无参构造
    }

    public Son(int num){
        super(num);//调用父类的方法
    }

    public void method(){
        System.out.println("method方法");
    }
    public void show(){
        int num = 30;
        System.out.println(num);//30
        System.out.println(this.num);//20
        System.out.println(super.num);//10

        this.method();//本类的method方法
        //调用父类的method方法
        super.method();
    }
}

public class Demo {
    public static void main(String[] args) {
        Son son = new Son();
        son.show();
    }
}