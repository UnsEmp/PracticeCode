package day12.demo1;

/**
 *  多态的优点与弊端
 *      优点：定义方法的时候，使用父类型作为参数，该方法就可以接收此父类型的任意子类对象【提高程序的扩展性】
 *      缺点：多态对象不能调用子类特有的成员[成员变量，成员方法]
 */

abstract class Animal{
    public abstract void eat();
}

class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    public void watchHome(){
        System.out.println("看家");
    }
}

class Cat extends Animal{
    public int num = 20;

    public void method(){
        System.out.println("Zi method");
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

public class Demo {
    public static void main(String[] args) {
//        useDog(new Dog());
//        useCat(new Cat());
//        useAnimal(new Cat());
        useAnimal(new Dog());
        useAnimal(new Cat());

        Animal a = new Cat();//父类的引用指向子类对象
        //a.method();
        //a.num;
//        Cat cat = new Cat();
//        System.out.println(cat.num);
//        cat.method();
    }

    public static void useDog(Dog dog){
        dog.eat();
    }

    public static void useCat(Cat cat){
        cat.eat();
    }

    /**
     *  关键字：instanceof
     *  变量名：instanceof 类型
     *  判断关键字左边的变量是否是右边的类型，返回的是boolean
     * @param animal
     */
    public static void useAnimal(Animal animal){//Animal animal = new Dog();Animal animal = new Cat();
        animal.eat();
//        Dog dog = (Dog)animal;
//        dog.watchHome();

        if (animal instanceof Dog){//判断animal变量的类型是否是Dog类型
            Dog dog = (Dog)animal;
            dog.watchHome();
        }
    }
}
