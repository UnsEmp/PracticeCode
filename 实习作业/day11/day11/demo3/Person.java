package day11.demo3;

public abstract class Person {
    String name;
    String age;

    public Person() {
    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();

    public abstract void sleep();
}
