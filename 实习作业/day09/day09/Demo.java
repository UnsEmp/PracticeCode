package day09;

class Person {
    String name;
    int age;
    static String country;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }

    static void eat() {
        System.out.println("eat!");
    }

}

/*
    static特点；
    A。随着类的加载而只加载一次。
    B。优先于对象存在，对象需要在类加载后才能创建被类的所有对象加载
    C。被类的所有对象共享
    D。可以通过类名调用
*/

public class Demo {
    public static void main(String[] args) {
        //多个对象有共同的成员变量值的时候，可以使用static修饰
        Person p1 = new Person("zs", 22, "chain");
        System.out.println(p1.toString());

        Person p2 = new Person("ls", 20);
        System.out.println(p2.toString());

        Person p3 = new Person("xw", 18);
        System.out.println(p3.toString());

        Person.eat();
    }
}
