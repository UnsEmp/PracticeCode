package day08.demo;

/**
 *  匿名对象：
 *      即没有名字的对象
 */

class Student{
    public void show(){
        System.out.println("爱学习");
    }
}
class StudentDemo{
    public void method(Student s){
        s.show();
    }
}
public class NoNameDemo {
    public static void main(String[] args) {
        Student s = new Student();//对内存消耗较小
        s.show();//多次调用用s.show，
        //s.show();//当main方法结束之后才会被清理
        //s.show();
        //s.show();

        //匿名对象
        new Student().show();//其实这里也是创建了一个新对象，不过没有给对象起名称
        //new Student().show();//如果只调用一次，用匿名对象比较合适
        //new Student().show();//执行一次就会被清理
        //new Student().show();

        StudentDemo sd = new StudentDemo();
        //sd.method(s);
        sd.method(new Student());//匿名对象可以作为方法的参数进行传递

        new StudentDemo().method(new Student());//链式编程，这一行代码相当于上面三行

    }
}