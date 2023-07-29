package day11.demo3;

public abstract class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String name, String age) {
        super(name, age);
    }

    public abstract void teach();
}
