package day12.demo10;

interface Swimming{
    void swim();
}

/**
 * lambda表达式：对匿名内部类进行优化
 */

public class SwimmingDemo {
    public static void main(String[] args) {
//        goSwimming(new SwimmingImpl());

        //通过匿名内部类实现
        goSwimming(new Swimming() {
            @Override
            public void swim() {
                System.out.println("we are go to swim");
            }
        });

        // 通过lambda表达式实现
        /*
            ()：里面没有内容，可以看成是方法形式参数为空
            ->：用箭头指向后面要做的事情
            {}：包含一段代码，可以称之为代码块，可以看成是方法体中的内容
            Lambda表示三要素，形式参数，箭头，代码块
        */
        goSwimming(()->{
            System.out.println("we are go to swimming");
        });



    }
    /**
     * 声明一个接口的方法
     */
    public static void goSwimming(Swimming swimming) {
        swimming.swim();
    }
}
