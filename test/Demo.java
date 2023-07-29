package test;

abstract class Person{
    private String name;
    private String seg;
    private String age;

    abstract public void active();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeg() {
        return seg;
    }

    public void setSeg(String seg) {
        this.seg = seg;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Person(String name, String seg, String age) {
        this.name = name;
        this.seg = seg;
        this.age = age;
    }

    public Person() {
    }
}

class JavaTeacher extends Person{

    @Override
    public void active() {
        System.out.println("上Java课");
    }

    public JavaTeacher(String name, String seg, String age) {
        super(name, seg, age);
    }

    public JavaTeacher() {
    }

    @Override
    public String toString() {
        return "JavaTeacher{" + "name=" + "'" + super.getName() + "'" + ",gender=" + "'" + super.getSeg() + "'" + ",age=" + "'" + super.getAge() + "'" + "}";
    }
}

class UITeacher extends Person implements Print{
    public UITeacher(String name, String seg, String age) {
        super(name, seg, age);
    }

    public UITeacher() {
    }

    @Override
    public void active() {
        System.out.println("将UI课程");
    }

    @Override
    public void print() {
        System.out.println("绘画");
    }

    @Override
    public String toString() {
        return "JavaTeacher{" + "name=" + "'" + super.getName() + "'" + ",gender=" + "'" + super.getSeg() + "'" + ",age=" + "'" + super.getAge() + "'" + "}";
    }
}

public class Demo {
    public static void main(String[] args) {
        JavaTeacher javaTeacher = new JavaTeacher("peter","boy","20");

        System.out.println(javaTeacher);
        javaTeacher.active();
        UITeacher uiTeacher = new UITeacher("jake","girl","22");

        System.out.println(uiTeacher);
        uiTeacher.active();
        uiTeacher.print();


    }
}

