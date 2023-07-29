package day11.demo4;

/*
    多态：同一个对象，在不同时刻体现出来的不同状态
    猫对象是一只猫，但同时也是一只动物
    Cat c = new Cat();
    Animal a = new Cat();
    多态猫是一个对象，这个对象既有猫的形态，也有动物的形态。
    一个对象拥有多种形态，，这就是多态

    多态的前提：
        要有继承或则实现关系
        有方法的重写
        父类的引用指向子类
*/

class Animal {
    public void eat(){
        System.out.println("动物吃饭");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

public class Demo {
    public static void main(String[] args) {
        //当前事物是一只猫
        Cat c = new Cat();

        //当前事物是一只动物
        Animal an = new Cat();

    }
}
