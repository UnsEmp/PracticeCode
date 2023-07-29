package day12.demo12;

/**
 * 有参无返回值的
 */

interface Flyable{
    void Fly(String s);
}

public class LambdaDemo {
    public static void main(String[] args) {
        useFlyable(new Flyable() {
            @Override
            public void Fly(String s) {
                System.out.println(s);
                System.out.println("适合出门");
            }
        });

        //Lambda表达式
//        useFlyable((String s)->{
//            System.out.println(s);
//            System.out.println("适合出门");
//        });
    }
    public static void useFlyable(Flyable f) {
        f.Fly("风和日丽");
    }
}
