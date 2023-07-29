package day11.demo;

public class Dog extends Animal implements AnimalTrain{
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    @Override
    public void jump() {
        System.out.println("狗跳高");
    }
}
