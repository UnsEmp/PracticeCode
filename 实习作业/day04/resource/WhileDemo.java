package day04;

/**
 *  while循环：
 *      基本格式：
 *          初始化语句；
 *          while(条件判断语句){
 *              循环体语句；
 *          }
 *
 *      完整格式：
 *          初始化语句；
 *          while(条件判断语句){
 *              循环体语句；
 *              条件控制语句；
 *          }
 *
 *  与for循环相比：
 *      for(初始化语句；条件判断语句；条件控制语句){
 *          循环体语句；
 *      }
 */
public class WhileDemo {
    public static void main(String[] args) {
        for (int x = 0;x < 5;x++){
            System.out.println("HelloWorld");
        }

        System.out.println("==========================");

        int x = 0;
        while (x < 5){//小括号后面不能加;（分号）
            System.out.println("HelloWorld");
            x++;
        }
    }
}
