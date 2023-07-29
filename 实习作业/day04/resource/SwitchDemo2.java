package day04;

import java.util.Scanner;

/**
 *  if和Switch区别：
 *      if语句：
 *          针对结果是boolean类型的判断；
 *          针对一个范围的判断；
 *          针对几个常量值的判断；
 *      switch语句：
 *          针对几个常量值的判断；
 */
public class SwitchDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weekday = sc.nextInt();
        switch (weekday){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;//case穿透
            case 6:
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("输入有误");
                break;
        }
    }
}
