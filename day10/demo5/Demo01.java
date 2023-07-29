package day10.demo5;

/**
 *  代码块：在java中，使用{}括起来的代码被称之为代码块
 *  分类：
 *      局部代码块
 *          位置：方法中定义
 *          作用：限制变量的生命周期，及早释放内存，提高内存的使用效率
 *      构造代码块
 *          位置：类中方法外
 *          作用：将多个构造方法中相同的代码，抽取到构造代码块中，提高代码的复用性
 *          特点：每次构造方法执行时，都会先执行构造代码块
 *      静态代码块
 *          位置：类中方法外
 *          作用：需要通过static 关键宇修饰，随着类的加载而加载，并且只执行一次
 *          特点：在类加载的时候做一些数据初始化的操作
 */

class Student{
    int num;

    //静态代码块
    static {
        System.out.println("静态代码块");
    }

    //构造代码块
//    {
//        num = 20;
//        System.out.println("构造代码块");
//    }

    public Student(){
        //this.num = 20;
        System.out.println("无参构造方法");
    }

    public Student(int a){
        //this.num = 20;
        System.out.println("带参构造方法");
    }
}

public class Demo01 {
    public static void main(String[] args) {

        Student student = new Student();
        Student student2 = new Student(20);

        //局部代码块
//        {
//            int a = 10;
//            System.out.println(a);
//        }

    }
}