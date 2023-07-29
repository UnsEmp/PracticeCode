package day08.demo2;

/*
    面向对象三大特征
        封装、继承、多态
    封装:
        隐藏实现的细节，泰露出合适的访问方式
    把成员变量用private修饰，提供setxxx，getxxx方法


    当前案例存在问题:
    之前对象去给成员变量赋值，可以赋值一些非法数据，这是不合理的
    应该是这样，在赋值之前，先对数据进行判断
    判断到底在哪里声明台适?
    StudentDemo类是一个测试类，测试类一般只是用来创建对象，调用方法的
    所以，这个判断应该定义在Student美中
    业务逻辑语句应该定义在方法中，在Student类提供一个方法来对数据进行校验

    如果偏偏不使用定义的方法对年龄进行赋值，这样我们的方法就毫无意义
    要求必须使用定义的方法，而不能使用对象名.成员变量赋值的方式
    针对这种情况，java提供了一个关键字:private
    private: 私有的，可以修饰成员变量和成员方法
    被private修饰的成员能在本类中访问

    封装主要的表现是私有，私有是封装的一种体现
    将代码抽取到方法中，这是对代码的一种封装
    将属性抽取到类中，这是对数据的一种封装
*/

class Student{
    private String name;
    private int age;

    //define a idea to judge age
    public void setAge(int a) {
        if(a < 0 || age > 150) {
            System.out.println("年龄不合理");
        }
        else {
            age = a;
        }
    }

    public void show() {
        System.out.println(name + " " + age);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();

//        s.name = "zhangsan";
//        s.age = 25;
        s.show();
    }
}
