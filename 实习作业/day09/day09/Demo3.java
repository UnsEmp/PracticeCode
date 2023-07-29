package day09;

/*
    继承的优点和弊端
    提高了代码的维护性，如果类中的属性需要添加，修改父类即可
    提高了代码的复用性，多个类相同的成员可以放在同一个类中

    继承让类与类之间产生了关系，类的耦合性增强了，当父类发生变化，
    子类实现也不得不跟着变化，削弱了子类的独立性（灵活性）

     开发原则：低耦合，高内聚
*/

class Fu{
    public void show(){
        System.out.println("show !");
    }
}

class Zi extends Fu{
    public void method() {
        System.out.println("method方法被调用");
    }
}

public class Demo3 {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.method();
        z.show();

        Fu f = new Fu();
        f.show();
    }
}
