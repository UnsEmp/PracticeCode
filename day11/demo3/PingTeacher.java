package day11.demo3;

public class PingTeacher extends Teacher {
    public PingTeacher() {
    }

    public PingTeacher(String name, String age) {
        super(name, age);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void teach() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }
}
