package day04;

/**
 *  return:返回
 *      作用：不是结束循环的，而是结束方法的
 */
public class ReturnDemo {
    public static void main(String[] args) {
        for(int x = 0;x < 10;x++){
            if(x == 2){
                System.out.println("退出");
                //break;
                //continue;
                return;
            }
            System.out.println(x);
        }
        System.out.println("over");
    }
}
