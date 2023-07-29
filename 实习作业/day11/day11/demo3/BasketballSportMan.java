package day11.demo3;

public class BasketballSportMan extends SportMan implements Inter{
    public BasketballSportMan() {
    }

    public BasketballSportMan(String name, String age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("study Basketball");
    }

    @Override
    public void eat() {
        System.out.println("BasketballSportMan eat");
    }

    @Override
    public void sleep() {
        System.out.println("BasketballSportMan sleep");
    }

    @Override
    public void speak() {
        System.out.println("BasketballSportMan speak");
    }
}
