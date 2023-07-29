package day08.demo4;

class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("调用无参构造方法");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printMessage() {
        System.out.println("my name is " + this.name + " " + this.age);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        /*
            Student(): 调用构造方法
            方法和类名相同，大小写也一致
            没有放回类型，void也不用写

            构造方法分类:
                无参构造:默认就是存在的，初始化对象的时候，成员变量的数据均采用默认值
                有参构造:在初始化对象的时候，同时可以为对象成员变量赋值

            成员变量赋值：
                1.对象名，成员变量
                2.setxxx() 方法赋值
                3.构造方法赋值

             构造方法注意事项:
                1.如果没有给出构造方法，系统将默认给出一个无参构造方法
                2.如果给出了构造方法，系统将不再提供默认的无参构造方法
                3.构造方法可以重载

        */
        Student st = new Student("zmh", 25);
        st.printMessage();
    }
}


