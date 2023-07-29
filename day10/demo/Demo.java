package day10.demo;

/*
    抽象方法
        将共性的方法抽取到父类之后，发现该方法实现逻辑无法在父类中具体的给出

    抽象类：
        如果一个类中存在抽象方法，那么该类就必须声明为抽象类

    抽象类的特点：
        A。抽象类和抽象方法必须用abstract关键字修饰
        B.抽象类不一定有抽象方法的类，有抽象方法的类一定是抽象类
        C。不能通过 new 创建对象，不能实例化，
            因为他不是具体存在的
            抽象类是有构造方法的，用于子类中super构造方法访问父类的数据的实例化
        D。抽象类的子类
            1.必须重写所有的抽象方法，这个时候子类必定是一个具体的类
            2.如果不想重写抽象方法，该子类必定是一个抽象类
*/

abstract class Animal {
    private String name;

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public void drink() {
        System.out.println("drinking");
    }

    public abstract void eat(); // 抽象方法

}
// 子类是抽象类，不需要重写父类的抽象方法，并且可以有自己特有的抽象方法
abstract class VertebrateAnimal extends Animal {

}
//子类是具体类，强制要求重写父类的所有抽象方法

class cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

class Dag extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}

public class Demo {
    public static void main(String[] args) {

    }
}
