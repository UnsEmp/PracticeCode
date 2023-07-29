package day08.demo3;

/*
    this 修饰变量用于指代成员变量，主要作用是区分成员变量和局部变量重名的问题
    方法的形参如果与成员变量同名，不带this 修饰的变量指的是形参，而不是成员变量
    方法的形参没有与成员变量同名，不带this 修饰的变量指的是成员变量

    this代表的是当前调用方法的引用地址值， 那个对象调用方法，this就代表那个对象
*/

class Student{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void messagePrint() {
        System.out.println(name + " " + age);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student st = new Student();
        st.setAge(18);
        st.setName("zmh");
        st.messagePrint();
    }
}
