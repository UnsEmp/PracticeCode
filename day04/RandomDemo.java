package day04;

import java.util.Random;

/**
 *  Scanner键盘录入
 *  Random产生随机数
 *      步骤：
 *          1.导包 import java.util.Random;
 *          2.创建对象
 *              Random r = new Random();
 *          3.产生随机数
 *              r.nextInt(10);//表示在0-10之间产生随机数，且为整数[0,10)含前不含后
 *
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 1;i <= 10;i++) {
            int num = r.nextInt(10);
            System.out.println(num);
        }
    }
}
