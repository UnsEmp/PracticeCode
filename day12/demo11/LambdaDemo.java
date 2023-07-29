package day12.demo11;
/*
    Lambda表达式的使用前提：
    1.有一个接口
    2.接口中有且仅有一个抽象方法
*/

interface Enable{
    void eat();//无参无返回值的抽象方法
}

//实现类
class EnableImpl implements Enable{
    @Override
    public void eat() {
        System.out.println("一天一苹果，医生远离我");
    }
}

public class LambdaDemo {
    public static void main(String[] args) {
        Enable en = new EnableImpl();
        en.eat();

        //通过匿名内部类实现
        useEnable(new Enable() {
            @Override
            public void eat() {
                System.out.println("一天一苹果，医生远离我");
            }
        });

        //通过Lambda表达式实现
        useEnable(()->{
            System.out.println("一天一苹果，医生远离我");
        });

    }
    public static void useEnable(Enable e) {
        e.eat();
    }
}
