package day11.demo3;

public class PingSportMan extends SportMan implements Inter{
    public PingSportMan() {
    }

    public PingSportMan(String name, String age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("study ping-pong");
    }

    @Override
    public void eat() {
        System.out.println("PingSportMan eat");
    }

    @Override
    public void sleep() {
        System.out.println("PingSportMan sleep");
    }

    @Override
    public void speak() {
        System.out.println("PingSportMan speak");
    }
}
