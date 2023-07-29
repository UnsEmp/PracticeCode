package day04;

/**
 *  for和while的区别：
 *      使用区别：如果想在循环结束后，继续使用控制条件的那个变量，用while循环，否则考虑使用for循环
 *      for循环：变量及早的从内存中消失，可以提高内存的使用效率；
 *
 *      另外一种常见的理解：
 *          如果明确是一个范围，用for循环
 *          如果不明确做多少次循环，用for循环比较合适
 */
public class WhileForDemo {
    public static void main(String[] args) {
        for (int x = 0;x < 10;x++){
            System.out.println("BieDate");
        }
        //需求：此处需要用到x变量进一步实现功能
        //System.out.println(x + 20);
        int x = 0;
        while (x < 10){
            System.out.println("BigData");
            x++;
        }
        System.out.println(x + 20);
    }
}
