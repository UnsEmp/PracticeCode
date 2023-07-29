package day12.demo14;

/**
 * 有参有返回值的抽象方法
 *
 * Lambda表达式的省略模式
 *      1.参数类型可以省略，但是多个参数的情况下，不能只省略一个
 *      2.参数类型有且仅有一个，数据类型和小括号都可以省略
 *
 */

interface Addable{
    int add(int x, int y);
}

interface Flyable{
    void Fly(String s);
}

public class LambdaDemo {
    public static void main(String[] args) {
        userAddable(new Addable() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        });

        userAddable((int x, int y)-> x + y);

        userFlyable(s -> System.out.println(s));
    }

    public static void userFlyable(Flyable f) {
        System.out.println("风和日丽");
    }

    public static void userAddable(Addable addable) {
        int sum = addable.add(10, 20);
        System.out.println(sum);
    }
}
