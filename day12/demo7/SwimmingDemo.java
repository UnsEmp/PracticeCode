package day12.demo7;

interface Swimming{
    void swim();
}

class SwimmingImpl implements Swimming {
    @Override
    public void swim() {
        System.out.println("我们去游泳吧");
    }
}

public class SwimmingDemo {
    public static void main(String[] args) {
//        goSwimming(new SwimmingImpl());

        goSwimming(new Swimming() {
            @Override
            public void swim() {
                System.out.println("we are go to swim");
            }
        });
    }
    /**
     * 声明一个接口的方法
     */
    public static void goSwimming(Swimming swimming) {
        swimming.swim();
    }
}
