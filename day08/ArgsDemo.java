package day08;

//形式参数是引用类型的方法

class StudentDemo{
    public void method(Student s){
        s.name = "万和开心果";
        s.age = 23;
    }
}
public class ArgsDemo {
    public static void main(String[] args) {
        StudentDemo sd = new StudentDemo();
        Student s = new Student();
        s.name = "张三";
        s.age = 25;
        s.show();
        sd.method(s);//把地址值传递
        s.show();
    }
}
