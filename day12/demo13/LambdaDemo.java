package day12.demo13;

import java.util.Random;

/**
 * 无参有返回值的抽象方法
 * 有参有返回值的抽象方法
 */

interface RandomNumHandler{
    int getNumber();
}

public class LambdaDemo {
    public static void main(String[] args) {
//        userRandomNumHandler(new RandomNumHandler() {
//            @Override
//            public int getNumber() {
//                Random ra = new Random();
//                return ra.nextInt(10) + 1;
//            }
//        });

        userRandomNumHandler(()->{
            Random ra = new Random();
            return ra.nextInt(10) + 1;
        });


    }
    public static int userRandomNumHandler(RandomNumHandler ran) {
        int result = ran.getNumber();
        return result;
    }
}
