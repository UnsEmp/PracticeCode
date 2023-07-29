package day11.demo3;

public abstract class SportMan extends Person{
    public SportMan() {
    }

    public SportMan(String name, String age) {
        super(name, age);
    }

    public abstract void study();
}
