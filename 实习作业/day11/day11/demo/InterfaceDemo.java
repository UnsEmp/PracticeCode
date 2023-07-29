package day11.demo;

/*
    接口:接口就是一种公共的规范标准，当一个类中所有的方法都是抽象方法的时候，
    可以将其定义为接口，接口是一种引用类型它比抽象类还抽象
    关键字interface
    interface 接口名 {
        抽象方法
    }

    class 类名 implements 接口名 {
        重写抽象方法
    }
    主要针对功能的扩展
    比如：猫钻火圈，狗跳高 不是动物与生俱来的， 是通过后期训练所具备的能力


    接口的子类：
        抽象类：意义不大
        具体的类：强制重写所有的抽象方法
*/


public class InterfaceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.jump();

//        AnimalTrain animalTrain = new AnimalTrain(); //接口不能实例化
    }
}
